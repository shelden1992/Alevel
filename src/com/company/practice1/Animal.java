package com.company.practice1;

public class Animal {
    private int age;
    private int weight;
    private String name;
    int feet;

    public Animal(int age, int weight) {
        this.setAge(age);
        this.setWeight(weight);
    }

    public Animal(int age, int weight, String name) {
        this.setAge(age);
        this.setWeight(weight);
        this.setName(name);
    }

    public Animal(int age, int weight, String name, int feet) {
        this.setAge(age);
        this.setWeight(weight);
        this.setName(name);
        this.feet = feet;
    }

    public void seeFeet(int feet) {
        System.out.println(feet);

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}



