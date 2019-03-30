package com.company.workWithString;

import java.util.Arrays;

public class Temp {
    private static Number number_create;

    public static void main(String[] args) {


//        StringBuilder s=new StringBuilder();
//        StringBuilder v=new StringBuilder();

        int number = 123;
        for (; number>0; number /=10){
            number_create = number%10;
            System.out.println(number_create);
        }
//        for (int a=122; a > 0; a/=10)
//             s.insert(0, a % 10);
//        System.out.println(Arrays.toString(s.toString().split("")));
    }
}
