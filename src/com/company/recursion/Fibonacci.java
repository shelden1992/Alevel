package com.company.recursion;

public class Fibonacci {
    public static void main(String[] args) {

//        for (int i=0; i <=9; i++) {


//        System.out.println( fibonacci(9));     //34
        System.out.println(  fibonacci(5));     //5
//        System.out.println( fibonacci(2));     //1
//        System.out.println( fibonacci(1));     //1
    }

    public static int fibonacci(int n) {

        if (n <2 ) {
            return n;

        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
            /*
             fibonacci (4)                                    +                   fibonacci (3)
                    |                                                                   |
                    ^                                                                   ^
                    fibonacci (3)         +         fibonacci (2)                  fib(2) + fib(1)
                       |                                   |                        |          |
                       ^                                   |                        ^          ^
                   fibonacci (2) + fibonacci (1)           |                        1     +    1
                        |              |                   |
                        ^              ^                   |
                        1    +         1          +        1
            */
        }

    }
//                x    y  + (x = sum)      x = sum
//                1,   1,     2,            3,        5,    8,    13//

}

