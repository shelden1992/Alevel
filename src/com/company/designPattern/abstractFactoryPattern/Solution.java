package com.company.designPattern.abstractFactoryPattern;

public class Solution {
    /**
     * спользуйте паттерн Factory в следующих случаях:
     * - класс не имеет информации о том, какой тип объекта он должен создать;
     * - класс передает ответственность по созданию объектов наследникам;
     * - необходимо создать объект в зависимости от входящих данных.
     */
    public static void main(String[] args) {
        AbstractFactory factory=FactoryProducer.getFactory(FactoryProducer.Animals.Cat);
        System.out.println(factory.getAnimals("Mau"));
        System.out.println(factory.getAnimals("Woof"));
        factory=FactoryProducer.getFactory(FactoryProducer.Animals.Dog);
        System.out.println(factory.getAnimals("Woof"));
    }


    /*
    Кроссворд
    */

}
