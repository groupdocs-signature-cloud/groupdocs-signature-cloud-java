/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="BarcodeSignature.java">
 *   Copyright (c) Aspose Pty Ltd
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
import com.groupdocs.cloud.signature.model.Signature;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * Contains Barcode signature properties
 */
@ApiModel(description = "Contains Barcode signature properties")
public class BarcodeSignature extends Signature {
  @SerializedName("barcodeType")
  private String barcodeType = null;

  @SerializedName("text")
  private String text = null;

  @SerializedName("format")
  private String format = null;

  public BarcodeSignature barcodeType(String barcodeType) {
    this.barcodeType = barcodeType;
    return this;
  }

   /**
   * Specifies the Barcode type
   * @return barcodeType
  **/
  @ApiModelProperty(value = "Specifies the Barcode type")
  public String getBarcodeType() {
    return barcodeType;
  }

  public void setBarcodeType(String barcodeType) {
    this.barcodeType = barcodeType;
  }

  public BarcodeSignature text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Specifies text of Bar-code
   * @return text
  **/
  @ApiModelProperty(value = "Specifies text of Bar-code")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public BarcodeSignature format(String format) {
    this.format = format;
    return this;
  }

   /**
   * Specifies the format of Barcode signature image.
   * @return format
  **/
  @ApiModelProperty(value = "Specifies the format of Barcode signature image.")
  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BarcodeSignature barcodeSignature = (BarcodeSignature) o;
    return Objects.equals(this.barcodeType, barcodeSignature.barcodeType) &&
        Objects.equals(this.text, barcodeSignature.text) &&
        Objects.equals(this.format, barcodeSignature.format) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(barcodeType, text, format, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BarcodeSignature {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    barcodeType: ").append(toIndentedString(barcodeType)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
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

