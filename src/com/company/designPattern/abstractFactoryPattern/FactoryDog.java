package com.company.designPattern.abstractFactoryPattern;

public class FactoryDog implements AbstractFactory {
    @Override
    public Animal getAnimals(String st) {
        if (st.equals("Woof"))
            return new Dog();
        else return null;
    }
}
