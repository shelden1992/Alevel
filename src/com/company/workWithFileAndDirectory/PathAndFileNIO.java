package com.company.workWithFileAndDirectory;

import java.io.IOException;
import java.nio.file.*;
//класс Path and Files

public class PathAndFileNIO {
    public static void main(String[] args) throws IOException {
        String fileName =  "/Users/macuser/Desktop/Directory/2.mp4";
        int count=0;
//        String plus = "+';
        printNioFileDetails(fileName);
    }

    public static void printNioFileDetails(String fileName) throws IOException {
        Path path = Paths.get(fileName);
        Path path1 = FileSystems.getDefault().getPath(fileName);
//        Path path2 = Paths.get(System.getProperty(""), fileName);

        System.out.println("" + path.getFileName());
        System.out.println("" + path.getRoot()); // корневая директория
        path =  path.toAbsolutePath(); //переоброзовать в абсалютный пас
        System.out.println(path.subpath(0, 2));
        System.out.println("" + path.getParent());
        System.out.println( "NameCount "+ path.getNameCount());

        System.out.println(Files.exists(path));
        System.out.println(Files.notExists(path));
        System.out.println(Files.isReadable(path));
        System.out.println(Files.isWritable(path));
        System.out.println(Files.isExecutable(path));

        System.out.println(Files.isSameFile(path, path1));

        Path parentPath = path.getParent();
        Path filePath = parentPath.resolve("Chlen");//
        if (Files.notExists(filePath)){
            Files.createDirectories(filePath);
            Files.copy(path, filePath.resolve(path.getFileName())); //копируем содержимое папки (от куда,куда. resolve - разделить/(какой файл) )
        }

    }
}
