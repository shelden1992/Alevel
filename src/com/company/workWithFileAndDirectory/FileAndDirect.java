package com.company.workWithFileAndDirectory;

import java.io.File;
import java.io.FilenameFilter;

public class FileAndDirect {
    public static void main(String[] args) {

        File file=new File("/Users/macuser/Desktop/Text.txt");
        File file2=new File("/Users/macuser/Desktop/Directory");
        if (file2.isDirectory()) {
            for (File item : file2.listFiles()) {
                System.out.println(item.getName() + " It's directory");//получаем название файлов в директории
                System.out.println(item.getPath());//получаем путь к файлам
//                System.out.println(item.renameTo(new File("Text1")));//получаем путь к файлам


            }

            FilenameFilter only=new OnlyExt("html");//если не использовать listFile
            String[] s=file2.list(only);
            for (int i=0; i < s.length; i++) {
                System.out.println(s[i]);

            }


        }
    }
}

