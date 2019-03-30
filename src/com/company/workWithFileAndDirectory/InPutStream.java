package com.company.workWithFileAndDirectory;

import java.io.FileInputStream;
import java.io.IOException;

public class InPutStream {
    public static void main(String[] args) {

        FileInputStream fileInputStream=null;

        {
            try {
                fileInputStream=new FileInputStream("/Users/macuser/Desktop/Directory/Text.txt");

                int data=fileInputStream.read();//первый символ из файла в int.
                char content;
                while (data != -1) {
                    // преобразуем полученный байт в символ
                    content=(char) data;//переобразуем в символ
                    // выводим посимвольно
                    System.out.print(content);
                    data=fileInputStream.read();
//                    System.out.print(fileInputStream.available());
                }
                fileInputStream.close();
//                System.out.println(fileInputStream.read());//первый символ в байтах (в нашем случае 72, что по ASCII = "H" (Hi it’s impassable!))
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
