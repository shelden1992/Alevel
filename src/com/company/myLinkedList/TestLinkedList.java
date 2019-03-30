package com.company.myLinkedList;

public class TestLinkedList {

    public static void main(String[] args) throws IllegalAccessException {
        SinglyLinkedList<String> str=new SinglyLinkedList<>();

        str.add(0,"хер1");
        str.add("хер2");
        str.add("хер3");
        str.add("хер4");
        str.add("хер5");
        str.add("хер6");
//        str.remove("хер5");
//        for (int i = 0; i<3; i++) {
//
//                System.out.println(str.get(i));}
//str.remove(0);
//        str.remove();
        str.clear( );

        for (int i=0; i < str.size(); i++) {

            System.out.println(str.get(i));

        }
        System.out.println(str.size());
        System.out.println(str.contains("хер1"));
    }
}
//
////        System.out.println(str.contains("хер3"));


