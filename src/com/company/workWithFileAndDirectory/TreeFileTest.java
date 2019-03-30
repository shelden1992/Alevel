package com.company.workWithFileAndDirectory;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TreeFileTest {
    public static void main(String[] args) throws IOException {
        Path path=Paths.get("/Users/macuser/Desktop/No_understand/");

        lisdDirectory(path, 0);

    }

    public static void lisdDirectory(Path path, int depth) throws IOException {

        if (Files.isDirectory(path)) {//Directory - и есть директория
            System.out.println(spaseDepth(depth) + "  >>" + path.getFileName());
            try (DirectoryStream<Path> paths=Files.newDirectoryStream(path)) {//показать все файлы, которые есть в папке

                for (Path tempPath : paths
                        ) {
                    System.out.println(tempPath);

                    lisdDirectory(tempPath, depth + 1);
                }
            }

        } else {
            System.out.println(spaseDepth(depth) + "+" + path.getFileName());
        }
    }

    public static String spaseDepth(int depth) {
        StringBuilder stringBuilder=new StringBuilder();
        for (int i=0; i < depth; i++)
            stringBuilder.append("   ");
        return stringBuilder.toString();
    }

}
