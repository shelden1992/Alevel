package com.company.practice1;

public class Task9 {
    public static void main(String[] args) throws Exception {

        int[] array = new int[]{0, -1, 7, 3, 55, 34, 7,333,322};
        int z =0;
        int m =0;
        int q =0;
        for (int i =0; i<array.length; i++){
            if (array[i]<0){
                m=m+1;

            }
            if (array[i]>0){
                q=q+1;}
                else {z=z+1;}

        }
        System.out.println(m+" "+" "+q +" "+z );
    }

}
