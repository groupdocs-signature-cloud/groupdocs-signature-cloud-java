/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="PdfSignTextOptionsData.java">
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
 * Represents the Text Sign Options for PDF Documents.
 */
@ApiModel(description = "Represents the Text Sign Options for PDF Documents.")
public class PdfSignTextOptionsData extends SignTextOptionsData {
  @SerializedName("opacity")
  private Double opacity = null;

  @SerializedName("signatureID")
  private Integer signatureID = null;

  /**
   * Gets or sets the type of text signature implementation.
   */
  @JsonAdapter(SignatureImplementationEnum.Adapter.class)
  public enum SignatureImplementationEnum {
    STAMP("Stamp"),
    
    IMAGE("Image"),
    
    ANNOTATION("Annotation"),
    
    STICKER("Sticker"),
    
    TEXTTOFORMFIELD("TextToFormField"),
    
    WATERMARK("Watermark");

    private String value;

    SignatureImplementationEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SignatureImplementationEnum fromValue(String text) {
      for (SignatureImplementationEnum b : SignatureImplementationEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SignatureImplementationEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SignatureImplementationEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SignatureImplementationEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SignatureImplementationEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("signatureImplementation")
  private SignatureImplementationEnum signatureImplementation = null;

  @SerializedName("formTextFieldTitle")
  private String formTextFieldTitle = null;

  /**
   * Gets or sets the type of form field to put text signature into it. This property could be used only with PdfTextSignatureImplementation &#x3D; TextToFormField. Value by default is AllTextTypes.
   */
  @JsonAdapter(FormTextFieldTypeEnum.Adapter.class)
  public enum FormTextFieldTypeEnum {
    ALLTEXTTYPES("AllTextTypes"),
    
    PLAINTEXT("PlainText"),
    
    RICHTEXT("RichText");

    private String value;

    FormTextFieldTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FormTextFieldTypeEnum fromValue(String text) {
      for (FormTextFieldTypeEnum b : FormTextFieldTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<FormTextFieldTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FormTextFieldTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FormTextFieldTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return FormTextFieldTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("formTextFieldType")
  private FormTextFieldTypeEnum formTextFieldType = null;

  /**
   * Horizontal alignment of text inside a signature. This feature is supported only for Image and Annotation signature implementations  (see  SignatureImplementation property).
   */
  @JsonAdapter(TextHorizontalAlignmentEnum.Adapter.class)
  public enum TextHorizontalAlignmentEnum {
    LEFT("Left"),
    
    CENTER("Center"),
    
    RIGHT("Right");

    private String value;

    TextHorizontalAlignmentEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TextHorizontalAlignmentEnum fromValue(String text) {
      for (TextHorizontalAlignmentEnum b : TextHorizontalAlignmentEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TextHorizontalAlignmentEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TextHorizontalAlignmentEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TextHorizontalAlignmentEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TextHorizontalAlignmentEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("textHorizontalAlignment")
  private TextHorizontalAlignmentEnum textHorizontalAlignment = null;

  /**
   * Vertical alignment of text inside a signature. This feature is supported only for Image signature implementation  (see  SignatureImplementation property).        
   */
  @JsonAdapter(TextVerticalAlignmentEnum.Adapter.class)
  public enum TextVerticalAlignmentEnum {
    TOP("Top"),
    
    CENTER("Center"),
    
    BOTTOM("Bottom");

    private String value;

    TextVerticalAlignmentEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TextVerticalAlignmentEnum fromValue(String text) {
      for (TextVerticalAlignmentEnum b : TextVerticalAlignmentEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TextVerticalAlignmentEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TextVerticalAlignmentEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TextVerticalAlignmentEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TextVerticalAlignmentEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("textVerticalAlignment")
  private TextVerticalAlignmentEnum textVerticalAlignment = null;

  public PdfSignTextOptionsData opacity(Double opacity) {
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

  public PdfSignTextOptionsData signatureID(Integer signatureID) {
    this.signatureID = signatureID;
    return this;
  }

   /**
   * Gets or sets the unique ID of signature. It can be used in signature verification options.
   * @return signatureID
  **/
  @ApiModelProperty(value = "Gets or sets the unique ID of signature. It can be used in signature verification options.")
  public Integer getSignatureID() {
    return signatureID;
  }

  public void setSignatureID(Integer signatureID) {
    this.signatureID = signatureID;
  }

  public PdfSignTextOptionsData signatureImplementation(SignatureImplementationEnum signatureImplementation) {
    this.signatureImplementation = signatureImplementation;
    return this;
  }

   /**
   * Gets or sets the type of text signature implementation.
   * @return signatureImplementation
  **/
  @ApiModelProperty(value = "Gets or sets the type of text signature implementation.")
  public SignatureImplementationEnum getSignatureImplementation() {
    return signatureImplementation;
  }

  public void setSignatureImplementation(SignatureImplementationEnum signatureImplementation) {
    this.signatureImplementation = signatureImplementation;
  }

  public PdfSignTextOptionsData formTextFieldTitle(String formTextFieldTitle) {
    this.formTextFieldTitle = formTextFieldTitle;
    return this;
  }

   /**
   * Gets or sets the title of text form field to put text signature into it. This property could be used only with PdfTextSignatureImplementation &#x3D; TextToFormField.
   * @return formTextFieldTitle
  **/
  @ApiModelProperty(value = "Gets or sets the title of text form field to put text signature into it. This property could be used only with PdfTextSignatureImplementation = TextToFormField.")
  public String getFormTextFieldTitle() {
    return formTextFieldTitle;
  }

  public void setFormTextFieldTitle(String formTextFieldTitle) {
    this.formTextFieldTitle = formTextFieldTitle;
  }

  public PdfSignTextOptionsData formTextFieldType(FormTextFieldTypeEnum formTextFieldType) {
    this.formTextFieldType = formTextFieldType;
    return this;
  }

   /**
   * Gets or sets the type of form field to put text signature into it. This property could be used only with PdfTextSignatureImplementation &#x3D; TextToFormField. Value by default is AllTextTypes.
   * @return formTextFieldType
  **/
  @ApiModelProperty(value = "Gets or sets the type of form field to put text signature into it. This property could be used only with PdfTextSignatureImplementation = TextToFormField. Value by default is AllTextTypes.")
  public FormTextFieldTypeEnum getFormTextFieldType() {
    return formTextFieldType;
  }

  public void setFormTextFieldType(FormTextFieldTypeEnum formTextFieldType) {
    this.formTextFieldType = formTextFieldType;
  }

  public PdfSignTextOptionsData textHorizontalAlignment(TextHorizontalAlignmentEnum textHorizontalAlignment) {
    this.textHorizontalAlignment = textHorizontalAlignment;
    return this;
  }

   /**
   * Horizontal alignment of text inside a signature. This feature is supported only for Image and Annotation signature implementations  (see  SignatureImplementation property).
   * @return textHorizontalAlignment
  **/
  @ApiModelProperty(value = "Horizontal alignment of text inside a signature. This feature is supported only for Image and Annotation signature implementations  (see  SignatureImplementation property).")
  public TextHorizontalAlignmentEnum getTextHorizontalAlignment() {
    return textHorizontalAlignment;
  }

  public void setTextHorizontalAlignment(TextHorizontalAlignmentEnum textHorizontalAlignment) {
    this.textHorizontalAlignment = textHorizontalAlignment;
  }

  public PdfSignTextOptionsData textVerticalAlignment(TextVerticalAlignmentEnum textVerticalAlignment) {
    this.textVerticalAlignment = textVerticalAlignment;
    return this;
  }

   /**
   * Vertical alignment of text inside a signature. This feature is supported only for Image signature implementation  (see  SignatureImplementation property).        
   * @return textVerticalAlignment
  **/
  @ApiModelProperty(value = "Vertical alignment of text inside a signature. This feature is supported only for Image signature implementation  (see  SignatureImplementation property).        ")
  public TextVerticalAlignmentEnum getTextVerticalAlignment() {
    return textVerticalAlignment;
  }

  public void setTextVerticalAlignment(TextVerticalAlignmentEnum textVerticalAlignment) {
    this.textVerticalAlignment = textVerticalAlignment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PdfSignTextOptionsData pdfSignTextOptionsData = (PdfSignTextOptionsData) o;
    return Objects.equals(this.opacity, pdfSignTextOptionsData.opacity) &&
        Objects.equals(this.signatureID, pdfSignTextOptionsData.signatureID) &&
        Objects.equals(this.signatureImplementation, pdfSignTextOptionsData.signatureImplementation) &&
        Objects.equals(this.formTextFieldTitle, pdfSignTextOptionsData.formTextFieldTitle) &&
        Objects.equals(this.formTextFieldType, pdfSignTextOptionsData.formTextFieldType) &&
        Objects.equals(this.textHorizontalAlignment, pdfSignTextOptionsData.textHorizontalAlignment) &&
        Objects.equals(this.textVerticalAlignment, pdfSignTextOptionsData.textVerticalAlignment) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(opacity, signatureID, signatureImplementation, formTextFieldTitle, formTextFieldType, textHorizontalAlignment, textVerticalAlignment, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PdfSignTextOptionsData {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    opacity: ").append(toIndentedString(opacity)).append("\n");
    sb.append("    signatureID: ").append(toIndentedString(signatureID)).append("\n");
    sb.append("    signatureImplementation: ").append(toIndentedString(signatureImplementation)).append("\n");
    sb.append("    formTextFieldTitle: ").append(toIndentedString(formTextFieldTitle)).append("\n");
    sb.append("    formTextFieldType: ").append(toIndentedString(formTextFieldType)).append("\n");
    sb.append("    textHorizontalAlignment: ").append(toIndentedString(textHorizontalAlignment)).append("\n");
    sb.append("    textVerticalAlignment: ").append(toIndentedString(textVerticalAlignment)).append("\n");
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

