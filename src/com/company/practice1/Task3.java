package com.company.practice1;

public class Task3 {
    public static void main(String[] args) {

        int[] array = {1, -1, 2, -2, 3, -4};
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                System.out.println(array[i]);
                continue;
            } else {
                System.out.println(array[i]);
                break;
            }
        }
    }
}
