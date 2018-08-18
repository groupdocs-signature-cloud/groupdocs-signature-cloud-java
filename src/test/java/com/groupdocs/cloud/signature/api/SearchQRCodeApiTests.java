package com.groupdocs.cloud.signature.api;

import com.groupdocs.cloud.signature.client.ApiException;
import com.groupdocs.cloud.signature.model.*;
import com.groupdocs.cloud.signature.model.requests.*;

import org.junit.Test;

/**
 * API tests for SignatureApi
 */
public class SearchQRCodeApiTests extends BaseApiTest {

    /**
     * Search document for QRCode Signature for Cells Documents
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void SearchQRCode_Cells_Test() throws ApiException {
        CellsSearchQRCodeOptionsData searchOptionsData = new CellsSearchQRCodeOptionsData();
        
        ComposeSearchQRCodeOptionsData(searchOptionsData);
        
        for (TestFile file : TestFiles.SignedCellsDocs) {
            PostSearchQRCodeRequest request = new PostSearchQRCodeRequest();
            request.setName(file.getFileName());
            request.setSearchOptionsData(searchOptionsData);
            request.setPassword(file.getPassword());
            request.setFolder(file.getFolder());
            request.setStorage(null);
            SearchDocumentResponse response = signatureApi.postSearchQRCode(request);
            AssertSearchResponse(file, response, "QRCode");
        }        
    }

    /**
     * Search document for QRCode Signature for Image Documents
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void SearchQRCode_Images_Test() throws ApiException {
        ImagesSearchQRCodeOptionsData searchOptionsData = new ImagesSearchQRCodeOptionsData();
        
        ComposeSearchQRCodeOptionsData(searchOptionsData);
        
        for (TestFile file : TestFiles.SignedImagesDocs) {
            PostSearchQRCodeRequest request = new PostSearchQRCodeRequest();
            request.setName(file.getFileName());
            request.setSearchOptionsData(searchOptionsData);
            request.setPassword(file.getPassword());
            request.setFolder(file.getFolder());
            request.setStorage(null);
            SearchDocumentResponse response = signatureApi.postSearchQRCode(request);
            AssertSearchResponse(file, response, "QRCode");
        }        
    }

    /**
     * Search document for QRCode Signature for Pdf Documents
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void SearchQRCode_Pdf_Test() throws ApiException {
        PdfSearchQRCodeOptionsData searchOptionsData = new PdfSearchQRCodeOptionsData();
        ComposeSearchQRCodeOptionsData(searchOptionsData);
        for (TestFile file : TestFiles.SignedPdfDocs) {
            PostSearchQRCodeRequest request = new PostSearchQRCodeRequest();
            request.setName(file.getFileName());
            request.setSearchOptionsData(searchOptionsData);
            request.setPassword(file.getPassword());
            request.setFolder(file.getFolder());
            request.setStorage(null);
            SearchDocumentResponse response = signatureApi.postSearchQRCode(request);
            AssertSearchResponse(file, response, "SignedForVerificationAll");
        }
    }

    /**
     * Search document for QRCode Signature for Words Documents
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void SearchQRCode_Words_Test() throws ApiException {
        WordsSearchQRCodeOptionsData searchOptionsData = new WordsSearchQRCodeOptionsData();
        ComposeSearchQRCodeOptionsData(searchOptionsData);
    
        for (TestFile file : TestFiles.SignedWordsDocs) {
            PostSearchQRCodeRequest request = new PostSearchQRCodeRequest();
            request.setName(file.getFileName());
            request.setSearchOptionsData(searchOptionsData);
            request.setPassword(file.getPassword());
            request.setFolder(file.getFolder());
            request.setStorage(null);
            SearchDocumentResponse response = signatureApi.postSearchQRCode(request);
            AssertSearchResponse(file, response, "SignedForVerificationAll");
        }
    }
}