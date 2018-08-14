/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="VerifyDigitalOptionsData.java">
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

package com.groupdocs.cloud.signature.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.groupdocs.cloud.signature.model.PagesSetupData;
import com.groupdocs.cloud.signature.model.VerifyOptionsData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Verify Digital Options - keeps options to verify Digital Signature of Document
 */
@ApiModel(description = "Verify Digital Options - keeps options to verify Digital Signature of Document")
public class VerifyDigitalOptionsData extends VerifyOptionsData {
  @SerializedName("password")
  private String password = null;

  @SerializedName("certificateGuid")
  private String certificateGuid = null;

  public VerifyDigitalOptionsData password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Password of Digital Certificate if required
   * @return password
  **/
  @ApiModelProperty(value = "Password of Digital Certificate if required")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public VerifyDigitalOptionsData certificateGuid(String certificateGuid) {
    this.certificateGuid = certificateGuid;
    return this;
  }

   /**
   * File Guid of Digital Certificate
   * @return certificateGuid
  **/
  @ApiModelProperty(value = "File Guid of Digital Certificate")
  public String getCertificateGuid() {
    return certificateGuid;
  }

  public void setCertificateGuid(String certificateGuid) {
    this.certificateGuid = certificateGuid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VerifyDigitalOptionsData verifyDigitalOptionsData = (VerifyDigitalOptionsData) o;
    return Objects.equals(this.password, verifyDigitalOptionsData.password) &&
        Objects.equals(this.certificateGuid, verifyDigitalOptionsData.certificateGuid) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(password, certificateGuid, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerifyDigitalOptionsData {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    certificateGuid: ").append(toIndentedString(certificateGuid)).append("\n");
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
