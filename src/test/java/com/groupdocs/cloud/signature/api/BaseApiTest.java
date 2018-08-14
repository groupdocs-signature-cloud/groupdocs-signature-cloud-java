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

    public void AssertDocumentRespose(TestFile testFile, DocumentResponse response){
        assertNotNull(response.getFileName());
        assertNotNull(response.getFolder());       
        assertNotNull(response.getStatus());
        assertEquals(response.getFileName(), testFile.getFileName());        
        
    }

    public void AssertSignatureRespose(TestFile testFile, SignatureDocumentResponse response){
        AssertDocumentRespose(testFile, response);
        assertEquals(response.getStatus(), "OK");
        assertEquals(response.getFolder(), "Output");
    }

    public void AssertVerificationRespose(TestFile testFile, VerifiedDocumentResponse response){
        AssertDocumentRespose(testFile, response);        
    }
    public void AssertSearchRespose(TestFile testFile, VerifiedDocumentResponse response){
        AssertDocumentRespose(testFile, response);        
    }
}