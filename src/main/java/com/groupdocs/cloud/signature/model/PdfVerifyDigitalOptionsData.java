/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="PdfVerifyDigitalOptionsData.java">
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
import com.groupdocs.cloud.signature.model.VerifyDigitalOptionsData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Pdf Verify Digital Options - keeps options to verify Digital Signature of Pdf Documents
 */
@ApiModel(description = "Pdf Verify Digital Options - keeps options to verify Digital Signature of Pdf Documents")
public class PdfVerifyDigitalOptionsData extends VerifyDigitalOptionsData {
  @SerializedName("reason")
  private String reason = null;

  @SerializedName("contact")
  private String contact = null;

  @SerializedName("location")
  private String location = null;

  public PdfVerifyDigitalOptionsData reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * Reason of Digital Signature to validate
   * @return reason
  **/
  @ApiModelProperty(value = "Reason of Digital Signature to validate")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public PdfVerifyDigitalOptionsData contact(String contact) {
    this.contact = contact;
    return this;
  }

   /**
   * Signature Contact to validate
   * @return contact
  **/
  @ApiModelProperty(value = "Signature Contact to validate")
  public String getContact() {
    return contact;
  }

  public void setContact(String contact) {
    this.contact = contact;
  }

  public PdfVerifyDigitalOptionsData location(String location) {
    this.location = location;
    return this;
  }

   /**
   * Signature Location to validate
   * @return location
  **/
  @ApiModelProperty(value = "Signature Location to validate")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PdfVerifyDigitalOptionsData pdfVerifyDigitalOptionsData = (PdfVerifyDigitalOptionsData) o;
    return Objects.equals(this.reason, pdfVerifyDigitalOptionsData.reason) &&
        Objects.equals(this.contact, pdfVerifyDigitalOptionsData.contact) &&
        Objects.equals(this.location, pdfVerifyDigitalOptionsData.location) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reason, contact, location, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PdfVerifyDigitalOptionsData {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
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

