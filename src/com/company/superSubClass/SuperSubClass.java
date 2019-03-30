package com.company.superSubClass;

public class SuperSubClass {
   abstract static class Auto{
        public void speed() {
        }
    }
    static  class SpecialAuto extends Auto{


    }
    static class FamallyAuto extends Auto{

    }
    static class BMV extends FamallyAuto{

        public  void speed(){
            System.out.println("Я BMW");
        }
void run(){

}

    }

    public static void main(String[] args) {
Auto auto = new BMV();
auto.speed();


    }
}
