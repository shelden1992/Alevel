package com.company.practice1;

public class Task11 {

    public static void main(String[] args) {
        int[][] array = new int[4][];
        array[0]=new int[1];
        array[1]=new int[2];
        array[2]=new int[3];
        array[3]=new int[4];
        int k = 0;
        for (int i = 0; i < 4; i++) {
            for (int a = 0; a < a+1; a++) {
                array[i][a] = k;
                k++;
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int a = 0; a < a+1; a++) {
                System.out.printf("%5d", array[i][a]);
            }
            System.out.println( );
        }

    }
}
