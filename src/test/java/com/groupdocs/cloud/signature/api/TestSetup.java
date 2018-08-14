package com.groupdocs.cloud.signature.api;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.aspose.storage.api.StorageApi;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
    // Helpers
    FormatsApiTests.class,
    BarcodesApiTests.class,
    QRCodesApiTests.class,
    // Signature
    SignatureTextApiTests.class,
    SignatureImageApiTests.class,
    SignatureDigitalApiTests.class,
    SignatureBarcodeApiTests.class,
    SignatureQRCodeApiTests.class,
    SignatureStampApiTests.class,
    // Verification
    VerificationTextApiTests.class,
    VerificationBarcodeApiTests.class,
    VerificationQRCodeApiTests.class,
    VerificationDigitalApiTests.class    
    // Search
    
})
public class TestSetup {
    
    private static StorageApi storageApi = 
        new StorageApi(Config.BasePath, Config.AppKey, Config.AppSID);
    private static String resourcesPath = 
        Paths.get("resources").toAbsolutePath().toString();

    @BeforeClass
    public static void setUp() {
        uploadTestData();
    }

	private static void uploadTestData() {
        uploadFiles(resourcesPath);
    }

	public static void uploadFiles(String path) {
        File directory = new File(path);

        File[] files = directory.listFiles();
        for (File file : files) {
            String relativePath = getRelativePath(file.getAbsolutePath(), resourcesPath);
            if (file.isFile()) {
                uploadFile(file, relativePath);
            } else if (file.isDirectory()) {
                uploadFiles(file.getAbsolutePath().toString());
            }
        }
    }

    private static String getRelativePath(String absolutePath, String basePath) {
        Path absolute = Paths.get(absolutePath);
        Path base = Paths.get(basePath);
        Path relative = base.relativize(absolute);

        return relative.toString();
    }

    private static void uploadFile(File file, String relativePath) {
        String filePath = relativePath.replace("\\", "/");
        storageApi.PutCreate(filePath, null, null, file);
    }   
}
