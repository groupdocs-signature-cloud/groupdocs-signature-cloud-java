package com.groupdocs.cloud.signature.api;

import com.groupdocs.cloud.signature.client.ApiException;
import com.groupdocs.cloud.signature.model.*;
import com.groupdocs.cloud.signature.model.requests.*;

import org.junit.Test;

/**
 * API tests for SignatureApi
 */
public class SignatureStampApiTests extends BaseApiTest {

    /**
     * Sign document with Stamp Signature for Cells Documents
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void SignStamp_Cells_Test() throws ApiException {
        CellsSignStampOptionsData signOptionsData = new CellsSignStampOptionsData();
        signOptionsData.setSheetNumber(1);
        signOptionsData.setRowNumber(2);
        signOptionsData.setColumnNumber(2);        
        ComposeSignStampOptionsData(signOptionsData);
        
        for (TestFile file : TestFiles.CellsDocs) {
            PostStampRequest request = new PostStampRequest();
            request.setName(file.getFileName());
            request.setSignOptionsData(signOptionsData);
            request.setPassword(file.getPassword());
            request.setFolder(file.getFolder());
            request.setStorage(null);
            SignatureDocumentResponse response = signatureApi.postStamp(request);
            AssertSignatureResponse(file,response);
        }        
    }

    /**
     * Sign document with Text Signature for Stamp Documents
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void SignStamp_Image_Test() throws ApiException {
        ImagesSignStampOptionsData signOptionsData = new ImagesSignStampOptionsData();
        ComposeSignStampOptionsData(signOptionsData);        
        for (TestFile file : TestFiles.ImagesDocs) {
            PostStampRequest request = new PostStampRequest();
            request.setName(file.getFileName());
            request.setSignOptionsData(signOptionsData);
            request.setPassword(file.getPassword());
            request.setFolder(file.getFolder());
            request.setStorage(null);
            SignatureDocumentResponse response = signatureApi.postStamp(request);
            AssertSignatureResponse(file,response);
        }
    }

    /**
     * Sign document with Text Signature for Pdf Documents
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void SignStamp_Pdf_Test() throws ApiException {
        PdfSignStampOptionsData signOptionsData = new PdfSignStampOptionsData();        
        ComposeSignStampOptionsData(signOptionsData);    
        for (TestFile file : TestFiles.PdfDocs) {
            PostStampRequest request = new PostStampRequest();
            request.setName(file.getFileName());
            request.setSignOptionsData(signOptionsData);
            request.setPassword(file.getPassword());
            request.setFolder(file.getFolder());
            request.setStorage(null);
            SignatureDocumentResponse response = signatureApi.postStamp(request);
            AssertSignatureResponse(file,response);
        }
    }

    /**
     * Sign document with Text Signature for Slides Documents
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void SignStamp_Slides_Test() throws ApiException {
        SlidesSignStampOptionsData signOptionsData = new SlidesSignStampOptionsData();
        ComposeSignStampOptionsData(signOptionsData);
    
        for (TestFile file : TestFiles.SlidesDocs) {
            PostStampRequest request = new PostStampRequest();
            request.setName(file.getFileName());
            request.setSignOptionsData(signOptionsData);
            request.setPassword(file.getPassword());
            request.setFolder(file.getFolder());
            request.setStorage(null);
            SignatureDocumentResponse response = signatureApi.postStamp(request);
            AssertSignatureResponse(file,response);
        }
    }

    /**
     * Sign document with Text Signature for Words Documents
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void SignStamp_Words_Test() throws ApiException {
        WordsSignStampOptionsData signOptionsData = new WordsSignStampOptionsData();
        ComposeSignStampOptionsData(signOptionsData);
    
        for (TestFile file : TestFiles.WordsDocs) {
            PostStampRequest request = new PostStampRequest();
            request.setName(file.getFileName());
            request.setSignOptionsData(signOptionsData);
            request.setPassword(file.getPassword());
            request.setFolder(file.getFolder());
            request.setStorage(null);
            SignatureDocumentResponse response = signatureApi.postStamp(request);
            AssertSignatureResponse(file,response);
        }
    }
}