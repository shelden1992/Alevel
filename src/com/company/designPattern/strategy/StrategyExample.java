package com.company.designPattern.strategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StrategyExample {
    public static void main(String[] args) {




        Contex contex = new Contex();
        contex.setStrategy(new Minus());
        int first=  contex.executeStrategy(10, 20);
        System.out.println(first);
        contex.setStrategy(new Multiply());
        int second = contex.executeStrategy(10, 20);
        System.out.println(second);
        contex.setStrategy(new Plus());
        int third = contex.executeStrategy(10, 20);
        System.out.println(third);



    }
    static public Strategy getStrategy (String s){
        switch (s){
            case "+":
                return new Plus();
            case "-":
                return new Minus();
            case "*":
                return new Multiply();

        }

        return null;
    }
    static void enterDate (){
         try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))){
             String s="";
             while (( s=bufferedReader.readLine()).equals("q") ) {



             }


         }
         catch (IOException e) {
             e.printStackTrace();
         }
    }
}
