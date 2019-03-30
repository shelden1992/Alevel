package com.company.threadAndVolatile;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SynchronizedTest2 {
    private int count;

    public static void main(String[] args) throws InterruptedException {
        Worker worker=new Worker();
        worker.main();
    }


}

class Worker {
    Random random=new Random();

    Object lock1 =  new Object();
    Object lock2 = new Object();

    private List<Integer> list1=new ArrayList<>();
    private List<Integer> list2=new ArrayList<>();

    public   void addToList1() {
        synchronized (lock1) {

            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            list1.add(random.nextInt(100));//от 0 до 99
        }
    }

    public   void addToList2() {
        synchronized (lock2) {

            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            list2.add(random.nextInt(100));//от 0 до 99
        }

    }

    public void work() {
        for (int i=0; i < 1000; i++) {
            addToList1();
            addToList2();
        }
    }


    public void main() throws InterruptedException {
        long befor=System.currentTimeMillis();
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                work();
            }
        });
        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                work();
            }
        });
        thread.start();
        thread2.start();

        thread.join();
        thread2.join();

        long after=System.currentTimeMillis();

        System.out.println("Program took " + ( after - befor ));
        System.out.println("List1 " + list1.size());
        System.out.println("List2 " + list2.size());

    }
}
