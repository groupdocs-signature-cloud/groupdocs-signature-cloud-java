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
            AssertSignatureRespose(file,response);
        }        
    }

    /**
     * Sign document with Text Signature for Stamp Documents
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void SignStamp_Stamp_Test() throws ApiException {
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
            AssertSignatureRespose(file,response);
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
            AssertSignatureRespose(file,response);
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
            AssertSignatureRespose(file,response);
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
            AssertSignatureRespose(file,response);
        }
    }

    private BorderLineData GetBorderLineData(String webColor, Double weight, Double transp, BorderLineData.StyleEnum enumData){
        BorderLineData result = new BorderLineData();
        Color color = GetColor(webColor);
        result.setColor(color);
        result.setStyle(enumData); 
        result.setTransparency(transp); 
        result.setWeight(weight);
        return result;
    }

    private StampLineData GetStampLineData(){
        StampLineData result = new StampLineData();
        result.setText(CommonText);
        SignatureFontData font = GetFont();
        result.setFont(font);
        result.setTextBottomIntent(5);
        result.setTextColor( GetColor("#0C0C0C"));       
        result.setTextRepeatType(StampLineData.TextRepeatTypeEnum.FULLTEXTREPEAT);
        result.setBackgroundColor( GetColor("#0C0C0C"));
        result.setHeight(20);
        BorderLineData brdInner = GetBorderLineData("#CCFF00",1.2,0.8, BorderLineData.StyleEnum.LONGDASH);
        result.setInnerBorder(brdInner);
        BorderLineData brdOuter = GetBorderLineData("#0000FF",1.2,0.8, BorderLineData.StyleEnum.SHORTDASH);
        result.setOuterBorder(brdOuter);
        result.setVisible(true);
        return result;
    }
    private void ComposeSignStampOptionsData(SignStampOptionsData signOptionsData){
        // SignOptionsData
        signOptionsData.setDocumentPageNumber(1);
        PagesSetupData pagesSetup = GetPagesSetup();
        signOptionsData.setPagesSetup(pagesSetup);
        // SignStampOptionsData
        TestFile Stamp = TestFiles.Images.get(0);
        signOptionsData.setImageGuid(Stamp.getPath());
        signOptionsData.setSignAllPages(false);
        
        // Location properties
        signOptionsData.setTop(100);        
        signOptionsData.setLeft(100);
        // Size properties
        signOptionsData.setWidth(200);
        signOptionsData.setHeight(100);        
        
        signOptionsData.setSizeMeasureType(SignStampOptionsData.SizeMeasureTypeEnum.PIXELS);
        // Location properties
        signOptionsData.setTop(100);
        signOptionsData.setLeft(100);
        signOptionsData.setLocationMeasureType(SignStampOptionsData.LocationMeasureTypeEnum.PIXELS);
        signOptionsData.setSizeMeasureType(SignStampOptionsData.SizeMeasureTypeEnum.PIXELS);
        signOptionsData.setMarginMeasureType(SignStampOptionsData.MarginMeasureTypeEnum.PIXELS);
        // Alignment properties
        signOptionsData.setHorizontalAlignment(SignStampOptionsData.HorizontalAlignmentEnum.LEFT);
        signOptionsData.setVerticalAlignment(SignStampOptionsData.VerticalAlignmentEnum.CENTER);
        
        signOptionsData.setMarginMeasureType(SignStampOptionsData.MarginMeasureTypeEnum.PIXELS);       
        // Margin
        PaddingData margin = GetMargin(10);
        signOptionsData.setMargin(margin);
        //
        signOptionsData.setOpacity(0.9);        
        signOptionsData.setRotationAngle(45);     
        // Stamp properties
        Color backgroundColor = GetColor("#OCOCOC");
        signOptionsData.setBackgroundColor(backgroundColor);

        signOptionsData.setBackgroundColorCropType(SignStampOptionsData.BackgroundColorCropTypeEnum.INNERAREA);
        signOptionsData.setBackgroundImageCropType(SignStampOptionsData.BackgroundImageCropTypeEnum.MIDDLEAREA);
       
        StampLineData outLine1 = GetStampLineData();
        signOptionsData.addOuterLinesItem(outLine1);
                         
        StampLineData inrLine1 = GetStampLineData();
        signOptionsData.addInnerLinesItem(inrLine1);   
    }
}