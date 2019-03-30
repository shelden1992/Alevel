package com.company.practice1;

public class Task5 {
    public static void main(String[] args) {

        int[] array = {2, 4, 6};

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                int[] array2 = {i};
            } else if (array[i] % 2 != 0) {
                System.out.println("нет четных");

            }
        }

    }
}
