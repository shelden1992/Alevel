package com.company.test.TestArrayList;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList {
    public static void main(String[] args) {
        List<Dog> home = new ArrayList<>();
        home.add(new Dog("Vasia", 12));
        home.add(new Dog("Masia", 15));
        home.add(new Dog("Kozia", 9));

        for (Object dog:home) {
            System.out.println(dog);

        }


    }
}
