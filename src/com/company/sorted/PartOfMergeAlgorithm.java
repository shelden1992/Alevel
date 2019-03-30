package com.company.sorted;

import java.sql.Array;
import java.util.Arrays;

public class PartOfMergeAlgorithm {
    public static void main(String[] args) {
        int[] array1={1, 4, 5, 6, 7, 10, 15};
        int[] array2={17, 18, 19};

        System.out.println(Arrays.toString(merge(array1, array2)));
    }

    private static int[] merge(int[] array1, int[] array2) {
        int[] newArray=new int[array1.length + array2.length];
        int a=0, b=0, c=0;


//
//        while (a+b != newArray.length){
//            if (array1[a]< array2[b]){
//                newArray[a+b] = array1[a++];
//
//            }
//            else newArray[a+b] =array2[b++];
//        }
//        не работает, так как

//
        while (a < array1.length && b < array2.length) {
                newArray[c++]=array1[a] < array2[b]? array1[a++]: array2[b++];

        }
        if (( a < array1.length )) {
            System.arraycopy(array1, a, newArray, c, array1.length - a);
        } else {
            System.arraycopy(array2, b, newArray, c, array2.length - b);
        }

//        while (a < array1.length) {
//            newArray[c++]=array1[a++];
//        }

//        while (b < array2.length) {
//            newArray[c++]=array2[b++];
//        }


        return newArray;


    }
}
