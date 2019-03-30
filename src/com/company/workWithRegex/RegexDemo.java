package com.company.workWithRegex;

public class RegexDemo {

    String telNumber;
    public static void main(String[] args) {


 /*
    [0-9] - \\d - одна цифра(только ОДНА цифра!)
    \\w  - одна буква
    \\w = [a-zA-Z]

     + - 1 или более
     * - 0 или более
     ? - символ который идет до него может быть (1) или не быть (0)
     ( x|y | z) - одна строка из множества "|" - это ИЛИ!
     [a-zA-Z]- все англ буквы
     [abc]= (a|b|c)
[^a]- отрицание все, что идет после этого символа в данном случае "a"
[^a-z]- все англ буквы прописные
 . - любой символ
 {2} - точное количество 2 символов до \\d{2} -
 {2, }-  2 или более  символа   \\d{2, } -
 {2,4} - от 2 до 4 символов


     */

        System.out.println(checkTelNumber("+380502087569"));
        System.out.println(checkTelNumber("+38(050)1234567"));
        System.out.println(checkTelNumber("+38050123-45-67"));
        System.out.println(checkTelNumber("050123-4567"));




        String a="-123";
        String b="123";
        String c="+123";
        System.out.println(a.matches("(-|\\+)?\\d*"));//сравнивает ту строку,которая приходит на вход, с той, которая вызывается
        System.out.println(b.matches("(-|\\+)?\\d*"));//сравнивает ту строку,которая приходит на вход, с той, которая вызывается
        System.out.println(c.matches("(-|\\+)?\\d*"));//сравнивает ту строку,которая приходит на вход, с той, которая вызывается

        String d="Ea23456";
        System.out.println("matches" + d.matches("[a-zA-Z]+\\d*"));
        String e="AZ";
        System.out.println(e.matches("[^a-zA-Z]*"));

        String url="http://www.chui.com";
        String url2="http://www.chuiBig.ru";
        System.out.println(url.matches("http://www\\..+\\.(com|ru)"));
        System.out.println(url2.matches("http://www\\..+\\.(com|ru)"));

        String f="123";
        System.out.println(f.matches("\\d{3}"));
    }


        public static boolean checkTelNumber(String telNumber) {
            if (telNumber == null) {
                return false;
            } else if (telNumber.startsWith("+") && telNumber.matches("\\+[0-9]{12}")) {
                return true;

            } else if (telNumber.matches("\\+\\d{2}\\([0-9]{3}\\)[0-9]{7}")) {
                return true;
            } else if (telNumber.matches("\\+?\\d{2}\\(?[0-9]{3}\\)?[0-9]{3}\\-?[0-9]{2}\\-?[0-9]{2}")) {
                return true;
            } else if (telNumber.matches("[0-9]{6}\\-?[0-9]{2}\\-?[0-9]{2}")) {
                return true;
            }


            return false;
        }





}
