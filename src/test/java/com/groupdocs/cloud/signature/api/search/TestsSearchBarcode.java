/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd">
 *   Copyright (c) 2003-2019 Aspose Pty Ltd
 * </copyright>
 * <summary>
 *  Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 * 
 *  The above copyright notice and this permission notice shall be included in all
 *  copies or substantial portions of the Software.
 * 
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *  SOFTWARE.
 * </summary>
 * --------------------------------------------------------------------------------------------------------------------
 */

package com.groupdocs.cloud.signature.api.search;

import com.groupdocs.cloud.signature.api.*;
import com.groupdocs.cloud.signature.client.ApiException;
import com.groupdocs.cloud.signature.model.*;
import com.groupdocs.cloud.signature.model.OptionsBase.DocumentTypeEnum;
import com.groupdocs.cloud.signature.model.OptionsBase.SignatureTypeEnum;
import com.groupdocs.cloud.signature.model.SearchBarcodeOptions.MatchTypeEnum;
import com.groupdocs.cloud.signature.model.requests.*;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.List;

public class TestsSearchBarcode extends BaseApiTest {

    @Test
    public void SearchBarcodeImage() throws ApiException
    {
        // Set request
        TestFile testFile = TestFiles.ImageStorageSigned.get(0);
        FileInfo fileInfo = testFile.ToFileInfo();
        SearchBarcodeOptions options = new SearchBarcodeOptions();
        PopulateOptions(options);
        options.setDocumentType(DocumentTypeEnum.IMAGE);
        SearchSettings searchSettings = new SearchSettings();
        searchSettings.setFileInfo(fileInfo);
        searchSettings.addOptionsItem(options);
        SearchSignaturesRequest request = new SearchSignaturesRequest(searchSettings);

        // Get and check result 
        SearchResult response = signApi.searchSignatures(request);

        CheckResponse(searchSettings.getOptions(), response, testFile);
    }

    @Test
    public void SearchBarcodePdf() throws ApiException
    {
        // Set request
        TestFile testFile = TestFiles.PdfStorageSigned.get(0);
        FileInfo fileInfo = testFile.ToFileInfo();
        SearchBarcodeOptions options = new SearchBarcodeOptions();
        PopulateOptions(options);
        options.setDocumentType(DocumentTypeEnum.PDF);
        SearchSettings searchSettings = new SearchSettings();
        searchSettings.setFileInfo(fileInfo);
        searchSettings.addOptionsItem(options);
        SearchSignaturesRequest request = new SearchSignaturesRequest(searchSettings);

        // Get and check result 
        SearchResult response = signApi.searchSignatures(request);

        CheckResponse(searchSettings.getOptions(), response, testFile);
    }

    @Test
    public void SearchBarcodePresentation() throws ApiException
    {
        // Set request
        TestFile testFile = TestFiles.PresentationStorageSigned.get(0);
        FileInfo fileInfo = testFile.ToFileInfo();
        SearchBarcodeOptions options = new SearchBarcodeOptions();
        PopulateOptions(options);
        options.setDocumentType(DocumentTypeEnum.PRESENTATION);
        SearchSettings searchSettings = new SearchSettings();
        searchSettings.setFileInfo(fileInfo);
        searchSettings.addOptionsItem(options);
        SearchSignaturesRequest request = new SearchSignaturesRequest(searchSettings);

        // Get and check result 
        SearchResult response = signApi.searchSignatures(request);

        CheckResponse(searchSettings.getOptions(), response, testFile);
    }

    @Test
    public void SearchBarcodeSpreadsheet() throws ApiException
    {
        // Set request
        TestFile testFile = TestFiles.SpreadsheetStorageSigned.get(0);
        FileInfo fileInfo = testFile.ToFileInfo();
        SearchBarcodeOptions options = new SearchBarcodeOptions();
        PopulateOptions(options);
        options.setDocumentType(DocumentTypeEnum.SPREADSHEET);
        SearchSettings searchSettings = new SearchSettings();
        searchSettings.setFileInfo(fileInfo);
        searchSettings.addOptionsItem(options);
        SearchSignaturesRequest request = new SearchSignaturesRequest(searchSettings);

        // Get and check result 
        SearchResult response = signApi.searchSignatures(request);

        CheckResponse(searchSettings.getOptions(), response, testFile);
    }

    @Test
    public void SearchBarcodeWordProcessing() throws ApiException
    {
        // Set request
        TestFile testFile = TestFiles.WordProcessingStorageSigned.get(0);
        FileInfo fileInfo = testFile.ToFileInfo();
        SearchBarcodeOptions options = new SearchBarcodeOptions();
        PopulateOptions(options);
        options.setDocumentType(DocumentTypeEnum.WORDPROCESSING);
        SearchSettings searchSettings = new SearchSettings();
        searchSettings.setFileInfo(fileInfo);
        searchSettings.addOptionsItem(options);
        SearchSignaturesRequest request = new SearchSignaturesRequest(searchSettings);

        // Get and check result 
        SearchResult response = signApi.searchSignatures(request);

        CheckResponse(searchSettings.getOptions(), response, testFile);
    }
   
    public static void PopulateOptions(SearchBarcodeOptions options)
    {
        options.setPage(1);
        options.setAllPages(true);
        PagesSetup pagesSetup = new PagesSetup();
        pagesSetup.setEvenPages(false);
        pagesSetup.setFirstPage(true);
        pagesSetup.setLastPage(false);
        pagesSetup.setOddPages(false);
        pagesSetup.addPageNumbersItem(1);
        options.setPagesSetup(pagesSetup);

        options.setSignatureType(SignatureTypeEnum.BARCODE);
        options.setBarcodeType("Code39Standard");
        options.setText("123456789012");
        options.setMatchType(MatchTypeEnum.CONTAINS);
    }

    protected void CheckResponse(List<SearchOptions> searchOptions, SearchResult result, TestFile testFile)
    {
        assertNotNull("Result is empty.", result);
        assertEquals("Wrong size.", result.getSize(), Long.valueOf(testFile.getSize()));
        assertNotNull("FileInfo is null.", result.getFileInfo());
        assertNotNull("FileInfo FilePath is empty.", result.getFileInfo().getFilePath());
        assertEquals("FileInfo FilePath is wrong.", testFile.getPath(), result.getFileInfo().getFilePath());
        assertNotNull("Signatures null", result.getSignatures());
        assertTrue("Signatures empty", result.getSignatures().size() > 0);
        for (SearchOptions option : searchOptions)
        {
             boolean exists = false;
             for (Signature signature : result.getSignatures())
             {
                 BarcodeSignature barcodeSignature = (BarcodeSignature)signature;
                 SearchBarcodeOptions searchBarcodeOptions = (SearchBarcodeOptions)option;
                 if (barcodeSignature != null &&
                     barcodeSignature.getSignatureType().toString().equals(searchBarcodeOptions.getSignatureType().toString()) &&
                     barcodeSignature.getBarcodeType().toString().equals(searchBarcodeOptions.getBarcodeType()) &&
                     barcodeSignature.getText().equals(searchBarcodeOptions.getText()))
                 {
                     exists = true;
                     break;
                 }
             }
             assertTrue("Signature type "+option.getSignatureType()+" is not found", exists);
        }
    }

}  