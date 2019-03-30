package com.company.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SimpleRecursion {

    public static void main(String[] args) {



                System.out.println(sum(new double[] {1,3,4,5}));
            }

            public static double sum(double[] a) {
                if (a.length == 0)
                    return 0.0;
                else{
                    return sumHelper(a, 3);
                }
            }

            private static double sumHelper(double[] a, int i) {
                if(a.length - 1 == i){ //смотри, пацик, если это последний элемент, в данном массиве  => тогда держи его,
//                    а вот если это  не последний элемент, тогда все интереснее
                    return  a[i];
                }else{
                    return  a[i] + sumHelper(a, i + 1);
                }
            }
        }