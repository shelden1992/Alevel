package com.company.workWithFileAndDirectory;

import java.io.IOException;
import java.nio.file.*;

public class WorkWithDirectory {
    public static void main(String[] args) throws IOException {
        Path path =Paths.get("temp");
        if (Files.notExists(path)){
        Files.createDirectory(path);}



    Files.createDirectories(Paths.get("temp/a/b/c"));

        Files.createTempDirectory(path, "tmp");
        Iterable<Path>rootDirectory =  FileSystems.getDefault().getRootDirectories();
        for (Path root: rootDirectory
             ) {
            System.out.println(root);

        }
        DirectoryStream.Filter<Path>filter = new DirectoryStream.Filter<Path>() {
            @Override
            public boolean accept(Path entry) throws IOException {

                return Files.isDirectory(entry);//переопределили метод
            }
        };
        try (DirectoryStream<Path> paths = Files.newDirectoryStream(Paths.get("/Users/macuser/Desktop/Directory"), filter))
        {
            for (Path p: paths
                 ) {
                System.out.println(p);

            }
        }

    }
}
