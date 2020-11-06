![](https://img.shields.io/badge/api-v2.0-lightgrey) [![GitHub license](https://img.shields.io/github/license/groupdocs-signature-cloud/groupdocs-signature-cloud-java)](https://github.com/groupdocs-signature-cloud/groupdocs-signature-cloud-java/blob/master/LICENSE) 

# Java SDK to Document Signature REST API

[GroupDocs.Signature Cloud SDK for Java](https://products.groupdocs.cloud/signature/java) wraps GroupDocs.Signature RESTful API so you may integrate Document Signing features in your own apps with zero initial cost.

GroupDocs.Signature Cloud API allows the developers to create, remove, verify and search different types of signature objects in a number of different formats including Word documents, Excel speradsheets, PowerPoint presentations, PDF, OpenDocument formats & images.

## Manipulate Digital Signatures

- [Support for 55+ document & image formats](https://docs.groupdocs.cloud/signature/supported-document-formats/).
- Add stamp, text, barcode, QR-code, image and digital signatures.
- Search & verify signatures.
- Update & delete signatures by ID.
- Extract document properties like size, creation & update dates, page count and so on.
- Get a list of supported document formats.
- Get a list of supported barcode & QR-Code encode types.

Check out the [Developer's Guide](https://docs.groupdocs.cloud/signature/developer-guide/) to know more about GroupDocs.Signature REST API.

## Supported Signature Types

- **Text Signature** 
- **Image Signature** 
- **Barcode Signature** 
- **QR-Code Signature**
- **Digital Signature** 
- **Stamp Signature**

## Microsoft Office Formats

**Microsoft Word:** DOC, DOCM, DOCX, DOT, DOTM, DOTX\
**Microsoft Excel:** XLS, XLSB, XLSM, XLSX\
**Microsoft PowerPoint:** POTM, POTX, PPS, PPSM, PPSX, PPT, PPTM, PPTX

## Other Document Formats

**Portable:** PDF\
**OpenDocument:** ODT, OTT, ODP, OTP\
**Images:** BMP, PNG, JPG, JPEG, TIFF, GIF, CDR, CGM, CMX, DCM, DJVU, DNG, EMF, WMF, EPS, ICO, JP2, ODG, PCL, PS, PSD, SVG, WEBP\
**Others:** TXT, RTF, CSV, TSV

## Get Started with GroupDocs.Signature Cloud SDK for Java

First create an account at [GroupDocs for Cloud](https://dashboard.groupdocs.cloud/) and get your application information. Next, follow the installation steps as given below.

### Installation

Simply execute the following command to install the API client library to your local Maven repository:

```shell
mvn install
```

Configure the settings of the repository and execute the following to deploy it to a remote Maven repository instead.

```shell
mvn deploy
```

Please refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

#### Maven

Add the following repository and dependency to your project's POM.

```xml
<repository>
    <id>groupdocs-artifact-repository</id>
    <name>GroupDocs Artifact Repository</name>
    <url>https://repository.groupdocs.cloud/repo</url>
</repository>
```

```xml
<dependency>
    <groupId>com.groupdocs</groupId>
    <artifactId>groupdocs-signature-cloud</artifactId>
    <version>20.7</version>
    <scope>compile</scope>
</dependency>
```

#### Others

Generate the JAR by executing `mvn package`, then manually install the following JARs.

* target/groupdocs-signature-cloud-20.7.jar
* target/lib/*.jar

## Get Supported Document Formats

Please follow the [installation](#installation) instruction and execute the following Java code.

```java
import com.groupdocs.cloud.signature.client.*;
import com.groupdocs.cloud.signature.model.*;
import com.groupdocs.cloud.signature.api.InfoApi;

import java.util.*;

public class ApiExample {

    public static void main(String[] args) {
        //TODO: Get your AppSID and AppKey at https://dashboard.groupdocs.cloud (free registration is required).
        String appSid = "XXXXXXXX-XXXX-XXXX-XXXX-XXXXXXXXXXXX";
        String appKey = "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";

        Configuration configuration = new Configuration(appSid, appKey);
        
        InfoApi infoApi = new InfoApi(configuration);

        try {            
            FormatsResult response = infoApi.getSupportedFileFormats();
            
            for (Format format : response.getFormats()) {
                System.out.println(format.getFileFormat());
            }
        } catch (ApiException e) {
            System.err.println("Exception");
            e.printStackTrace();
        }
    }
}
```

## GroupDocs.Signature Cloud SDKs in Popular Languages

| .NET | Java | PHP | Python | Ruby | Node.js |
|---|---|---|---|---|---|
| [GitHub](https://github.com/groupdocs-signature-cloud/groupdocs-signature-cloud-dotnet) | [GitHub](https://github.com/groupdocs-signature-cloud/groupdocs-signature-cloud-java) | [GitHub](https://github.com/groupdocs-signature-cloud/groupdocs-signature-cloud-php) | [GitHub](https://github.com/groupdocs-signature-cloud/groupdocs-signature-cloud-python) | [GitHub](https://github.com/groupdocs-signature-cloud/groupdocs-signature-cloud-ruby)  | [GitHub](https://github.com/groupdocs-signature-cloud/groupdocs-signature-cloud-node) |
| [NuGet](https://www.nuget.org/packages/GroupDocs.Signature-Cloud/) | [Maven](https://repository.groupdocs.cloud/webapp/#/artifacts/browse/tree/General/repo/com/groupdocs/groupdocs-signature-cloud) | [Composer](https://packagist.org/packages/groupdocscloud/groupdocs-signature-cloud) | [PIP](https://pypi.org/project/groupdocs-signature-cloud/) | [GEM](https://rubygems.org/gems/groupdocs_signature_cloud)  | [NPM](https://www.npmjs.com/package/groupdocs-signature-cloud) | 

[Home](https://www.groupdocs.cloud/) | [Product Page](https://products.groupdocs.cloud/signature/java) | [Documentation](https://docs.groupdocs.cloud/signature/) | [Live Demo](https://products.groupdocs.app/signature/total) | [API Reference](https://apireference.groupdocs.cloud/signature/) | [Code Samples](https://github.com/groupdocs-signature-cloud/groupdocs-signature-cloud-dotnet-samples) | [Blog](https://blog.groupdocs.cloud/category/signature/) | [Free Support](https://forum.groupdocs.cloud/c/signature) | [Free Trial](https://dashboard.groupdocs.cloud)
