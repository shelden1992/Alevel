package com.company.designPattern.decorator.example;

public class Decor extends Pizza {
    private Pizza pizza;

    public Decor(Pizza pizza) {
        this.pizza=pizza;
    }

    @Override
    public String getName() {
        return pizza.getName();
    }

    @Override
    public int getCost() {
        return pizza.getCost();
    }
}
