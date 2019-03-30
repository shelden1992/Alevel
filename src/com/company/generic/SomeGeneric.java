package com.company.generic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SomeGeneric {
    public static void main(String[] args) {
//        можно присвоить лист параметрезовани extends Number!!!!!!!!!!
        List<? extends Number> numbers1=new ArrayList<Integer>();
        Number [] numbers =new Integer[10];
        numbers[0] =1;
//        numbers[1] = 2.0;
//        String s = newList();
//        Object o = newList();
//        Double d =newList();
//


        List<? extends Number> numbers2=new ArrayList<Double>();
        List<? extends Number> numbers3=new ArrayList<Long>();

/////////////////////////////
//        но дообавть нельзя
/////////////////////////////////////////////////////////////////
        List<? super Number> number4 = new ArrayList<>();
        number4.add(123L);
        number4.add(1);
        number4.add(1D);
//        number4.add(new Object());

        }

    public static void someAdd (List<? extends Number> list){
//        list.add(333L);
//        list.add(1D);
//        list.add(1);
        list.add(null);

    }

     public static void PECS (){
//        Collections.copy( List<? !!!super!!! T> dest, List<? extends T> src));
//    PECS (Producer - extends, consumer -super)
//    Joshua Bloch
//

//     ковариатность возвращаймого значения


    }
//    private static  <T extends List<Integer>> T newList(){
//        return (T) new ArrayList<Integer>();
//    }
}
