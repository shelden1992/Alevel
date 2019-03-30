package com.company.hometaskNioAndIo;

import java.io.*;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;

public class ReaderAndWriterNIO {
    public static void main(String[] args) throws IOException {
        try (BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in))) {
            int lines=Integer.parseInt(bufferedReader.readLine());
            String path1="/Users/macuser/Desktop/projects/Alevel/Hellow1";
            String path2="/Users/macuser/Desktop/projects/Alevel/Hellow";

            try (BufferedReader bufRead=Files.newBufferedReader(Paths.get(path1));
                 BufferedWriter bufWrite=Files.newBufferedWriter(Paths.get(path2))) {

                String stringNIO;
                int count=0;

                while (count < lines) {
//

                    stringNIO=bufRead.readLine();
                    bufWrite.write(stringNIO);
                    bufWrite.write("\n");

                    count++;
                }

            } catch (NullPointerException | FileNotFoundException | FileAlreadyExistsException | InvalidPathException e) {
                e.printStackTrace();
            }


        }
    }
}