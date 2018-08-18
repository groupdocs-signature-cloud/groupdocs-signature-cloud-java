package com.groupdocs.cloud.signature.api;

import com.groupdocs.cloud.signature.client.ApiException;
import com.groupdocs.cloud.signature.model.*;
import com.groupdocs.cloud.signature.model.requests.*;

import org.junit.Test;

/**
 * API tests for SignatureApi
 */
public class SearchCollectionApiTests extends BaseApiTest {

    /**
     * Search document with Collection of Search for Cells Documents
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void SearchCollection_Cells_Test() throws ApiException {

        CellsSearchDigitalOptionsData SearchOptionsDataDgtl = new CellsSearchDigitalOptionsData();        
        ComposeSearchDigitalOptionsData(SearchOptionsDataDgtl);
        CellsSearchBarcodeOptionsData SearchOptionsDataBrcd = new CellsSearchBarcodeOptionsData();        
        ComposeSearchBarcodeOptionsData(SearchOptionsDataBrcd);
        CellsSearchQRCodeOptionsData SearchOptionsDataQrcd = new CellsSearchQRCodeOptionsData();        
        ComposeSearchQRCodeOptionsData(SearchOptionsDataQrcd);

        SearchOptionsCollectionData collection = new SearchOptionsCollectionData();
        collection.addItemsItem(SearchOptionsDataDgtl);
        collection.addItemsItem(SearchOptionsDataBrcd);
        collection.addItemsItem(SearchOptionsDataQrcd);

        for (TestFile file : TestFiles.SignedCellsDocs) {
            PostSearchCollectionRequest request = new PostSearchCollectionRequest();
            request.setName(file.getFileName());
            request.setSearchOptionsCollectionData(collection);
            request.setPassword(file.getPassword());
            request.setFolder(file.getFolder());
            request.setStorage(null);
            SearchDocumentResponse response = signatureApi.postSearchCollection(request);
            AssertSearchResponse(file, response, "Alls");
        }        
    }

    /**
     * Search document with Collection of Search for Images Documents
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void SearchCollection_Images_Test() throws ApiException {

        ImagesSearchBarcodeOptionsData SearchOptionsDataBrcd = new ImagesSearchBarcodeOptionsData();        
        ComposeSearchBarcodeOptionsData(SearchOptionsDataBrcd);
        ImagesSearchQRCodeOptionsData SearchOptionsDataQrcd = new ImagesSearchQRCodeOptionsData();        
        ComposeSearchQRCodeOptionsData(SearchOptionsDataQrcd);

        SearchOptionsCollectionData collection = new SearchOptionsCollectionData();
        collection.addItemsItem(SearchOptionsDataBrcd);
        collection.addItemsItem(SearchOptionsDataQrcd);

        for (TestFile file : TestFiles.SignedImagesDocs) {
            PostSearchCollectionRequest request = new PostSearchCollectionRequest();
            request.setName(file.getFileName());
            request.setSearchOptionsCollectionData(collection);
            request.setPassword(file.getPassword());
            request.setFolder(file.getFolder());
            request.setStorage(null);
            SearchDocumentResponse response = signatureApi.postSearchCollection(request);
            AssertSearchResponse(file, response, "Alls");
        }
    }

    /**
     * Search document with Collection of Search for Pdf Documents
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void SearchCollection_Pdf_Test() throws ApiException {

        PdfSearchDigitalOptionsData SearchOptionsDataDgtl = new PdfSearchDigitalOptionsData();        
        ComposeSearchDigitalOptionsData(SearchOptionsDataDgtl);
        PdfSearchBarcodeOptionsData SearchOptionsDataBrcd = new PdfSearchBarcodeOptionsData();        
        ComposeSearchBarcodeOptionsData(SearchOptionsDataBrcd);
        PdfSearchQRCodeOptionsData SearchOptionsDataQrcd = new PdfSearchQRCodeOptionsData();        
        ComposeSearchQRCodeOptionsData(SearchOptionsDataQrcd);

        SearchOptionsCollectionData collection = new SearchOptionsCollectionData();
        collection.addItemsItem(SearchOptionsDataDgtl);
        collection.addItemsItem(SearchOptionsDataBrcd);
        collection.addItemsItem(SearchOptionsDataQrcd);

        for (TestFile file : TestFiles.SignedPdfDocs) {
            PostSearchCollectionRequest request = new PostSearchCollectionRequest();
            request.setName(file.getFileName());
            request.setSearchOptionsCollectionData(collection);
            request.setPassword(file.getPassword());
            request.setFolder(file.getFolder());
            request.setStorage(null);
            SearchDocumentResponse response = signatureApi.postSearchCollection(request);
            AssertSearchResponse(file, response, "Alls");
        }        
    }
    
    /**
     * Search document with Collection of Search for Slides Documents
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void SearchCollection_Slides_Test() throws ApiException {

        SlidesSearchBarcodeOptionsData SearchOptionsDataBrcd = new SlidesSearchBarcodeOptionsData();        
        ComposeSearchBarcodeOptionsData(SearchOptionsDataBrcd);
        SlidesSearchQRCodeOptionsData SearchOptionsDataQrcd = new SlidesSearchQRCodeOptionsData();        
        ComposeSearchQRCodeOptionsData(SearchOptionsDataQrcd);

        SearchOptionsCollectionData collection = new SearchOptionsCollectionData();
        collection.addItemsItem(SearchOptionsDataBrcd);
        collection.addItemsItem(SearchOptionsDataQrcd);

        for (TestFile file : TestFiles.SignedSlidesDocs) {
            PostSearchCollectionRequest request = new PostSearchCollectionRequest();
            request.setName(file.getFileName());
            request.setSearchOptionsCollectionData(collection);
            request.setPassword(file.getPassword());
            request.setFolder(file.getFolder());
            request.setStorage(null);
            SearchDocumentResponse response = signatureApi.postSearchCollection(request);
            AssertSearchResponse(file, response, "Alls");
        }        
    }

    /**
     * Search document with Collection of Search for Words Documents
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void SearchCollection_Words_Test() throws ApiException {

        WordsSearchDigitalOptionsData SearchOptionsDataDgtl = new WordsSearchDigitalOptionsData();        
        ComposeSearchDigitalOptionsData(SearchOptionsDataDgtl);
        WordsSearchBarcodeOptionsData SearchOptionsDataBrcd = new WordsSearchBarcodeOptionsData();        
        ComposeSearchBarcodeOptionsData(SearchOptionsDataBrcd);
        WordsSearchQRCodeOptionsData SearchOptionsDataQrcd = new WordsSearchQRCodeOptionsData();        
        ComposeSearchQRCodeOptionsData(SearchOptionsDataQrcd);

        SearchOptionsCollectionData collection = new SearchOptionsCollectionData();
        collection.addItemsItem(SearchOptionsDataDgtl);
        collection.addItemsItem(SearchOptionsDataBrcd);
        collection.addItemsItem(SearchOptionsDataQrcd);

        for (TestFile file : TestFiles.SignedWordsDocs) {
            PostSearchCollectionRequest request = new PostSearchCollectionRequest();
            request.setName(file.getFileName());
            request.setSearchOptionsCollectionData(collection);
            request.setPassword(file.getPassword());
            request.setFolder(file.getFolder());
            request.setStorage(null);
            SearchDocumentResponse response = signatureApi.postSearchCollection(request);
            AssertSearchResponse(file, response, "Alls");
        }        
    }
}