package com.company.hometask2.Interface;


import java.util.Scanner;

public class Desktop {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Substance s = null;

            while (s == null) {
                String input = scan.next();
                switch (input) {
                    case "water":
                        s = new Water();
                        break;
                    case "iron":
                        s = new Iron();


                        break;
                    case "oxygen":
                        s = new Oxygen();

                        break;
                }


            }

        while (true) {
            int t = scan.nextInt();
        if (t == 0) { break;
        }
            System.out.println(s.heatUp(t));
            System.out.println(s.getTemperature());

        }
    }

}







