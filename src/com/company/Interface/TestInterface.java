package com.company.Interface;

public class TestInterface {
    interface Rul{}
    interface Pedal{}
    interface Kpp{}
      abstract static class Car  {

    }

       abstract static class CarWithOutKpp  extends Car implements Rul,Pedal{

           public abstract String getRul();

           public abstract String getPedal();

       }

    abstract static class CarWithKpp extends Car {
        public abstract String getRul();

        public abstract String getPedal();

        public abstract String getKpp();



}
  static class BMW extends CarWithOutKpp{

      @Override
      public String getRul() {
          return "Хорошо рулется";

      }

      @Override
      public String getPedal() {
          return "Имеет 2 педали";

      }
  }
    static class Mersedes extends CarWithKpp{

        @Override
        public String getRul() {
            return "Руль достаточно валкий";
        }

        @Override
        public String getPedal() {
            return "Так как механическая коробка передач и меет 3 педали";
        }

        @Override
        public String getKpp() {
            return "5 ступенчатая механика";
        }
    }

    public static void main(String[] args) {
    CarWithOutKpp bmw = new BMW();
//    Car mersedes = new Mersedes();
        CarWithKpp mersedes = new Mersedes();
    testAction1(bmw);
        testAction2 (mersedes);


    }

    private static void testAction2(CarWithKpp mersedes) {
        System.out.println( mersedes.getRul() +
                mersedes.getPedal() + mersedes.getKpp());
    }

    private static void testAction1(CarWithOutKpp bmw) {

//        bmw.getRul(); // можно
//        bmw.getPedal(); // можно
        System.out.println( bmw.getRul() +
        bmw.getPedal());
    }
}
