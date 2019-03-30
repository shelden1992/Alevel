package com.company.threadAndVolatile.synchronize;

import java.util.concurrent.Semaphore;

public class SemaphoreTest {
    public static void main(String[] args) {
        Semaphore semaphore =new Semaphore(3);//разрешение
        try {
            semaphore.acquire();//когда в потоке начинаем взаемодействовать с ресурсом (количество взаемодействий -1)
            semaphore.acquire();
            semaphore.acquire();

            System.out.println("All permits have been acquired");
            semaphore.acquire();//4-e разрешение, которое или нужно освободить или создать больше

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        semaphore.release(); //взаемодействие с ресурсом +1

        semaphore.availablePermits();//количество разрешений
    }
}
