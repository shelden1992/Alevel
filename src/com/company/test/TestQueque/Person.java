package com.company.test.TestQueque;

public class Person {
    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                '}';
    }

    public Person(int id) {
        this.id=id;
    }

    private int id;

}
