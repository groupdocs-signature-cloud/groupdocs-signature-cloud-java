/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="SignOptionsData.java">
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Base container class for signature options data
 */
@ApiModel(description = "Base container class for signature options data")
public class SignOptionsData {
  @SerializedName("documentPageNumber")
  private Integer documentPageNumber = null;

  @SerializedName("pagesSetup")
  private PagesSetupData pagesSetup = null;

  @SerializedName("optionsType")
  private String optionsType = null;

  public SignOptionsData documentPageNumber(Integer documentPageNumber) {
    this.documentPageNumber = documentPageNumber;
    return this;
  }

   /**
   * Gets or sets a document page number to put signature Value starts from 1
   * @return documentPageNumber
  **/
  @ApiModelProperty(required = true, value = "Gets or sets a document page number to put signature Value starts from 1")
  public Integer getDocumentPageNumber() {
    return documentPageNumber;
  }

  public void setDocumentPageNumber(Integer documentPageNumber) {
    this.documentPageNumber = documentPageNumber;
  }

  public SignOptionsData pagesSetup(PagesSetupData pagesSetup) {
    this.pagesSetup = pagesSetup;
    return this;
  }

   /**
   * Page Options to specify pages to be verified.
   * @return pagesSetup
  **/
  @ApiModelProperty(value = "Page Options to specify pages to be verified.")
  public PagesSetupData getPagesSetup() {
    return pagesSetup;
  }

  public void setPagesSetup(PagesSetupData pagesSetup) {
    this.pagesSetup = pagesSetup;
  }

  public SignOptionsData optionsType(String optionsType) {
    this.optionsType = optionsType;
    return this;
  }

   /**
   * Internal property that specify the name of Options.
   * @return optionsType
  **/
  @ApiModelProperty(value = "Internal property that specify the name of Options.")
  public String getOptionsType() {
    return optionsType;
  }

  public void setOptionsType(String optionsType) {
    this.optionsType = optionsType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignOptionsData signOptionsData = (SignOptionsData) o;
    return Objects.equals(this.documentPageNumber, signOptionsData.documentPageNumber) &&
        Objects.equals(this.pagesSetup, signOptionsData.pagesSetup) &&
        Objects.equals(this.optionsType, signOptionsData.optionsType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentPageNumber, pagesSetup, optionsType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignOptionsData {\n");
    
    sb.append("    documentPageNumber: ").append(toIndentedString(documentPageNumber)).append("\n");
    sb.append("    pagesSetup: ").append(toIndentedString(pagesSetup)).append("\n");
    sb.append("    optionsType: ").append(toIndentedString(optionsType)).append("\n");
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

