package com.company.sorted;

import java.util.Arrays;

public class SortedBubble {

    public static void main(String[] args) {
        int[] array={13, 44, 0, 65, 34, 23, 5, 6, 2, 1, 3, 5, 2, 56, 2};
        long start=System.nanoTime();
        sortedBuubleQuick(array);
        long finish=System.nanoTime();

//        double start2=System.currentTimeMillis();
//        sortedBuuble(array);
//        double finish2=System.currentTimeMillis();


        System.out.println("Quick bubble " + ( finish - start ));
//        System.out.println("Bubble sorted " + ( finish2 - start2 ));
    }

    public static String sortedBuubleQuick(int[] array) {

        for (int i=0; i < array.length - 1; i++) {
            for (int j=0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp=array[j];
                    array[j]=array[j + 1];
                    array[j + 1]=temp;
                }
            }
        }


        return Arrays.toString(array);
    }


    /*
public static String sortedBuuble(int[] array) {

        for (int i=0; i < array.length - 1 ; i++) {
            for (int j=0; j < array.length  - 1 ; j++) {
                if (array[j] > array[j + 1]) {
                    int temp=array[j];
                    array[j]=array[j + 1];
                    array[j + 1]=temp;
                }
            }
        }


        return Arrays.toString(array);
    }
    */
}
