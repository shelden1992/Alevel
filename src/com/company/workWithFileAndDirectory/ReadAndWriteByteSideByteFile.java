package com.company.workWithFileAndDirectory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadAndWriteByteSideByteFile {
        public static void main(String[] args) throws IOException {
            List<Integer> array=new ArrayList<>();


            Scanner scanner=new Scanner(System.in);
            String nameFile1=scanner.nextLine();
            String nameFile2=scanner.nextLine();
            String nameFile3=scanner.nextLine();
            scanner.close();
            scanner.close();
            scanner.close();

            FileInputStream in1=null;
            FileOutputStream in2=null;
            FileOutputStream in3=null;
            try {
                File file1=new File(nameFile1);
                File file2=new File(nameFile2);
                File file3=new File(nameFile3);
                in1=new FileInputStream(file1);
                in2=new FileOutputStream(file2);
                in3=new FileOutputStream(file3);


                if (in1.available() > 0) {
                    byte[] buffer=new byte[in1.available()];//создает массив байтов, которы будет в дальнейш считывавться [с размером количест массивов]
                    int count=in1.read(buffer); // создаем счетчик,
                    if (count % 2 == 0) {
                        in2.write(buffer, 0, count / 2);
                        in3.write(buffer, count / 2, count / 2);
                    } else {
                        in2.write(buffer, 0, count / 2 + 1);
                        in3.write(buffer, count / 2 + 1, count / 2);
                    }


                }


            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                in1.close();
                in2.close();
                in3.close();

            }

        }
    }