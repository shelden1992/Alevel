package com.company.workWithFileAndDirectory;

import java.io.*;

public class ReadAndWriteByteSideByte {
    public static void main(String[] args) {

        String path="/Users/macuser/Desktop/Directory/2.mp4";
        String path2="/Users/macuser/Desktop/Directory2/2.mp4";
        try

        {
            FileInputStream inputStream=new FileInputStream(path);
            FileOutputStream outputStream=new FileOutputStream(path2);
//            BufferedInputStream bufferedReader=new BufferedInputStream(inputStream);
//            BufferedOutputStream bufferedWrite=new BufferedOutputStream(outputStream);
            byte[] bt = new byte[1000];
            while (inputStream.available() > 0) {

                int date=inputStream.read(bt);// не совсем понимаю принимает в качестве аргументв массив байтов
                outputStream.write(bt, 0, date);
            }
            outputStream.close();
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
