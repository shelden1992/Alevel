package com.company.Instaceof;

import java.util.Scanner;


public class CatInstanceof {


    public static void main(String[] args) throws Exception {
        Scanner scanner=new Scanner(System.in);

        while (true) {
            String s=scanner.nextLine();
            Cat cat=new Cat(s);
            cat=CatFactory.getCatByKey(s);

            if (s.isEmpty()) {
                break;

            }


            System.out.println(cat);


        }


    }

    static class CatFactory {
        static Cat getCatByKey(String key) {
            Cat cat=null;
            if ("vaska".equals(key)) {
                cat=new MaleCat("Василий");
            } else if ("murka".equals(key)) {
                cat=new FemaleCat("Мурочка");
            } else if ("kiska".equals(key)) {
                cat=new FemaleCat("Кисюлька");
            } else {
                cat=new Cat(key);
            }
            return cat;
        }
    }

    static class Cat {
        private String name;

        protected Cat(String name) {
            this.name=name;
        }

        public String getName() {
            return this.name;
        }

        public String toString() {
            return "Я уличный кот " + getName();
        }
    }

    static class MaleCat extends Cat {
        MaleCat(String name) {
            super(name);
        }

        public String toString() {
            return "Я - солидный кошак по имени " + getName();
        }
    }


    static class FemaleCat extends Cat {
        FemaleCat(String name) {
            super(name);
        }

        public String toString() {
            return "Я - милая кошечка по имени " + getName();
        }
    }
}
