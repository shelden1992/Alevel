//package com.company.sorted;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//import static com.company.sorted.MergeSorted.mergeSorted;
//import static com.company.sorted.QuickSorted.quickSorted;
//import static com.company.sorted.SortedBubble.sortedBuuble;
//import static com.company.sorted.SortedInsertion.sortedInsertion;
//import static com.company.sorted.SortedSelection.sortedSelection;
//
//public class Main {
//
//
//    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
////
////
////        System.out.println(" Enter name sorted: bubble/selection/insertion/shell/quickSorted/mergeSorted");
//
////            String nameSorted=scanner.nextLine();
//
//
//        System.out.println("Enter eltments in array");
//        int number=Integer.parseInt(scanner.nextLine());
//        if (number > 0) {
//
//            int[] array=new int[number];
//            for (int i=0; i < number; i++) {
//                System.out.println("Enter numbers");
//                int numbersInArray=scanner.nextInt();
//                array[i]=numbersInArray;
//            }
//
//            long start1=System.currentTimeMillis();
//            System.out.println(sortedBuuble(array));
//            long finish1=System.currentTimeMillis();
//            long timeBubble=finish1 - start1;
//
//
//            long start2=System.currentTimeMillis();
//            System.out.println(sortedSelection(array));
//            long finish2=System.currentTimeMillis();
//            long timeSelection=finish2 - start2;
//
//
//            long start3=System.currentTimeMillis();
//            System.out.println(sortedInsertion(array));
//            long finish3=System.currentTimeMillis();
//            long timeInsertion=finish3 - start3;
//
//
//            long start4=System.currentTimeMillis();
//            System.out.println(sortedInsertion(array));
//            long finish4=System.currentTimeMillis();
//            long timeShell=finish4 - start4;
//
//
//            long start5=System.currentTimeMillis();
//            System.out.println(quickSorted(array, 0, array.length - 1));
//            long finish5=System.currentTimeMillis();
//            long timeQuickSorted=finish5 - start5;
//
//
//            long start6=System.currentTimeMillis();
//            System.out.println(mergeSorted(array));
//            long finish6=System.currentTimeMillis();
//            long timeMergeSorted=finish6 - start6;
//
//
//
//            System.out.println("Time: " + time(timeBubble, timeMergeSorted, timeInsertion, timeShell, timeQuickSorted, timeSelection));
//
//        }
//    }
//
//    public static long time(long timeBubble, long timeMergeSorted, long timeInsertion, long timeShell, long timeQuickSorted, long timeSelection) {
//        ArrayList<Long> list=new ArrayList<>();
//        long max = Long.MAX_VALUE;
//        list.add(timeMergeSorted);
//        list.add(timeInsertion);
//        list.add(timeSelection);
//        list.add(timeQuickSorted);
//        list.add(timeShell);
//        list.add(timeBubble);
//
//
//        for (Long list1 : list) {
//
//            if (timeBubble > list1) {
//                timeBubble=list1;
//
//            }
//
//
//        }
//        return timeBubble;
//    }
//}
//
//
//
