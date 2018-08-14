/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="SearchBarcodeOptionsData.java">
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
import com.groupdocs.cloud.signature.model.SearchOptionsData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Search Barcode Options - keeps options to Search Barcode Signature of Document.
 */
@ApiModel(description = "Search Barcode Options - keeps options to Search Barcode Signature of Document.")
public class SearchBarcodeOptionsData extends SearchOptionsData {
  @SerializedName("barcodeTypeName")
  private String barcodeTypeName = null;

  @SerializedName("text")
  private String text = null;

  /**
   * Get or set barcode text Match Type search. It is used only when Text property is set.
   */
  @JsonAdapter(MatchTypeEnum.Adapter.class)
  public enum MatchTypeEnum {
    EXACT("Exact"),
    
    STARTSWITH("StartsWith"),
    
    ENDSWITH("EndsWith"),
    
    CONTAINS("Contains");

    private String value;

    MatchTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MatchTypeEnum fromValue(String text) {
      for (MatchTypeEnum b : MatchTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<MatchTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MatchTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MatchTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return MatchTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("matchType")
  private MatchTypeEnum matchType = null;

  public SearchBarcodeOptionsData barcodeTypeName(String barcodeTypeName) {
    this.barcodeTypeName = barcodeTypeName;
    return this;
  }

   /**
   * Specifies Encode Type property to search barcodes. If this value is not set, search is processed for all supported barcode Types.
   * @return barcodeTypeName
  **/
  @ApiModelProperty(value = "Specifies Encode Type property to search barcodes. If this value is not set, search is processed for all supported barcode Types.")
  public String getBarcodeTypeName() {
    return barcodeTypeName;
  }

  public void setBarcodeTypeName(String barcodeTypeName) {
    this.barcodeTypeName = barcodeTypeName;
  }

  public SearchBarcodeOptionsData text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Specifies text for searching and matching in barcode signature.
   * @return text
  **/
  @ApiModelProperty(value = "Specifies text for searching and matching in barcode signature.")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public SearchBarcodeOptionsData matchType(MatchTypeEnum matchType) {
    this.matchType = matchType;
    return this;
  }

   /**
   * Get or set barcode text Match Type search. It is used only when Text property is set.
   * @return matchType
  **/
  @ApiModelProperty(value = "Get or set barcode text Match Type search. It is used only when Text property is set.")
  public MatchTypeEnum getMatchType() {
    return matchType;
  }

  public void setMatchType(MatchTypeEnum matchType) {
    this.matchType = matchType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchBarcodeOptionsData searchBarcodeOptionsData = (SearchBarcodeOptionsData) o;
    return Objects.equals(this.barcodeTypeName, searchBarcodeOptionsData.barcodeTypeName) &&
        Objects.equals(this.text, searchBarcodeOptionsData.text) &&
        Objects.equals(this.matchType, searchBarcodeOptionsData.matchType) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(barcodeTypeName, text, matchType, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchBarcodeOptionsData {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    barcodeTypeName: ").append(toIndentedString(barcodeTypeName)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    matchType: ").append(toIndentedString(matchType)).append("\n");
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

