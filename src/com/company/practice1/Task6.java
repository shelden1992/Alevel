package com.company.practice1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task6 {
    public static void main(String[] args) throws Exception {

            int[] array = new int[] { 1, 5, 7, 3, 55, 34, 7 };

            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            for (int i =0; i<array.length; i++)
            {
                if (i<min ) {
                    min=i;
                }
                if (i>max) {
                    max=i;

                }
            }

            System.out.println("Result: " + (max - min));
        }
    }
