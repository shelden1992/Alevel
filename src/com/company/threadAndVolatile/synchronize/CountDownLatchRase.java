package com.company.threadAndVolatile.synchronize;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class CountDownLatchRase {
    private static CountDownLatch countDownLatch=new CountDownLatch(8);
    private static final int trackLength=500000;


    public static void main(String[] args) throws InterruptedException {

        for (int i=1; i <= 5; i++) {
            new Thread(new Car((int) ( Math.random() * 100 + 50 ), i)).start();
            TimeUnit.MILLISECONDS.sleep(1000);
        }
            try {
                while (countDownLatch.getCount() > 3) {
                    TimeUnit.MILLISECONDS.sleep(100);
                }

                TimeUnit.MILLISECONDS.sleep(1000);
                System.out.println("На старт");
                countDownLatch.countDown();

                TimeUnit.MILLISECONDS.sleep(1000);
                System.out.println("Внимание");
                countDownLatch.countDown();

                TimeUnit.MILLISECONDS.sleep(1000);
                System.out.println("Марш");
                countDownLatch.countDown();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }




    }


    static class Car implements Runnable {
        private int speed;
        private int numberCar;

        public Car(int speed, int numberCar) {
            this.speed=speed;
            this.numberCar=numberCar;
        }

        @Override
        public void run() {


            try {
                    System.out.println("Автомобиль подьехали к и готовы к старту " + numberCar);
                    countDownLatch.countDown();




                countDownLatch.await();
                TimeUnit.MILLISECONDS.sleep(trackLength / speed);
                System.out.println("Финишировала машина под номером " + numberCar);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
    }
}
