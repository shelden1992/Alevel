package com.company.InputOutput;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class FileReaderScanner {
        public static void main(String[] args) throws IOException
        {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Введите название файла");
            String s =bufferedReader.readLine();
            File file = new File(s);

            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        }
    }

