/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="CellsSignDigitalOptionsData.java">
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
 * Represents the Digital Sign Options for Cells Documents.
 */
@ApiModel(description = "Represents the Digital Sign Options for Cells Documents.")
public class CellsSignDigitalOptionsData extends SignDigitalOptionsData {
  @SerializedName("sheetNumber")
  private Integer sheetNumber = null;

  @SerializedName("rowNumber")
  private Integer rowNumber = null;

  @SerializedName("columnNumber")
  private Integer columnNumber = null;

  public CellsSignDigitalOptionsData sheetNumber(Integer sheetNumber) {
    this.sheetNumber = sheetNumber;
    return this;
  }

   /**
   * Gets or sets worksheet number for signing. DocumentPageNumber parameter contains the same value.
   * @return sheetNumber
  **/
  @ApiModelProperty(value = "Gets or sets worksheet number for signing. DocumentPageNumber parameter contains the same value.")
  public Integer getSheetNumber() {
    return sheetNumber;
  }

  public void setSheetNumber(Integer sheetNumber) {
    this.sheetNumber = sheetNumber;
  }

  public CellsSignDigitalOptionsData rowNumber(Integer rowNumber) {
    this.rowNumber = rowNumber;
    return this;
  }

   /**
   * Gets or sets the top row number of signature (min value is 0). Top parameter contains the same value.
   * @return rowNumber
  **/
  @ApiModelProperty(value = "Gets or sets the top row number of signature (min value is 0). Top parameter contains the same value.")
  public Integer getRowNumber() {
    return rowNumber;
  }

  public void setRowNumber(Integer rowNumber) {
    this.rowNumber = rowNumber;
  }

  public CellsSignDigitalOptionsData columnNumber(Integer columnNumber) {
    this.columnNumber = columnNumber;
    return this;
  }

   /**
   * Gets or sets the left column number of signature (min value is 0). Left parameter contains the same value.
   * @return columnNumber
  **/
  @ApiModelProperty(value = "Gets or sets the left column number of signature (min value is 0). Left parameter contains the same value.")
  public Integer getColumnNumber() {
    return columnNumber;
  }

  public void setColumnNumber(Integer columnNumber) {
    this.columnNumber = columnNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CellsSignDigitalOptionsData cellsSignDigitalOptionsData = (CellsSignDigitalOptionsData) o;
    return Objects.equals(this.sheetNumber, cellsSignDigitalOptionsData.sheetNumber) &&
        Objects.equals(this.rowNumber, cellsSignDigitalOptionsData.rowNumber) &&
        Objects.equals(this.columnNumber, cellsSignDigitalOptionsData.columnNumber) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sheetNumber, rowNumber, columnNumber, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CellsSignDigitalOptionsData {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    sheetNumber: ").append(toIndentedString(sheetNumber)).append("\n");
    sb.append("    rowNumber: ").append(toIndentedString(rowNumber)).append("\n");
    sb.append("    columnNumber: ").append(toIndentedString(columnNumber)).append("\n");
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

