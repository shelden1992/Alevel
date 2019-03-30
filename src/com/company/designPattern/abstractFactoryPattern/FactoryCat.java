package com.company.designPattern.abstractFactoryPattern;

public class FactoryCat implements AbstractFactory{
    @Override
    public Animal getAnimals(String st) {
       if (st.equals("Mau"))
        return new Cat();
       else return null;
    }
}
