package com.company.hometaskNioAndIo;


import java.io.*;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.InvalidPathException;
import java.util.Scanner;

public class ReaderAndWriterIO {
    public static void main(String[] args) throws IOException {


        String pathSourse="/Users/macuser/Desktop/projects/Alevel/Hellow";
        String pathDestination1="/Users/macuser/Desktop/projects/Alevel/Hellow1";

        Scanner scanner=new Scanner(System.in);
        int lines=scanner.nextInt();

        try (BufferedReader bufRead=new BufferedReader(new FileReader(new File(pathSourse)));
             BufferedWriter bufWrite=new BufferedWriter(new FileWriter(new File(pathDestination1)));
        ) {

            String stringIO;
            int count=0;
            int countB=0;

            while (count < lines) {
//

                stringIO=bufRead.readLine();
                bufWrite.write(stringIO);
                bufWrite.write("\n");

                count++;
            }

        } catch (NullPointerException | FileNotFoundException | FileAlreadyExistsException | InvalidPathException e) {
            e.printStackTrace();
        }


    }
}