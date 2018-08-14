/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="PostVerificationDigitalFromUrlRequest.java">
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

package com.groupdocs.cloud.signature.model.requests;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.groupdocs.cloud.signature.model.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.io.File;

/**
 * Request model for postVerificationDigitalFromUrl method.
 */
public class PostVerificationDigitalFromUrlRequest {
  @SerializedName("url")
  private String url = null;

  @SerializedName("verifyOptionsData")
  private VerifyOptionsData verifyOptionsData = null;

  @SerializedName("password")
  private String password = null;

  @SerializedName("certificateGuid")
  private String certificateGuid = null;

  @SerializedName("storage")
  private String storage = null;

  /**
   * The url of document.
   * @return The url of document.
  **/
  @ApiModelProperty(example = "url_example", required = true, value = "The url of document.")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  /**
   * Verification Options
   * @return Verification Options
  **/
  @ApiModelProperty(example = "new VerifyOptionsData()", value = "Verification Options")
  public VerifyOptionsData getVerifyOptionsData() {
    return verifyOptionsData;
  }

  public void setVerifyOptionsData(VerifyOptionsData verifyOptionsData) {
    this.verifyOptionsData = verifyOptionsData;
  }

  /**
   * Document password if required.
   * @return Document password if required.
  **/
  @ApiModelProperty(example = "password_example", value = "Document password if required.")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  /**
   * Digital certificate Guid.
   * @return Digital certificate Guid.
  **/
  @ApiModelProperty(example = "certificateGuid_example", value = "Digital certificate Guid.")
  public String getCertificateGuid() {
    return certificateGuid;
  }

  public void setCertificateGuid(String certificateGuid) {
    this.certificateGuid = certificateGuid;
  }

  /**
   * The file storage which have to be used.
   * @return The file storage which have to be used.
  **/
  @ApiModelProperty(example = "storage_example", value = "The file storage which have to be used.")
  public String getStorage() {
    return storage;
  }

  public void setStorage(String storage) {
    this.storage = storage;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }

    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    
    PostVerificationDigitalFromUrlRequest request = (PostVerificationDigitalFromUrlRequest) o;
    return Objects.equals(this.url, request.url) &&
        Objects.equals(this.verifyOptionsData, request.verifyOptionsData) &&
        Objects.equals(this.password, request.password) &&
        Objects.equals(this.certificateGuid, request.certificateGuid) &&
        Objects.equals(this.storage, request.storage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, verifyOptionsData, password, certificateGuid, storage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostVerificationDigitalFromUrl {\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    verifyOptionsData: ").append(toIndentedString(verifyOptionsData)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    certificateGuid: ").append(toIndentedString(certificateGuid)).append("\n");
    sb.append("    storage: ").append(toIndentedString(storage)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

