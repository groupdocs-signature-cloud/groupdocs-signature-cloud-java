package com.groupdocs.cloud.signature.api;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TestFiles {

    public static List<TestFile> CellsDocs;
    public static List<TestFile> PdfDocs;
    public static List<TestFile> SlidesDocs;
    public static List<TestFile> ImagesDocs;
    public static List<TestFile> WordsDocs;
    public static List<TestFile> Images;
    public static List<TestFile> Certificates;

    public static ArrayList<TestFile> SignedCellsDocs;
    public static ArrayList<TestFile> SignedPdfDocs;
    public static ArrayList<TestFile> SignedSlidesDocs;
    public static ArrayList<TestFile> SignedImagesDocs;
    public static ArrayList<TestFile> SignedWordsDocs;

    public static String ResourcesPath; 
    public static String StoragePath; 
    public static String SignedPath;
    public static String ImagesPath;
    public static String CertificatesPath;

    static {
        ResourcesPath = Paths.get("resources").toAbsolutePath().toString();
        StoragePath = Paths.get("resources\\storage").toAbsolutePath().toString();
        SignedPath = Paths.get("resources\\signed").toAbsolutePath().toString();
        ImagesPath = Paths.get("resources\\images").toAbsolutePath().toString();
        CertificatesPath = Paths.get("resources\\certificates").toAbsolutePath().toString();

        CellsDocs = getFiles(StoragePath,".xlsx","storage");
        ImagesDocs = getFiles(StoragePath,".jpg","storage");
        PdfDocs = getFiles(StoragePath,".pdf","storage");
        SlidesDocs = getFiles(StoragePath,".pptx","storage");
        WordsDocs = getFiles(StoragePath,".docx","storage");
        Images = getFiles(ImagesPath,".jpg","images");
        Certificates = getFiles(CertificatesPath,".pfx","certificates");

        SignedCellsDocs = getFiles(SignedPath,".xlsx", "signed");
        SignedImagesDocs = getFiles(SignedPath,".png", "signed");
        SignedPdfDocs = getFiles(SignedPath,".pdf", "signed");
        SignedSlidesDocs = getFiles(SignedPath,".pptx", "signed");
        SignedWordsDocs = getFiles(SignedPath,".docx", "signed");
    }

    public static ArrayList<TestFile> getFiles(String path, String pattern, String folder) {
        ArrayList<TestFile> result = new ArrayList<TestFile>();
        File directory = new File(path);
        File[] files = directory.listFiles();        
        for (File file : files) {
            String name = file.getName();
            if(file.isFile() && name.endsWith(pattern)){ 
                TestFile testFile = new TestFile(name);
                testFile.setFolder(folder);
                if(name.indexOf("pwd") != -1){
                    testFile.setPassword("1234567890");
                }
                result.add(testFile);
            }
        }
        return result;
    }
}