package com.groupdocs.cloud.signature.api;

import com.groupdocs.cloud.signature.client.ApiException;
import com.groupdocs.cloud.signature.model.*;
import com.groupdocs.cloud.signature.model.requests.*;

import org.junit.Test;

/**
 * API tests for SignatureApi
 */
public class SignatureBarcodeApiTests extends BaseApiTest {

    /**
     * Sign document with Barcode Signature for Cells Documents
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void SignBarcode_Cells_Test() throws ApiException {
        CellsSignBarcodeOptionsData signOptionsData = new CellsSignBarcodeOptionsData();
        signOptionsData.setSheetNumber(1);
        signOptionsData.setRowNumber(2);
        signOptionsData.setColumnNumber(2);
        
        ComposeSignBarcodeOptionsData(signOptionsData);
        
        for (TestFile file : TestFiles.CellsDocs) {
            PostBarcodeRequest request = new PostBarcodeRequest();
            request.setName(file.getFileName());
            request.setSignOptionsData(signOptionsData);
            request.setPassword(file.getPassword());
            request.setFolder(file.getFolder());
            request.setStorage(null);
            SignatureDocumentResponse response = signatureApi.postBarcode(request);
            AssertSignatureResponse(file, response);
        }        
    }

    /**
     * Sign document with Barcode Signature for Image Documents
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void SignBarcode_Image_Test() throws ApiException {
        ImagesSignBarcodeOptionsData signOptionsData = new ImagesSignBarcodeOptionsData();
        ComposeSignBarcodeOptionsData(signOptionsData);        
        for (TestFile file : TestFiles.ImagesDocs) {
            PostBarcodeRequest request = new PostBarcodeRequest();
            request.setName(file.getFileName());
            request.setSignOptionsData(signOptionsData);
            request.setPassword(file.getPassword());
            request.setFolder(file.getFolder());
            request.setStorage(null);
            SignatureDocumentResponse response = signatureApi.postBarcode(request);
            AssertSignatureResponse(file, response);
        }
    }

    /**
     * Sign document with Barcode Signature for Pdf Documents
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void SignBarcode_Pdf_Test() throws ApiException {
        PdfSignBarcodeOptionsData signOptionsData = new PdfSignBarcodeOptionsData();
        ComposeSignBarcodeOptionsData(signOptionsData);
        Color clrBrdr = GetColor("#OCOCOC");
        signOptionsData.setBorderColor(clrBrdr);
    
        for (TestFile file : TestFiles.PdfDocs) {
            PostBarcodeRequest request = new PostBarcodeRequest();
            request.setName(file.getFileName());
            request.setSignOptionsData(signOptionsData);
            request.setPassword(file.getPassword());
            request.setFolder(file.getFolder());
            request.setStorage(null);
            SignatureDocumentResponse response = signatureApi.postBarcode(request);
            AssertSignatureResponse(file,response);
        }
    }

    /**
     * Sign document with Barcode Signature for Slides Documents
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void SignBarcode_Slides_Test() throws ApiException {
        SlidesSignBarcodeOptionsData signOptionsData = new SlidesSignBarcodeOptionsData();
        ComposeSignBarcodeOptionsData(signOptionsData);
    
        for (TestFile file : TestFiles.SlidesDocs) {
            PostBarcodeRequest request = new PostBarcodeRequest();
            request.setName(file.getFileName());
            request.setSignOptionsData(signOptionsData);
            request.setPassword(file.getPassword());
            request.setFolder(file.getFolder());
            request.setStorage(null);
            SignatureDocumentResponse response = signatureApi.postBarcode(request);
            AssertSignatureResponse(file,response);
        }
    }

    /**
     * Sign document with Barcode Signature for Words Documents
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void SignBarcode_Words_Test() throws ApiException {
        WordsSignBarcodeOptionsData signOptionsData = new WordsSignBarcodeOptionsData();
        ComposeSignBarcodeOptionsData(signOptionsData);
    
        for (TestFile file : TestFiles.WordsDocs) {
            PostBarcodeRequest request = new PostBarcodeRequest();
            request.setName(file.getFileName());
            request.setSignOptionsData(signOptionsData);
            request.setPassword(file.getPassword());
            request.setFolder(file.getFolder());
            request.setStorage(null);
            SignatureDocumentResponse response = signatureApi.postBarcode(request);
            AssertSignatureResponse(file,response);
        }
    }
}