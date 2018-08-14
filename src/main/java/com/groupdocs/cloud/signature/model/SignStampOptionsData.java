/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="SignStampOptionsData.java">
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
import com.groupdocs.cloud.signature.model.SignImageOptionsData;
import com.groupdocs.cloud.signature.model.StampLineData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents the Stamp Signature Options.
 */
@ApiModel(description = "Represents the Stamp Signature Options.")
public class SignStampOptionsData extends SignImageOptionsData {
  @SerializedName("outerLines")
  private List<StampLineData> outerLines = null;

  @SerializedName("innerLines")
  private List<StampLineData> innerLines = null;

  @SerializedName("backgroundColor")
  private Color backgroundColor = null;

  @SerializedName("backgroundBrush")
  private BrushData backgroundBrush = null;

  /**
   * Gets or sets the background color crop type of signature.
   */
  @JsonAdapter(BackgroundColorCropTypeEnum.Adapter.class)
  public enum BackgroundColorCropTypeEnum {
    NONE("None"),
    
    OUTERAREA("OuterArea"),
    
    MIDDLEAREA("MiddleArea"),
    
    INNERAREA("InnerArea");

    private String value;

    BackgroundColorCropTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static BackgroundColorCropTypeEnum fromValue(String text) {
      for (BackgroundColorCropTypeEnum b : BackgroundColorCropTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<BackgroundColorCropTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BackgroundColorCropTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public BackgroundColorCropTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return BackgroundColorCropTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("backgroundColorCropType")
  private BackgroundColorCropTypeEnum backgroundColorCropType = null;

  /**
   * Gets or sets the background image crop type of signature.
   */
  @JsonAdapter(BackgroundImageCropTypeEnum.Adapter.class)
  public enum BackgroundImageCropTypeEnum {
    NONE("None"),
    
    OUTERAREA("OuterArea"),
    
    MIDDLEAREA("MiddleArea"),
    
    INNERAREA("InnerArea");

    private String value;

    BackgroundImageCropTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static BackgroundImageCropTypeEnum fromValue(String text) {
      for (BackgroundImageCropTypeEnum b : BackgroundImageCropTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<BackgroundImageCropTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BackgroundImageCropTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public BackgroundImageCropTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return BackgroundImageCropTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("backgroundImageCropType")
  private BackgroundImageCropTypeEnum backgroundImageCropType = null;

  public SignStampOptionsData outerLines(List<StampLineData> outerLines) {
    this.outerLines = outerLines;
    return this;
  }

  public SignStampOptionsData addOuterLinesItem(StampLineData outerLinesItem) {
    if (this.outerLines == null) {
      this.outerLines = new ArrayList<StampLineData>();
    }
    this.outerLines.add(outerLinesItem);
    return this;
  }

   /**
   * List of Outer Lines rendered as concentric circles.
   * @return outerLines
  **/
  @ApiModelProperty(value = "List of Outer Lines rendered as concentric circles.")
  public List<StampLineData> getOuterLines() {
    return outerLines;
  }

  public void setOuterLines(List<StampLineData> outerLines) {
    this.outerLines = outerLines;
  }

  public SignStampOptionsData innerLines(List<StampLineData> innerLines) {
    this.innerLines = innerLines;
    return this;
  }

  public SignStampOptionsData addInnerLinesItem(StampLineData innerLinesItem) {
    if (this.innerLines == null) {
      this.innerLines = new ArrayList<StampLineData>();
    }
    this.innerLines.add(innerLinesItem);
    return this;
  }

   /**
   * List of Inner Lines rendered as set of rectangles.
   * @return innerLines
  **/
  @ApiModelProperty(value = "List of Inner Lines rendered as set of rectangles.")
  public List<StampLineData> getInnerLines() {
    return innerLines;
  }

  public void setInnerLines(List<StampLineData> innerLines) {
    this.innerLines = innerLines;
  }

  public SignStampOptionsData backgroundColor(Color backgroundColor) {
    this.backgroundColor = backgroundColor;
    return this;
  }

   /**
   * Gets or sets the background color of signature.
   * @return backgroundColor
  **/
  @ApiModelProperty(value = "Gets or sets the background color of signature.")
  public Color getBackgroundColor() {
    return backgroundColor;
  }

  public void setBackgroundColor(Color backgroundColor) {
    this.backgroundColor = backgroundColor;
  }

  public SignStampOptionsData backgroundBrush(BrushData backgroundBrush) {
    this.backgroundBrush = backgroundBrush;
    return this;
  }

   /**
   * Gets or sets the signature background brush. Value by default is null.  When property has a value it is used instead BackgroundBrush property.
   * @return backgroundBrush
  **/
  @ApiModelProperty(value = "Gets or sets the signature background brush. Value by default is null.  When property has a value it is used instead BackgroundBrush property.")
  public BrushData getBackgroundBrush() {
    return backgroundBrush;
  }

  public void setBackgroundBrush(BrushData backgroundBrush) {
    this.backgroundBrush = backgroundBrush;
  }

  public SignStampOptionsData backgroundColorCropType(BackgroundColorCropTypeEnum backgroundColorCropType) {
    this.backgroundColorCropType = backgroundColorCropType;
    return this;
  }

   /**
   * Gets or sets the background color crop type of signature.
   * @return backgroundColorCropType
  **/
  @ApiModelProperty(value = "Gets or sets the background color crop type of signature.")
  public BackgroundColorCropTypeEnum getBackgroundColorCropType() {
    return backgroundColorCropType;
  }

  public void setBackgroundColorCropType(BackgroundColorCropTypeEnum backgroundColorCropType) {
    this.backgroundColorCropType = backgroundColorCropType;
  }

  public SignStampOptionsData backgroundImageCropType(BackgroundImageCropTypeEnum backgroundImageCropType) {
    this.backgroundImageCropType = backgroundImageCropType;
    return this;
  }

   /**
   * Gets or sets the background image crop type of signature.
   * @return backgroundImageCropType
  **/
  @ApiModelProperty(value = "Gets or sets the background image crop type of signature.")
  public BackgroundImageCropTypeEnum getBackgroundImageCropType() {
    return backgroundImageCropType;
  }

  public void setBackgroundImageCropType(BackgroundImageCropTypeEnum backgroundImageCropType) {
    this.backgroundImageCropType = backgroundImageCropType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignStampOptionsData signStampOptionsData = (SignStampOptionsData) o;
    return Objects.equals(this.outerLines, signStampOptionsData.outerLines) &&
        Objects.equals(this.innerLines, signStampOptionsData.innerLines) &&
        Objects.equals(this.backgroundColor, signStampOptionsData.backgroundColor) &&
        Objects.equals(this.backgroundBrush, signStampOptionsData.backgroundBrush) &&
        Objects.equals(this.backgroundColorCropType, signStampOptionsData.backgroundColorCropType) &&
        Objects.equals(this.backgroundImageCropType, signStampOptionsData.backgroundImageCropType) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(outerLines, innerLines, backgroundColor, backgroundBrush, backgroundColorCropType, backgroundImageCropType, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignStampOptionsData {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    outerLines: ").append(toIndentedString(outerLines)).append("\n");
    sb.append("    innerLines: ").append(toIndentedString(innerLines)).append("\n");
    sb.append("    backgroundColor: ").append(toIndentedString(backgroundColor)).append("\n");
    sb.append("    backgroundBrush: ").append(toIndentedString(backgroundBrush)).append("\n");
    sb.append("    backgroundColorCropType: ").append(toIndentedString(backgroundColorCropType)).append("\n");
    sb.append("    backgroundImageCropType: ").append(toIndentedString(backgroundImageCropType)).append("\n");
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

