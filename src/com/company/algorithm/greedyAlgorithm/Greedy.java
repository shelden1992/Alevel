package com.company.algorithm.greedyAlgorithm;

import java.util.Arrays;

public class Greedy {
    public static void main(String[] args) {
        long [] l = {3,1,7,9,9,5};
        long [] l2 = new long[l.length];

        long max = Long.MIN_VALUE;
        for (int i=0; i < l.length-1; i++) {
            if (l[i]>max){
                max = l[i];
                l2[i] = max;
            }

        }
        System.out.println(Arrays.toString(l) );
    }

}
