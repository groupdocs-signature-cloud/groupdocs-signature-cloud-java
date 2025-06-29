# GroupDocs.Signature Cloud SDK for Java

This repository contains GroupDocs.Signature Cloud SDK for Java source code. This SDK allows you to work with GroupDocs.Signature Cloud REST APIs in your Java applications.

## Requirements

* Java SE Development Kit 8

## Installation

### Maven

Add following repository and dependency to your project's POM

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
    <version>25.6</version>
    <scope>compile</scope>
</dependency>
```

### Gradle

Add following repository and dependency to your build.gradle:

```javascript
repositories {
    maven {
        url "https://repository.groupdocs.cloud/repo/"
    }
}

...
dependencies {
    ...
    implementation 'com.groupdocs:groupdocs-signature-cloud:25.6'
}
```

## Getting Started

* Please follow the [installation](#installation) instruction
* Get your AppSID and AppKey at [Dashboard](https://dashboard.groupdocs.cloud) and use them in your code
* Build and execute
* Explore more samples at [GitHub](https://github.com/groupdocs-signature-cloud/groupdocs-signature-cloud-java-samples)

Example:

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
            System.err.println("Failed to get supported file formats");
            e.printStackTrace();
        }
    }
}
```

## Manual build and installation from sources

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.
Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

At first generate the JAR by executing following command in "/src" working directory:

```shell
mvn package -D maven.test.skip=true
```

Then manually install the following JARs:

* target/groupdocs-signature-cloud-25.6.jar
* target/lib/*.jar

## Licensing

All GroupDocs.Signature Cloud SDKs are licensed under [MIT License](LICENSE).

## Resources

* [**Website**](https://www.groupdocs.cloud)
* [**Product Home**](https://products.groupdocs.cloud/signature)
* [**Documentation**](https://docs.groupdocs.cloud/signature/)
* [**Free Support Forum**](https://forum.groupdocs.cloud/c/signature)
* [**Blog**](https://blog.groupdocs.cloud/category/signature)

## Contact Us

Your feedback is very important to us. Please feel free to contact us using our [Support Forums](https://forum.groupdocs.cloud/c/signature).
