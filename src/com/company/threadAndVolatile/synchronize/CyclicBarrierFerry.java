package com.company.threadAndVolatile.synchronize;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;

public class CyclicBarrierFerry {
    static CyclicBarrier cyclicBarrier=new CyclicBarrier(3, new FerryBoat());

    public static void main(String[] args) {


        for (int i=0; i < 6; i++) {
            new Thread(new Car(i)).start();

        }


    }

    public static class FerryBoat implements Runnable {


        @Override
        public void run() {
            try {
                TimeUnit.MILLISECONDS.sleep(500);
                System.out.println("Паром переправил автомобили");

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    public static class Car implements Runnable {
        private int numberCar;

        public int getNumberCar() {
            return numberCar;
        }

        public void setNumberCar(int numberCar) {
            this.numberCar=numberCar;
        }



        @Override
        public void run() {
            try {
                System.out.println("Автомобили готовы к погрузке " + numberCar);

                cyclicBarrier.await();

                System.out.println("Авто погрузилось на паром " + numberCar);


            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
        }

        public Car(int numberCar) {
            this.numberCar=numberCar;
        }
    }
}

