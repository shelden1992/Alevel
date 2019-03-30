package com.company.workWithFileAndDirectory;

import java.io.*;

public class OutPutStream {
    public static void main(String[] args) {
        String s = "Хуй тебе!";


        OutputStream outputStream;
        File flieDirector = new File ("/Users/macuser/Desktop/Directory2/");
        if (flieDirector.isDirectory()){
            File newFile = new File("/Users/macuser/Desktop/Directory2/", "TextХуй.txt");
            try {

                outputStream=new FileOutputStream(newFile);

                outputStream.write(s.getBytes());

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        else
        {
            try {

                outputStream=new FileOutputStream(flieDirector);

                outputStream.write(s.getBytes());

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
