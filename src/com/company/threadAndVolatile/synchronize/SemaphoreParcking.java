package com.company.threadAndVolatile.synchronize;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class SemaphoreParcking {
    private static final boolean[] PARCKING_PLACE=new boolean[5];
    private static Semaphore semaphore=new Semaphore(5, true);


    public static void main(String[] args) {
        for (int i=1; i <= 10; i++) {
            new Thread(new Car(i)).start();
            try {
                TimeUnit.MILLISECONDS.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }

    }


    static class Car implements Runnable {
        private int numberCar;

        public Car(int numberCar) {
            this.numberCar=numberCar;
        }

        @Override
        public void run() {
                System.out.println("Машина подьехала к парковке " + numberCar);

                try {
                    semaphore.acquire(); // изначально пермис равный 5, и заходя, каждый поток уменьшает на  1!;

                    int parkingNumber=0;

                    synchronized (PARCKING_PLACE) {
                        for (int i=0; i < 5; i++) {

                            if (!PARCKING_PLACE[i]) {
                                PARCKING_PLACE[i]=true;
                                parkingNumber=i;


                                System.out.printf("Автомобиль %d припаркованна на стоянке под номером %d \n", numberCar, i+1);
                                break;
                            }


                        }
                    }

                    TimeUnit.MILLISECONDS.sleep(1000);


                    synchronized (PARCKING_PLACE) {

                        PARCKING_PLACE[parkingNumber]=false;
                    }

                    semaphore.release();
                    System.out.printf("Автомобиль уехал под номером %d \n", numberCar);


                } catch (InterruptedException e) {
                    e.printStackTrace();
                }



        }
    }
}
