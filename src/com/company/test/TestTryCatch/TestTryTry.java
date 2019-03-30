package com.company.test.TestTryCatch;

public class TestTryTry {
    public static void main(String[] args) {
        int [] array = new int[1];
        try {


            try {
                int a =1;
                int b =1/0;
            }
            catch (ArithmeticException a){
                System.out.println("Деление на ноль "+a);
            }
        for (int i=0; i<1; i++) {
            array[i] = i;
        }
        }
        catch (ArrayIndexOutOfBoundsException a){
            System.out.println("Превышение массива "+a);
        }

    }
}
