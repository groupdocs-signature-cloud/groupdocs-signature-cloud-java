package com.groupdocs.cloud.signature.api;

import com.groupdocs.cloud.signature.client.ApiException;
import com.groupdocs.cloud.signature.model.*;
import com.groupdocs.cloud.signature.model.requests.*;

import org.junit.Test;

/**
 * API tests for SignatureApi
 */
public class VerifyCollectionApiTests extends BaseApiTest {

    /**
     * Verify document with Collection of Verification for Cells Documents
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void VerifyCollection_Cells_Test() throws ApiException {

        CellsVerifyDigitalOptionsData verifyOptionsDataDgtl = new CellsVerifyDigitalOptionsData();        
        ComposeVerifyDigitalOptionsData(verifyOptionsDataDgtl);
        CellsVerifyBarcodeOptionsData verifyOptionsDataBrcd = new CellsVerifyBarcodeOptionsData();        
        ComposeVerifyBarcodeOptionsData(verifyOptionsDataBrcd);
        CellsVerifyQRCodeOptionsData verifyOptionsDataQrcd = new CellsVerifyQRCodeOptionsData();        
        ComposeVerifyQRCodeOptionsData(verifyOptionsDataQrcd);

        VerifyOptionsCollectionData collection = new VerifyOptionsCollectionData();
        collection.addItemsItem(verifyOptionsDataDgtl);
        collection.addItemsItem(verifyOptionsDataBrcd);
        collection.addItemsItem(verifyOptionsDataQrcd);

        for (TestFile file : TestFiles.SignedCellsDocs) {
            PostVerificationCollectionRequest request = new PostVerificationCollectionRequest();
            request.setName(file.getFileName());
            request.setVerifyOptionsCollectionData(collection);
            request.setPassword(file.getPassword());
            request.setFolder(file.getFolder());
            request.setStorage(null);
            VerifiedDocumentResponse response = signatureApi.postVerificationCollection(request);
            AssertVerificationResponse(file, response);
        }        
    }

    /**
     * Verify document with Collection of Verification for Images Documents
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void VerifyCollection_Images_Test() throws ApiException {

        ImagesVerifyBarcodeOptionsData verifyOptionsDataBrcd = new ImagesVerifyBarcodeOptionsData();        
        ComposeVerifyBarcodeOptionsData(verifyOptionsDataBrcd);
        ImagesVerifyQRCodeOptionsData verifyOptionsDataQrcd = new ImagesVerifyQRCodeOptionsData();        
        ComposeVerifyQRCodeOptionsData(verifyOptionsDataQrcd);

        VerifyOptionsCollectionData collection = new VerifyOptionsCollectionData();
        collection.addItemsItem(verifyOptionsDataBrcd);
        collection.addItemsItem(verifyOptionsDataQrcd);

        for (TestFile file : TestFiles.SignedImagesDocs) {
            PostVerificationCollectionRequest request = new PostVerificationCollectionRequest();
            request.setName(file.getFileName());
            request.setVerifyOptionsCollectionData(collection);
            request.setPassword(file.getPassword());
            request.setFolder(file.getFolder());
            request.setStorage(null);
            VerifiedDocumentResponse response = signatureApi.postVerificationCollection(request);
            AssertVerificationResponse(file, response);
        }
    }

    /**
     * Verify document with Collection of Verification for Pdf Documents
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void VerifyCollection_Pdf_Test() throws ApiException {

        PdfVerifyDigitalOptionsData verifyOptionsDataDgtl = new PdfVerifyDigitalOptionsData();        
        ComposeVerifyDigitalOptionsData(verifyOptionsDataDgtl);
        PdfVerifyBarcodeOptionsData verifyOptionsDataBrcd = new PdfVerifyBarcodeOptionsData();        
        ComposeVerifyBarcodeOptionsData(verifyOptionsDataBrcd);
        PdfVerifyQRCodeOptionsData verifyOptionsDataQrcd = new PdfVerifyQRCodeOptionsData();        
        ComposeVerifyQRCodeOptionsData(verifyOptionsDataQrcd);

        VerifyOptionsCollectionData collection = new VerifyOptionsCollectionData();
        collection.addItemsItem(verifyOptionsDataDgtl);
        collection.addItemsItem(verifyOptionsDataBrcd);
        collection.addItemsItem(verifyOptionsDataQrcd);

        for (TestFile file : TestFiles.SignedPdfDocs) {
            PostVerificationCollectionRequest request = new PostVerificationCollectionRequest();
            request.setName(file.getFileName());
            request.setVerifyOptionsCollectionData(collection);
            request.setPassword(file.getPassword());
            request.setFolder(file.getFolder());
            request.setStorage(null);
            VerifiedDocumentResponse response = signatureApi.postVerificationCollection(request);
            AssertVerificationResponse(file, response);
        }        
    }
    
    /**
     * Verify document with Collection of Verification for Slides Documents
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void VerifyCollection_Slides_Test() throws ApiException {

        SlidesVerifyBarcodeOptionsData verifyOptionsDataBrcd = new SlidesVerifyBarcodeOptionsData();        
        ComposeVerifyBarcodeOptionsData(verifyOptionsDataBrcd);
        SlidesVerifyQRCodeOptionsData verifyOptionsDataQrcd = new SlidesVerifyQRCodeOptionsData();        
        ComposeVerifyQRCodeOptionsData(verifyOptionsDataQrcd);

        VerifyOptionsCollectionData collection = new VerifyOptionsCollectionData();
        collection.addItemsItem(verifyOptionsDataBrcd);
        collection.addItemsItem(verifyOptionsDataQrcd);

        for (TestFile file : TestFiles.SignedSlidesDocs) {
            PostVerificationCollectionRequest request = new PostVerificationCollectionRequest();
            request.setName(file.getFileName());
            request.setVerifyOptionsCollectionData(collection);
            request.setPassword(file.getPassword());
            request.setFolder(file.getFolder());
            request.setStorage(null);
            VerifiedDocumentResponse response = signatureApi.postVerificationCollection(request);
            AssertVerificationResponse(file, response);
        }        
    }

    /**
     * Verify document with Collection of Verification for Words Documents
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void VerifyCollection_Words_Test() throws ApiException {

        WordsVerifyDigitalOptionsData verifyOptionsDataDgtl = new WordsVerifyDigitalOptionsData();        
        ComposeVerifyDigitalOptionsData(verifyOptionsDataDgtl);
        WordsVerifyBarcodeOptionsData verifyOptionsDataBrcd = new WordsVerifyBarcodeOptionsData();        
        ComposeVerifyBarcodeOptionsData(verifyOptionsDataBrcd);
        WordsVerifyQRCodeOptionsData verifyOptionsDataQrcd = new WordsVerifyQRCodeOptionsData();        
        ComposeVerifyQRCodeOptionsData(verifyOptionsDataQrcd);

        VerifyOptionsCollectionData collection = new VerifyOptionsCollectionData();
        collection.addItemsItem(verifyOptionsDataDgtl);
        collection.addItemsItem(verifyOptionsDataBrcd);
        collection.addItemsItem(verifyOptionsDataQrcd);

        for (TestFile file : TestFiles.SignedWordsDocs) {
            PostVerificationCollectionRequest request = new PostVerificationCollectionRequest();
            request.setName(file.getFileName());
            request.setVerifyOptionsCollectionData(collection);
            request.setPassword(file.getPassword());
            request.setFolder(file.getFolder());
            request.setStorage(null);
            VerifiedDocumentResponse response = signatureApi.postVerificationCollection(request);
            AssertVerificationResponse(file, response);
        }        
    }
}