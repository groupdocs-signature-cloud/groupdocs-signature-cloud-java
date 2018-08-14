/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="DocumentInfo.java">
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
import com.groupdocs.cloud.signature.model.PagesInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * Describes document information.
 */
@ApiModel(description = "Describes document information.")
public class DocumentInfo {
  @SerializedName("name")
  private String name = null;

  @SerializedName("folder")
  private String folder = null;

  @SerializedName("extension")
  private String extension = null;

  @SerializedName("fileFormat")
  private String fileFormat = null;

  @SerializedName("size")
  private Long size = null;

  @SerializedName("dateModified")
  private OffsetDateTime dateModified = null;

  @SerializedName("pages")
  private PagesInfo pages = null;

  public DocumentInfo name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Document name
   * @return name
  **/
  @ApiModelProperty(value = "Document name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DocumentInfo folder(String folder) {
    this.folder = folder;
    return this;
  }

   /**
   * File name.
   * @return folder
  **/
  @ApiModelProperty(value = "File name.")
  public String getFolder() {
    return folder;
  }

  public void setFolder(String folder) {
    this.folder = folder;
  }

  public DocumentInfo extension(String extension) {
    this.extension = extension;
    return this;
  }

   /**
   * Extension
   * @return extension
  **/
  @ApiModelProperty(value = "Extension")
  public String getExtension() {
    return extension;
  }

  public void setExtension(String extension) {
    this.extension = extension;
  }

  public DocumentInfo fileFormat(String fileFormat) {
    this.fileFormat = fileFormat;
    return this;
  }

   /**
   * File format.
   * @return fileFormat
  **/
  @ApiModelProperty(value = "File format.")
  public String getFileFormat() {
    return fileFormat;
  }

  public void setFileFormat(String fileFormat) {
    this.fileFormat = fileFormat;
  }

  public DocumentInfo size(Long size) {
    this.size = size;
    return this;
  }

   /**
   * Size in bytes.
   * @return size
  **/
  @ApiModelProperty(required = true, value = "Size in bytes.")
  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  public DocumentInfo dateModified(OffsetDateTime dateModified) {
    this.dateModified = dateModified;
    return this;
  }

   /**
   * Modification date.
   * @return dateModified
  **/
  @ApiModelProperty(required = true, value = "Modification date.")
  public OffsetDateTime getDateModified() {
    return dateModified;
  }

  public void setDateModified(OffsetDateTime dateModified) {
    this.dateModified = dateModified;
  }

  public DocumentInfo pages(PagesInfo pages) {
    this.pages = pages;
    return this;
  }

   /**
   * Pages information.
   * @return pages
  **/
  @ApiModelProperty(value = "Pages information.")
  public PagesInfo getPages() {
    return pages;
  }

  public void setPages(PagesInfo pages) {
    this.pages = pages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentInfo documentInfo = (DocumentInfo) o;
    return Objects.equals(this.name, documentInfo.name) &&
        Objects.equals(this.folder, documentInfo.folder) &&
        Objects.equals(this.extension, documentInfo.extension) &&
        Objects.equals(this.fileFormat, documentInfo.fileFormat) &&
        Objects.equals(this.size, documentInfo.size) &&
        Objects.equals(this.dateModified, documentInfo.dateModified) &&
        Objects.equals(this.pages, documentInfo.pages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, folder, extension, fileFormat, size, dateModified, pages);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentInfo {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    folder: ").append(toIndentedString(folder)).append("\n");
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    fileFormat: ").append(toIndentedString(fileFormat)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    pages: ").append(toIndentedString(pages)).append("\n");
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

