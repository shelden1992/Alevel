package com.company.workWithFileAndDirectory;

import java.io.*;
import java.util.Scanner;

public class PrintWriteFile {
    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(System.in);
        String file1=scanner.nextLine();
        String file2=scanner.nextLine();
        scanner.close();
        FileReader fileInputStream;
        FileWriter fileOutputStream;
        float toFloat=0;
        String s;
        BufferedReader bufferedReader=null;
        PrintWriter printWriter=null;
        try {
            bufferedReader=new BufferedReader(fileInputStream=new FileReader(file1));
            printWriter=new PrintWriter(new FileWriter(file2));
            while (( s=bufferedReader.readLine() ) != null) {
                toFloat=Float.parseFloat(s);
                printWriter.print(Math.round(toFloat));
                printWriter.print(" ");

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            bufferedReader.close();
            printWriter.close();
        }
    }
}

