package com.company.threadAndVolatile.synchronize.producer_consumer;

public class Producer implements Runnable {
    private final SingleElementBuffer singleElementBuffer;
    private  int startValue;
    private final int period;




    public Producer(int startValue, int period, SingleElementBuffer singleElementBuffer) {
        this.startValue= startValue;
        this.period=period;
        this.singleElementBuffer = singleElementBuffer;
    }

    @Override
    public void run() {
        while (true){
            try {
                System.out.println(startValue + " producer");
                singleElementBuffer.put(startValue++);
                Thread.sleep(period);




            }catch (InterruptedException e){
                e.printStackTrace();
            }


        }
    }
}
