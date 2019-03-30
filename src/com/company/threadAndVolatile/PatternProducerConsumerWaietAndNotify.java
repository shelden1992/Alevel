package com.company.threadAndVolatile;

import java.util.LinkedList;
import java.util.Queue;

public class PatternProducerConsumerWaietAndNotify {

    static ProducerConsumer producerConsumer=new ProducerConsumer();

    public static void main(String[] args) throws InterruptedException {


        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    producerConsumer.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


            }
        });


        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    producerConsumer.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

    }
}
class ProducerConsumer {
    private Queue<Integer> queue=new LinkedList<>();
    private final int LIMIT=10;
    private Object lock=new Object();//те обьекты на которых происходит синхронизация должны быть константами (final)
    int value=0;
    public void produce() throws InterruptedException {

        while (true) {// когда заходит поток он как бы начинает показывать на экран "монитора = lock"
            synchronized (lock) {//заходит поток и блокирует для другого потока
                while (queue.size() == LIMIT) {//заходит поток подусер в том случае когда заполнена очередь
                    lock.wait();//(как бы теперь освободил монитор и сказал жди  )освобождает lock
                }
                queue.offer(value++);
                lock.notify();

            }
        }

    }

    public void consume() throws InterruptedException {
        while (true) {
            synchronized (lock) { //в этот момент консумер заходит в этот синхр блок
                while (queue.size() == 0) {
                    lock.wait();
                }

                int value=queue.poll();
                System.out.println(value);
                System.out.println("Queue size = "  + queue.size());
                lock.notify();

            }
            Thread.sleep(1000);
        }

    }
}
