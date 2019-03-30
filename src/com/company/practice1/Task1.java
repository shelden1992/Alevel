package com.company.practice1;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int[] array = new int[100];
        int a = 2;
        int summ = 0;
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] % a == 0) {
                summ += array[i];
            }
        }
        System.out.println(summ);


    }
}
