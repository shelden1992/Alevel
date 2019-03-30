package com.company.threadAndVolatile.threadNew;

import java.util.concurrent.*;

public class FutureAndCallable {
    public static void main(String[] args) {
        ExecutorService executorService=Executors.newFixedThreadPool(5); // 5 thread одновременно;

        Future<Integer> submit=executorService.submit(new MyCallable());

        while (!submit.isDone()) {
            try {
                String s="Not done";
                System.out.println(s);
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        executorService.shutdown();
    }

}

class MyCallable implements Callable<Integer> {

//    @Override
//    public void run() {
//        try {
//            System.out.println("started " + Thread.currentThread().getId());
//
//            TimeUnit.SECONDS.sleep(5);
//
//            System.out.println("finish");
//        } catch (InterruptedException e) {
//            e.printStackTrace(System.out);
//        }
//
//    }

    @Override
    public Integer call() throws Exception {

        return null;
    }
}