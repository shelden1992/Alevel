package com.company.test.TestTryCatch;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class OpenFile {
    public static void main(String[] args) throws FileNotFoundException {
        openFile();


    }

    static void openFile() throws FileNotFoundException {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        try (Scanner scannFile = new Scanner(new File(s))) {

            try {

                while (scannFile.hasNextLine()) {
                    System.out.println(scannFile.nextLine());
                }

            } catch (Exception e) {
                e.printStackTrace();
            }


        }

        scanner.close();
    }


}


