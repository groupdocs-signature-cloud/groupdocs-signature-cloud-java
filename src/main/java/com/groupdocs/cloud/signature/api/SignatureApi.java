/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="SignatureApi.java">
 *   Copyright (c) 2003-2018 Aspose Pty Ltd
 * </copyright>
 * <summary>
 *  Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 * 
 *  The above copyright notice and this permission notice shall be included in all
 *  copies or substantial portions of the Software.
 * 
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *  SOFTWARE.
 * </summary>
 * --------------------------------------------------------------------------------------------------------------------
 */

package com.groupdocs.cloud.signature.api;

import com.groupdocs.cloud.signature.client.ApiCallback;
import com.groupdocs.cloud.signature.client.ApiClient;
import com.groupdocs.cloud.signature.client.ApiException;
import com.groupdocs.cloud.signature.client.ApiResponse;
import com.groupdocs.cloud.signature.client.Configuration;
import com.groupdocs.cloud.signature.client.Pair;
import com.groupdocs.cloud.signature.client.ProgressRequestBody;
import com.groupdocs.cloud.signature.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.groupdocs.cloud.signature.model.BarcodeCollection;
import com.groupdocs.cloud.signature.model.DocumentInfo;
import com.groupdocs.cloud.signature.model.FormatCollection;
import com.groupdocs.cloud.signature.model.QRCodeCollection;
import com.groupdocs.cloud.signature.model.SearchDocumentResponse;
import com.groupdocs.cloud.signature.model.SearchOptionsCollectionData;
import com.groupdocs.cloud.signature.model.SearchOptionsData;
import com.groupdocs.cloud.signature.model.SignOptionsCollectionData;
import com.groupdocs.cloud.signature.model.SignOptionsData;
import com.groupdocs.cloud.signature.model.SignatureDocumentResponse;
import com.groupdocs.cloud.signature.model.VerifiedDocumentResponse;
import com.groupdocs.cloud.signature.model.VerifyOptionsCollectionData;
import com.groupdocs.cloud.signature.model.VerifyOptionsData;
import com.groupdocs.cloud.signature.model.requests.*;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SignatureApi {
    private ApiClient apiClient;

    public SignatureApi(String appSid, String appKey) {
        this(new Configuration(appSid, appKey));
    }

    public SignatureApi(Configuration configuration) {
        this.apiClient = new ApiClient(configuration);
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getBarcodes
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getBarcodesCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/signature/barcodes";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getBarcodesValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getBarcodesCall(progressListener, progressRequestListener);
        return call;

    }

    /**
     * Retrieves list of supported Barcode type names.
     * 
     * @return BarcodeCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public BarcodeCollection getBarcodes() throws ApiException {
        ApiResponse<BarcodeCollection> resp = getBarcodesWithHttpInfo();
        return resp.getData();
    }

    /**
     * Retrieves list of supported Barcode type names.
     * 
     * @return ApiResponse&lt;BarcodeCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<BarcodeCollection> getBarcodesWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getBarcodesValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<BarcodeCollection>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieves list of supported Barcode type names. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getBarcodesAsync(final ApiCallback<BarcodeCollection> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getBarcodesValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<BarcodeCollection>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getDocumentInfo
     * @param request The request model
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getDocumentInfoCall(GetDocumentInfoRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/signature/{fileName}/document/info"
            .replaceAll("\\{" + "fileName" + "\\}", apiClient.escapeString(request.getFileName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.getPassword() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("password", request.getPassword()));
        if (request.getFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("folder", request.getFolder()));
        if (request.getStorage() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("storage", request.getStorage()));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getDocumentInfoValidateBeforeCall(GetDocumentInfoRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'fileName' is set
        if (request.getFileName() == null) {
            throw new ApiException("Missing the required parameter 'fileName' when calling getDocumentInfo(Async)");
        }
        

        com.squareup.okhttp.Call call = getDocumentInfoCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Retrieves document information.
     * 
     * @param request The request model
     * @return DocumentInfo
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DocumentInfo getDocumentInfo(GetDocumentInfoRequest request) throws ApiException {
        ApiResponse<DocumentInfo> resp = getDocumentInfoWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Retrieves document information.
     * 
     * @param request The request model
     * @return ApiResponse&lt;DocumentInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DocumentInfo> getDocumentInfoWithHttpInfo(GetDocumentInfoRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getDocumentInfoValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<DocumentInfo>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieves document information. (asynchronously)
     * 
     * @param request The request model
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDocumentInfoAsync(GetDocumentInfoRequest request, final ApiCallback<DocumentInfo> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getDocumentInfoValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DocumentInfo>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getDocumentInfoFromUrl
     * @param request The request model
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getDocumentInfoFromUrlCall(GetDocumentInfoFromUrlRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/signature/document/info";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.getUrl() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("url", request.getUrl()));
        if (request.getPassword() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("password", request.getPassword()));
        if (request.getStorage() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("storage", request.getStorage()));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getDocumentInfoFromUrlValidateBeforeCall(GetDocumentInfoFromUrlRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'url' is set
        if (request.getUrl() == null) {
            throw new ApiException("Missing the required parameter 'url' when calling getDocumentInfoFromUrl(Async)");
        }
        

        com.squareup.okhttp.Call call = getDocumentInfoFromUrlCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Retrieves document information for document at provided URL. Retrieves file from specified URL and tries to detect file type when fileName parameter is not specified. Saves retrieved file in storage. Use fileName and folder parameters to specify desired file name and folder to save file. When file with specified name already exists in storage new unique file name will be used for file.
     * 
     * @param request The request model
     * @return DocumentInfo
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DocumentInfo getDocumentInfoFromUrl(GetDocumentInfoFromUrlRequest request) throws ApiException {
        ApiResponse<DocumentInfo> resp = getDocumentInfoFromUrlWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Retrieves document information for document at provided URL. Retrieves file from specified URL and tries to detect file type when fileName parameter is not specified. Saves retrieved file in storage. Use fileName and folder parameters to specify desired file name and folder to save file. When file with specified name already exists in storage new unique file name will be used for file.
     * 
     * @param request The request model
     * @return ApiResponse&lt;DocumentInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DocumentInfo> getDocumentInfoFromUrlWithHttpInfo(GetDocumentInfoFromUrlRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getDocumentInfoFromUrlValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<DocumentInfo>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieves document information for document at provided URL. Retrieves file from specified URL and tries to detect file type when fileName parameter is not specified. Saves retrieved file in storage. Use fileName and folder parameters to specify desired file name and folder to save file. When file with specified name already exists in storage new unique file name will be used for file. (asynchronously)
     * 
     * @param request The request model
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDocumentInfoFromUrlAsync(GetDocumentInfoFromUrlRequest request, final ApiCallback<DocumentInfo> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getDocumentInfoFromUrlValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DocumentInfo>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getQRCodes
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getQRCodesCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/signature/qrcodes";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getQRCodesValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getQRCodesCall(progressListener, progressRequestListener);
        return call;

    }

    /**
     * Retrieves list of supported QR-Code type names.
     * 
     * @return QRCodeCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public QRCodeCollection getQRCodes() throws ApiException {
        ApiResponse<QRCodeCollection> resp = getQRCodesWithHttpInfo();
        return resp.getData();
    }

    /**
     * Retrieves list of supported QR-Code type names.
     * 
     * @return ApiResponse&lt;QRCodeCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<QRCodeCollection> getQRCodesWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getQRCodesValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<QRCodeCollection>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieves list of supported QR-Code type names. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getQRCodesAsync(final ApiCallback<QRCodeCollection> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getQRCodesValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<QRCodeCollection>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSupportedFormats
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSupportedFormatsCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/signature/formats";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getSupportedFormatsValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getSupportedFormatsCall(progressListener, progressRequestListener);
        return call;

    }

    /**
     * Lists supported file formats.
     * 
     * @return FormatCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public FormatCollection getSupportedFormats() throws ApiException {
        ApiResponse<FormatCollection> resp = getSupportedFormatsWithHttpInfo();
        return resp.getData();
    }

    /**
     * Lists supported file formats.
     * 
     * @return ApiResponse&lt;FormatCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<FormatCollection> getSupportedFormatsWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getSupportedFormatsValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<FormatCollection>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Lists supported file formats. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSupportedFormatsAsync(final ApiCallback<FormatCollection> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getSupportedFormatsValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<FormatCollection>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postBarcode
     * @param request The request model
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postBarcodeCall(PostBarcodeRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request.getSignOptionsData();

        // create path and map variables
        String localVarPath = "/signature/{name}/barcode"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.getPassword() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("password", request.getPassword()));
        if (request.getFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("folder", request.getFolder()));
        if (request.getStorage() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("storage", request.getStorage()));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postBarcodeValidateBeforeCall(PostBarcodeRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling postBarcode(Async)");
        }
        

        com.squareup.okhttp.Call call = postBarcodeCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Insert Barcode Signature into the Document
     * 
     * @param request The request model
     * @return SignatureDocumentResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SignatureDocumentResponse postBarcode(PostBarcodeRequest request) throws ApiException {
        ApiResponse<SignatureDocumentResponse> resp = postBarcodeWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Insert Barcode Signature into the Document
     * 
     * @param request The request model
     * @return ApiResponse&lt;SignatureDocumentResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SignatureDocumentResponse> postBarcodeWithHttpInfo(PostBarcodeRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postBarcodeValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<SignatureDocumentResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Insert Barcode Signature into the Document (asynchronously)
     * 
     * @param request The request model
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postBarcodeAsync(PostBarcodeRequest request, final ApiCallback<SignatureDocumentResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postBarcodeValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SignatureDocumentResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postBarcodeFromUrl
     * @param request The request model
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postBarcodeFromUrlCall(PostBarcodeFromUrlRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request.getSignOptionsData();

        // create path and map variables
        String localVarPath = "/signature/barcode";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.getUrl() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("url", request.getUrl()));
        if (request.getPassword() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("password", request.getPassword()));
        if (request.getStorage() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("storage", request.getStorage()));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postBarcodeFromUrlValidateBeforeCall(PostBarcodeFromUrlRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'url' is set
        if (request.getUrl() == null) {
            throw new ApiException("Missing the required parameter 'url' when calling postBarcodeFromUrl(Async)");
        }
        

        com.squareup.okhttp.Call call = postBarcodeFromUrlCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Insert Barcode Signature into the Document provided by URL
     * 
     * @param request The request model
     * @return SignatureDocumentResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SignatureDocumentResponse postBarcodeFromUrl(PostBarcodeFromUrlRequest request) throws ApiException {
        ApiResponse<SignatureDocumentResponse> resp = postBarcodeFromUrlWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Insert Barcode Signature into the Document provided by URL
     * 
     * @param request The request model
     * @return ApiResponse&lt;SignatureDocumentResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SignatureDocumentResponse> postBarcodeFromUrlWithHttpInfo(PostBarcodeFromUrlRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postBarcodeFromUrlValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<SignatureDocumentResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Insert Barcode Signature into the Document provided by URL (asynchronously)
     * 
     * @param request The request model
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postBarcodeFromUrlAsync(PostBarcodeFromUrlRequest request, final ApiCallback<SignatureDocumentResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postBarcodeFromUrlValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SignatureDocumentResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postCollection
     * @param request The request model
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postCollectionCall(PostCollectionRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request.getSignOptionsCollectionData();

        // create path and map variables
        String localVarPath = "/signature/{name}/collection"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.getPassword() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("password", request.getPassword()));
        if (request.getFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("folder", request.getFolder()));
        if (request.getStorage() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("storage", request.getStorage()));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postCollectionValidateBeforeCall(PostCollectionRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling postCollection(Async)");
        }
        

        com.squareup.okhttp.Call call = postCollectionCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Insert Signature into the Document
     * 
     * @param request The request model
     * @return SignatureDocumentResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SignatureDocumentResponse postCollection(PostCollectionRequest request) throws ApiException {
        ApiResponse<SignatureDocumentResponse> resp = postCollectionWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Insert Signature into the Document
     * 
     * @param request The request model
     * @return ApiResponse&lt;SignatureDocumentResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SignatureDocumentResponse> postCollectionWithHttpInfo(PostCollectionRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postCollectionValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<SignatureDocumentResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Insert Signature into the Document (asynchronously)
     * 
     * @param request The request model
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postCollectionAsync(PostCollectionRequest request, final ApiCallback<SignatureDocumentResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postCollectionValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SignatureDocumentResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postCollectionFromUrl
     * @param request The request model
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postCollectionFromUrlCall(PostCollectionFromUrlRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request.getSignOptionsCollectionData();

        // create path and map variables
        String localVarPath = "/signature/collection";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.getUrl() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("url", request.getUrl()));
        if (request.getPassword() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("password", request.getPassword()));
        if (request.getStorage() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("storage", request.getStorage()));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postCollectionFromUrlValidateBeforeCall(PostCollectionFromUrlRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'url' is set
        if (request.getUrl() == null) {
            throw new ApiException("Missing the required parameter 'url' when calling postCollectionFromUrl(Async)");
        }
        

        com.squareup.okhttp.Call call = postCollectionFromUrlCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Insert Stamp Signature into the Document provided by URL
     * 
     * @param request The request model
     * @return SignatureDocumentResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SignatureDocumentResponse postCollectionFromUrl(PostCollectionFromUrlRequest request) throws ApiException {
        ApiResponse<SignatureDocumentResponse> resp = postCollectionFromUrlWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Insert Stamp Signature into the Document provided by URL
     * 
     * @param request The request model
     * @return ApiResponse&lt;SignatureDocumentResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SignatureDocumentResponse> postCollectionFromUrlWithHttpInfo(PostCollectionFromUrlRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postCollectionFromUrlValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<SignatureDocumentResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Insert Stamp Signature into the Document provided by URL (asynchronously)
     * 
     * @param request The request model
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postCollectionFromUrlAsync(PostCollectionFromUrlRequest request, final ApiCallback<SignatureDocumentResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postCollectionFromUrlValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SignatureDocumentResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postDigital
     * @param request The request model
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postDigitalCall(PostDigitalRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request.getSignOptionsData();

        // create path and map variables
        String localVarPath = "/signature/{name}/digital"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.getPassword() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("password", request.getPassword()));
        if (request.getFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("folder", request.getFolder()));
        if (request.getCertificateFile() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("certificateFile", request.getCertificateFile()));
        if (request.getImageFile() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("imageFile", request.getImageFile()));
        if (request.getStorage() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("storage", request.getStorage()));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postDigitalValidateBeforeCall(PostDigitalRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling postDigital(Async)");
        }
        

        com.squareup.okhttp.Call call = postDigitalCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Insert Digital Signature into the Document
     * 
     * @param request The request model
     * @return SignatureDocumentResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SignatureDocumentResponse postDigital(PostDigitalRequest request) throws ApiException {
        ApiResponse<SignatureDocumentResponse> resp = postDigitalWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Insert Digital Signature into the Document
     * 
     * @param request The request model
     * @return ApiResponse&lt;SignatureDocumentResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SignatureDocumentResponse> postDigitalWithHttpInfo(PostDigitalRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postDigitalValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<SignatureDocumentResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Insert Digital Signature into the Document (asynchronously)
     * 
     * @param request The request model
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postDigitalAsync(PostDigitalRequest request, final ApiCallback<SignatureDocumentResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postDigitalValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SignatureDocumentResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postDigitalFromUrl
     * @param request The request model
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postDigitalFromUrlCall(PostDigitalFromUrlRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request.getSignOptionsData();

        // create path and map variables
        String localVarPath = "/signature/digital";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.getUrl() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("url", request.getUrl()));
        if (request.getPassword() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("password", request.getPassword()));
        if (request.getCertificateFile() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("certificateFile", request.getCertificateFile()));
        if (request.getImageFile() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("imageFile", request.getImageFile()));
        if (request.getStorage() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("storage", request.getStorage()));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postDigitalFromUrlValidateBeforeCall(PostDigitalFromUrlRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'url' is set
        if (request.getUrl() == null) {
            throw new ApiException("Missing the required parameter 'url' when calling postDigitalFromUrl(Async)");
        }
        

        com.squareup.okhttp.Call call = postDigitalFromUrlCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Insert Digital Signature into the Document
     * 
     * @param request The request model
     * @return SignatureDocumentResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SignatureDocumentResponse postDigitalFromUrl(PostDigitalFromUrlRequest request) throws ApiException {
        ApiResponse<SignatureDocumentResponse> resp = postDigitalFromUrlWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Insert Digital Signature into the Document
     * 
     * @param request The request model
     * @return ApiResponse&lt;SignatureDocumentResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SignatureDocumentResponse> postDigitalFromUrlWithHttpInfo(PostDigitalFromUrlRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postDigitalFromUrlValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<SignatureDocumentResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Insert Digital Signature into the Document (asynchronously)
     * 
     * @param request The request model
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postDigitalFromUrlAsync(PostDigitalFromUrlRequest request, final ApiCallback<SignatureDocumentResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postDigitalFromUrlValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SignatureDocumentResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postImage
     * @param request The request model
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postImageCall(PostImageRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request.getSignOptionsData();

        // create path and map variables
        String localVarPath = "/signature/{name}/image"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.getPassword() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("password", request.getPassword()));
        if (request.getFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("folder", request.getFolder()));
        if (request.getImage() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("image", request.getImage()));
        if (request.getStorage() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("storage", request.getStorage()));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postImageValidateBeforeCall(PostImageRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling postImage(Async)");
        }
        

        com.squareup.okhttp.Call call = postImageCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Insert Image Signature into the Document
     * 
     * @param request The request model
     * @return SignatureDocumentResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SignatureDocumentResponse postImage(PostImageRequest request) throws ApiException {
        ApiResponse<SignatureDocumentResponse> resp = postImageWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Insert Image Signature into the Document
     * 
     * @param request The request model
     * @return ApiResponse&lt;SignatureDocumentResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SignatureDocumentResponse> postImageWithHttpInfo(PostImageRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postImageValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<SignatureDocumentResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Insert Image Signature into the Document (asynchronously)
     * 
     * @param request The request model
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postImageAsync(PostImageRequest request, final ApiCallback<SignatureDocumentResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postImageValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SignatureDocumentResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postImageFromUrl
     * @param request The request model
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postImageFromUrlCall(PostImageFromUrlRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request.getSignOptionsData();

        // create path and map variables
        String localVarPath = "/signature/image";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.getUrl() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("url", request.getUrl()));
        if (request.getPassword() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("password", request.getPassword()));
        if (request.getImage() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("image", request.getImage()));
        if (request.getStorage() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("storage", request.getStorage()));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postImageFromUrlValidateBeforeCall(PostImageFromUrlRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'url' is set
        if (request.getUrl() == null) {
            throw new ApiException("Missing the required parameter 'url' when calling postImageFromUrl(Async)");
        }
        

        com.squareup.okhttp.Call call = postImageFromUrlCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Insert Image Signature into the Document provided by URL
     * 
     * @param request The request model
     * @return SignatureDocumentResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SignatureDocumentResponse postImageFromUrl(PostImageFromUrlRequest request) throws ApiException {
        ApiResponse<SignatureDocumentResponse> resp = postImageFromUrlWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Insert Image Signature into the Document provided by URL
     * 
     * @param request The request model
     * @return ApiResponse&lt;SignatureDocumentResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SignatureDocumentResponse> postImageFromUrlWithHttpInfo(PostImageFromUrlRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postImageFromUrlValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<SignatureDocumentResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Insert Image Signature into the Document provided by URL (asynchronously)
     * 
     * @param request The request model
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postImageFromUrlAsync(PostImageFromUrlRequest request, final ApiCallback<SignatureDocumentResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postImageFromUrlValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SignatureDocumentResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postQRCode
     * @param request The request model
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postQRCodeCall(PostQRCodeRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request.getSignOptionsData();

        // create path and map variables
        String localVarPath = "/signature/{name}/qrcode"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.getPassword() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("password", request.getPassword()));
        if (request.getFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("folder", request.getFolder()));
        if (request.getStorage() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("storage", request.getStorage()));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postQRCodeValidateBeforeCall(PostQRCodeRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling postQRCode(Async)");
        }
        

        com.squareup.okhttp.Call call = postQRCodeCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Insert QRCode Signature into the Document
     * 
     * @param request The request model
     * @return SignatureDocumentResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SignatureDocumentResponse postQRCode(PostQRCodeRequest request) throws ApiException {
        ApiResponse<SignatureDocumentResponse> resp = postQRCodeWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Insert QRCode Signature into the Document
     * 
     * @param request The request model
     * @return ApiResponse&lt;SignatureDocumentResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SignatureDocumentResponse> postQRCodeWithHttpInfo(PostQRCodeRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postQRCodeValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<SignatureDocumentResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Insert QRCode Signature into the Document (asynchronously)
     * 
     * @param request The request model
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postQRCodeAsync(PostQRCodeRequest request, final ApiCallback<SignatureDocumentResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postQRCodeValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SignatureDocumentResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postQRCodeFromUrl
     * @param request The request model
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postQRCodeFromUrlCall(PostQRCodeFromUrlRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request.getSignOptionsData();

        // create path and map variables
        String localVarPath = "/signature/qrcode";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.getUrl() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("url", request.getUrl()));
        if (request.getPassword() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("password", request.getPassword()));
        if (request.getStorage() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("storage", request.getStorage()));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postQRCodeFromUrlValidateBeforeCall(PostQRCodeFromUrlRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'url' is set
        if (request.getUrl() == null) {
            throw new ApiException("Missing the required parameter 'url' when calling postQRCodeFromUrl(Async)");
        }
        

        com.squareup.okhttp.Call call = postQRCodeFromUrlCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Insert QRCode Signature into the Document provided by URL
     * 
     * @param request The request model
     * @return SignatureDocumentResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SignatureDocumentResponse postQRCodeFromUrl(PostQRCodeFromUrlRequest request) throws ApiException {
        ApiResponse<SignatureDocumentResponse> resp = postQRCodeFromUrlWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Insert QRCode Signature into the Document provided by URL
     * 
     * @param request The request model
     * @return ApiResponse&lt;SignatureDocumentResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SignatureDocumentResponse> postQRCodeFromUrlWithHttpInfo(PostQRCodeFromUrlRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postQRCodeFromUrlValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<SignatureDocumentResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Insert QRCode Signature into the Document provided by URL (asynchronously)
     * 
     * @param request The request model
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postQRCodeFromUrlAsync(PostQRCodeFromUrlRequest request, final ApiCallback<SignatureDocumentResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postQRCodeFromUrlValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SignatureDocumentResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postSearchBarcode
     * @param request The request model
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postSearchBarcodeCall(PostSearchBarcodeRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request.getSearchOptionsData();

        // create path and map variables
        String localVarPath = "/signature/{name}/barcode/search"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.getPassword() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("password", request.getPassword()));
        if (request.getFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("folder", request.getFolder()));
        if (request.getStorage() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("storage", request.getStorage()));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postSearchBarcodeValidateBeforeCall(PostSearchBarcodeRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling postSearchBarcode(Async)");
        }
        

        com.squareup.okhttp.Call call = postSearchBarcodeCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Search the Document with Barcode Signatures
     * 
     * @param request The request model
     * @return SearchDocumentResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SearchDocumentResponse postSearchBarcode(PostSearchBarcodeRequest request) throws ApiException {
        ApiResponse<SearchDocumentResponse> resp = postSearchBarcodeWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Search the Document with Barcode Signatures
     * 
     * @param request The request model
     * @return ApiResponse&lt;SearchDocumentResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SearchDocumentResponse> postSearchBarcodeWithHttpInfo(PostSearchBarcodeRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postSearchBarcodeValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<SearchDocumentResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Search the Document with Barcode Signatures (asynchronously)
     * 
     * @param request The request model
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postSearchBarcodeAsync(PostSearchBarcodeRequest request, final ApiCallback<SearchDocumentResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postSearchBarcodeValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SearchDocumentResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postSearchBarcodeFromUrl
     * @param request The request model
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postSearchBarcodeFromUrlCall(PostSearchBarcodeFromUrlRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request.getSearchOptionsData();

        // create path and map variables
        String localVarPath = "/signature/barcode/search";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.getUrl() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("url", request.getUrl()));
        if (request.getPassword() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("password", request.getPassword()));
        if (request.getStorage() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("storage", request.getStorage()));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postSearchBarcodeFromUrlValidateBeforeCall(PostSearchBarcodeFromUrlRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'url' is set
        if (request.getUrl() == null) {
            throw new ApiException("Missing the required parameter 'url' when calling postSearchBarcodeFromUrl(Async)");
        }
        

        com.squareup.okhttp.Call call = postSearchBarcodeFromUrlCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Search the url based Document with Barcode Signatures
     * 
     * @param request The request model
     * @return SearchDocumentResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SearchDocumentResponse postSearchBarcodeFromUrl(PostSearchBarcodeFromUrlRequest request) throws ApiException {
        ApiResponse<SearchDocumentResponse> resp = postSearchBarcodeFromUrlWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Search the url based Document with Barcode Signatures
     * 
     * @param request The request model
     * @return ApiResponse&lt;SearchDocumentResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SearchDocumentResponse> postSearchBarcodeFromUrlWithHttpInfo(PostSearchBarcodeFromUrlRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postSearchBarcodeFromUrlValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<SearchDocumentResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Search the url based Document with Barcode Signatures (asynchronously)
     * 
     * @param request The request model
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postSearchBarcodeFromUrlAsync(PostSearchBarcodeFromUrlRequest request, final ApiCallback<SearchDocumentResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postSearchBarcodeFromUrlValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SearchDocumentResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postSearchCollection
     * @param request The request model
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postSearchCollectionCall(PostSearchCollectionRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request.getSearchOptionsCollectionData();

        // create path and map variables
        String localVarPath = "/signature/{name}/collection/search"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.getPassword() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("password", request.getPassword()));
        if (request.getFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("folder", request.getFolder()));
        if (request.getStorage() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("storage", request.getStorage()));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postSearchCollectionValidateBeforeCall(PostSearchCollectionRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling postSearchCollection(Async)");
        }
        

        com.squareup.okhttp.Call call = postSearchCollectionCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Search the Document.
     * 
     * @param request The request model
     * @return SearchDocumentResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SearchDocumentResponse postSearchCollection(PostSearchCollectionRequest request) throws ApiException {
        ApiResponse<SearchDocumentResponse> resp = postSearchCollectionWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Search the Document.
     * 
     * @param request The request model
     * @return ApiResponse&lt;SearchDocumentResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SearchDocumentResponse> postSearchCollectionWithHttpInfo(PostSearchCollectionRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postSearchCollectionValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<SearchDocumentResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Search the Document. (asynchronously)
     * 
     * @param request The request model
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postSearchCollectionAsync(PostSearchCollectionRequest request, final ApiCallback<SearchDocumentResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postSearchCollectionValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SearchDocumentResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postSearchCollectionFromUrl
     * @param request The request model
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postSearchCollectionFromUrlCall(PostSearchCollectionFromUrlRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request.getSearchOptionsCollectionData();

        // create path and map variables
        String localVarPath = "/signature/collection/search";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.getUrl() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("url", request.getUrl()));
        if (request.getPassword() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("password", request.getPassword()));
        if (request.getStorage() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("storage", request.getStorage()));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postSearchCollectionFromUrlValidateBeforeCall(PostSearchCollectionFromUrlRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'url' is set
        if (request.getUrl() == null) {
            throw new ApiException("Missing the required parameter 'url' when calling postSearchCollectionFromUrl(Async)");
        }
        

        com.squareup.okhttp.Call call = postSearchCollectionFromUrlCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Search the Document provided by URL.
     * 
     * @param request The request model
     * @return SearchDocumentResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SearchDocumentResponse postSearchCollectionFromUrl(PostSearchCollectionFromUrlRequest request) throws ApiException {
        ApiResponse<SearchDocumentResponse> resp = postSearchCollectionFromUrlWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Search the Document provided by URL.
     * 
     * @param request The request model
     * @return ApiResponse&lt;SearchDocumentResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SearchDocumentResponse> postSearchCollectionFromUrlWithHttpInfo(PostSearchCollectionFromUrlRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postSearchCollectionFromUrlValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<SearchDocumentResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Search the Document provided by URL. (asynchronously)
     * 
     * @param request The request model
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postSearchCollectionFromUrlAsync(PostSearchCollectionFromUrlRequest request, final ApiCallback<SearchDocumentResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postSearchCollectionFromUrlValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SearchDocumentResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postSearchDigital
     * @param request The request model
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postSearchDigitalCall(PostSearchDigitalRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request.getSearchOptionsData();

        // create path and map variables
        String localVarPath = "/signature/{name}/digital/search"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.getPassword() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("password", request.getPassword()));
        if (request.getFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("folder", request.getFolder()));
        if (request.getStorage() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("storage", request.getStorage()));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postSearchDigitalValidateBeforeCall(PostSearchDigitalRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling postSearchDigital(Async)");
        }
        

        com.squareup.okhttp.Call call = postSearchDigitalCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Search the Document with Digital Signatures
     * 
     * @param request The request model
     * @return SearchDocumentResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SearchDocumentResponse postSearchDigital(PostSearchDigitalRequest request) throws ApiException {
        ApiResponse<SearchDocumentResponse> resp = postSearchDigitalWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Search the Document with Digital Signatures
     * 
     * @param request The request model
     * @return ApiResponse&lt;SearchDocumentResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SearchDocumentResponse> postSearchDigitalWithHttpInfo(PostSearchDigitalRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postSearchDigitalValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<SearchDocumentResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Search the Document with Digital Signatures (asynchronously)
     * 
     * @param request The request model
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postSearchDigitalAsync(PostSearchDigitalRequest request, final ApiCallback<SearchDocumentResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postSearchDigitalValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SearchDocumentResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postSearchDigitalFromUrl
     * @param request The request model
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postSearchDigitalFromUrlCall(PostSearchDigitalFromUrlRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request.getSearchOptionsData();

        // create path and map variables
        String localVarPath = "/signature/digital/search";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.getUrl() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("url", request.getUrl()));
        if (request.getPassword() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("password", request.getPassword()));
        if (request.getStorage() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("storage", request.getStorage()));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postSearchDigitalFromUrlValidateBeforeCall(PostSearchDigitalFromUrlRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'url' is set
        if (request.getUrl() == null) {
            throw new ApiException("Missing the required parameter 'url' when calling postSearchDigitalFromUrl(Async)");
        }
        

        com.squareup.okhttp.Call call = postSearchDigitalFromUrlCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Search the Document from url with Digital Signatures
     * 
     * @param request The request model
     * @return SearchDocumentResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SearchDocumentResponse postSearchDigitalFromUrl(PostSearchDigitalFromUrlRequest request) throws ApiException {
        ApiResponse<SearchDocumentResponse> resp = postSearchDigitalFromUrlWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Search the Document from url with Digital Signatures
     * 
     * @param request The request model
     * @return ApiResponse&lt;SearchDocumentResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SearchDocumentResponse> postSearchDigitalFromUrlWithHttpInfo(PostSearchDigitalFromUrlRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postSearchDigitalFromUrlValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<SearchDocumentResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Search the Document from url with Digital Signatures (asynchronously)
     * 
     * @param request The request model
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postSearchDigitalFromUrlAsync(PostSearchDigitalFromUrlRequest request, final ApiCallback<SearchDocumentResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postSearchDigitalFromUrlValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SearchDocumentResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postSearchQRCode
     * @param request The request model
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postSearchQRCodeCall(PostSearchQRCodeRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request.getSearchOptionsData();

        // create path and map variables
        String localVarPath = "/signature/{name}/qrcode/search"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.getPassword() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("password", request.getPassword()));
        if (request.getFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("folder", request.getFolder()));
        if (request.getStorage() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("storage", request.getStorage()));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postSearchQRCodeValidateBeforeCall(PostSearchQRCodeRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling postSearchQRCode(Async)");
        }
        

        com.squareup.okhttp.Call call = postSearchQRCodeCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Search the Document with QRCode Signatures
     * 
     * @param request The request model
     * @return SearchDocumentResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SearchDocumentResponse postSearchQRCode(PostSearchQRCodeRequest request) throws ApiException {
        ApiResponse<SearchDocumentResponse> resp = postSearchQRCodeWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Search the Document with QRCode Signatures
     * 
     * @param request The request model
     * @return ApiResponse&lt;SearchDocumentResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SearchDocumentResponse> postSearchQRCodeWithHttpInfo(PostSearchQRCodeRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postSearchQRCodeValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<SearchDocumentResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Search the Document with QRCode Signatures (asynchronously)
     * 
     * @param request The request model
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postSearchQRCodeAsync(PostSearchQRCodeRequest request, final ApiCallback<SearchDocumentResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postSearchQRCodeValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SearchDocumentResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postSearchQRCodeFromUrl
     * @param request The request model
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postSearchQRCodeFromUrlCall(PostSearchQRCodeFromUrlRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request.getSearchOptionsData();

        // create path and map variables
        String localVarPath = "/signature/qrcode/search";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.getUrl() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("url", request.getUrl()));
        if (request.getPassword() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("password", request.getPassword()));
        if (request.getStorage() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("storage", request.getStorage()));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postSearchQRCodeFromUrlValidateBeforeCall(PostSearchQRCodeFromUrlRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'url' is set
        if (request.getUrl() == null) {
            throw new ApiException("Missing the required parameter 'url' when calling postSearchQRCodeFromUrl(Async)");
        }
        

        com.squareup.okhttp.Call call = postSearchQRCodeFromUrlCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Search the url based Document with QRCode Signatures
     * 
     * @param request The request model
     * @return SearchDocumentResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SearchDocumentResponse postSearchQRCodeFromUrl(PostSearchQRCodeFromUrlRequest request) throws ApiException {
        ApiResponse<SearchDocumentResponse> resp = postSearchQRCodeFromUrlWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Search the url based Document with QRCode Signatures
     * 
     * @param request The request model
     * @return ApiResponse&lt;SearchDocumentResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SearchDocumentResponse> postSearchQRCodeFromUrlWithHttpInfo(PostSearchQRCodeFromUrlRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postSearchQRCodeFromUrlValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<SearchDocumentResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Search the url based Document with QRCode Signatures (asynchronously)
     * 
     * @param request The request model
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postSearchQRCodeFromUrlAsync(PostSearchQRCodeFromUrlRequest request, final ApiCallback<SearchDocumentResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postSearchQRCodeFromUrlValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SearchDocumentResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postStamp
     * @param request The request model
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postStampCall(PostStampRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request.getSignOptionsData();

        // create path and map variables
        String localVarPath = "/signature/{name}/stamp"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.getPassword() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("password", request.getPassword()));
        if (request.getFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("folder", request.getFolder()));
        if (request.getStorage() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("storage", request.getStorage()));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postStampValidateBeforeCall(PostStampRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling postStamp(Async)");
        }
        

        com.squareup.okhttp.Call call = postStampCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Insert Stamp Signature into the Document
     * 
     * @param request The request model
     * @return SignatureDocumentResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SignatureDocumentResponse postStamp(PostStampRequest request) throws ApiException {
        ApiResponse<SignatureDocumentResponse> resp = postStampWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Insert Stamp Signature into the Document
     * 
     * @param request The request model
     * @return ApiResponse&lt;SignatureDocumentResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SignatureDocumentResponse> postStampWithHttpInfo(PostStampRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postStampValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<SignatureDocumentResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Insert Stamp Signature into the Document (asynchronously)
     * 
     * @param request The request model
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postStampAsync(PostStampRequest request, final ApiCallback<SignatureDocumentResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postStampValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SignatureDocumentResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postStampFromUrl
     * @param request The request model
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postStampFromUrlCall(PostStampFromUrlRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request.getSignOptionsData();

        // create path and map variables
        String localVarPath = "/signature/stamp";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.getUrl() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("url", request.getUrl()));
        if (request.getPassword() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("password", request.getPassword()));
        if (request.getStorage() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("storage", request.getStorage()));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postStampFromUrlValidateBeforeCall(PostStampFromUrlRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'url' is set
        if (request.getUrl() == null) {
            throw new ApiException("Missing the required parameter 'url' when calling postStampFromUrl(Async)");
        }
        

        com.squareup.okhttp.Call call = postStampFromUrlCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Insert Stamp Signature into the Document provided by URL
     * 
     * @param request The request model
     * @return SignatureDocumentResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SignatureDocumentResponse postStampFromUrl(PostStampFromUrlRequest request) throws ApiException {
        ApiResponse<SignatureDocumentResponse> resp = postStampFromUrlWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Insert Stamp Signature into the Document provided by URL
     * 
     * @param request The request model
     * @return ApiResponse&lt;SignatureDocumentResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SignatureDocumentResponse> postStampFromUrlWithHttpInfo(PostStampFromUrlRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postStampFromUrlValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<SignatureDocumentResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Insert Stamp Signature into the Document provided by URL (asynchronously)
     * 
     * @param request The request model
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postStampFromUrlAsync(PostStampFromUrlRequest request, final ApiCallback<SignatureDocumentResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postStampFromUrlValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SignatureDocumentResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postText
     * @param request The request model
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postTextCall(PostTextRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request.getSignOptionsData();

        // create path and map variables
        String localVarPath = "/signature/{name}/text"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.getPassword() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("password", request.getPassword()));
        if (request.getFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("folder", request.getFolder()));
        if (request.getStorage() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("storage", request.getStorage()));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postTextValidateBeforeCall(PostTextRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling postText(Async)");
        }
        

        com.squareup.okhttp.Call call = postTextCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Insert Text Signature into the Document
     * 
     * @param request The request model
     * @return SignatureDocumentResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SignatureDocumentResponse postText(PostTextRequest request) throws ApiException {
        ApiResponse<SignatureDocumentResponse> resp = postTextWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Insert Text Signature into the Document
     * 
     * @param request The request model
     * @return ApiResponse&lt;SignatureDocumentResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SignatureDocumentResponse> postTextWithHttpInfo(PostTextRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postTextValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<SignatureDocumentResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Insert Text Signature into the Document (asynchronously)
     * 
     * @param request The request model
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postTextAsync(PostTextRequest request, final ApiCallback<SignatureDocumentResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postTextValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SignatureDocumentResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postTextFromUrl
     * @param request The request model
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postTextFromUrlCall(PostTextFromUrlRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request.getSignOptionsData();

        // create path and map variables
        String localVarPath = "/signature/text";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.getUrl() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("url", request.getUrl()));
        if (request.getPassword() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("password", request.getPassword()));
        if (request.getStorage() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("storage", request.getStorage()));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postTextFromUrlValidateBeforeCall(PostTextFromUrlRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'url' is set
        if (request.getUrl() == null) {
            throw new ApiException("Missing the required parameter 'url' when calling postTextFromUrl(Async)");
        }
        

        com.squareup.okhttp.Call call = postTextFromUrlCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Insert Text Signature into the Document
     * 
     * @param request The request model
     * @return SignatureDocumentResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SignatureDocumentResponse postTextFromUrl(PostTextFromUrlRequest request) throws ApiException {
        ApiResponse<SignatureDocumentResponse> resp = postTextFromUrlWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Insert Text Signature into the Document
     * 
     * @param request The request model
     * @return ApiResponse&lt;SignatureDocumentResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SignatureDocumentResponse> postTextFromUrlWithHttpInfo(PostTextFromUrlRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postTextFromUrlValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<SignatureDocumentResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Insert Text Signature into the Document (asynchronously)
     * 
     * @param request The request model
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postTextFromUrlAsync(PostTextFromUrlRequest request, final ApiCallback<SignatureDocumentResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postTextFromUrlValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SignatureDocumentResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postVerificationBarcode
     * @param request The request model
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postVerificationBarcodeCall(PostVerificationBarcodeRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request.getVerifyOptionsData();

        // create path and map variables
        String localVarPath = "/signature/{name}/barcode/verification"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.getPassword() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("password", request.getPassword()));
        if (request.getFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("folder", request.getFolder()));
        if (request.getStorage() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("storage", request.getStorage()));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postVerificationBarcodeValidateBeforeCall(PostVerificationBarcodeRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling postVerificationBarcode(Async)");
        }
        

        com.squareup.okhttp.Call call = postVerificationBarcodeCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Verify the Document with Barcode Signatures
     * 
     * @param request The request model
     * @return VerifiedDocumentResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public VerifiedDocumentResponse postVerificationBarcode(PostVerificationBarcodeRequest request) throws ApiException {
        ApiResponse<VerifiedDocumentResponse> resp = postVerificationBarcodeWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Verify the Document with Barcode Signatures
     * 
     * @param request The request model
     * @return ApiResponse&lt;VerifiedDocumentResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<VerifiedDocumentResponse> postVerificationBarcodeWithHttpInfo(PostVerificationBarcodeRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postVerificationBarcodeValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<VerifiedDocumentResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Verify the Document with Barcode Signatures (asynchronously)
     * 
     * @param request The request model
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postVerificationBarcodeAsync(PostVerificationBarcodeRequest request, final ApiCallback<VerifiedDocumentResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postVerificationBarcodeValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<VerifiedDocumentResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postVerificationBarcodeFromUrl
     * @param request The request model
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postVerificationBarcodeFromUrlCall(PostVerificationBarcodeFromUrlRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request.getVerifyOptionsData();

        // create path and map variables
        String localVarPath = "/signature/barcode/verification";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.getUrl() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("url", request.getUrl()));
        if (request.getPassword() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("password", request.getPassword()));
        if (request.getStorage() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("storage", request.getStorage()));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postVerificationBarcodeFromUrlValidateBeforeCall(PostVerificationBarcodeFromUrlRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'url' is set
        if (request.getUrl() == null) {
            throw new ApiException("Missing the required parameter 'url' when calling postVerificationBarcodeFromUrl(Async)");
        }
        

        com.squareup.okhttp.Call call = postVerificationBarcodeFromUrlCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Verify the url based Document with Barcode Signatures
     * 
     * @param request The request model
     * @return VerifiedDocumentResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public VerifiedDocumentResponse postVerificationBarcodeFromUrl(PostVerificationBarcodeFromUrlRequest request) throws ApiException {
        ApiResponse<VerifiedDocumentResponse> resp = postVerificationBarcodeFromUrlWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Verify the url based Document with Barcode Signatures
     * 
     * @param request The request model
     * @return ApiResponse&lt;VerifiedDocumentResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<VerifiedDocumentResponse> postVerificationBarcodeFromUrlWithHttpInfo(PostVerificationBarcodeFromUrlRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postVerificationBarcodeFromUrlValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<VerifiedDocumentResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Verify the url based Document with Barcode Signatures (asynchronously)
     * 
     * @param request The request model
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postVerificationBarcodeFromUrlAsync(PostVerificationBarcodeFromUrlRequest request, final ApiCallback<VerifiedDocumentResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postVerificationBarcodeFromUrlValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<VerifiedDocumentResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postVerificationCollection
     * @param request The request model
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postVerificationCollectionCall(PostVerificationCollectionRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request.getVerifyOptionsCollectionData();

        // create path and map variables
        String localVarPath = "/signature/{name}/collection/verification"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.getPassword() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("password", request.getPassword()));
        if (request.getFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("folder", request.getFolder()));
        if (request.getStorage() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("storage", request.getStorage()));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postVerificationCollectionValidateBeforeCall(PostVerificationCollectionRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling postVerificationCollection(Async)");
        }
        

        com.squareup.okhttp.Call call = postVerificationCollectionCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Verify the Document.
     * 
     * @param request The request model
     * @return VerifiedDocumentResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public VerifiedDocumentResponse postVerificationCollection(PostVerificationCollectionRequest request) throws ApiException {
        ApiResponse<VerifiedDocumentResponse> resp = postVerificationCollectionWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Verify the Document.
     * 
     * @param request The request model
     * @return ApiResponse&lt;VerifiedDocumentResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<VerifiedDocumentResponse> postVerificationCollectionWithHttpInfo(PostVerificationCollectionRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postVerificationCollectionValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<VerifiedDocumentResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Verify the Document. (asynchronously)
     * 
     * @param request The request model
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postVerificationCollectionAsync(PostVerificationCollectionRequest request, final ApiCallback<VerifiedDocumentResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postVerificationCollectionValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<VerifiedDocumentResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postVerificationCollectionFromUrl
     * @param request The request model
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postVerificationCollectionFromUrlCall(PostVerificationCollectionFromUrlRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request.getVerifyOptionsCollectionData();

        // create path and map variables
        String localVarPath = "/signature/collection/verification";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.getUrl() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("url", request.getUrl()));
        if (request.getPassword() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("password", request.getPassword()));
        if (request.getStorage() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("storage", request.getStorage()));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postVerificationCollectionFromUrlValidateBeforeCall(PostVerificationCollectionFromUrlRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'url' is set
        if (request.getUrl() == null) {
            throw new ApiException("Missing the required parameter 'url' when calling postVerificationCollectionFromUrl(Async)");
        }
        

        com.squareup.okhttp.Call call = postVerificationCollectionFromUrlCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Verify the Document provided by URL.
     * 
     * @param request The request model
     * @return VerifiedDocumentResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public VerifiedDocumentResponse postVerificationCollectionFromUrl(PostVerificationCollectionFromUrlRequest request) throws ApiException {
        ApiResponse<VerifiedDocumentResponse> resp = postVerificationCollectionFromUrlWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Verify the Document provided by URL.
     * 
     * @param request The request model
     * @return ApiResponse&lt;VerifiedDocumentResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<VerifiedDocumentResponse> postVerificationCollectionFromUrlWithHttpInfo(PostVerificationCollectionFromUrlRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postVerificationCollectionFromUrlValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<VerifiedDocumentResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Verify the Document provided by URL. (asynchronously)
     * 
     * @param request The request model
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postVerificationCollectionFromUrlAsync(PostVerificationCollectionFromUrlRequest request, final ApiCallback<VerifiedDocumentResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postVerificationCollectionFromUrlValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<VerifiedDocumentResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postVerificationDigital
     * @param request The request model
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postVerificationDigitalCall(PostVerificationDigitalRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request.getVerifyOptionsData();

        // create path and map variables
        String localVarPath = "/signature/{name}/digital/verification"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.getPassword() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("password", request.getPassword()));
        if (request.getFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("folder", request.getFolder()));
        if (request.getCertificateGuid() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("certificateGuid", request.getCertificateGuid()));
        if (request.getStorage() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("storage", request.getStorage()));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postVerificationDigitalValidateBeforeCall(PostVerificationDigitalRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling postVerificationDigital(Async)");
        }
        

        com.squareup.okhttp.Call call = postVerificationDigitalCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Verify the Document with Digital Signatures
     * 
     * @param request The request model
     * @return VerifiedDocumentResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public VerifiedDocumentResponse postVerificationDigital(PostVerificationDigitalRequest request) throws ApiException {
        ApiResponse<VerifiedDocumentResponse> resp = postVerificationDigitalWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Verify the Document with Digital Signatures
     * 
     * @param request The request model
     * @return ApiResponse&lt;VerifiedDocumentResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<VerifiedDocumentResponse> postVerificationDigitalWithHttpInfo(PostVerificationDigitalRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postVerificationDigitalValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<VerifiedDocumentResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Verify the Document with Digital Signatures (asynchronously)
     * 
     * @param request The request model
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postVerificationDigitalAsync(PostVerificationDigitalRequest request, final ApiCallback<VerifiedDocumentResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postVerificationDigitalValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<VerifiedDocumentResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postVerificationDigitalFromUrl
     * @param request The request model
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postVerificationDigitalFromUrlCall(PostVerificationDigitalFromUrlRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request.getVerifyOptionsData();

        // create path and map variables
        String localVarPath = "/signature/digital/verification";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.getUrl() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("url", request.getUrl()));
        if (request.getPassword() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("password", request.getPassword()));
        if (request.getCertificateGuid() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("certificateGuid", request.getCertificateGuid()));
        if (request.getStorage() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("storage", request.getStorage()));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postVerificationDigitalFromUrlValidateBeforeCall(PostVerificationDigitalFromUrlRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'url' is set
        if (request.getUrl() == null) {
            throw new ApiException("Missing the required parameter 'url' when calling postVerificationDigitalFromUrl(Async)");
        }
        

        com.squareup.okhttp.Call call = postVerificationDigitalFromUrlCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Verify the Document from url with Digital Signatures
     * 
     * @param request The request model
     * @return VerifiedDocumentResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public VerifiedDocumentResponse postVerificationDigitalFromUrl(PostVerificationDigitalFromUrlRequest request) throws ApiException {
        ApiResponse<VerifiedDocumentResponse> resp = postVerificationDigitalFromUrlWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Verify the Document from url with Digital Signatures
     * 
     * @param request The request model
     * @return ApiResponse&lt;VerifiedDocumentResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<VerifiedDocumentResponse> postVerificationDigitalFromUrlWithHttpInfo(PostVerificationDigitalFromUrlRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postVerificationDigitalFromUrlValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<VerifiedDocumentResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Verify the Document from url with Digital Signatures (asynchronously)
     * 
     * @param request The request model
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postVerificationDigitalFromUrlAsync(PostVerificationDigitalFromUrlRequest request, final ApiCallback<VerifiedDocumentResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postVerificationDigitalFromUrlValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<VerifiedDocumentResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postVerificationQRCode
     * @param request The request model
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postVerificationQRCodeCall(PostVerificationQRCodeRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request.getVerifyOptionsData();

        // create path and map variables
        String localVarPath = "/signature/{name}/qrcode/verification"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.getPassword() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("password", request.getPassword()));
        if (request.getFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("folder", request.getFolder()));
        if (request.getStorage() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("storage", request.getStorage()));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postVerificationQRCodeValidateBeforeCall(PostVerificationQRCodeRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling postVerificationQRCode(Async)");
        }
        

        com.squareup.okhttp.Call call = postVerificationQRCodeCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Verify the Document with QRCode Signatures
     * 
     * @param request The request model
     * @return VerifiedDocumentResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public VerifiedDocumentResponse postVerificationQRCode(PostVerificationQRCodeRequest request) throws ApiException {
        ApiResponse<VerifiedDocumentResponse> resp = postVerificationQRCodeWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Verify the Document with QRCode Signatures
     * 
     * @param request The request model
     * @return ApiResponse&lt;VerifiedDocumentResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<VerifiedDocumentResponse> postVerificationQRCodeWithHttpInfo(PostVerificationQRCodeRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postVerificationQRCodeValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<VerifiedDocumentResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Verify the Document with QRCode Signatures (asynchronously)
     * 
     * @param request The request model
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postVerificationQRCodeAsync(PostVerificationQRCodeRequest request, final ApiCallback<VerifiedDocumentResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postVerificationQRCodeValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<VerifiedDocumentResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postVerificationQRCodeFromUrl
     * @param request The request model
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postVerificationQRCodeFromUrlCall(PostVerificationQRCodeFromUrlRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request.getVerifyOptionsData();

        // create path and map variables
        String localVarPath = "/signature/qrcode/verification";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.getUrl() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("url", request.getUrl()));
        if (request.getPassword() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("password", request.getPassword()));
        if (request.getStorage() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("storage", request.getStorage()));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postVerificationQRCodeFromUrlValidateBeforeCall(PostVerificationQRCodeFromUrlRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'url' is set
        if (request.getUrl() == null) {
            throw new ApiException("Missing the required parameter 'url' when calling postVerificationQRCodeFromUrl(Async)");
        }
        

        com.squareup.okhttp.Call call = postVerificationQRCodeFromUrlCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Verify the url based Document with QRCode Signatures
     * 
     * @param request The request model
     * @return VerifiedDocumentResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public VerifiedDocumentResponse postVerificationQRCodeFromUrl(PostVerificationQRCodeFromUrlRequest request) throws ApiException {
        ApiResponse<VerifiedDocumentResponse> resp = postVerificationQRCodeFromUrlWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Verify the url based Document with QRCode Signatures
     * 
     * @param request The request model
     * @return ApiResponse&lt;VerifiedDocumentResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<VerifiedDocumentResponse> postVerificationQRCodeFromUrlWithHttpInfo(PostVerificationQRCodeFromUrlRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postVerificationQRCodeFromUrlValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<VerifiedDocumentResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Verify the url based Document with QRCode Signatures (asynchronously)
     * 
     * @param request The request model
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postVerificationQRCodeFromUrlAsync(PostVerificationQRCodeFromUrlRequest request, final ApiCallback<VerifiedDocumentResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postVerificationQRCodeFromUrlValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<VerifiedDocumentResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postVerificationText
     * @param request The request model
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postVerificationTextCall(PostVerificationTextRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request.getVerifyOptionsData();

        // create path and map variables
        String localVarPath = "/signature/{name}/text/verification"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.getPassword() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("password", request.getPassword()));
        if (request.getFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("folder", request.getFolder()));
        if (request.getStorage() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("storage", request.getStorage()));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postVerificationTextValidateBeforeCall(PostVerificationTextRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling postVerificationText(Async)");
        }
        

        com.squareup.okhttp.Call call = postVerificationTextCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Verify the Document with Text Signatures
     * 
     * @param request The request model
     * @return VerifiedDocumentResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public VerifiedDocumentResponse postVerificationText(PostVerificationTextRequest request) throws ApiException {
        ApiResponse<VerifiedDocumentResponse> resp = postVerificationTextWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Verify the Document with Text Signatures
     * 
     * @param request The request model
     * @return ApiResponse&lt;VerifiedDocumentResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<VerifiedDocumentResponse> postVerificationTextWithHttpInfo(PostVerificationTextRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postVerificationTextValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<VerifiedDocumentResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Verify the Document with Text Signatures (asynchronously)
     * 
     * @param request The request model
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postVerificationTextAsync(PostVerificationTextRequest request, final ApiCallback<VerifiedDocumentResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postVerificationTextValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<VerifiedDocumentResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postVerificationTextFromUrl
     * @param request The request model
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postVerificationTextFromUrlCall(PostVerificationTextFromUrlRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request.getVerifyOptionsData();

        // create path and map variables
        String localVarPath = "/signature/text/verification";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.getUrl() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("url", request.getUrl()));
        if (request.getPassword() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("password", request.getPassword()));
        if (request.getStorage() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("storage", request.getStorage()));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postVerificationTextFromUrlValidateBeforeCall(PostVerificationTextFromUrlRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'url' is set
        if (request.getUrl() == null) {
            throw new ApiException("Missing the required parameter 'url' when calling postVerificationTextFromUrl(Async)");
        }
        

        com.squareup.okhttp.Call call = postVerificationTextFromUrlCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Verify the Document provided by url with Text Signatures
     * 
     * @param request The request model
     * @return VerifiedDocumentResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public VerifiedDocumentResponse postVerificationTextFromUrl(PostVerificationTextFromUrlRequest request) throws ApiException {
        ApiResponse<VerifiedDocumentResponse> resp = postVerificationTextFromUrlWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Verify the Document provided by url with Text Signatures
     * 
     * @param request The request model
     * @return ApiResponse&lt;VerifiedDocumentResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<VerifiedDocumentResponse> postVerificationTextFromUrlWithHttpInfo(PostVerificationTextFromUrlRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postVerificationTextFromUrlValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<VerifiedDocumentResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Verify the Document provided by url with Text Signatures (asynchronously)
     * 
     * @param request The request model
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postVerificationTextFromUrlAsync(PostVerificationTextFromUrlRequest request, final ApiCallback<VerifiedDocumentResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postVerificationTextFromUrlValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<VerifiedDocumentResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

