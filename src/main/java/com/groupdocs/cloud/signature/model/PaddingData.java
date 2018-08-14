/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="PaddingData.java">
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Represents padding or margin information associated with element
 */
@ApiModel(description = "Represents padding or margin information associated with element")
public class PaddingData {
  @SerializedName("all")
  private Integer all = null;

  @SerializedName("left")
  private Integer left = null;

  @SerializedName("top")
  private Integer top = null;

  @SerializedName("right")
  private Integer right = null;

  @SerializedName("bottom")
  private Integer bottom = null;

  public PaddingData all(Integer all) {
    this.all = all;
    return this;
  }

   /**
   * Gets or sets the padding value for all the edges.
   * @return all
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the padding value for all the edges.")
  public Integer getAll() {
    return all;
  }

  public void setAll(Integer all) {
    this.all = all;
  }

  public PaddingData left(Integer left) {
    this.left = left;
    return this;
  }

   /**
   * Gets or sets the padding value for the left edge.
   * @return left
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the padding value for the left edge.")
  public Integer getLeft() {
    return left;
  }

  public void setLeft(Integer left) {
    this.left = left;
  }

  public PaddingData top(Integer top) {
    this.top = top;
    return this;
  }

   /**
   * Gets or sets the padding value for the top edge.
   * @return top
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the padding value for the top edge.")
  public Integer getTop() {
    return top;
  }

  public void setTop(Integer top) {
    this.top = top;
  }

  public PaddingData right(Integer right) {
    this.right = right;
    return this;
  }

   /**
   * Gets or sets the padding value for the right edge.
   * @return right
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the padding value for the right edge.")
  public Integer getRight() {
    return right;
  }

  public void setRight(Integer right) {
    this.right = right;
  }

  public PaddingData bottom(Integer bottom) {
    this.bottom = bottom;
    return this;
  }

   /**
   * Gets or sets the padding value for the bottom edge.
   * @return bottom
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the padding value for the bottom edge.")
  public Integer getBottom() {
    return bottom;
  }

  public void setBottom(Integer bottom) {
    this.bottom = bottom;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaddingData paddingData = (PaddingData) o;
    return Objects.equals(this.all, paddingData.all) &&
        Objects.equals(this.left, paddingData.left) &&
        Objects.equals(this.top, paddingData.top) &&
        Objects.equals(this.right, paddingData.right) &&
        Objects.equals(this.bottom, paddingData.bottom);
  }

  @Override
  public int hashCode() {
    return Objects.hash(all, left, top, right, bottom);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaddingData {\n");
    
    sb.append("    all: ").append(toIndentedString(all)).append("\n");
    sb.append("    left: ").append(toIndentedString(left)).append("\n");
    sb.append("    top: ").append(toIndentedString(top)).append("\n");
    sb.append("    right: ").append(toIndentedString(right)).append("\n");
    sb.append("    bottom: ").append(toIndentedString(bottom)).append("\n");
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

