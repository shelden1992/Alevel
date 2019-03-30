package com.company.hometaskExeption;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int x=scanner.nextInt();


        ArithmeticProgression arithmeticProgression=null;
        try {
            arithmeticProgression=new ArithmeticProgression(1, 2);
        } catch (ProgressionConfigurationException e) {
            e.printStackTrace();
        }

        try {
            arithmeticProgression.calculate(x);
        } catch (ProgressionConfigurationException e) {
            e.printStackTrace();
        }
    }
}
