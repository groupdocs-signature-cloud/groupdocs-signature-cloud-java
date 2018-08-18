package com.groupdocs.cloud.signature.api;

import static org.junit.Assert.fail;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.aspose.storage.api.StorageApi;
import com.groupdocs.cloud.signature.client.Configuration;
import com.groupdocs.cloud.signature.client.JSON;

import org.junit.After;
import java.awt.List;

import com.groupdocs.cloud.signature.model.*;

/**
 * API tests for SignatureApi
 */
public class BaseApiTest {

    public final String FromUrlFolder = "tests\\from_url";
    public final String FromContentFolder = "tests\\from_content";

    public final String Def_SignText = "Mr.Sherlock";

    public final String CommonText = "John Smith";
    public final String CommonFontName = "Arial";
    public final int    CommonFontSize = 12;
    public final String CommonBarcodeTypeName = "Code39Standard";
    public final String CommonBarCodeText = "123456789012";
    public final String CommonQrCodeTypeName = "Aztec";
    public final String CommonQrCodeText = "John Smith";
    public final String CommonPassword = "1234567890";


    protected SignatureApi signatureApi;
    private StorageApi storageApi;

    public BaseApiTest() {
        super();

        Configuration configuration = new Configuration(Config.AppSID, Config.AppKey);
        configuration.setBasePath(Config.BasePath);

        signatureApi = new SignatureApi(configuration);
        signatureApi.getApiClient().setConnectTimeout(10 * 1000);

        storageApi = new StorageApi(Config.BasePath, Config.AppKey, Config.AppSID);
    }

    @After
    public void cleanup() {
        removeTempFiles();
    }

    private void removeTempFiles() {
        // dont clear output folder
    }

    private void deleteFolderFromStorage(String folderName) {
        storageApi.DeleteFolder(folderName, null, true);
    }

    public File getTestFile(TestFile testFile) throws FileNotFoundException {
        Path filePath = Paths.get("resources", testFile.getFolder(), testFile.getFileName());
        File file = filePath.toFile();
        if (!file.exists())
            throw new FileNotFoundException(file.getAbsolutePath());

        return file;
    }

    public File toJsonFile(Object obj) throws IOException {
        JSON json = new JSON();
        String content = json.serialize(obj);

        File file = File.createTempFile("java", ".json");
        FileWriter fileWriter = new FileWriter(file.getAbsoluteFile(), true);
        fileWriter.write(content);
        fileWriter.close();

        return file;
    }
    public Color GetColor(String web){
        Color color = new Color(web);
        color.setWeb(web);
        return color;
    }
    public PagesSetupData GetPagesSetup(){
        PagesSetupData pagesSetup = new PagesSetupData();
        pagesSetup.setFirstPage(true);
        pagesSetup.setLastPage(true);
        pagesSetup.setOddPages(true);
        pagesSetup.setEvenPages(true);
        pagesSetup.addPageNumbersItem(1);
        return pagesSetup;
    };
    
    public BrushData GetBrushData(int type){
        BrushData result = new SolidBrushData();
        switch(type)
        {
            case 0: 
              SolidBrushData tempSB = new SolidBrushData();
              tempSB.setColor( GetColor("#0C0CFF"));
              result = tempSB;
            break;
            case 1: 
              RadialGradientBrushData tempRB = new RadialGradientBrushData();
              tempRB.setInnerColor( GetColor("#0C0CFF"));
              tempRB.setOuterColor( GetColor("#0CFFFF"));
              result = tempRB;
            break;
            case 2: 
              LinearGradientBrushData tempGB = new LinearGradientBrushData();
              tempGB.setStartColor( GetColor("#0C0CFF"));
              tempGB.setEndColor( GetColor("#0CFFFF"));
              result = tempGB;
            break;

        }        
        return result;
    };

    public PaddingData GetMargin(int all){
        PaddingData margin = new PaddingData();
        margin.setLeft(all);
        margin.setTop(all);
        margin.setRight(all);
        margin.setBottom(all);
        return margin;
    }
    
