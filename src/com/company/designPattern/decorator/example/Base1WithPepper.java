package com.company.designPattern.decorator.example;

public class Base1WithPepper extends Pizza {
    @Override
    public String getName() {
        return " Base 2";
    }

    @Override
    public int getCost() {
        return 20;
    }
}
