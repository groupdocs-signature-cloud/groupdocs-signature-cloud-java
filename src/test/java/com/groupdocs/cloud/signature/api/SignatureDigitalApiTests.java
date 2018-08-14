package com.groupdocs.cloud.signature.api;

import com.groupdocs.cloud.signature.client.ApiException;
import com.groupdocs.cloud.signature.model.*;
import com.groupdocs.cloud.signature.model.requests.*;

import org.junit.Test;

/**
 * API tests for SignatureApi
 */
public class SignatureDigitalApiTests extends BaseApiTest {

    /**
     * Sign document with Digital Signature for Cells Documents
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void SignDigital_Cells_Test() throws ApiException {
        CellsSignDigitalOptionsData signOptionsData = new CellsSignDigitalOptionsData();
        signOptionsData.setSheetNumber(1);
        signOptionsData.setRowNumber(2);
        signOptionsData.setColumnNumber(2);
        ComposeSignDigitalOptionsData(signOptionsData);
        
        for (TestFile file : TestFiles.CellsDocs) {
            PostDigitalRequest request = new PostDigitalRequest();
            request.setName(file.getFileName());
            request.setSignOptionsData(signOptionsData);
            request.setPassword(file.getPassword());
            request.setFolder(file.getFolder());
            request.setStorage(null);
            SignatureDocumentResponse response = signatureApi.postDigital(request);
            AssertSignatureRespose(file,response);
        }        
    }

    /**
     * Sign document with DigitalSignature for Pdf Documents
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void SignDigital_Pdf_Test() throws ApiException {
        PdfSignDigitalOptionsData signOptionsData = new PdfSignDigitalOptionsData();        
        ComposeSignDigitalOptionsData(signOptionsData);
    
        for (TestFile file : TestFiles.PdfDocs) {
            if(file.getFileName().indexOf("pwd") == -1){
                PostDigitalRequest request = new PostDigitalRequest();
                request.setName(file.getFileName());
                request.setSignOptionsData(signOptionsData);
                request.setPassword(file.getPassword());
                request.setFolder(file.getFolder());
                request.setStorage(null);
                SignatureDocumentResponse response = signatureApi.postDigital(request);
                AssertSignatureRespose(file,response);
            }
        }
    }

    /**
     * Sign document with DigitalSignature for Words Documents
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void SignDigital_Words_Test() throws ApiException {
        WordsSignDigitalOptionsData signOptionsData = new WordsSignDigitalOptionsData();
        ComposeSignDigitalOptionsData(signOptionsData);
    
        for (TestFile file : TestFiles.WordsDocs) {
            PostDigitalRequest request = new PostDigitalRequest();
            request.setName(file.getFileName());
            request.setSignOptionsData(signOptionsData);
            request.setPassword(file.getPassword());
            request.setFolder(file.getFolder());
            request.setStorage(null);
            SignatureDocumentResponse response = signatureApi.postDigital(request);
            AssertSignatureRespose(file,response);
        }
    }

    private void ComposeSignDigitalOptionsData(SignDigitalOptionsData signOptionsData){
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
}