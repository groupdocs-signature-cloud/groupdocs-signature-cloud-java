package com.groupdocs.cloud.signature.api;

import com.groupdocs.cloud.signature.client.ApiException;
import com.groupdocs.cloud.signature.model.*;
import com.groupdocs.cloud.signature.model.requests.*;

import org.junit.Test;

/**
 * API tests for SignatureApi
 */
public class VerificationDigitalApiTests extends BaseApiTest {

    /**
     * Verify document with Digital Signature for Cells Documents
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void VerifyDigital_Cells_Test() throws ApiException {
        CellsVerifyDigitalOptionsData verifyOptionsData = new CellsVerifyDigitalOptionsData();        
        ComposeVerifyDigitalOptionsData(verifyOptionsData);        
        for (TestFile file : TestFiles.SignedCellsDocs) {
            PostVerificationDigitalRequest request = new PostVerificationDigitalRequest();
            request.setName(file.getFileName());
            request.setVerifyOptionsData(verifyOptionsData);
            request.setPassword(file.getPassword());
            request.setFolder(file.getFolder());
            request.setStorage(null);
            VerifiedDocumentResponse response = signatureApi.postVerificationDigital(request);
            AssertVerificationRespose(file, response);
        }        
    }

    /**
     * Verify document with Digital Signature for Pdf Documents
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void VerifyDigital_Pdf_Test() throws ApiException {
        PdfVerifyDigitalOptionsData verifyOptionsData = new PdfVerifyDigitalOptionsData();
        ComposeVerifyDigitalOptionsData(verifyOptionsData);
        
        for (TestFile file : TestFiles.PdfDocs) {
            PostVerificationDigitalRequest request = new PostVerificationDigitalRequest();
            request.setName(file.getFileName());
            request.setVerifyOptionsData(verifyOptionsData);
            request.setPassword(file.getPassword());
            request.setFolder(file.getFolder());
            request.setStorage(null);
            VerifiedDocumentResponse response = signatureApi.postVerificationDigital(request);
            AssertVerificationRespose(file,response);
        }
    }


    /**
     * Verify document with Text Signature for Words Documents
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void VerifyDigital_Words_Test() throws ApiException {
        WordsVerifyDigitalOptionsData verifyOptionsData = new WordsVerifyDigitalOptionsData();
        ComposeVerifyDigitalOptionsData(verifyOptionsData);
    
        for (TestFile file : TestFiles.WordsDocs) {
            PostVerificationDigitalRequest request = new PostVerificationDigitalRequest();
            request.setName(file.getFileName());
            request.setVerifyOptionsData(verifyOptionsData);
            request.setPassword(file.getPassword());
            request.setFolder(file.getFolder());
            request.setStorage(null);
            VerifiedDocumentResponse response = signatureApi.postVerificationDigital(request);
            AssertVerificationRespose(file,response);
        }
    }

    private void ComposeVerifyDigitalOptionsData(VerifyDigitalOptionsData verifyOptionsData){
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
}