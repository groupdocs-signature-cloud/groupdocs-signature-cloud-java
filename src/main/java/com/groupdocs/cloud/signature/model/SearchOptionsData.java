/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="SearchOptionsData.java">
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
 * Search Options - keeps options to Search document
 */
@ApiModel(description = "Search Options - keeps options to Search document")
public class SearchOptionsData {
  @SerializedName("documentPageNumber")
  private Integer documentPageNumber = null;

  @SerializedName("pagesSetup")
  private PagesSetupData pagesSetup = null;

  @SerializedName("searchAllPages")
  private Boolean searchAllPages = null;

  @SerializedName("optionsType")
  private String optionsType = null;

  public SearchOptionsData documentPageNumber(Integer documentPageNumber) {
    this.documentPageNumber = documentPageNumber;
    return this;
  }

   /**
   * Gets or sets Document page number for searching. Value is optional.
   * @return documentPageNumber
  **/
  @ApiModelProperty(value = "Gets or sets Document page number for searching. Value is optional.")
  public Integer getDocumentPageNumber() {
    return documentPageNumber;
  }

  public void setDocumentPageNumber(Integer documentPageNumber) {
    this.documentPageNumber = documentPageNumber;
  }

  public SearchOptionsData pagesSetup(PagesSetupData pagesSetup) {
    this.pagesSetup = pagesSetup;
    return this;
  }

   /**
   * Options to specify pages for Signature searching.
   * @return pagesSetup
  **/
  @ApiModelProperty(value = "Options to specify pages for Signature searching.")
  public PagesSetupData getPagesSetup() {
    return pagesSetup;
  }

  public void setPagesSetup(PagesSetupData pagesSetup) {
    this.pagesSetup = pagesSetup;
  }

  public SearchOptionsData searchAllPages(Boolean searchAllPages) {
    this.searchAllPages = searchAllPages;
    return this;
  }

   /**
   * Flag to search on each Document page.
   * @return searchAllPages
  **/
  @ApiModelProperty(required = true, value = "Flag to search on each Document page.")
  public Boolean isSearchAllPages() {
    return searchAllPages;
  }

  public void setSearchAllPages(Boolean searchAllPages) {
    this.searchAllPages = searchAllPages;
  }

  public SearchOptionsData optionsType(String optionsType) {
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
    SearchOptionsData searchOptionsData = (SearchOptionsData) o;
    return Objects.equals(this.documentPageNumber, searchOptionsData.documentPageNumber) &&
        Objects.equals(this.pagesSetup, searchOptionsData.pagesSetup) &&
        Objects.equals(this.searchAllPages, searchOptionsData.searchAllPages) &&
        Objects.equals(this.optionsType, searchOptionsData.optionsType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentPageNumber, pagesSetup, searchAllPages, optionsType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchOptionsData {\n");
    
    sb.append("    documentPageNumber: ").append(toIndentedString(documentPageNumber)).append("\n");
    sb.append("    pagesSetup: ").append(toIndentedString(pagesSetup)).append("\n");
    sb.append("    searchAllPages: ").append(toIndentedString(searchAllPages)).append("\n");
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

