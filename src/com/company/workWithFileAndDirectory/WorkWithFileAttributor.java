package com.company.workWithFileAndDirectory;

import java.io.IOException;
import java.nio.file.FileStore;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.*;

public class WorkWithFileAttributor {
    public static void main(String[] args) throws IOException {
        Path path =Paths.get("/Users/macuser/Desktop/Directory");
        System.out.println(Files.size(path));
        System.out.println(Files.getLastModifiedTime(path));
        System.out.println(Files.isWritable(path));

        FileStore fs = Files.getFileStore(path);
        System.out.println(fs.type());

        validateView(fs, BasicFileAttributeView .class); //+
        validateView(fs, DosFileAttributeView.class);    //-
        validateView(fs, PosixFileAttributeView.class);  //+
        validateView(fs, AclFileAttributeView.class);    //-
        validateView(fs, UserDefinedFileAttributeView.class); //-
        validateView(fs, FileOwnerAttributeView.class);  //+

        BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);
//        DosFileAttributes dosFileAttributes = Files.readAttributes(path, DosFileAttributes.class);
        System.out.println(basicFileAttributes.creationTime());
//        System.out.println(dosFileAttributes.isSystem());//UnsupportedOperationException
//        Set<PosixFilePermission> posixFilePermissions = PosixFilePermissions.fromString("rwx-------");
//        FileAttribute<Set<PosixFilePermission>> fileAttribute = PosixFilePermissions.asFileAttribute(posixFilePermissions);
//        Files.createFile(Paths.get("/Users/macuser/Desktop/Directory"), fileAttribute);
    }

    private static void validateView(FileStore fs, Class<? extends FileAttributeView> viewClass) {
        boolean supports =fs.supportsFileAttributeView(viewClass);
        System.out.println("Supp " + viewClass.getSimpleName()+ " - " + supports);
    }

}
