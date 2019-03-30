package com.company.designPattern.singleton;
//Неудачное решение: отказаться от создания объектов, просто создать класс у которого все методы статические.

/**Удачное решение: создать единственный объект класса и хранить его в статической переменной. Запретить создание второго объекта этого класса.*/
//Топорно реализовать Одиночку очень просто — достаточно скрыть конструктор и предоставить статический создающий метод.


public class Sun {
    private static Sun instance;

    public int getId() {
        return id;
    }

    private int id;

    private Sun(int id) {   //приватный конструктор обеспечит инициализацию только через !!getInstance!!
    this.id= id;
    }

    public static Sun getInstance(int id) {
        if (instance==null){
           instance = new Sun(id);

        }
        return instance;

    }
}
