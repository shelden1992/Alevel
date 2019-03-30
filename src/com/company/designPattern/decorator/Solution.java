package com.company.designPattern.decorator;

import com.company.designPattern.decorator.example.*;

public class Solution {
    /**решает проблемы различных комбинация: например: есть пицца, и пицца имеет множество вариаций и множество цен
     и чтобы не прописовать каждую пиццу можно сделать через данный паттерн, где component - это пицца, а decorator - это
     вид пиццы*/
    public static void main(String[] args) {
        Pizza p1= new ChessDecor(new Base1WithPepper());
        Pizza p2=  new SeaPizzaDecor(new Base2WithTomato());
        System.out.println(p1.getCost() + p1.getName());
        System.out.println(p2.getCost() + p2.getName());
    }



}
