package com.company.designPattern.decorator.example;

public class SeaPizzaDecor extends Decor {
    @Override
    public String getName() {
        return super.getName() + " sea pizza";
    }

    @Override
    public int getCost() {
        return  super.getCost() + 120;
    }

    public SeaPizzaDecor(Pizza pizza) {
        super(pizza);
    }
}
