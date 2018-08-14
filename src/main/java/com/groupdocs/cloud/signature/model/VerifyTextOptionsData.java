/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="VerifyTextOptionsData.java">
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
import com.groupdocs.cloud.signature.model.VerifyOptionsData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Verify Text Options - keeps options to verify Text Signature of Document.
 */
@ApiModel(description = "Verify Text Options - keeps options to verify Text Signature of Document.")
public class VerifyTextOptionsData extends VerifyOptionsData {
  @SerializedName("text")
  private String text = null;

  @SerializedName("verifyAllPages")
  private Boolean verifyAllPages = null;

  public VerifyTextOptionsData text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Specify Signature Text if it should be verified.
   * @return text
  **/
  @ApiModelProperty(value = "Specify Signature Text if it should be verified.")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public VerifyTextOptionsData verifyAllPages(Boolean verifyAllPages) {
    this.verifyAllPages = verifyAllPages;
    return this;
  }

   /**
   * Flag to verify each Document Page.
   * @return verifyAllPages
  **/
  @ApiModelProperty(value = "Flag to verify each Document Page.")
  public Boolean isVerifyAllPages() {
    return verifyAllPages;
  }

  public void setVerifyAllPages(Boolean verifyAllPages) {
    this.verifyAllPages = verifyAllPages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VerifyTextOptionsData verifyTextOptionsData = (VerifyTextOptionsData) o;
    return Objects.equals(this.text, verifyTextOptionsData.text) &&
        Objects.equals(this.verifyAllPages, verifyTextOptionsData.verifyAllPages) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, verifyAllPages, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerifyTextOptionsData {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    verifyAllPages: ").append(toIndentedString(verifyAllPages)).append("\n");
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

