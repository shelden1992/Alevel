package com.company.workWithRegex;

import java.util.Arrays;

public class RegexSplit {
    public static void main(String[] args) {


        String s="Hello1231413chui2345voniuchiy 212 qw";
       s.replaceAll("[^0-9]+", ""); //вывести только цифры и склеить их
        String[] word =  s.split( "\\s"); // разделить строку на пробелы и записать  в массив
        System.out.println(Arrays.asList(word)); //[Hello1231413chui12345voniuchiy, 212, qw]

        for (String str: word){  //пройтисф по элемент массива
            System.out.println(Arrays.asList(str.matches("\\d+"))); // matches - очень удобно когда нужно
            //полное соответствие узнать; то есть в данном примере спрашиваем является ли элеммент массива ЧИСЛОМ именно числом, а не аброй-кадаброй(123аыа или что-то подобное)
        }


//        System.out.println( Arrays.asList(word.trim().split(" ")));
//        String b= "Hello12 chui voniuchiy";
//        System.out.println(b.replaceAll ("\\d+", " "));
    }
}
