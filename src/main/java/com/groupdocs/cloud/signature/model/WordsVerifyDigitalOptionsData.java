/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="WordsVerifyDigitalOptionsData.java">
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
import com.groupdocs.cloud.signature.model.VerifyDigitalOptionsData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * Words Verify Digital Options - keeps options to verify Digital Signature of Words Documents.
 */
@ApiModel(description = "Words Verify Digital Options - keeps options to verify Digital Signature of Words Documents.")
public class WordsVerifyDigitalOptionsData extends VerifyDigitalOptionsData {
  @SerializedName("comments")
  private String comments = null;

  @SerializedName("signDateTimeFrom")
  private OffsetDateTime signDateTimeFrom = null;

  @SerializedName("signDateTimeTo")
  private OffsetDateTime signDateTimeTo = null;

  public WordsVerifyDigitalOptionsData comments(String comments) {
    this.comments = comments;
    return this;
  }

   /**
   * Comments of Digital Signature to validate.
   * @return comments
  **/
  @ApiModelProperty(value = "Comments of Digital Signature to validate.")
  public String getComments() {
    return comments;
  }

  public void setComments(String comments) {
    this.comments = comments;
  }

  public WordsVerifyDigitalOptionsData signDateTimeFrom(OffsetDateTime signDateTimeFrom) {
    this.signDateTimeFrom = signDateTimeFrom;
    return this;
  }

   /**
   * Date and time range of Digital Signature to validate. Null value will be ignored.
   * @return signDateTimeFrom
  **/
  @ApiModelProperty(value = "Date and time range of Digital Signature to validate. Null value will be ignored.")
  public OffsetDateTime getSignDateTimeFrom() {
    return signDateTimeFrom;
  }

  public void setSignDateTimeFrom(OffsetDateTime signDateTimeFrom) {
    this.signDateTimeFrom = signDateTimeFrom;
  }

  public WordsVerifyDigitalOptionsData signDateTimeTo(OffsetDateTime signDateTimeTo) {
    this.signDateTimeTo = signDateTimeTo;
    return this;
  }

   /**
   * Date and time range of Digital Signature to validate. Null value will be ignored.
   * @return signDateTimeTo
  **/
  @ApiModelProperty(value = "Date and time range of Digital Signature to validate. Null value will be ignored.")
  public OffsetDateTime getSignDateTimeTo() {
    return signDateTimeTo;
  }

  public void setSignDateTimeTo(OffsetDateTime signDateTimeTo) {
    this.signDateTimeTo = signDateTimeTo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WordsVerifyDigitalOptionsData wordsVerifyDigitalOptionsData = (WordsVerifyDigitalOptionsData) o;
    return Objects.equals(this.comments, wordsVerifyDigitalOptionsData.comments) &&
        Objects.equals(this.signDateTimeFrom, wordsVerifyDigitalOptionsData.signDateTimeFrom) &&
        Objects.equals(this.signDateTimeTo, wordsVerifyDigitalOptionsData.signDateTimeTo) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comments, signDateTimeFrom, signDateTimeTo, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WordsVerifyDigitalOptionsData {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    signDateTimeFrom: ").append(toIndentedString(signDateTimeFrom)).append("\n");
    sb.append("    signDateTimeTo: ").append(toIndentedString(signDateTimeTo)).append("\n");
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

