package com.company.recursion;

public class FirstExemple {
    public static void main(String[] args) {
//        int x = 10;
        print(10);
    }

    private static void print(int x) {
        if (x<=0){
        System.out.println("I am ZERO");
        System.exit(0);}
        else
            System.out.println(x);
            print(x-1);
        System.out.println(x);
    }
}
