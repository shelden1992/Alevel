package com.company.threadAndVolatile;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static javafx.scene.input.KeyCode.F;

public class ThreadPool {
    public static void main(String[] args) {
        ExecutorService executorService =Executors.newFixedThreadPool(2 ); //наши работники мы назначаем их количество


        for (int i= 0; i<5; i++){
            executorService.submit(new Work(i));//передали задание новым работникам (или мы сказали, что 2 работникам, которых мы создали
            //newFixedThreadPool, нужно перенести 5 коробок и они параллельно переносят данные коробки )

        }
        executorService.shutdown();//означает, чо больше не будет новых заданий
        //и они начнут наши работники=поотоки выполнять переданные задания


    }

}
class Work implements Runnable{
    public Work(int id) {
        this.id=id;
    }

    private int id;
    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Work with " + id + " was completed");
    }

}
