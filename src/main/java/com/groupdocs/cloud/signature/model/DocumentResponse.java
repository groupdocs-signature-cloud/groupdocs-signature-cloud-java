/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="DocumentResponse.java">
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
 * Base class for all responses.
 */
@ApiModel(description = "Base class for all responses.")
public class DocumentResponse {
  @SerializedName("fileName")
  private String fileName = null;

  @SerializedName("folder")
  private String folder = null;

  /**
   * Response status code.
   */
  @JsonAdapter(CodeEnum.Adapter.class)
  public enum CodeEnum {
    CONTINUE("Continue"),
    
    SWITCHINGPROTOCOLS("SwitchingProtocols"),
    
    OK("OK"),
    
    CREATED("Created"),
    
    ACCEPTED("Accepted"),
    
    NONAUTHORITATIVEINFORMATION("NonAuthoritativeInformation"),
    
    NOCONTENT("NoContent"),
    
    RESETCONTENT("ResetContent"),
    
    PARTIALCONTENT("PartialContent"),
    
    MULTIPLECHOICES("MultipleChoices"),
    
    AMBIGUOUS("Ambiguous"),
    
    MOVEDPERMANENTLY("MovedPermanently"),
    
    MOVED("Moved"),
    
    FOUND("Found"),
    
    REDIRECT("Redirect"),
    
    SEEOTHER("SeeOther"),
    
    REDIRECTMETHOD("RedirectMethod"),
    
    NOTMODIFIED("NotModified"),
    
    USEPROXY("UseProxy"),
    
    UNUSED("Unused"),
    
    TEMPORARYREDIRECT("TemporaryRedirect"),
    
    REDIRECTKEEPVERB("RedirectKeepVerb"),
    
    BADREQUEST("BadRequest"),
    
    UNAUTHORIZED("Unauthorized"),
    
    PAYMENTREQUIRED("PaymentRequired"),
    
    FORBIDDEN("Forbidden"),
    
    NOTFOUND("NotFound"),
    
    METHODNOTALLOWED("MethodNotAllowed"),
    
    NOTACCEPTABLE("NotAcceptable"),
    
    PROXYAUTHENTICATIONREQUIRED("ProxyAuthenticationRequired"),
    
    REQUESTTIMEOUT("RequestTimeout"),
    
    CONFLICT("Conflict"),
    
    GONE("Gone"),
    
    LENGTHREQUIRED("LengthRequired"),
    
    PRECONDITIONFAILED("PreconditionFailed"),
    
    REQUESTENTITYTOOLARGE("RequestEntityTooLarge"),
    
    REQUESTURITOOLONG("RequestUriTooLong"),
    
    UNSUPPORTEDMEDIATYPE("UnsupportedMediaType"),
    
    REQUESTEDRANGENOTSATISFIABLE("RequestedRangeNotSatisfiable"),
    
    EXPECTATIONFAILED("ExpectationFailed"),
    
    UPGRADEREQUIRED("UpgradeRequired"),
    
    INTERNALSERVERERROR("InternalServerError"),
    
    NOTIMPLEMENTED("NotImplemented"),
    
    BADGATEWAY("BadGateway"),
    
    SERVICEUNAVAILABLE("ServiceUnavailable"),
    
    GATEWAYTIMEOUT("GatewayTimeout"),
    
    HTTPVERSIONNOTSUPPORTED("HttpVersionNotSupported");

    private String value;

    CodeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CodeEnum fromValue(String text) {
      for (CodeEnum b : CodeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<CodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CodeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CodeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CodeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("code")
  private CodeEnum code = null;

  @SerializedName("status")
  private String status = null;

  public DocumentResponse fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

   /**
   * Output File Name.
   * @return fileName
  **/
  @ApiModelProperty(value = "Output File Name.")
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public DocumentResponse folder(String folder) {
    this.folder = folder;
    return this;
  }

   /**
   * Output folder.
   * @return folder
  **/
  @ApiModelProperty(value = "Output folder.")
  public String getFolder() {
    return folder;
  }

  public void setFolder(String folder) {
    this.folder = folder;
  }

  public DocumentResponse code(CodeEnum code) {
    this.code = code;
    return this;
  }

   /**
   * Response status code.
   * @return code
  **/
  @ApiModelProperty(required = true, value = "Response status code.")
  public CodeEnum getCode() {
    return code;
  }

  public void setCode(CodeEnum code) {
    this.code = code;
  }

  public DocumentResponse status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Response status.
   * @return status
  **/
  @ApiModelProperty(value = "Response status.")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentResponse documentResponse = (DocumentResponse) o;
    return Objects.equals(this.fileName, documentResponse.fileName) &&
        Objects.equals(this.folder, documentResponse.folder) &&
        Objects.equals(this.code, documentResponse.code) &&
        Objects.equals(this.status, documentResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileName, folder, code, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentResponse {\n");
    
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    folder: ").append(toIndentedString(folder)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

