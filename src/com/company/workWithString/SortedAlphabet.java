package com.company.workWithString;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class SortedAlphabet {


    /* Количество букв
    Ввести с клавиатуры 10 строчек и подсчитать в них количество различных букв (для 33 букв алфавита).  Вывести результат на экран.
    Пример вывода:
    а 5
    б 8
    в 3
    г 7
    д 0
    …
    я 9
    */
    public static void main(String[] args) throws Exception {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

        // алфавит
        String abc="абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray=abc.toCharArray();

        ArrayList<Character> alphabet=new ArrayList<Character>();
        for (int i=0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        // ввод строк
        ArrayList<String> list=new ArrayList<String>();//
        for (int i=0; i < 3; i++) {
            String s=reader.readLine();
            list.add(s.toLowerCase());
        }

        for (Character character : alphabet) {//проходимся по листу с алфавитом //начиная с буквы "а"
            int count=0;

            for (String string : list) {//проходимся по листу с нашими строками и извликаем первый элемент!!!!


                for (int i=0; i < string.length(); i++) {//теперь в этом цикле проходимся по самому элементу("мама")
                    if (string.charAt(i) == character) {//спрашивает данный char эквивалентен тому чару по котору мы проходимся?
                        count++;//если да итеррируй
                    }


                }
            }
        }
    }
}