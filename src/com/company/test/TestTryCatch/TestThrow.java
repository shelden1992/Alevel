package com.company.test.TestTryCatch;

import java.io.IOException;
import java.util.Scanner;

public class TestThrow {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            int x = Integer.parseInt(scanner.nextLine());

            if (x < 0) {
                try {


                    throw new IOException();
                } catch (IOException e) {
                    System.out.println("Вы ввели отрицательное значение");
                }
                break;
            }
        }

    }
}
