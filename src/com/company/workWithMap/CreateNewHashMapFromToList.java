package com.company.workWithMap;

import java.util.*;

public class CreateNewHashMapFromToList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        HashMap <String, String> hashMap = new HashMap<>();


        Iterator<String> iterator1 = list.iterator();
        Iterator<String> iterator2= list2.iterator();


        while (iterator1.hasNext() && iterator2.hasNext()){
            hashMap.put(iterator1.next(), iterator2.next());
        }
        if (iterator1.hasNext() || iterator2.hasNext()){
            throw  new IllegalArgumentException();
        }


//        List<String> things = Arrays.asList("123,456,789".split(","));
    }
}
