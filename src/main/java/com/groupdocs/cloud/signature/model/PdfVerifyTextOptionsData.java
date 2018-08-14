/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="PdfVerifyTextOptionsData.java">
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
 * Pdf Verify Text Options - keeps options to verify Text Signature of Pdf Document
 */
@ApiModel(description = "Pdf Verify Text Options - keeps options to verify Text Signature of Pdf Document")
public class PdfVerifyTextOptionsData extends VerifyTextOptionsData {
  @SerializedName("signatureID")
  private Integer signatureID = null;

  /**
   * Type of Signature to be verified
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

  public PdfVerifyTextOptionsData signatureID(Integer signatureID) {
    this.signatureID = signatureID;
    return this;
  }

   /**
   * Specify Text Signature ID more than zero if it should be verified
   * @return signatureID
  **/
  @ApiModelProperty(value = "Specify Text Signature ID more than zero if it should be verified")
  public Integer getSignatureID() {
    return signatureID;
  }

  public void setSignatureID(Integer signatureID) {
    this.signatureID = signatureID;
  }

  public PdfVerifyTextOptionsData signatureImplementation(SignatureImplementationEnum signatureImplementation) {
    this.signatureImplementation = signatureImplementation;
    return this;
  }

   /**
   * Type of Signature to be verified
   * @return signatureImplementation
  **/
  @ApiModelProperty(value = "Type of Signature to be verified")
  public SignatureImplementationEnum getSignatureImplementation() {
    return signatureImplementation;
  }

  public void setSignatureImplementation(SignatureImplementationEnum signatureImplementation) {
    this.signatureImplementation = signatureImplementation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PdfVerifyTextOptionsData pdfVerifyTextOptionsData = (PdfVerifyTextOptionsData) o;
    return Objects.equals(this.signatureID, pdfVerifyTextOptionsData.signatureID) &&
        Objects.equals(this.signatureImplementation, pdfVerifyTextOptionsData.signatureImplementation) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(signatureID, signatureImplementation, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PdfVerifyTextOptionsData {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    signatureID: ").append(toIndentedString(signatureID)).append("\n");
    sb.append("    signatureImplementation: ").append(toIndentedString(signatureImplementation)).append("\n");
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

