/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="QRCodeSignatureData.java">
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
import com.groupdocs.cloud.signature.model.BaseSignatureData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Contains QRCode Signature properties.
 */
@ApiModel(description = "Contains QRCode Signature properties.")
public class QRCodeSignatureData extends BaseSignatureData {
  @SerializedName("qrCodeTypeName")
  private String qrCodeTypeName = null;

  @SerializedName("text")
  private String text = null;

  public QRCodeSignatureData qrCodeTypeName(String qrCodeTypeName) {
    this.qrCodeTypeName = qrCodeTypeName;
    return this;
  }

   /**
   * Specifies the QRCode type.
   * @return qrCodeTypeName
  **/
  @ApiModelProperty(value = "Specifies the QRCode type.")
  public String getQrCodeTypeName() {
    return qrCodeTypeName;
  }

  public void setQrCodeTypeName(String qrCodeTypeName) {
    this.qrCodeTypeName = qrCodeTypeName;
  }

  public QRCodeSignatureData text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Specifies text of Bar-code.
   * @return text
  **/
  @ApiModelProperty(value = "Specifies text of Bar-code.")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QRCodeSignatureData qrCodeSignatureData = (QRCodeSignatureData) o;
    return Objects.equals(this.qrCodeTypeName, qrCodeSignatureData.qrCodeTypeName) &&
        Objects.equals(this.text, qrCodeSignatureData.text) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(qrCodeTypeName, text, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QRCodeSignatureData {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    qrCodeTypeName: ").append(toIndentedString(qrCodeTypeName)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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

