/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="VerifyQRCodeOptionsData.java">
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
import com.groupdocs.cloud.signature.model.VerifyTextOptionsData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Verify QRCode Options - keeps options to verify QRCode Signature of Document.
 */
@ApiModel(description = "Verify QRCode Options - keeps options to verify QRCode Signature of Document.")
public class VerifyQRCodeOptionsData extends VerifyTextOptionsData {
  @SerializedName("qrCodeTypeName")
  private String qrCodeTypeName = null;

  /**
   * Get or set Text Match Type verification.
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

  public VerifyQRCodeOptionsData qrCodeTypeName(String qrCodeTypeName) {
    this.qrCodeTypeName = qrCodeTypeName;
    return this;
  }

   /**
   * Get or set QRCode Type Name verification.
   * @return qrCodeTypeName
  **/
  @ApiModelProperty(value = "Get or set QRCode Type Name verification.")
  public String getQrCodeTypeName() {
    return qrCodeTypeName;
  }

  public void setQrCodeTypeName(String qrCodeTypeName) {
    this.qrCodeTypeName = qrCodeTypeName;
  }

  public VerifyQRCodeOptionsData matchType(MatchTypeEnum matchType) {
    this.matchType = matchType;
    return this;
  }

   /**
   * Get or set Text Match Type verification.
   * @return matchType
  **/
  @ApiModelProperty(value = "Get or set Text Match Type verification.")
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
    VerifyQRCodeOptionsData verifyQRCodeOptionsData = (VerifyQRCodeOptionsData) o;
    return Objects.equals(this.qrCodeTypeName, verifyQRCodeOptionsData.qrCodeTypeName) &&
        Objects.equals(this.matchType, verifyQRCodeOptionsData.matchType) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(qrCodeTypeName, matchType, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerifyQRCodeOptionsData {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    qrCodeTypeName: ").append(toIndentedString(qrCodeTypeName)).append("\n");
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

