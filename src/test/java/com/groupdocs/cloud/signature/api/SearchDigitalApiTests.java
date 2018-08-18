package com.groupdocs.cloud.signature.api;

import com.groupdocs.cloud.signature.client.ApiException;
import com.groupdocs.cloud.signature.model.*;
import com.groupdocs.cloud.signature.model.requests.*;

import org.junit.Test;

/**
 * API tests for SignatureApi
 */
public class SearchDigitalApiTests extends BaseApiTest {

    /**
     * Search document for Digital Signature for Cells Documents
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void SearchDigital_Cells_Test() throws ApiException {
        CellsSearchDigitalOptionsData searchOptionsData = new CellsSearchDigitalOptionsData();
        
        ComposeSearchDigitalOptionsData(searchOptionsData);
        
        for (TestFile file : TestFiles.SignedCellsDocs) {
            PostSearchDigitalRequest request = new PostSearchDigitalRequest();
            request.setName(file.getFileName());
            request.setSearchOptionsData(searchOptionsData);
            request.setPassword(file.getPassword());
            request.setFolder(file.getFolder());
            request.setStorage(null);
            SearchDocumentResponse response = signatureApi.postSearchDigital(request);
            AssertSearchResponse(file, response, "Digital");
        }        
    }

    /**
     * Search document for Digital Signature for Pdf Documents
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void SearchDigital_Pdf_Test() throws ApiException {
        PdfSearchDigitalOptionsData searchOptionsData = new PdfSearchDigitalOptionsData();
        ComposeSearchDigitalOptionsData(searchOptionsData);
        for (TestFile file : TestFiles.SignedPdfDocs) {
            PostSearchDigitalRequest request = new PostSearchDigitalRequest();
            request.setName(file.getFileName());
            request.setSearchOptionsData(searchOptionsData);
            request.setPassword(file.getPassword());
            request.setFolder(file.getFolder());
            request.setStorage(null);
            SearchDocumentResponse response = signatureApi.postSearchDigital(request);
            AssertSearchResponse(file, response, "Digital");
        }
    }

    /**
     * Search document for Digital Signature for Words Documents
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void SearchDigital_Words_Test() throws ApiException {
        WordsSearchDigitalOptionsData searchOptionsData = new WordsSearchDigitalOptionsData();
        ComposeSearchDigitalOptionsData(searchOptionsData);
    
        for (TestFile file : TestFiles.SignedWordsDocs) {
            PostSearchDigitalRequest request = new PostSearchDigitalRequest();
            request.setName(file.getFileName());
            request.setSearchOptionsData(searchOptionsData);
            request.setPassword(file.getPassword());
            request.setFolder(file.getFolder());
            request.setStorage(null);
            SearchDocumentResponse response = signatureApi.postSearchDigital(request);
            AssertSearchResponse(file, response, "Digital");
        }
    }
}