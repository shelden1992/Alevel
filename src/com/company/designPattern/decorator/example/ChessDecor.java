package com.company.designPattern.decorator.example;

public class ChessDecor extends Decor  {
    @Override
    public String getName() {
        return super.getName() + " chessPizza";
    }

    @Override
    public int getCost() {
        return super.getCost() + 100;
    }

    public ChessDecor(Pizza pizza) {
        super(pizza);
    }
}