    protected SignatureFontData GetFont(){
        SignatureFontData result = new SignatureFontData();
        result.setFontFamily(CommonFontName);
        result.setFontSize(12.2);
        result.setBold(true);
        result.setItalic(true);
        result.setUnderline(true);
        return result;                     
    }

    public void AssertDocumentResponse(TestFile testFile, DocumentResponse response){
        assertNotNull(response.getFileName());
        assertNotNull(response.getFolder());       
        assertNotNull(response.getStatus());
        assertEquals(response.getFileName(), testFile.getFileName());        
        
    }

    public void AssertSignatureResponse(TestFile testFile, SignatureDocumentResponse response){
        AssertDocumentResponse(testFile, response);
        assertEquals(response.getStatus(), "OK");
        assertEquals(response.getFolder(), "Output");
    }

    public void AssertVerificationResponse(TestFile testFile, VerifiedDocumentResponse response){
        AssertDocumentResponse(testFile, response);        
    }
    public void AssertSearchResponse(TestFile testFile, SearchDocumentResponse response, String seachType){
        AssertDocumentResponse(testFile, response);
        String fileName = testFile.getFileName();
        Boolean hasSignatures = ((fileName.indexOf(seachType) != -1)||(fileName.indexOf("SignedForVerificationAll") != -1));
        if(hasSignatures && (seachType.indexOf("Alls") == -1)){
           assertTrue(response.getSignatures().size()>0);
        }
    }

