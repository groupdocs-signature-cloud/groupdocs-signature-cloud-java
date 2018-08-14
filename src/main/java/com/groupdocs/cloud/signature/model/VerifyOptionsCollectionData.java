/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="VerifyOptionsCollectionData.java">
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
import com.groupdocs.cloud.signature.model.VerifyOptionsData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Collection of Verify Options - keeps list of options to verify the document.
 */
@ApiModel(description = "Collection of Verify Options - keeps list of options to verify the document.")
public class VerifyOptionsCollectionData {
  @SerializedName("items")
  private List<VerifyOptionsData> items = null;

  @SerializedName("isValid")
  private Boolean isValid = null;

  public VerifyOptionsCollectionData items(List<VerifyOptionsData> items) {
    this.items = items;
    return this;
  }

  public VerifyOptionsCollectionData addItemsItem(VerifyOptionsData itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<VerifyOptionsData>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * List of Verify Options records.
   * @return items
  **/
  @ApiModelProperty(value = "List of Verify Options records.")
  public List<VerifyOptionsData> getItems() {
    return items;
  }

  public void setItems(List<VerifyOptionsData> items) {
    this.items = items;
  }

  public VerifyOptionsCollectionData isValid(Boolean isValid) {
    this.isValid = isValid;
    return this;
  }

   /**
   * Returns summary value of all collection items. If at least one has Valid as false then return values is false.  If all items were verified successfully then return value is true.
   * @return isValid
  **/
  @ApiModelProperty(required = true, value = "Returns summary value of all collection items. If at least one has Valid as false then return values is false.  If all items were verified successfully then return value is true.")
  public Boolean isIsValid() {
    return isValid;
  }

  public void setIsValid(Boolean isValid) {
    this.isValid = isValid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VerifyOptionsCollectionData verifyOptionsCollectionData = (VerifyOptionsCollectionData) o;
    return Objects.equals(this.items, verifyOptionsCollectionData.items) &&
        Objects.equals(this.isValid, verifyOptionsCollectionData.isValid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, isValid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerifyOptionsCollectionData {\n");
    
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    isValid: ").append(toIndentedString(isValid)).append("\n");
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

