package com.company.recursion;

import java.lang.ref.SoftReference;

public class Factorial {
    public static void main(String[] args) {
        System.out.println( factorial (3));
    }

    private static int factorial(int i) {
        if (i<=1 ){
            return i;

        }

        else return i* factorial(i-1) ;
                /*            |
10 * 9
                */

    }

}
