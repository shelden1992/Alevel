package com.company.threadAndVolatile.synchronize.producer_consumer;

public class Consumer implements Runnable {



    SingleElementBuffer singleElementBuffer;


    public Consumer(SingleElementBuffer singleElementBuffer) {
        this.singleElementBuffer = singleElementBuffer;
    }

    @Override
    public void run() {
     while (true){
         try {
             int elem = singleElementBuffer.get();
             System.out.println(elem + " consumer");
         }
         catch (InterruptedException e){
             e.printStackTrace();
         }
     }
    }
}