    protected void ComposeSignTextOptionsData(SignTextOptionsData signOptionsData){
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

    protected void ComposeSignImageOptionsData(SignImageOptionsData signOptionsData){
        // SignOptionsData
        signOptionsData.setDocumentPageNumber(1);
        PagesSetupData pagesSetup = GetPagesSetup();
        signOptionsData.setPagesSetup(pagesSetup);
        // SignImageOptionsData
        TestFile image = TestFiles.Images.get(0);
        signOptionsData.setImageGuid(image.getPath());
        signOptionsData.setSignAllPages(false);
        
        // Location properties
        signOptionsData.setTop(100);        
        signOptionsData.setLeft(100);
        // Size properties
        signOptionsData.setWidth(200);
        signOptionsData.setHeight(100);        
        
        signOptionsData.setSizeMeasureType(SignImageOptionsData.SizeMeasureTypeEnum.PIXELS);
        // Location properties
        signOptionsData.setTop(100);
        signOptionsData.setLeft(100);
        signOptionsData.setLocationMeasureType(SignImageOptionsData.LocationMeasureTypeEnum.PIXELS);
        signOptionsData.setSizeMeasureType(SignImageOptionsData.SizeMeasureTypeEnum.PIXELS);
        signOptionsData.setMarginMeasureType(SignImageOptionsData.MarginMeasureTypeEnum.PIXELS);
        // Alignment properties
        signOptionsData.setHorizontalAlignment(SignImageOptionsData.HorizontalAlignmentEnum.LEFT);
        signOptionsData.setVerticalAlignment(SignImageOptionsData.VerticalAlignmentEnum.CENTER);
        
        signOptionsData.setMarginMeasureType(SignImageOptionsData.MarginMeasureTypeEnum.PIXELS);       
        // Margin
        PaddingData margin = GetMargin(10);
        signOptionsData.setMargin(margin);
        //
        signOptionsData.setOpacity(0.9);        
        signOptionsData.setRotationAngle(45);        
    }

    protected void ComposeSignDigitalOptionsData(SignDigitalOptionsData signOptionsData){
        // SignOptionsData
        signOptionsData.setDocumentPageNumber(1);
        PagesSetupData pagesSetup = GetPagesSetup();
        signOptionsData.setPagesSetup(pagesSetup);
        // SignImageOptionsData
        TestFile image = TestFiles.Images.get(0);
        signOptionsData.setImageGuid(image.getPath());
        signOptionsData.setSignAllPages(false);
        
        // Location properties
        signOptionsData.setTop(100);        
        signOptionsData.setLeft(100);
        // Size properties
        signOptionsData.setWidth(200);
        signOptionsData.setHeight(100);        
        
        signOptionsData.setSizeMeasureType(SignImageOptionsData.SizeMeasureTypeEnum.PIXELS);
        // Location properties
        signOptionsData.setTop(100);
        signOptionsData.setLeft(100);
        signOptionsData.setLocationMeasureType(SignImageOptionsData.LocationMeasureTypeEnum.PIXELS);
        signOptionsData.setSizeMeasureType(SignImageOptionsData.SizeMeasureTypeEnum.PIXELS);
        signOptionsData.setMarginMeasureType(SignImageOptionsData.MarginMeasureTypeEnum.PIXELS);
        // Alignment properties
        signOptionsData.setHorizontalAlignment(SignImageOptionsData.HorizontalAlignmentEnum.LEFT);
        signOptionsData.setVerticalAlignment(SignImageOptionsData.VerticalAlignmentEnum.CENTER);
        
        signOptionsData.setMarginMeasureType(SignImageOptionsData.MarginMeasureTypeEnum.PIXELS);       
        // Margin
        PaddingData margin = GetMargin(10);
        signOptionsData.setMargin(margin);
        // Digital
        TestFile certificate = TestFiles.Certificates.get(0);
        signOptionsData.setCertificateGuid(certificate.getPath());
        signOptionsData.setPassword(CommonPassword);

        //             
    }

    protected void ComposeSignBarcodeOptionsData(SignBarcodeOptionsData signOptionsData){
        // SignOptionsData
        signOptionsData.setDocumentPageNumber(1);
        PagesSetupData pagesSetup = GetPagesSetup();
        signOptionsData.setPagesSetup(pagesSetup);
        // SignBarcodeOptionsData
        signOptionsData.setText(CommonBarCodeText);        
        signOptionsData.setSignAllPages(false);
        // Size properties
        signOptionsData.setWidth(200);
        signOptionsData.setHeight(100);
        signOptionsData.setSizeMeasureType(SignBarcodeOptionsData.SizeMeasureTypeEnum.PIXELS);
        // Location properties
        signOptionsData.setTop(100);
        signOptionsData.setLeft(100);
        signOptionsData.setLocationMeasureType(SignBarcodeOptionsData.LocationMeasureTypeEnum.PIXELS);
        signOptionsData.setSizeMeasureType(SignBarcodeOptionsData.SizeMeasureTypeEnum.PIXELS);
        signOptionsData.setMarginMeasureType(SignBarcodeOptionsData.MarginMeasureTypeEnum.PIXELS);
        // Alignment properties
        signOptionsData.setHorizontalAlignment(SignBarcodeOptionsData.HorizontalAlignmentEnum.LEFT);
        signOptionsData.setVerticalAlignment(SignBarcodeOptionsData.VerticalAlignmentEnum.CENTER);
        //signOptionsData.setMargin(new PaddingData { All(5 });
        signOptionsData.setMarginMeasureType(SignBarcodeOptionsData.MarginMeasureTypeEnum.PIXELS);
        //Appearance properties
        Color clrBack = Color.AliceBlue;
        signOptionsData.setBackgroundColor(clrBack);
        Color clrBrdr = Color.BlanchedAlmond;
        signOptionsData.setBorderColor(clrBrdr);
        Color clrFore = Color.DarkRed;
        signOptionsData.setForeColor(clrFore);
        signOptionsData.setFont(new SignatureFontData());
        //
        BrushData brushData = GetBrushData(1);
        signOptionsData.setBackgroundBrush(brushData);
        //
        signOptionsData.setBarcodeTypeName(CommonBarcodeTypeName);
        signOptionsData.setBorderVisiblity(true);
        signOptionsData.setBorderDashStyle(SignBarcodeOptionsData.BorderDashStyleEnum.DASHLONGDASHDOT);
        signOptionsData.setBorderWeight(1.5);
        signOptionsData.setOpacity(0.9);      
        // Margin
        PaddingData margin = GetMargin(2);
        signOptionsData.setInnerMargins(margin);
    }

    protected void ComposeSignQRCodeOptionsData(SignQRCodeOptionsData signOptionsData){
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

    protected BorderLineData GetBorderLineData(String webColor, Double weight, Double transp, BorderLineData.StyleEnum enumData){
        BorderLineData result = new BorderLineData();
        Color color = GetColor(webColor);
        result.setColor(color);
        result.setStyle(enumData); 
        result.setTransparency(transp); 
        result.setWeight(weight);
        return result;
    }

    protected StampLineData GetStampLineData(){
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
    
    protected void ComposeSignStampOptionsData(SignStampOptionsData signOptionsData){
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

    protected void ComposeVerifyDigitalOptionsData(VerifyDigitalOptionsData verifyOptionsData){
        // VerifyOptionsData
        verifyOptionsData.setDocumentPageNumber(1);
        PagesSetupData pagesSetup = GetPagesSetup();
        verifyOptionsData.setPagesSetup(pagesSetup);
        // VerifyDigitalOptionsData
        verifyOptionsData.setPassword(CommonPassword);    
        TestFile certificate = TestFiles.Certificates.get(0);
        String fileName = certificate.getPath();
        verifyOptionsData.setCertificateGuid(fileName);
    }

    protected void ComposeVerifyQRCodeOptionsData(VerifyQRCodeOptionsData verifyOptionsData){
        // VerifyOptionsData
        verifyOptionsData.setDocumentPageNumber(1);
        PagesSetupData pagesSetup = GetPagesSetup();
        verifyOptionsData.setPagesSetup(pagesSetup);
        // VerifyQRCodeOptionsData
        verifyOptionsData.setText(CommonText);        
        verifyOptionsData.setVerifyAllPages(false);
    }

    protected void ComposeVerifyBarcodeOptionsData(VerifyBarcodeOptionsData verifyOptionsData){
        // VerifyOptionsData
        verifyOptionsData.setDocumentPageNumber(1);
        PagesSetupData pagesSetup = GetPagesSetup();
        verifyOptionsData.setPagesSetup(pagesSetup);
        // VerifyBarcodeOptionsData
        verifyOptionsData.setText(CommonText);        
        verifyOptionsData.setVerifyAllPages(false);
    }

    protected void ComposeSearchBarcodeOptionsData(SearchBarcodeOptionsData searchOptionsData){
        // SignOptionsData
        searchOptionsData.setDocumentPageNumber(1);
        PagesSetupData pagesSetup = GetPagesSetup();
        searchOptionsData.setPagesSetup(pagesSetup);
        searchOptionsData.searchAllPages(true);
        //searchOptionsData.setBarcodeTypeName(CommonBarcodeTypeName);
        //searchOptionsData.setText(CommonBarCodeText);
        searchOptionsData.setMatchType(SearchBarcodeOptionsData.MatchTypeEnum.CONTAINS);
    }

    protected void ComposeSearchDigitalOptionsData(SearchDigitalOptionsData searchOptionsData){
        // SignOptionsData
        searchOptionsData.setDocumentPageNumber(1);
        PagesSetupData pagesSetup = GetPagesSetup();
        searchOptionsData.setPagesSetup(pagesSetup);
        searchOptionsData.searchAllPages(true);
    }

    protected void ComposeSearchQRCodeOptionsData(SearchQRCodeOptionsData searchOptionsData){
        // SignOptionsData
        //searchOptionsData.setDocumentPageNumber(1);
        //PagesSetupData pagesSetup = GetPagesSetup();
        //searchOptionsData.setPagesSetup(pagesSetup);
        searchOptionsData.searchAllPages(true);
        //searchOptionsData.setQrCodeTypeName(CommonQrCodeTypeName);
        //searchOptionsData.setText(CommonQrCodeText);
        //searchOptionsData.setMatchType(SearchQRCodeOptionsData.MatchTypeEnum.CONTAINS);
    }
}