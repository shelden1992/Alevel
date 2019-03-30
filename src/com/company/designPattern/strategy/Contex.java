package com.company.designPattern.strategy;

public class Contex {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy=strategy;
    }

    public int executeStrategy(int a, int b) {

        return strategy.someWorkFromArgument(a, b);
    }
}
