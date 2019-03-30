package com.company.threadAndVolatile;

import java.util.Scanner;

public class VolatileTest {
    public static void main(String[] args) {
//не работает, из-за плохой когерентности кешэй!
        //volatile - изменчевый, подвержен изменению
        //и если есть данная пометка - это означает, что переменная изменчевая, и не надо ее кешировать
        //volatile -гарантирует когерентность кешэй,
        MyThread myThread = new MyThread();
        myThread.start();
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        myThread.stopThread();
    }

}
class MyThread extends Thread{
    private volatile boolean running = true;

    public void run (){
        while (running){
            System.out.println("Hellow");

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
    }
    public void stopThread(){
        this.running = false;
    }
}
