/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="BarcodesResult.java">
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
import com.groupdocs.cloud.signature.model.BarcodeType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Describes collection of supported Barcode types
 */
@ApiModel(description = "Describes collection of supported Barcode types")
public class BarcodesResult {
  @SerializedName("barcodeTypes")
  private List<BarcodeType> barcodeTypes = null;

  public BarcodesResult barcodeTypes(List<BarcodeType> barcodeTypes) {
    this.barcodeTypes = barcodeTypes;
    return this;
  }

  public BarcodesResult addBarcodeTypesItem(BarcodeType barcodeTypesItem) {
    if (this.barcodeTypes == null) {
      this.barcodeTypes = new ArrayList<BarcodeType>();
    }
    this.barcodeTypes.add(barcodeTypesItem);
    return this;
  }

   /**
   * List of Barcode types
   * @return barcodeTypes
  **/
  @ApiModelProperty(value = "List of Barcode types")
  public List<BarcodeType> getBarcodeTypes() {
    return barcodeTypes;
  }

  public void setBarcodeTypes(List<BarcodeType> barcodeTypes) {
    this.barcodeTypes = barcodeTypes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BarcodesResult barcodesResult = (BarcodesResult) o;
    return Objects.equals(this.barcodeTypes, barcodesResult.barcodeTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(barcodeTypes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BarcodesResult {\n");
    
    sb.append("    barcodeTypes: ").append(toIndentedString(barcodeTypes)).append("\n");
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

