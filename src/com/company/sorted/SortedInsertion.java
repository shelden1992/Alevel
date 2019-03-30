package com.company.sorted;

import java.util.Arrays;

public class SortedInsertion {


    public static void main(String[] args) {
        int[] array={1, 0, 2, 4, 1,7, 5 };
        System.out.println(sortedInsertion(array));
    }


    public static String sortedInsertion(int[] array) {

        for (int barier=1; barier < array.length; barier++) {
            for (int index=barier; index > 0; index--) {
                if (array[index-1] > array[index]) {

                    int temp=array[index]; //
                    array[index]=array[index-1];
                    array[index-1]=temp;
                }
            }

        }



//     установка барьера на элементе под инд 1 (так-как считаем, что 0 элемент уже отсортирован)
//     и идем от данного барьера в начало массива
//     и если предидущий элемент больше "барьерного"
//     меняем их местами

//        1 [0] | 2 4 1 7 5
//        1>0? switch : nothing
//        условие barier++
//        0 1 [2] | 4 1 7 5
//        1>2? switch : nothing
//        index--
//        0>2 ? switch : nothing
//        условие barier++
//        0 1 2 [4] | 1 7 5
//        2>4 ? switch : nothing
//        1>4 ? switch : nothing
//        0>4 ? switch : nothing
//        условие barier++
//        0 1 2 4  [1] | 7 5
//         4 >1 ? switch
//        0 1 2 [1]   4 | 7 5
//        index --
//        2> 1 ?  switch
//        0 1 [1] 2  4 | 7 5
//        index --
//        1>1?
//        условие barier++

//


//


//        for (int barrier=1; barrier < array.length; barrier++) {
//            int newElement=array[barrier];
//            int location=barrier - 1;
//
//
//            while (location >=0 && array[location] > newElement ) {
//                array[location + 1]=array[location];
//                location--;
//            }
//            array[location+1]= newElement;
//        }

        return Arrays.toString(array);
    }




}
