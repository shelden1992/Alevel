package com.company.findWorldInMatrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        char [][] crossword=new char[][]{ //у x   5*6
                {'s', 'a', 'm', 'e', 'l'}  ,
                {'w', 'w', 'w', 'w', 'l'},
                {'s', 'a', 'm', 'e', 'l'},
                {'s', 'a', 'm', 'e', 'l'}
        };

        StringBuilder stringBuilder  = new StringBuilder();
        stringBuilder.append(  Arrays.deepToString(crossword).replaceAll("\\,\\s", ""));
        System.out.println(   stringBuilder );

//        System.out.println(detectAllWords(crossword, "home", "same"));
        /*
Ожидаемый результат
home - (5, 3) - (2, 0)
same - (1, 1) - (4, 1)
         */
    }

    public static List<Word> detectAllWords(int[][] crossword, String... words) {
        List<Word> listc=new ArrayList<>();
        int countWords=words.length;
        while (countWords > 0) {


            StringBuilder concontenationCharToWord=new StringBuilder(" ");
            String workWord=words[countWords - 1];
            char[] charactersWorkWord=workWord.toCharArray();
            Word word=new Word(workWord);


            for (char c : charactersWorkWord)

                for (int i=0; i < 2; i++) {
                    for (int j=0; j < 5; j++) {
                        char findWord=(char) crossword[i][j];
                        if (c == findWord) {
                            for (int z = j; z < workWord.length() && z<5; z++){
                                concontenationCharToWord.append ((char) crossword[i][z]);


                            }

                        }



                    }


                }




            countWords--;

        }


        return listc;
    }

    public static class Word {
        private String text;
        private int startX;
        private int startY;
        private int endX;
        private int endY;

        public Word(String text) {
            this.text=text;
        }

        public void setStartPoint(int i, int j) {
            startX=i;
            startY=j;
        }

        public void setText(String text) {
            this.text=text;
        }

        public void setStartX(int startX) {
            this.startX=startX;
        }

        public void setStartY(int startY) {
            this.startY=startY;
        }

        public void setEndX(int endX) {
            this.endX=endX;
        }

        public void setEndY(int endY) {
            this.endY=endY;
        }

        public void setEndPoint(int i, int j) {
            endX=i;
            endY=j;
        }

        public String getText() {
            return text;
        }

        public int getStartX() {
            return startX;
        }

        public int getStartY() {
            return startY;
        }

        public int getEndX() {
            return endX;
        }

        public int getEndY() {
            return endY;
        }

        @Override
        public String toString() {

            return String.format("%s - (%d, %d) - (%d, %d)", text, startX, startY, endX, endY);
        }
    }
}
