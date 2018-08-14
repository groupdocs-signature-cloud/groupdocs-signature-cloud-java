package com.groupdocs.cloud.signature.api;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.groupdocs.cloud.signature.client.ApiException;
import com.groupdocs.cloud.signature.model.*;

import org.junit.Test;

/**
 * API tests for SignatureApi
 */
public class BarcodesApiTests extends BaseApiTest {

    /**
     * List of support Barcodes.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getBarcodesTest() throws ApiException {
        BarcodeCollection response = signatureApi.getBarcodes();

        assertTrue(response.getBarcodeTypes().size() > 0);
        for (BarcodeType barcodeType : response.getBarcodeTypes()) {
            assertFalse(barcodeType.getName() == null);
            assertFalse(barcodeType.getName().isEmpty());
        }
    }
}