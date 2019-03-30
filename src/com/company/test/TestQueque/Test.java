package com.company.test.TestQueque;

import java.util.ArrayDeque;

public class Test {
    public static void main(String[] args) {
        Person person1 = new Person(1);
        Person person2 = new Person(2);
        Person person3 = new Person(3);
        Person person4 = new Person(4);

//        Queue<Person>people = new LinkedList<>();
        ArrayDeque<Person> people = new ArrayDeque<>();
        people.add (person3);//FIFO (first in first out)
        people.add (person2);
        people.add (person4);
        people.add (person1);

        //3<-2<-4<-1
        for (Person person: people
             ) {
            System.out.println(person);

        }
    }
}
