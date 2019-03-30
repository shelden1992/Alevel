package com.company.test.Comparator;

public class Person {

    public Person(int age, String name) {
        this.age=age;
        this.name=name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public int getAge() {
        return age;
    }

    int age;
        String name;
    }

