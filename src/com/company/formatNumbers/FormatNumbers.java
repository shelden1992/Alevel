package com.company.formatNumbers;

public class FormatNumbers {
    static double i = 1234567.09876543;
    static int a = 1234567;

    public static void main(String[] args) {
//        String str = String.format("Испаравить %,100.2f", i);
//        System.out.println(str);


        System.out.printf("Испаравить %,d из %.2f", a, i);

    }
}
