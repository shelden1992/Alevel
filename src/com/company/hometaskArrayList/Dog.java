package com.company.hometaskArrayList;

public class Dog {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public int getAge() {
        return age;
    }

    public Dog(String name, int age) {

        this.name=name;
        this.age=age;
    }
}
