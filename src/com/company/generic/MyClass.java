package com.company.generic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyClass {
    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<>();
//        ///////////////
        List<Pets> petsList= new ArrayList<>();
//        petsList.add(new Pets());
        List<Pets> petsList2= new ArrayList<>();
//        petsList2.add(new Pets());
//        ///////////////

        List<Cat> catList = new ArrayList<>();
        List<Dog> dogList = new ArrayList<>();
//        catList.add(new Cat());
        Collections.copy(petsList, catList);
//        public static <T> void copy(List<? !!!extends!!! T> dest, List<? extends T> src); // так нельзя копировать!
//        тогда можно было бы сделать так: Сollections.copy(dogList, catList); прировнять котов к собакам!
//        так-как   public static <T> void copy(List<? !!!super!!! T> dest, List<? extends T> src),
//        то можно сделать так:
        Collections.copy(animalList, catList);


        for (Pets pet: petsList
             ) {
            pet.call();
            System.out.println(pet);

        }

    }
}
