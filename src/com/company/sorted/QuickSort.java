//package com.company.sorted;
//
//import java.util.Arrays;
//
//public class QuickSort {
//
//        public static void quickSort (int [] array, int startIndex , int endIndex ) {
//            if (array.length == 0)
//                return;
//            if (startIndex >= endIndex)
//                return;
//
//            int i=startIndex, j=endIndex;
//            int cur= startIndex + (endIndex - startIndex) / 2;
////            int opora = array[cur];
//            while (i < j) {
//
//                while (i < cur && ( array[i] <= array[cur] )) {
//                    // 0<=1? true
//                    //  4<=1? false -> вышли из цикла
//                    i++;
//                }
//                while ( j > cur && ( array[cur] <= array[j] )) {
//                    // 1<=5 true
//                    // 1<=2 true
//                    // 1<=0 false
//                    j--;
//                }
//
//                  {//меняем местами    arr[i] = 4, arr[j] = 0
//                    if (i < j) {
//                        int temp = array[i];
//                        array[i] = array[j];
//                        array[j] = temp;
//                        // после обмена 0 0 (1) 4 2 5
//
//
//                        if (i == cur)
//                            cur = j;
//                        else if (j == cur)
//                            cur = i;
//                    }
//                }
//
//            }
//
//
//
//            quickSort(array, startIndex, cur);
//            quickSort(array, cur+1, endIndex);
//
//
//
//            // вызов рекурсии для сортировки левой и правой части
//
//        }
//
//
//
//
//    public static void main(String[] args) {
//        int [] arrray = new int[]{0,4,1,0,2,5};
//            quickSort (arrray, 0, arrray.length -1 );
//        System.out.println(Arrays.toString(arrray));
//
//    }
//
//}
