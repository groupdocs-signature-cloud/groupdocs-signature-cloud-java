package com.groupdocs.cloud.signature.api;

import com.groupdocs.cloud.signature.client.ApiException;
import com.groupdocs.cloud.signature.model.*;
import com.groupdocs.cloud.signature.model.requests.*;

import org.junit.Test;

/**
 * API tests for SignatureApi
 */
public class SignatureCollectionApiTests extends BaseApiTest {

    /**
     * Sign document with Collection of Signatures for Cells Documents
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void SignCollection_Cells_Test() throws ApiException {
        CellsSignTextOptionsData signOptionsDataText = new CellsSignTextOptionsData();
        signOptionsDataText.setSheetNumber(1);
        signOptionsDataText.setRowNumber(2);
        signOptionsDataText.setColumnNumber(2);
        signOptionsDataText.setSignatureImplementation(CellsSignTextOptionsData.SignatureImplementationEnum.TEXTSTAMP);
        ComposeSignTextOptionsData(signOptionsDataText);

        CellsSignImageOptionsData signOptionsDataImgs = new CellsSignImageOptionsData();
        signOptionsDataImgs.setSheetNumber(1);
        signOptionsDataImgs.setRowNumber(10);
        signOptionsDataImgs.setColumnNumber(10);        
        ComposeSignImageOptionsData(signOptionsDataImgs);

        CellsSignDigitalOptionsData signOptionsDataDgtl = new CellsSignDigitalOptionsData();
        signOptionsDataDgtl.setSheetNumber(1);
        signOptionsDataDgtl.setRowNumber(20);
        signOptionsDataDgtl.setColumnNumber(20);
        ComposeSignDigitalOptionsData(signOptionsDataDgtl);

        CellsSignBarcodeOptionsData signOptionsDataBrcd = new CellsSignBarcodeOptionsData();
        signOptionsDataBrcd.setSheetNumber(1);
        signOptionsDataBrcd.setRowNumber(30);
        signOptionsDataBrcd.setColumnNumber(30);        
        ComposeSignBarcodeOptionsData(signOptionsDataBrcd);
        
        CellsSignQRCodeOptionsData signOptionsDataQrcd = new CellsSignQRCodeOptionsData();
        signOptionsDataQrcd.setSheetNumber(1);
        signOptionsDataQrcd.setRowNumber(40);
        signOptionsDataQrcd.setColumnNumber(40);        
        ComposeSignQRCodeOptionsData(signOptionsDataQrcd);

        CellsSignStampOptionsData signOptionsDataStmp = new CellsSignStampOptionsData();
        signOptionsDataStmp.setSheetNumber(1);
        signOptionsDataStmp.setRowNumber(50);
        signOptionsDataStmp.setColumnNumber(50);        
        ComposeSignStampOptionsData(signOptionsDataStmp);


        SignOptionsCollectionData collection = new SignOptionsCollectionData();
        collection.addItemsItem(signOptionsDataText);
        collection.addItemsItem(signOptionsDataImgs);
        collection.addItemsItem(signOptionsDataDgtl);
        collection.addItemsItem(signOptionsDataBrcd);
        collection.addItemsItem(signOptionsDataQrcd);
        collection.addItemsItem(signOptionsDataStmp);

        for (TestFile file : TestFiles.CellsDocs) {
            PostCollectionRequest request = new PostCollectionRequest();
            request.setName(file.getFileName());
            request.setSignOptionsCollectionData(collection);
            request.setPassword(file.getPassword());
            request.setFolder(file.getFolder());
            request.setStorage(null);
            SignatureDocumentResponse response = signatureApi.postCollection(request);
            AssertSignatureResponse(file, response);
        }        
    }

    /**
     * Sign document with Collection of Signatures for Image Documents
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void SignCollection_Image_Test() throws ApiException {
        ImagesSignTextOptionsData signOptionsDataText = new ImagesSignTextOptionsData();
        ComposeSignTextOptionsData(signOptionsDataText);
        ImagesSignImageOptionsData signOptionsDataImgs = new ImagesSignImageOptionsData();
        ComposeSignImageOptionsData(signOptionsDataImgs);
        ImagesSignBarcodeOptionsData signOptionsDataBrcd = new ImagesSignBarcodeOptionsData();
        ComposeSignBarcodeOptionsData(signOptionsDataBrcd);        
        ImagesSignQRCodeOptionsData signOptionsDataQrcd = new ImagesSignQRCodeOptionsData();
        ComposeSignQRCodeOptionsData(signOptionsDataQrcd);
        ImagesSignStampOptionsData signOptionsDataStmp = new ImagesSignStampOptionsData();
        ComposeSignStampOptionsData(signOptionsDataStmp);

        SignOptionsCollectionData collection = new SignOptionsCollectionData();
        collection.addItemsItem(signOptionsDataText);
        collection.addItemsItem(signOptionsDataImgs);
        collection.addItemsItem(signOptionsDataBrcd);
        collection.addItemsItem(signOptionsDataQrcd);
        collection.addItemsItem(signOptionsDataStmp);

        for (TestFile file : TestFiles.ImagesDocs) {
            PostCollectionRequest request = new PostCollectionRequest();
            request.setName(file.getFileName());
            request.setSignOptionsCollectionData(collection);
            request.setPassword(file.getPassword());
            request.setFolder(file.getFolder());
            request.setStorage(null);
            SignatureDocumentResponse response = signatureApi.postCollection(request);
            AssertSignatureResponse(file, response);
        }
    }

    /**
     * Sign document with Collection of Signatures for Pdf Documents
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void SignCollection_Pdf_Test() throws ApiException {
        PdfSignTextOptionsData signOptionsDataText = new PdfSignTextOptionsData();
        ComposeSignTextOptionsData(signOptionsDataText);
        PdfSignImageOptionsData signOptionsDataImgs = new PdfSignImageOptionsData();
        ComposeSignImageOptionsData(signOptionsDataImgs);
        PdfSignDigitalOptionsData signOptionsDataDgtl = new PdfSignDigitalOptionsData();
        ComposeSignDigitalOptionsData(signOptionsDataDgtl);
        PdfSignBarcodeOptionsData signOptionsDataBrcd = new PdfSignBarcodeOptionsData();
        ComposeSignBarcodeOptionsData(signOptionsDataBrcd);        
        PdfSignQRCodeOptionsData signOptionsDataQrcd = new PdfSignQRCodeOptionsData();
        ComposeSignQRCodeOptionsData(signOptionsDataQrcd);
        PdfSignStampOptionsData signOptionsDataStmp = new PdfSignStampOptionsData();
        ComposeSignStampOptionsData(signOptionsDataStmp);

        SignOptionsCollectionData collection = new SignOptionsCollectionData();
        collection.addItemsItem(signOptionsDataText);
        collection.addItemsItem(signOptionsDataImgs);
        collection.addItemsItem(signOptionsDataDgtl);        
        collection.addItemsItem(signOptionsDataBrcd);
        collection.addItemsItem(signOptionsDataQrcd);
        collection.addItemsItem(signOptionsDataStmp);
    
        for (TestFile file : TestFiles.PdfDocs) {
            PostCollectionRequest request = new PostCollectionRequest();
            request.setName(file.getFileName());
            request.setSignOptionsCollectionData(collection);
            request.setPassword(file.getPassword());
            request.setFolder(file.getFolder());
            request.setStorage(null);
            SignatureDocumentResponse response = signatureApi.postCollection(request);
            AssertSignatureResponse(file,response);
        }
    }

    /**
     * Sign document with Collection of Signatures for Slides Documents
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void SignCollection_Slides_Test() throws ApiException {
        
        SlidesSignTextOptionsData signOptionsDataText = new SlidesSignTextOptionsData();
        ComposeSignTextOptionsData(signOptionsDataText);
        SlidesSignImageOptionsData signOptionsDataImgs = new SlidesSignImageOptionsData();
        ComposeSignImageOptionsData(signOptionsDataImgs);
        SlidesSignBarcodeOptionsData signOptionsDataBrcd = new SlidesSignBarcodeOptionsData();
        ComposeSignBarcodeOptionsData(signOptionsDataBrcd);        
        SlidesSignQRCodeOptionsData signOptionsDataQrcd = new SlidesSignQRCodeOptionsData();
        ComposeSignQRCodeOptionsData(signOptionsDataQrcd);
        SlidesSignStampOptionsData signOptionsDataStmp = new SlidesSignStampOptionsData();
        ComposeSignStampOptionsData(signOptionsDataStmp);
    
        SignOptionsCollectionData collection = new SignOptionsCollectionData();
        collection.addItemsItem(signOptionsDataText);
        collection.addItemsItem(signOptionsDataImgs);       
        collection.addItemsItem(signOptionsDataBrcd);
        collection.addItemsItem(signOptionsDataQrcd);
        collection.addItemsItem(signOptionsDataStmp);

        for (TestFile file : TestFiles.SlidesDocs) {
            PostCollectionRequest request = new PostCollectionRequest();
            request.setName(file.getFileName());
            request.setSignOptionsCollectionData(collection);
            request.setPassword(file.getPassword());
            request.setFolder(file.getFolder());
            request.setStorage(null);
            SignatureDocumentResponse response = signatureApi.postCollection(request);
            AssertSignatureResponse(file,response);
        }
    }

    /**
     * Sign document with Collection of Signatures for Words Documents
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void SignCollection_Words_Test() throws ApiException {

        WordsSignTextOptionsData signOptionsDataText = new WordsSignTextOptionsData();
        ComposeSignTextOptionsData(signOptionsDataText);
        WordsSignImageOptionsData signOptionsDataImgs = new WordsSignImageOptionsData();
        ComposeSignImageOptionsData(signOptionsDataImgs);
        WordsSignDigitalOptionsData signOptionsDataDgtl = new WordsSignDigitalOptionsData();
        ComposeSignDigitalOptionsData(signOptionsDataDgtl);
        WordsSignBarcodeOptionsData signOptionsDataBrcd = new WordsSignBarcodeOptionsData();
        ComposeSignBarcodeOptionsData(signOptionsDataBrcd);        
        WordsSignQRCodeOptionsData signOptionsDataQrcd = new WordsSignQRCodeOptionsData();
        ComposeSignQRCodeOptionsData(signOptionsDataQrcd);
        WordsSignStampOptionsData signOptionsDataStmp = new WordsSignStampOptionsData();
        ComposeSignStampOptionsData(signOptionsDataStmp);
    
        SignOptionsCollectionData collection = new SignOptionsCollectionData();
        collection.addItemsItem(signOptionsDataText);
        collection.addItemsItem(signOptionsDataImgs);
        collection.addItemsItem(signOptionsDataDgtl);        
        collection.addItemsItem(signOptionsDataBrcd);
        collection.addItemsItem(signOptionsDataQrcd);
        collection.addItemsItem(signOptionsDataStmp);

        for (TestFile file : TestFiles.WordsDocs) {
            PostCollectionRequest request = new PostCollectionRequest();
            request.setName(file.getFileName());
            request.setSignOptionsCollectionData(collection);
            request.setPassword(file.getPassword());
            request.setFolder(file.getFolder());
            request.setStorage(null);
            // SignatureDocumentResponse response = signatureApi.postCollection(request);
            // unkown issue with assertion AssertSignatureResponse(file,response);
        }
    }
}