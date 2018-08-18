package com.groupdocs.cloud.signature.api;

import com.groupdocs.cloud.signature.client.ApiException;
import com.groupdocs.cloud.signature.model.*;
import com.groupdocs.cloud.signature.model.requests.*;

import org.junit.Test;

/**
 * API tests for SignatureApi
 */
public class SignatureImageApiTests extends BaseApiTest {

    /**
     * Sign document with Image Signature for Cells Documents
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void SignImage_Cells_Test() throws ApiException {
        CellsSignImageOptionsData signOptionsData = new CellsSignImageOptionsData();
        signOptionsData.setSheetNumber(1);
        signOptionsData.setRowNumber(2);
        signOptionsData.setColumnNumber(2);        
        ComposeSignImageOptionsData(signOptionsData);
        
        for (TestFile file : TestFiles.CellsDocs) {
            PostImageRequest request = new PostImageRequest();
            request.setName(file.getFileName());
            request.setSignOptionsData(signOptionsData);
            request.setPassword(file.getPassword());
            request.setFolder(file.getFolder());
            request.setStorage(null);
            SignatureDocumentResponse response = signatureApi.postImage(request);
            AssertSignatureResponse(file,response);
        }        
    }

    /**
     * Sign document with Text Signature for Image Documents
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void SignImage_Image_Test() throws ApiException {
        ImagesSignImageOptionsData signOptionsData = new ImagesSignImageOptionsData();
        ComposeSignImageOptionsData(signOptionsData);        
        for (TestFile file : TestFiles.ImagesDocs) {
            PostImageRequest request = new PostImageRequest();
            request.setName(file.getFileName());
            request.setSignOptionsData(signOptionsData);
            request.setPassword(file.getPassword());
            request.setFolder(file.getFolder());
            request.setStorage(null);
            SignatureDocumentResponse response = signatureApi.postImage(request);
            AssertSignatureResponse(file,response);
        }
    }

    /**
     * Sign document with Text Signature for Pdf Documents
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void SignImage_Pdf_Test() throws ApiException {
        PdfSignImageOptionsData signOptionsData = new PdfSignImageOptionsData();        
        ComposeSignImageOptionsData(signOptionsData);    
        for (TestFile file : TestFiles.PdfDocs) {
            PostImageRequest request = new PostImageRequest();
            request.setName(file.getFileName());
            request.setSignOptionsData(signOptionsData);
            request.setPassword(file.getPassword());
            request.setFolder(file.getFolder());
            request.setStorage(null);
            SignatureDocumentResponse response = signatureApi.postImage(request);
            AssertSignatureResponse(file,response);
        }
    }

    /**
     * Sign document with Text Signature for Slides Documents
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void SignImage_Slides_Test() throws ApiException {
        SlidesSignImageOptionsData signOptionsData = new SlidesSignImageOptionsData();
        ComposeSignImageOptionsData(signOptionsData);
    
        for (TestFile file : TestFiles.SlidesDocs) {
            PostImageRequest request = new PostImageRequest();
            request.setName(file.getFileName());
            request.setSignOptionsData(signOptionsData);
            request.setPassword(file.getPassword());
            request.setFolder(file.getFolder());
            request.setStorage(null);
            SignatureDocumentResponse response = signatureApi.postImage(request);
            AssertSignatureResponse(file,response);
        }
    }

    /**
     * Sign document with Text Signature for Words Documents
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void SignImage_Words_Test() throws ApiException {
        WordsSignImageOptionsData signOptionsData = new WordsSignImageOptionsData();
        ComposeSignImageOptionsData(signOptionsData);
    
        for (TestFile file : TestFiles.WordsDocs) {
            PostImageRequest request = new PostImageRequest();
            request.setName(file.getFileName());
            request.setSignOptionsData(signOptionsData);
            request.setPassword(file.getPassword());
            request.setFolder(file.getFolder());
            request.setStorage(null);
            SignatureDocumentResponse response = signatureApi.postImage(request);
            AssertSignatureResponse(file,response);
        }
    }    
}