package com.company.InputOutput;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.*;

/*
Чтение файла
*/

class FileReadeer {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//создали буффер
        String fileName = reader.readLine(); //путь к файлу
        reader.close();//закрыли буфер
        InputStream inStream = new FileInputStream(fileName);//создать новый файл и поместили в новый файл наш путь
        while ( inStream.available() > 0) {   //немного магии
            System.out.print((char)inStream.read());
        }
        System.out.println();
        inStream.close();//закрыли поток помещения

    }
}
