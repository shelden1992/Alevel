package com.company.designPattern.abstractFactoryPattern;

public class FactoryProducer    {
/**Используйте паттерн Абстрактная Фабрика в таких случаях:

 - система не должна зависеть от способа создания объектов;
 - система работает с одним из нескольких семейств объектов;
 - объекты внутри семейства взаимосвязаны.*/

    protected static enum Animals{  //это как пример
        Cat, Dog
    }

    public static AbstractFactory getFactory(Animals animals){ // можно использовать вместе с !!! instance of Object !!!
        switch (animals){
            case Cat:
                return new FactoryCat();
            case Dog:
                return new FactoryDog();
        }
        return null;
    }
}
