package com.company.practice1;

public class CatZefir extends Animal {
       private String name;
       int feet = 3;

        public CatZefir (int age, int weight, String name, int feet) {
            super (age,weight,name);
            this.feet = feet;}

            public CatZefir (int age, int weight, String name) {
            super (age,weight,name);

//  super.setAge(age);
//            super.setWeight(weight);
//            this.setName(name);

        }

    public void seeFeet(int feet) {
        System.out.println(feet);
    }

    public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
