package com.company.test.TestStack;

import java.util.Stack;

public class TestStack {
    public static void main(String[] args) {
        Stack<Integer>stack = new Stack<>(); //LIFO

        stack.push(5);
        stack.push(3);
        stack.push(1);
//        stack.pop();//последний добавленный элемент в стек
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
        while (!stack.empty()){
            System.out.println(stack.pop());
        }
    }
}
