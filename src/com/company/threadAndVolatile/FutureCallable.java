package com.company.threadAndVolatile;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class FutureCallable {

    public static void main(String[] args) {


        ExecutorService executorService=Executors.newFixedThreadPool(1);


        Future future=executorService.submit(new StringReverse("привет"));
        int i=0;
        while (!future.isDone()) {
            try {
                TimeUnit.MILLISECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;

            System.out.println("Waiting " + i);

        }

        try {
            System.out.println(future.get());
        } catch (Exception e) {
            e.printStackTrace();
        }

        executorService.shutdown();

    }


}
