package com.company.practice1;

public class Task4 {
    public static void main(String[] args) {
        int max = 0;
        int[] array = {1, 2, 3, 3, 5, 6};

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];}
            else{
                System.out.println("Массив не возрастает");
                break;}

        }
//        System.out.println("Массив возрастает");

    }
}