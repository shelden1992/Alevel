package com.company.test.TestTryCatch;

public class Test {


    public static void main(String[] args) {
        divisionOne();
        System.out.println("Вызван из ");

    }

    static void divisionOne() {
        int a = 5;
        int b = 1;
        int c = a / b;
        System.out.println("Вызван из divisionOne ");
        divisionZero();

    }

     static void divisionZero() {

        try {

        int a = 5;
        int b = a/0;
            System.out.println("Вызван из try");
       }

       catch (ArithmeticException e) {
            System.out.println("Вызван из divisionZero ");
            //return c;}
        }

    }
}
