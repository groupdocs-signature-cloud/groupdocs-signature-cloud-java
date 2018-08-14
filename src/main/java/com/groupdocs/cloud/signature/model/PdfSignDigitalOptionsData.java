/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="PdfSignDigitalOptionsData.java">
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
import com.groupdocs.cloud.signature.model.PaddingData;
import com.groupdocs.cloud.signature.model.PagesSetupData;
import com.groupdocs.cloud.signature.model.SignDigitalOptionsData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Represents the Digital Sign Options for PDF Documents.
 */
@ApiModel(description = "Represents the Digital Sign Options for PDF Documents.")
public class PdfSignDigitalOptionsData extends SignDigitalOptionsData {
  @SerializedName("reason")
  private String reason = null;

  @SerializedName("contact")
  private String contact = null;

  @SerializedName("location")
  private String location = null;

  @SerializedName("visible")
  private Boolean visible = null;

  public PdfSignDigitalOptionsData reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * Gets or sets the reason of signature.
   * @return reason
  **/
  @ApiModelProperty(value = "Gets or sets the reason of signature.")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public PdfSignDigitalOptionsData contact(String contact) {
    this.contact = contact;
    return this;
  }

   /**
   * Gets or sets the signature contact.
   * @return contact
  **/
  @ApiModelProperty(value = "Gets or sets the signature contact.")
  public String getContact() {
    return contact;
  }

  public void setContact(String contact) {
    this.contact = contact;
  }

  public PdfSignDigitalOptionsData location(String location) {
    this.location = location;
    return this;
  }

   /**
   * Gets or sets the signature location.
   * @return location
  **/
  @ApiModelProperty(value = "Gets or sets the signature location.")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public PdfSignDigitalOptionsData visible(Boolean visible) {
    this.visible = visible;
    return this;
  }

   /**
   * Gets or sets the visibility of signature.
   * @return visible
  **/
  @ApiModelProperty(value = "Gets or sets the visibility of signature.")
  public Boolean isVisible() {
    return visible;
  }

  public void setVisible(Boolean visible) {
    this.visible = visible;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PdfSignDigitalOptionsData pdfSignDigitalOptionsData = (PdfSignDigitalOptionsData) o;
    return Objects.equals(this.reason, pdfSignDigitalOptionsData.reason) &&
        Objects.equals(this.contact, pdfSignDigitalOptionsData.contact) &&
        Objects.equals(this.location, pdfSignDigitalOptionsData.location) &&
        Objects.equals(this.visible, pdfSignDigitalOptionsData.visible) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reason, contact, location, visible, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PdfSignDigitalOptionsData {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    visible: ").append(toIndentedString(visible)).append("\n");
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

