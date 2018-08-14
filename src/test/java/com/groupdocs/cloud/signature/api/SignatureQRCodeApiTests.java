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
            AssertSignatureRespose(file, response);
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
            AssertSignatureRespose(file, response);
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
            AssertSignatureRespose(file,response);
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
            AssertSignatureRespose(file,response);
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
            AssertSignatureRespose(file,response);
        }
    }

    private void ComposeSignQRCodeOptionsData(SignQRCodeOptionsData signOptionsData){
        // SignOptionsData
        signOptionsData.setDocumentPageNumber(1);
        PagesSetupData pagesSetup = GetPagesSetup();
        signOptionsData.setPagesSetup(pagesSetup);
        // SignQRCodeOptionsData
        signOptionsData.setText(CommonQrCodeText);        
        signOptionsData.setSignAllPages(false);
        // Size properties
        signOptionsData.setWidth(200);
        signOptionsData.setHeight(100);
        signOptionsData.setSizeMeasureType(SignQRCodeOptionsData.SizeMeasureTypeEnum.PIXELS);
        // Location properties
        signOptionsData.setTop(100);
        signOptionsData.setLeft(100);
        signOptionsData.setLocationMeasureType(SignQRCodeOptionsData.LocationMeasureTypeEnum.PIXELS);
        signOptionsData.setSizeMeasureType(SignQRCodeOptionsData.SizeMeasureTypeEnum.PIXELS);
        signOptionsData.setMarginMeasureType(SignQRCodeOptionsData.MarginMeasureTypeEnum.PIXELS);
        // Alignment properties
        signOptionsData.setHorizontalAlignment(SignQRCodeOptionsData.HorizontalAlignmentEnum.LEFT);
        signOptionsData.setVerticalAlignment(SignQRCodeOptionsData.VerticalAlignmentEnum.CENTER);
        //signOptionsData.setMargin(new PaddingData { All(5 });
        signOptionsData.setMarginMeasureType(SignQRCodeOptionsData.MarginMeasureTypeEnum.PIXELS);
        //Appearance properties
        Color clrBack = GetColor("#BCBCBC");
        signOptionsData.setBackgroundColor(clrBack);
        Color clrBrdr = GetColor("#OCOCOC");
        signOptionsData.setBorderColor(clrBrdr);
        Color clrFore = GetColor("#FFFFFF");
        signOptionsData.setForeColor(clrFore);
        signOptionsData.setFont(new SignatureFontData());
        //
        BrushData brushData = GetBrushData(1);
        signOptionsData.setBackgroundBrush(brushData);
        //
        signOptionsData.setQrCodeTypeName(CommonQrCodeTypeName);
        signOptionsData.setBorderVisiblity(true);
        signOptionsData.setBorderDashStyle(SignQRCodeOptionsData.BorderDashStyleEnum.DASHLONGDASHDOT);
        signOptionsData.setBorderWeight(1.5);
        signOptionsData.setOpacity(0.9);      
        // Margin
        PaddingData margin = GetMargin(2);
        signOptionsData.setInnerMargins(margin);
    }    
}