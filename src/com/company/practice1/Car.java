package com.company.practice1;

abstract class Car {
    int hourse;
    double parametrs;

    public Car(int hourse, double parametrs) {
        this.hourse = hourse;
        this.parametrs = parametrs;
    }

    abstract int strong();
}

class BMV extends Car {
      String clasCar;


    public BMV(int hourse, double parametrs, String clasCar) {
        super(hourse, parametrs);
        this.clasCar = clasCar;
    }

    @Override
    public int strong() {
        return (int) (hourse * parametrs);

    }

    public static void main(String[] args) {
//        Car car = new Car(32, 23);
        BMV bmv = new BMV(120, 8, "first");
        Mersedess mersedess = new Mersedess(130, 6);
        System.out.println(bmv.strong());
    }
}
class Mersedess extends Car{


    public Mersedess(int hourse, double parametrs) {
        super(hourse, parametrs);

    }

    @Override
    int strong() {
        return (int) (hourse * parametrs);
    }
}
