package com.groupdocs.cloud.signature.api;

import com.groupdocs.cloud.signature.client.ApiException;
import com.groupdocs.cloud.signature.model.*;
import com.groupdocs.cloud.signature.model.requests.*;

import org.junit.Test;

/**
 * API tests for SignatureApi
 */
public class SearchBarcodeApiTests extends BaseApiTest {

    /**
     * Search document for Barcode Signature for Cells Documents
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void SearchBarcode_Cells_Test() throws ApiException {
        CellsSearchBarcodeOptionsData searchOptionsData = new CellsSearchBarcodeOptionsData();
        
        ComposeSearchBarcodeOptionsData(searchOptionsData);
        
        for (TestFile file : TestFiles.SignedCellsDocs) {
            PostSearchBarcodeRequest request = new PostSearchBarcodeRequest();
            request.setName(file.getFileName());
            request.setSearchOptionsData(searchOptionsData);
            request.setPassword(file.getPassword());
            request.setFolder(file.getFolder());
            request.setStorage(null);
            SearchDocumentResponse response = signatureApi.postSearchBarcode(request);
            AssertSearchResponse(file, response, "BarCode");
        }        
    }

    /**
     * Search document for Barcode Signature for Image Documents
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void SearchBarcode_Images_Test() throws ApiException {
        ImagesSearchBarcodeOptionsData searchOptionsData = new ImagesSearchBarcodeOptionsData();
        
        ComposeSearchBarcodeOptionsData(searchOptionsData);
        
        for (TestFile file : TestFiles.SignedImagesDocs) {
            PostSearchBarcodeRequest request = new PostSearchBarcodeRequest();
            request.setName(file.getFileName());
            request.setSearchOptionsData(searchOptionsData);
            request.setPassword(file.getPassword());
            request.setFolder(file.getFolder());
            request.setStorage(null);
            SearchDocumentResponse response = signatureApi.postSearchBarcode(request);
            AssertSearchResponse(file, response, "Barcode");
        }        
    }

    /**
     * Search document for Barcode Signature for Pdf Documents
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void SearchBarcode_Pdf_Test() throws ApiException {
        PdfSearchBarcodeOptionsData searchOptionsData = new PdfSearchBarcodeOptionsData();
        ComposeSearchBarcodeOptionsData(searchOptionsData);
        for (TestFile file : TestFiles.SignedPdfDocs) {
            PostSearchBarcodeRequest request = new PostSearchBarcodeRequest();
            request.setName(file.getFileName());
            request.setSearchOptionsData(searchOptionsData);
            request.setPassword(file.getPassword());
            request.setFolder(file.getFolder());
            request.setStorage(null);
            SearchDocumentResponse response = signatureApi.postSearchBarcode(request);
            AssertSearchResponse(file, response, "SignedForVerificationAll");
        }
    }

    /**
     * Search document for Barcode Signature for Words Documents
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void SearchBarcode_Words_Test() throws ApiException {
        WordsSearchBarcodeOptionsData searchOptionsData = new WordsSearchBarcodeOptionsData();
        ComposeSearchBarcodeOptionsData(searchOptionsData);
    
        for (TestFile file : TestFiles.SignedWordsDocs) {
            PostSearchBarcodeRequest request = new PostSearchBarcodeRequest();
            request.setName(file.getFileName());
            request.setSearchOptionsData(searchOptionsData);
            request.setPassword(file.getPassword());
            request.setFolder(file.getFolder());
            request.setStorage(null);
            SearchDocumentResponse response = signatureApi.postSearchBarcode(request);
            AssertSearchResponse(file, response, "SignedForVerificationAll");
        }
    }
}