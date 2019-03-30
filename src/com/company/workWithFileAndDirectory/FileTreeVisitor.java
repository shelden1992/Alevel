package com.company.workWithFileAndDirectory;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FileTreeVisitor {
//    SimpleFileVisitor позволяет не реализовывыть все методы интерфейса FileVisitor
public static void main(String[] args) throws IOException {
    Path path =Paths.get("/Users/macuser/Desktop/Directory/OpenFile.java");
    Files.walkFileTree(path, new Visitor());


}
public  static class Visitor extends  SimpleFileVisitor<Path>{
    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException { //ввыводить директории и путь
        System.out.println(dir);
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {  //выводить все файлы в данной директории и путь

        int nameCount = file.getNameCount();
        Path starPath = file.subpath(0, nameCount-1);
        Path finalPath =  file.subpath(nameCount-1, nameCount);

        Files.move(file, Paths.get(starPath +File.separator + LocalDate.now().format(DateTimeFormatter.ISO_DATE) + "__" + finalPath));
        return FileVisitResult.CONTINUE;
    }
}
}
