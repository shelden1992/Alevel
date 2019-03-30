package com.company.test.TestLinkedList1;


public class TestLinkedList {
    public static void main(String[] args) throws Exception {


        SingleLinkedList<String> myLinkedList=new SingleLinkedList<>();

        myLinkedList.add("aaa");
//        myLinkedList.add(1, "#@#");
        myLinkedList.add(3, "2");
        for (int i=0; i < myLinkedList.size(); i++) {
            System.out.println(myLinkedList.get(i));
        }
    }
}