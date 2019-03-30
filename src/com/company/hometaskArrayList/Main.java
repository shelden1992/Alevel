package com.company.hometaskArrayList;

public class Main {
    public static void main(String[] args) {
        Cat cat=new Cat("Vasika", 12);
        Cat cat2=new Cat("Muka", 3);
        Dog dog=new Dog("Mops", 5);
        Dog dog1=new Dog("Layka", 12);
        Person person=new Person("Den", 20);
        PetHomeList<Object> habitant=new PetHomeList<>();
        habitant.add(cat);
        habitant.add(cat2);
        habitant.add(dog);
        habitant.add(dog1);
        habitant.add(person);
        for (int i=0; i < habitant.size(); i++) {
            System.out.println(habitant.get(i));
        }

        habitant.delet(4);
        for (int i=0; i < habitant.size(); i++) {
            System.out.println(habitant.get(i));
        }


    }
}

