package com.groupdocs.cloud.signature.api;

import com.groupdocs.cloud.signature.client.ApiException;
import com.groupdocs.cloud.signature.model.*;
import com.groupdocs.cloud.signature.model.requests.*;

import org.junit.Test;

/**
 * API tests for SignatureApi
 */
public class SignatureQRCodeApiTests extends BaseApiTest {

    /**
     * Sign document with QRCode Signature for Cells Documents
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void SignQRCode_Cells_Test() throws ApiException {
        CellsSignQRCodeOptionsData signOptionsData = new CellsSignQRCodeOptionsData();
        signOptionsData.setSheetNumber(1);
        signOptionsData.setRowNumber(2);
        signOptionsData.setColumnNumber(2);
        
        ComposeSignQRCodeOptionsData(signOptionsData);
        
        for (TestFile file : TestFiles.CellsDocs) {
            PostQRCodeRequest request = new PostQRCodeRequest();
            request.setName(file.getFileName());
            request.setSignOptionsData(signOptionsData);
            request.setPassword(file.getPassword());
            request.setFolder(file.getFolder());
            request.setStorage(null);
            SignatureDocumentResponse response = signatureApi.postQRCode(request);
            AssertSignatureResponse(file, response);
        }        
    }

    /**
     * Sign document with QRCode Signature for Image Documents
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void SignQRCode_Image_Test() throws ApiException {
        ImagesSignQRCodeOptionsData signOptionsData = new ImagesSignQRCodeOptionsData();
        ComposeSignQRCodeOptionsData(signOptionsData);        
        for (TestFile file : TestFiles.ImagesDocs) {
            PostQRCodeRequest request = new PostQRCodeRequest();
            request.setName(file.getFileName());
            request.setSignOptionsData(signOptionsData);
            request.setPassword(file.getPassword());
            request.setFolder(file.getFolder());
            request.setStorage(null);
            SignatureDocumentResponse response = signatureApi.postQRCode(request);
            AssertSignatureResponse(file, response);
        }
    }

    /**
     * Sign document with QRCode Signature for Pdf Documents
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void SignQRCode_Pdf_Test() throws ApiException {
        PdfSignQRCodeOptionsData signOptionsData = new PdfSignQRCodeOptionsData();
        ComposeSignQRCodeOptionsData(signOptionsData);
        Color clrBrdr = GetColor("#OCOCOC");
        signOptionsData.setBorderColor(clrBrdr);
    
        for (TestFile file : TestFiles.PdfDocs) {
            PostQRCodeRequest request = new PostQRCodeRequest();
            request.setName(file.getFileName());
            request.setSignOptionsData(signOptionsData);
            request.setPassword(file.getPassword());
            request.setFolder(file.getFolder());
            request.setStorage(null);
            SignatureDocumentResponse response = signatureApi.postQRCode(request);
            AssertSignatureResponse(file,response);
        }
    }

    /**
     * Sign document with QRCode Signature for Slides Documents
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void SignQRCode_Slides_Test() throws ApiException {
        SlidesSignQRCodeOptionsData signOptionsData = new SlidesSignQRCodeOptionsData();
        ComposeSignQRCodeOptionsData(signOptionsData);
    
        for (TestFile file : TestFiles.SlidesDocs) {
            PostQRCodeRequest request = new PostQRCodeRequest();
            request.setName(file.getFileName());
            request.setSignOptionsData(signOptionsData);
            request.setPassword(file.getPassword());
            request.setFolder(file.getFolder());
            request.setStorage(null);
            SignatureDocumentResponse response = signatureApi.postQRCode(request);
            AssertSignatureResponse(file,response);
        }
    }

    /**
     * Sign document with QRCode Signature for Words Documents
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void SignQRCode_Words_Test() throws ApiException {
        WordsSignQRCodeOptionsData signOptionsData = new WordsSignQRCodeOptionsData();
        ComposeSignQRCodeOptionsData(signOptionsData);
    
        for (TestFile file : TestFiles.WordsDocs) {
            PostQRCodeRequest request = new PostQRCodeRequest();
            request.setName(file.getFileName());
            request.setSignOptionsData(signOptionsData);
            request.setPassword(file.getPassword());
            request.setFolder(file.getFolder());
            request.setStorage(null);
            SignatureDocumentResponse response = signatureApi.postQRCode(request);
            AssertSignatureResponse(file,response);
        }
    }
}