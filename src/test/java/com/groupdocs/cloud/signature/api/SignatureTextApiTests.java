package com.groupdocs.cloud.signature.api;

import com.groupdocs.cloud.signature.client.ApiException;
import com.groupdocs.cloud.signature.model.*;
import com.groupdocs.cloud.signature.model.requests.*;

import org.junit.Test;

/**
 * API tests for SignatureApi
 */
public class SignatureTextApiTests extends BaseApiTest {

    /**
     * Sign document with Text Signature for Cells Documents
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void SignText_Cells_Test() throws ApiException {
        CellsSignTextOptionsData signOptionsData = new CellsSignTextOptionsData();
        signOptionsData.setSheetNumber(1);
        signOptionsData.setRowNumber(2);
        signOptionsData.setColumnNumber(2);
        signOptionsData.setSignatureImplementation(CellsSignTextOptionsData.SignatureImplementationEnum.TEXTSTAMP);
        ComposeSignTextOptionsData(signOptionsData);
        
        for (TestFile file : TestFiles.CellsDocs) {
            PostTextRequest request = new PostTextRequest();
            request.setName(file.getFileName());
            request.setSignOptionsData(signOptionsData);
            request.setPassword(file.getPassword());
            request.setFolder(file.getFolder());
            request.setStorage(null);
            SignatureDocumentResponse response = signatureApi.postText(request);
            AssertSignatureResponse(file, response);
        }        
    }

    /**
     * Sign document with Text Signature for Image Documents
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void SignText_Image_Test() throws ApiException {
        ImagesSignTextOptionsData signOptionsData = new ImagesSignTextOptionsData();
        ComposeSignTextOptionsData(signOptionsData);        
        for (TestFile file : TestFiles.ImagesDocs) {
            PostTextRequest request = new PostTextRequest();
            request.setName(file.getFileName());
            request.setSignOptionsData(signOptionsData);
            request.setPassword(file.getPassword());
            request.setFolder(file.getFolder());
            request.setStorage(null);
            SignatureDocumentResponse response = signatureApi.postText(request);
            AssertSignatureResponse(file, response);
        }
    }

    /**
     * Sign document with Text Signature for Pdf Documents
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void SignText_Pdf_Test() throws ApiException {
        PdfSignTextOptionsData signOptionsData = new PdfSignTextOptionsData();
        signOptionsData.setSignatureImplementation(PdfSignTextOptionsData.SignatureImplementationEnum.STAMP);
        ComposeSignTextOptionsData(signOptionsData);
        Color clrBrdr = GetColor("#OCOCOC");
        signOptionsData.setBorderColor(clrBrdr);
    
        for (TestFile file : TestFiles.PdfDocs) {
            PostTextRequest request = new PostTextRequest();
            request.setName(file.getFileName());
            request.setSignOptionsData(signOptionsData);
            request.setPassword(file.getPassword());
            request.setFolder(file.getFolder());
            request.setStorage(null);
            SignatureDocumentResponse response = signatureApi.postText(request);
            AssertSignatureResponse(file,response);
        }
    }

    /**
     * Sign document with Text Signature for Slides Documents
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void SignText_Slides_Test() throws ApiException {
        SlidesSignTextOptionsData signOptionsData = new SlidesSignTextOptionsData();
        signOptionsData.setSignatureImplementation(SlidesSignTextOptionsData.SignatureImplementationEnum.TEXTSTAMP);
        ComposeSignTextOptionsData(signOptionsData);
    
        for (TestFile file : TestFiles.SlidesDocs) {
            PostTextRequest request = new PostTextRequest();
            request.setName(file.getFileName());
            request.setSignOptionsData(signOptionsData);
            request.setPassword(file.getPassword());
            request.setFolder(file.getFolder());
            request.setStorage(null);
            SignatureDocumentResponse response = signatureApi.postText(request);
            AssertSignatureResponse(file,response);
        }
    }

    /**
     * Sign document with Text Signature for Words Documents
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void SignText_Words_Test() throws ApiException {
        WordsSignTextOptionsData signOptionsData = new WordsSignTextOptionsData();
        signOptionsData.setSignatureImplementation(WordsSignTextOptionsData.SignatureImplementationEnum.TEXTSTAMP);
        ComposeSignTextOptionsData(signOptionsData);
    
        for (TestFile file : TestFiles.WordsDocs) {
            PostTextRequest request = new PostTextRequest();
            request.setName(file.getFileName());
            request.setSignOptionsData(signOptionsData);
            request.setPassword(file.getPassword());
            request.setFolder(file.getFolder());
            request.setStorage(null);
            SignatureDocumentResponse response = signatureApi.postText(request);
            AssertSignatureResponse(file,response);
        }
    }        
}