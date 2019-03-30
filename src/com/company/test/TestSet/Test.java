package com.company.test.TestSet;

import java.util.*;

public class Test {
    public static void main(String[] args) {

        Map<Cat, String> map=new HashMap<>();
        Set<Cat> set = new HashSet<>();
maps(map);





        }
        public static void maps(Map<com.company.test.TestSet.Cat, String> map){
        Cat cat = new Cat("Vasia", 12);
        Cat cat2= new Cat("Vasia", 12);
        map.put(cat, "первый кот");
        map.put(cat2, "второй кот с его параметрами");

            for(Map.Entry < Cat, String > entry: map.entrySet()){
                System.out.println(entry.getKey() + " " + entry.getValue());
            }


        }





    }






