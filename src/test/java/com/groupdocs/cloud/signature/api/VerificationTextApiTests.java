package com.groupdocs.cloud.signature.api;

import com.groupdocs.cloud.signature.client.ApiException;
import com.groupdocs.cloud.signature.model.*;
import com.groupdocs.cloud.signature.model.requests.*;

import org.junit.Test;

/**
 * API tests for SignatureApi
 */
public class VerificationTextApiTests extends BaseApiTest {

    /**
     * Verify document with Text Signature for Cells Documents
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void VerifyText_Cells_Test() throws ApiException {
        CellsVerifyTextOptionsData verifyOptionsData = new CellsVerifyTextOptionsData();        
        ComposeVerifyTextOptionsData(verifyOptionsData);        
        for (TestFile file : TestFiles.SignedCellsDocs) {
            PostVerificationTextRequest request = new PostVerificationTextRequest();
            request.setName(file.getFileName());
            request.setVerifyOptionsData(verifyOptionsData);
            request.setPassword(file.getPassword());
            request.setFolder(file.getFolder());
            request.setStorage(null);
            VerifiedDocumentResponse response = signatureApi.postVerificationText(request);
            AssertVerificationRespose(file, response);
        }        
    }

    /**
     * Verify document with Text Signature for Pdf Documents
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void VerifyText_Pdf_Test() throws ApiException {
        PdfVerifyTextOptionsData verifyOptionsData = new PdfVerifyTextOptionsData();
        verifyOptionsData.setSignatureImplementation(PdfVerifyTextOptionsData.SignatureImplementationEnum.STAMP);
        ComposeVerifyTextOptionsData(verifyOptionsData);
        
        for (TestFile file : TestFiles.PdfDocs) {
            PostVerificationTextRequest request = new PostVerificationTextRequest();
            request.setName(file.getFileName());
            request.setVerifyOptionsData(verifyOptionsData);
            request.setPassword(file.getPassword());
            request.setFolder(file.getFolder());
            request.setStorage(null);
            VerifiedDocumentResponse response = signatureApi.postVerificationText(request);
            AssertVerificationRespose(file,response);
        }
    }

    /**
     * Verify document with Text Signature for Slides Documents
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void VerifyText_Slides_Test() throws ApiException {
        SlidesVerifyTextOptionsData verifyOptionsData = new SlidesVerifyTextOptionsData();
        ComposeVerifyTextOptionsData(verifyOptionsData);
    
        for (TestFile file : TestFiles.SlidesDocs) {
            PostVerificationTextRequest request = new PostVerificationTextRequest();
            request.setName(file.getFileName());
            request.setVerifyOptionsData(verifyOptionsData);
            request.setPassword(file.getPassword());
            request.setFolder(file.getFolder());
            request.setStorage(null);
            VerifiedDocumentResponse response = signatureApi.postVerificationText(request);
            AssertVerificationRespose(file,response);
        }
    }

    /**
     * Verify document with Text Signature for Words Documents
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void VerifyText_Words_Test() throws ApiException {
        WordsVerifyTextOptionsData verifyOptionsData = new WordsVerifyTextOptionsData();
        ComposeVerifyTextOptionsData(verifyOptionsData);
    
        for (TestFile file : TestFiles.WordsDocs) {
            PostVerificationTextRequest request = new PostVerificationTextRequest();
            request.setName(file.getFileName());
            request.setVerifyOptionsData(verifyOptionsData);
            request.setPassword(file.getPassword());
            request.setFolder(file.getFolder());
            request.setStorage(null);
            VerifiedDocumentResponse response = signatureApi.postVerificationText(request);
            AssertVerificationRespose(file,response);
        }
    }

    private void ComposeVerifyTextOptionsData(VerifyTextOptionsData verifyOptionsData){
        // VerifyOptionsData
        verifyOptionsData.setDocumentPageNumber(1);
        PagesSetupData pagesSetup = GetPagesSetup();
        verifyOptionsData.setPagesSetup(pagesSetup);
        // VerifyTextOptionsData
        verifyOptionsData.setText(CommonText);        
        verifyOptionsData.setVerifyAllPages(false);
    }    
}