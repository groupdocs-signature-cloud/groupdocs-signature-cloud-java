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
            AssertSignatureResponse(file,response);
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
                AssertSignatureResponse(file,response);
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
            AssertSignatureResponse(file,response);
        }
    }
}