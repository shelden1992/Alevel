package com.company.workWithMap;


import java.util.HashMap;

public class NewHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        System.out.println( map.size());
        map.put(1, "1");
        map.put(1, "1");
        map.put(2, "1");
        map.put(2, "1");
        System.out.println( map.size());
    }
}
