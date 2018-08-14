/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="SignBarcodeOptionsData.java">
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
import com.groupdocs.cloud.signature.model.BrushData;
import com.groupdocs.cloud.signature.model.Color;
import com.groupdocs.cloud.signature.model.PaddingData;
import com.groupdocs.cloud.signature.model.PagesSetupData;
import com.groupdocs.cloud.signature.model.SignTextOptionsData;
import com.groupdocs.cloud.signature.model.SignatureFontData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Represents the Barcode Signature Options.
 */
@ApiModel(description = "Represents the Barcode Signature Options.")
public class SignBarcodeOptionsData extends SignTextOptionsData {
  @SerializedName("barcodeTypeName")
  private String barcodeTypeName = null;

  @SerializedName("borderVisiblity")
  private Boolean borderVisiblity = null;

  /**
   * Gets or sets the signature border style.
   */
  @JsonAdapter(BorderDashStyleEnum.Adapter.class)
  public enum BorderDashStyleEnum {
    DASH("Dash"),
    
    DASHDOT("DashDot"),
    
    DASHDOTDOT("DashDotDot"),
    
    DASHLONGDASH("DashLongDash"),
    
    DASHLONGDASHDOT("DashLongDashDot"),
    
    ROUNDDOT("RoundDot"),
    
    SOLID("Solid"),
    
    SQUAREDOT("SquareDot");

    private String value;

    BorderDashStyleEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static BorderDashStyleEnum fromValue(String text) {
      for (BorderDashStyleEnum b : BorderDashStyleEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<BorderDashStyleEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BorderDashStyleEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public BorderDashStyleEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return BorderDashStyleEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("borderDashStyle")
  private BorderDashStyleEnum borderDashStyle = null;

  @SerializedName("borderWeight")
  private Double borderWeight = null;

  @SerializedName("opacity")
  private Double opacity = null;

  /**
   * Gets or sets the alignment of text in the result Barcode. Default value is None.
   */
  @JsonAdapter(CodeTextAlignmentEnum.Adapter.class)
  public enum CodeTextAlignmentEnum {
    NONE("None"),
    
    ABOVE("Above"),
    
    BELOW("Below"),
    
    RIGHT("Right");

    private String value;

    CodeTextAlignmentEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CodeTextAlignmentEnum fromValue(String text) {
      for (CodeTextAlignmentEnum b : CodeTextAlignmentEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<CodeTextAlignmentEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CodeTextAlignmentEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CodeTextAlignmentEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CodeTextAlignmentEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("codeTextAlignment")
  private CodeTextAlignmentEnum codeTextAlignment = null;

  @SerializedName("innerMargins")
  private PaddingData innerMargins = null;

  public SignBarcodeOptionsData barcodeTypeName(String barcodeTypeName) {
    this.barcodeTypeName = barcodeTypeName;
    return this;
  }

   /**
   * Get or set Barcode type. Pick one from supported Barcode Types list.
   * @return barcodeTypeName
  **/
  @ApiModelProperty(value = "Get or set Barcode type. Pick one from supported Barcode Types list.")
  public String getBarcodeTypeName() {
    return barcodeTypeName;
  }

  public void setBarcodeTypeName(String barcodeTypeName) {
    this.barcodeTypeName = barcodeTypeName;
  }

  public SignBarcodeOptionsData borderVisiblity(Boolean borderVisiblity) {
    this.borderVisiblity = borderVisiblity;
    return this;
  }

   /**
   * Gets or sets the signature border visibility.
   * @return borderVisiblity
  **/
  @ApiModelProperty(value = "Gets or sets the signature border visibility.")
  public Boolean isBorderVisiblity() {
    return borderVisiblity;
  }

  public void setBorderVisiblity(Boolean borderVisiblity) {
    this.borderVisiblity = borderVisiblity;
  }

  public SignBarcodeOptionsData borderDashStyle(BorderDashStyleEnum borderDashStyle) {
    this.borderDashStyle = borderDashStyle;
    return this;
  }

   /**
   * Gets or sets the signature border style.
   * @return borderDashStyle
  **/
  @ApiModelProperty(value = "Gets or sets the signature border style.")
  public BorderDashStyleEnum getBorderDashStyle() {
    return borderDashStyle;
  }

  public void setBorderDashStyle(BorderDashStyleEnum borderDashStyle) {
    this.borderDashStyle = borderDashStyle;
  }

  public SignBarcodeOptionsData borderWeight(Double borderWeight) {
    this.borderWeight = borderWeight;
    return this;
  }

   /**
   * Gets or sets the weight of the signature border. 
   * @return borderWeight
  **/
  @ApiModelProperty(value = "Gets or sets the weight of the signature border. ")
  public Double getBorderWeight() {
    return borderWeight;
  }

  public void setBorderWeight(Double borderWeight) {
    this.borderWeight = borderWeight;
  }

  public SignBarcodeOptionsData opacity(Double opacity) {
    this.opacity = opacity;
    return this;
  }

   /**
   * Gets or sets the signature opacity (value from 0.0 (clear) through 1.0 (opaque)). By default the value is 1.0.
   * @return opacity
  **/
  @ApiModelProperty(value = "Gets or sets the signature opacity (value from 0.0 (clear) through 1.0 (opaque)). By default the value is 1.0.")
  public Double getOpacity() {
    return opacity;
  }

  public void setOpacity(Double opacity) {
    this.opacity = opacity;
  }

  public SignBarcodeOptionsData codeTextAlignment(CodeTextAlignmentEnum codeTextAlignment) {
    this.codeTextAlignment = codeTextAlignment;
    return this;
  }

   /**
   * Gets or sets the alignment of text in the result Barcode. Default value is None.
   * @return codeTextAlignment
  **/
  @ApiModelProperty(value = "Gets or sets the alignment of text in the result Barcode. Default value is None.")
  public CodeTextAlignmentEnum getCodeTextAlignment() {
    return codeTextAlignment;
  }

  public void setCodeTextAlignment(CodeTextAlignmentEnum codeTextAlignment) {
    this.codeTextAlignment = codeTextAlignment;
  }

  public SignBarcodeOptionsData innerMargins(PaddingData innerMargins) {
    this.innerMargins = innerMargins;
    return this;
  }

   /**
   * Gets or sets the space between Barcode elements and result image borders.
   * @return innerMargins
  **/
  @ApiModelProperty(value = "Gets or sets the space between Barcode elements and result image borders.")
  public PaddingData getInnerMargins() {
    return innerMargins;
  }

  public void setInnerMargins(PaddingData innerMargins) {
    this.innerMargins = innerMargins;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignBarcodeOptionsData signBarcodeOptionsData = (SignBarcodeOptionsData) o;
    return Objects.equals(this.barcodeTypeName, signBarcodeOptionsData.barcodeTypeName) &&
        Objects.equals(this.borderVisiblity, signBarcodeOptionsData.borderVisiblity) &&
        Objects.equals(this.borderDashStyle, signBarcodeOptionsData.borderDashStyle) &&
        Objects.equals(this.borderWeight, signBarcodeOptionsData.borderWeight) &&
        Objects.equals(this.opacity, signBarcodeOptionsData.opacity) &&
        Objects.equals(this.codeTextAlignment, signBarcodeOptionsData.codeTextAlignment) &&
        Objects.equals(this.innerMargins, signBarcodeOptionsData.innerMargins) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(barcodeTypeName, borderVisiblity, borderDashStyle, borderWeight, opacity, codeTextAlignment, innerMargins, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignBarcodeOptionsData {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    barcodeTypeName: ").append(toIndentedString(barcodeTypeName)).append("\n");
    sb.append("    borderVisiblity: ").append(toIndentedString(borderVisiblity)).append("\n");
    sb.append("    borderDashStyle: ").append(toIndentedString(borderDashStyle)).append("\n");
    sb.append("    borderWeight: ").append(toIndentedString(borderWeight)).append("\n");
    sb.append("    opacity: ").append(toIndentedString(opacity)).append("\n");
    sb.append("    codeTextAlignment: ").append(toIndentedString(codeTextAlignment)).append("\n");
    sb.append("    innerMargins: ").append(toIndentedString(innerMargins)).append("\n");
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

