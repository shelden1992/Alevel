package com.company.test.TestTryCatch;

import java.util.Random;

public class TestNew {
    public static void main(String[] args) throws Exception {
        try{
        random();}
        catch (Exception e){}


    }

    public static void random() throws Exception{
        Random random = new Random();
        int a = 0, b = 0, c = 0, f = 0;


        for (long i = 0; i < 1000000; i++) {
//            try {
//                    a = random.nextInt();
                b = random.nextInt();
                c = random.nextInt();
                int d = 1 / ( b / c );


//            } catch (Exception e) {
                   System.out.println("Вот ты и попался нолик!" );
                f++;

//                int d = 0;


            }

        System.out.println(f);
        }
    }


