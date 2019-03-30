package com.company.stack;

public class Stack {
    public static void main(String[] args) {
        System.out.println("Вызов из main");
        main2();
        System.out.println("Закончил main");
    }

    private static void main2() {

        try {
            System.out.println("Вызов из main2" );
            main3();
        }


    catch(ArithmeticException err) {
        System.out.println(err.getMessage());
        System.out.println("ошибка деления на 0");

        }
    }

    private static void main3() {
        int i = 0;
        int a = 13;
        int z = a / i;
        System.out.println("Вызов из main3" + z);

    }
}
