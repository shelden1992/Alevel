package com.company.test.Comparator;

import java.util.*;

public class TestComparator {
    public static void main(String[] args) {
        List<Person> people=new ArrayList<>();
        people.add(new Person(33, "Vasia"));
        people.add(new Person(122, "VasiaOld"));
        people.add(new Person(11, "VasiaYoung"));


        Collections.sort(people, new PersonComrator());

        System.out.println(people);
    }
}

class PersonComrator implements Comparator<Person>{
            @Override

            public int compare(Person o1, Person o2) {
                if (o1.getAge()>o2.getAge())

                    return 1;
                else if (o1.getAge()<o2.getAge())
                    return -1;
                else return 0;
            }
        }









