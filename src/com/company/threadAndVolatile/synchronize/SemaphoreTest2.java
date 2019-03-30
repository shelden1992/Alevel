package com.company.threadAndVolatile.synchronize;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class SemaphoreTest2 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService=Executors.newFixedThreadPool(200);
        Connection connection=Connection.getConnection();
        for (int i=0; i < 200; i++) {
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        connection.work();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.DAYS);
    }

}

//singleton
class Connection {
    private static Connection connection=new Connection();
    Semaphore semaphore=new Semaphore(10);

    private int connectCount;

    private Connection() {
    }

    public static Connection getConnection() {
        return connection;
    }

    public void work() throws InterruptedException {
        semaphore.acquire();
        try {
            doWork();

        } finally {
            semaphore.release();
        }


    }

    public void doWork() throws InterruptedException {
        synchronized (this) {
            connectCount++;
            System.out.println(connectCount);


        }
        Thread.sleep(5000);
        synchronized (this) {
            connectCount--;
        }

    }
}
