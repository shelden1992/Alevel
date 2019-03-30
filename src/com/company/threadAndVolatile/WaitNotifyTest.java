package com.company.threadAndVolatile;

import java.util.Scanner;

public class WaitNotifyTest {
    public static void main(String[] args) throws InterruptedException {
        WaitAndNotify waitNotify = new WaitAndNotify();

        Thread thread =new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    waitNotify.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        });

        Thread thread2 =new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    waitNotify.consumer();
                } catch (InterruptedException e) {


                }

            }
        });
        thread.start();
        thread2.start();

        thread.join();
        thread2.join();
    }

}
class WaitAndNotify{
    public void produce() throws InterruptedException {
        synchronized (this){
            System.out.println("Producer thread start/// ");
            wait();//1- отдаем intrinsic lock 2-ждет, пока не будет вызван notify именно на этом ОБЬЕКТЕ!!!
            //по умолчанию вызываются на обьекте this !!! (this.wait())_
            System.out.println("Producer thread resumed/// ");
        }
        }

    public void consumer() throws InterruptedException{
        Thread.sleep(2000);
        Scanner scanner =new Scanner(System.in);
        synchronized (this){
            System.out.println("Waiting for return key pressed");
            scanner.nextLine();
            notify();

        }

        }
        }
