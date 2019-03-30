package com.company.factorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class FactoriaBigInteger {


    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

        int input=Integer.parseInt(reader.readLine());
        reader.close();

        if (input < 0) {
            System.out.println(0);
        } else if (input == 0) {
            System.out.println(1);
        } else if (input >= 1 && input <= 150) {
            System.out.println(factorial(input));
        }
    }

    public static String factorial(int n) {

        BigInteger fact=BigInteger.valueOf(1);
        for (int i=1; i <= n; i++)
            fact=fact.multiply(BigInteger.valueOf(i));

        return fact.toString();
    }
}
//87178291200

