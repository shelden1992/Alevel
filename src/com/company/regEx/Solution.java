package com.company.regEx;

import java.io.*;
import java.math.MathContext;

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader  = new BufferedReader(new FileReader("/Users/macuser/Desktop/мама/allFilesContent.txt"));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("/Users/macuser/Desktop/мама/secretPasswords.txt"))){
            String s= "";
            StringBuilder stringBuilder = new StringBuilder();
            while ((s= bufferedReader.readLine())!=null){
                String[] splitWord =  (s.split("\\s"));
                for (String st: splitWord
                ) {
                    if (st.matches("\\b[\\S]*[\\d]+[\\S]*\\b")){  //if match digital+word
                        stringBuilder.append(st).append(" ");
                    }

                }




            }
            bufferedWriter.write(stringBuilder.toString());
            System.out.println(stringBuilder);



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


