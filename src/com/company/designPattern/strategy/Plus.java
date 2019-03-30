package com.company.designPattern.strategy;

public class Plus implements Strategy {

    @Override
    public int someWorkFromArgument(int a, int b) {
        return a+b;
    }
}
