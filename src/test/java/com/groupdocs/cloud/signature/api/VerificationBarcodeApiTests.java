package com.groupdocs.cloud.signature.api;

import com.groupdocs.cloud.signature.client.ApiException;
import com.groupdocs.cloud.signature.model.*;
import com.groupdocs.cloud.signature.model.requests.*;

import org.junit.Test;

/**
 * API tests for SignatureApi
 */
public class VerificationBarcodeApiTests extends BaseApiTest {

    /**
     * Verify document with Barcode Signature for Cells Documents
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void VerifyBarcode_Cells_Test() throws ApiException {
        CellsVerifyBarcodeOptionsData verifyOptionsData = new CellsVerifyBarcodeOptionsData();        
        ComposeVerifyBarcodeOptionsData(verifyOptionsData);        
        for (TestFile file : TestFiles.SignedCellsDocs) {
            PostVerificationBarcodeRequest request = new PostVerificationBarcodeRequest();
            request.setName(file.getFileName());
            request.setVerifyOptionsData(verifyOptionsData);
            request.setPassword(file.getPassword());
            request.setFolder(file.getFolder());
            request.setStorage(null);
            VerifiedDocumentResponse response = signatureApi.postVerificationBarcode(request);
            AssertVerificationRespose(file, response);
        }        
    }

    /**
     * Verify document with Barcode Signature for Images Documents
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void VerifyBarcode_Images_Test() throws ApiException {
        ImagesVerifyBarcodeOptionsData verifyOptionsData = new ImagesVerifyBarcodeOptionsData();        
        ComposeVerifyBarcodeOptionsData(verifyOptionsData);        
        for (TestFile file : TestFiles.SignedImagesDocs) {
            PostVerificationBarcodeRequest request = new PostVerificationBarcodeRequest();
            request.setName(file.getFileName());
            request.setVerifyOptionsData(verifyOptionsData);
            request.setPassword(file.getPassword());
            request.setFolder(file.getFolder());
            request.setStorage(null);
            VerifiedDocumentResponse response = signatureApi.postVerificationBarcode(request);
            AssertVerificationRespose(file, response);
        }        
    }

    /**
     * Verify document with Barcode Signature for Pdf Documents
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void VerifyBarcode_Pdf_Test() throws ApiException {
        PdfVerifyBarcodeOptionsData verifyOptionsData = new PdfVerifyBarcodeOptionsData();
        ComposeVerifyBarcodeOptionsData(verifyOptionsData);
        
        for (TestFile file : TestFiles.PdfDocs) {
            PostVerificationBarcodeRequest request = new PostVerificationBarcodeRequest();
            request.setName(file.getFileName());
            request.setVerifyOptionsData(verifyOptionsData);
            request.setPassword(file.getPassword());
            request.setFolder(file.getFolder());
            request.setStorage(null);
            VerifiedDocumentResponse response = signatureApi.postVerificationBarcode(request);
            AssertVerificationRespose(file,response);
        }
    }

    /**
     * Verify document with Barcode Signature for Slides Documents
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void VerifyBarcode_Slides_Test() throws ApiException {
        SlidesVerifyBarcodeOptionsData verifyOptionsData = new SlidesVerifyBarcodeOptionsData();
        ComposeVerifyBarcodeOptionsData(verifyOptionsData);
    
        for (TestFile file : TestFiles.SlidesDocs) {
            PostVerificationBarcodeRequest request = new PostVerificationBarcodeRequest();
            request.setName(file.getFileName());
            request.setVerifyOptionsData(verifyOptionsData);
            request.setPassword(file.getPassword());
            request.setFolder(file.getFolder());
            request.setStorage(null);
            VerifiedDocumentResponse response = signatureApi.postVerificationBarcode(request);
            AssertVerificationRespose(file,response);
        }
    }

    /**
     * Verify document with Barcode Signature for Words Documents
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void VerifyBarcode_Words_Test() throws ApiException {
        WordsVerifyBarcodeOptionsData verifyOptionsData = new WordsVerifyBarcodeOptionsData();
        ComposeVerifyBarcodeOptionsData(verifyOptionsData);
    
        for (TestFile file : TestFiles.WordsDocs) {
            PostVerificationBarcodeRequest request = new PostVerificationBarcodeRequest();
            request.setName(file.getFileName());
            request.setVerifyOptionsData(verifyOptionsData);
            request.setPassword(file.getPassword());
            request.setFolder(file.getFolder());
            request.setStorage(null);
            VerifiedDocumentResponse response = signatureApi.postVerificationBarcode(request);
            AssertVerificationRespose(file,response);
        }
    }

    private void ComposeVerifyBarcodeOptionsData(VerifyBarcodeOptionsData verifyOptionsData){
        // VerifyOptionsData
        verifyOptionsData.setDocumentPageNumber(1);
        PagesSetupData pagesSetup = GetPagesSetup();
        verifyOptionsData.setPagesSetup(pagesSetup);
        // VerifyBarcodeOptionsData
        verifyOptionsData.setText(CommonText);        
        verifyOptionsData.setVerifyAllPages(false);
    }    
}