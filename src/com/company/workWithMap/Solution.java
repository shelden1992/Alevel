package com.company.workWithMap;


/*
Самый богатый
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.toMap;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader=new BufferedReader(new FileReader("/Users/macuser/Desktop/мама/allFilesContent.txt"));
        String s="";
        Map<String, Double> map=new HashMap<>();
        while (( s=bufferedReader.readLine() ) != null) {

            String[] array=s.split("\\s");

            if (map.containsKey(array[0])) {
                map.put(array[0], map.get(array[0]) + Double.parseDouble(array[1]));
            } else
                map.put(array[0], Double.parseDouble(array[1]));


        }
        double max = Collections.max(map.values());

        for (Map.Entry<String, Double> entry: map.entrySet()) {
            if (entry.getValue().equals(max)){
            System.out.println(entry.getKey());}
        }
        bufferedReader.close();


    }

    private static Map<String, Double> sortedMapForValue(Map<String, Double> map) {

        return map
                .entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(
                        toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2,
                                LinkedHashMap::new));

    }


}