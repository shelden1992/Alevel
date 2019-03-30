package com.company.lambda;


import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Hello");
        list.add("By");
        list.add("To match");

        list.sort((o1, o2) -> {

            if (o1.length() > o2.length()) return 1;
            else if (o1.length() < o2.length()) return -1;
            else return 0;
        });
        System.out.println(list);
    }
}
