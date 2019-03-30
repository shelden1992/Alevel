package com.company.JSON.data_binding.serialize;

import com.company.JSON.data_binding.serialize.Cat;
import com.company.JSON.data_binding.serialize.Dog;
import com.company.JSON.data_binding.serialize.Home;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.StringWriter;

public class ToJSON {

    public static void main(String[] args) throws IOException {
        Cat cat=new Cat();
        cat.name="Murka";
        cat.age=5;

        Dog dog=new Dog();
        dog.name="Killer";
        dog.age=8;
        dog.owner="Bill Jeferson";

        Home house=new Home();
        house.pets.add(dog);
        house.pets.add(cat);

        StringWriter writer=new StringWriter();
        ObjectMapper mapper=new ObjectMapper();
        mapper.writeValue(writer, house);
        System.out.println(writer.toString());
    }
}