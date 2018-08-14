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
            AssertSignatureRespose(file, response);
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
            AssertSignatureRespose(file, response);
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
            AssertSignatureRespose(file,response);
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
            AssertSignatureRespose(file,response);
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
            AssertSignatureRespose(file,response);
        }
    }

    private void ComposeSignTextOptionsData(SignTextOptionsData signOptionsData){
        // SignOptionsData
        signOptionsData.setDocumentPageNumber(1);
        PagesSetupData pagesSetup = GetPagesSetup();
        signOptionsData.setPagesSetup(pagesSetup);
        // SignTextOptionsData
        signOptionsData.setText(Def_SignText);        
        signOptionsData.setSignAllPages(false);
        // Size properties
        signOptionsData.setWidth(200);
        signOptionsData.setHeight(100);
        signOptionsData.setSizeMeasureType(SignTextOptionsData.SizeMeasureTypeEnum.PIXELS);
        // Location properties
        signOptionsData.setTop(100);
        signOptionsData.setLeft(100);
        signOptionsData.setLocationMeasureType(SignTextOptionsData.LocationMeasureTypeEnum.PIXELS);
        signOptionsData.setSizeMeasureType(SignTextOptionsData.SizeMeasureTypeEnum.PIXELS);
        signOptionsData.setMarginMeasureType(SignTextOptionsData.MarginMeasureTypeEnum.PIXELS);
        // Alignment properties
        signOptionsData.setHorizontalAlignment(SignTextOptionsData.HorizontalAlignmentEnum.LEFT);
        signOptionsData.setVerticalAlignment(SignTextOptionsData.VerticalAlignmentEnum.CENTER);
        //signOptionsData.setMargin(new PaddingData { All(5 });
        signOptionsData.setMarginMeasureType(SignTextOptionsData.MarginMeasureTypeEnum.PIXELS);
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
    }    
}