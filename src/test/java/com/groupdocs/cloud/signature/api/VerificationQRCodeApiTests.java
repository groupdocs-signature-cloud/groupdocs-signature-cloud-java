package com.groupdocs.cloud.signature.api;

import com.groupdocs.cloud.signature.client.ApiException;
import com.groupdocs.cloud.signature.model.*;
import com.groupdocs.cloud.signature.model.requests.*;

import org.junit.Test;

/**
 * API tests for SignatureApi
 */
public class VerificationQRCodeApiTests extends BaseApiTest {

    /**
     * Verify document with QRCode Signature for Cells Documents
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void VerifyQRCode_Cells_Test() throws ApiException {
        CellsVerifyQRCodeOptionsData verifyOptionsData = new CellsVerifyQRCodeOptionsData();        
        ComposeVerifyQRCodeOptionsData(verifyOptionsData);        
        for (TestFile file : TestFiles.SignedCellsDocs) {
            PostVerificationQRCodeRequest request = new PostVerificationQRCodeRequest();
            request.setName(file.getFileName());
            request.setVerifyOptionsData(verifyOptionsData);
            request.setPassword(file.getPassword());
            request.setFolder(file.getFolder());
            request.setStorage(null);
            VerifiedDocumentResponse response = signatureApi.postVerificationQRCode(request);
            AssertVerificationResponse(file, response);
        }        
    }

       /**
     * Verify document with QRCode Signature for Images Documents
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void VerifyQRCode_Images_Test() throws ApiException {
        ImagesVerifyQRCodeOptionsData verifyOptionsData = new ImagesVerifyQRCodeOptionsData();        
        ComposeVerifyQRCodeOptionsData(verifyOptionsData);        
        for (TestFile file : TestFiles.SignedImagesDocs) {
            PostVerificationQRCodeRequest request = new PostVerificationQRCodeRequest();
            request.setName(file.getFileName());
            request.setVerifyOptionsData(verifyOptionsData);
            request.setPassword(file.getPassword());
            request.setFolder(file.getFolder());
            request.setStorage(null);
            VerifiedDocumentResponse response = signatureApi.postVerificationQRCode(request);
            AssertVerificationResponse(file, response);
        }        
    }

    /**
     * Verify document with QRCode Signature for Pdf Documents
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void VerifyQRCode_Pdf_Test() throws ApiException {
        PdfVerifyQRCodeOptionsData verifyOptionsData = new PdfVerifyQRCodeOptionsData();
        ComposeVerifyQRCodeOptionsData(verifyOptionsData);
        
        for (TestFile file : TestFiles.PdfDocs) {
            PostVerificationQRCodeRequest request = new PostVerificationQRCodeRequest();
            request.setName(file.getFileName());
            request.setVerifyOptionsData(verifyOptionsData);
            request.setPassword(file.getPassword());
            request.setFolder(file.getFolder());
            request.setStorage(null);
            VerifiedDocumentResponse response = signatureApi.postVerificationQRCode(request);
            AssertVerificationResponse(file,response);
        }
    }

    /**
     * Verify document with QRCode Signature for Slides Documents
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void VerifyQRCode_Slides_Test() throws ApiException {
        SlidesVerifyQRCodeOptionsData verifyOptionsData = new SlidesVerifyQRCodeOptionsData();
        ComposeVerifyQRCodeOptionsData(verifyOptionsData);
    
        for (TestFile file : TestFiles.SlidesDocs) {
            PostVerificationQRCodeRequest request = new PostVerificationQRCodeRequest();
            request.setName(file.getFileName());
            request.setVerifyOptionsData(verifyOptionsData);
            request.setPassword(file.getPassword());
            request.setFolder(file.getFolder());
            request.setStorage(null);
            VerifiedDocumentResponse response = signatureApi.postVerificationQRCode(request);
            AssertVerificationResponse(file,response);
        }
    }

    /**
     * Verify document with QRCode Signature for Words Documents
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void VerifyQRCode_Words_Test() throws ApiException {
        WordsVerifyQRCodeOptionsData verifyOptionsData = new WordsVerifyQRCodeOptionsData();
        ComposeVerifyQRCodeOptionsData(verifyOptionsData);
    
        for (TestFile file : TestFiles.WordsDocs) {
            PostVerificationQRCodeRequest request = new PostVerificationQRCodeRequest();
            request.setName(file.getFileName());
            request.setVerifyOptionsData(verifyOptionsData);
            request.setPassword(file.getPassword());
            request.setFolder(file.getFolder());
            request.setStorage(null);
            VerifiedDocumentResponse response = signatureApi.postVerificationQRCode(request);
            AssertVerificationResponse(file,response);
        }
    }
}