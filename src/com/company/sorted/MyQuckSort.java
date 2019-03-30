package com.company.sorted;

import java.util.Arrays;

public class MyQuckSort {

   private static void sort (int [] array, int startIndex, int lastIndex){
       if (array.length==0){
           return;
       }
       if (startIndex>=lastIndex){
           return;
       }
       int i = startIndex, j = lastIndex;
       int pivot = startIndex + (lastIndex-startIndex)/2;

       while (i<j){


           while (i< pivot && array[i]<=array[pivot]){
               i++;
           }
           while (j > pivot && array[j]>=array[pivot]){
           j--;
           }

           if (i<j){
               int temp = array[j];
               array[j] = array[i];
               array[i] = temp;

//               if (i== pivot){
//                   pivot = i;
//               }
//             else  if (j == pivot){
//                   pivot=j;
//               }

           }
           sort(array,startIndex, pivot );
           sort(array, pivot+1, lastIndex );


       }





    }

    public static void main(String[] args) {
        int[] arr=  new int[]{1,0,3 ,5 ,1, 0, 0, 3, 5,1};
        sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString( arr));

    }
}
