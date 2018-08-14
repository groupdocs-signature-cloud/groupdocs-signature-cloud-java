package com.groupdocs.cloud.signature.api;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.groupdocs.cloud.signature.client.ApiException;
import com.groupdocs.cloud.signature.model.*;

import org.junit.Test;

/**
 * API tests for SignatureApi
 */
public class QRCodesApiTests extends BaseApiTest {

    /**
     * List of support QRCodes.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getQRCodesTest() throws ApiException {
        QRCodeCollection response = signatureApi.getQRCodes();

        assertTrue(response.getQrCodeTypes().size() > 0);
        for (QRCodeType qrcodeType : response.getQrCodeTypes()) {
            assertFalse(qrcodeType.getName() == null);
            assertFalse(qrcodeType.getName().isEmpty());
        }
    }
}