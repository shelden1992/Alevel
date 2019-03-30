package com.company.sorted;

import java.util.Arrays;

public class SortedSelection {

    public static void main(String[] args) {
        int[] array={3, 2, 5, 0, 4, 1};

        System.out.println(sortedSelection(array));

    }

    public static String sortedSelection(int[] array) {
//        int max=array[0];

        for (int i=0; i < array.length - 1; i++) {
            for (int j=i + 1; j < array.length; j++) {

                if (array[i] > array[j]) {  // нахождения самого мелкого
                    int temp=array[j]; //
                    array[j]=array[i];
                    array[i]=temp;
                }
//2 3 5 0 4 1  0 элемент сравнивается со всем остальным
//2 3 5 0 4 1                                              //
//0 3 5 2 4 1
// i++ 1 элемент сравнивают со всем остальным
//0 2 5 3 4 1
//0 2 5 3 4 1
//0 1 5 3 4 2
// i++ 2 элемент сравнивают со всем остальным
//0 1 3 5 4 2
//0 1 3 5 4 2
//0 1 2 5 4 3
// i++ 3


            }

        }
        return Arrays.toString(array);
    }
    /**
     1/ идея в том, чтобы не менять местами, а запоминать индекс самого маленького елемента, а потом делать один обмен
     2/ заменить if локальной переменной (более дешовая операция)
     */

}
