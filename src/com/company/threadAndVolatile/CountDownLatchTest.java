package com.company.threadAndVolatile;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownLatchTest {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch =new CountDownLatch(3);//аргумент - это число сколько раз мы должны вызвать коунт даун чтобы авайт больне не ждал

        ExecutorService executorService =Executors.newFixedThreadPool(1000);
        for (int i =0; i<1000; i++){
            executorService.submit(new Proccesor(countDownLatch));}//трем потоком мы дали задание
            executorService.shutdown();


            countDownLatch.await();
            System.out.println("Latch has been opened and main thread is proceeding");


    }
}
class Proccesor implements Runnable{
private CountDownLatch countDownLatch;
public  Proccesor(CountDownLatch countDownLatch){
    this.countDownLatch = countDownLatch;
}

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
countDownLatch.countDown();//отсчет назад
    }
}