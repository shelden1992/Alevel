package com.company.threadAndVolatile.synchronize.producer_consumer;

public class ProducersConsumer {


    public static void main(String[] args) {

        SingleElementBuffer singleElementBuffer = new SingleElementBuffer();
        new Thread(new Producer(1, 1000, singleElementBuffer)).start();
        new Thread( new Consumer(singleElementBuffer)).start();
    }
}
