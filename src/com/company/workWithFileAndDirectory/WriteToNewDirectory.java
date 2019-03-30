package com.company.workWithFileAndDirectory;


import java.io.File;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;

public class WriteToNewDirectory {
    public static void main(String[] args) {


        File file=new File("/Users/macuser/Desktop/Directory");
        File file2=new File("/Users/macuser/Desktop/Directory2");

      if (!file2.exists()) {


          boolean result = file2.mkdir();//создаем новый деректорий если путь указан не верно или такой папки не существует!!
          //mkdirs -- создает коталог+ все родительские катологи
          if (result)
          System.out.println("This directory was created " + file2.getAbsolutePath());
          else System.out.println("This directory failed creating " + file2.getAbsolutePath());
      }

        for (File write : file.listFiles()) {
            try {
                Files.copy(write.toPath(),  new File (file2+File.separator+write.getName()).toPath()); //Files - из библиотеки NIO
            } catch (FileAlreadyExistsException a) {
                a.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

