package com.company.threadAndVolatile.synchronize.producer_consumer;

public class SingleElementBuffer {
    private Integer elem =null;

    public synchronized  void  put (Integer newElem) throws InterruptedException{
        while (elem!= null){
            this.wait();
        }
        this.elem = newElem;
        this.notifyAll();

    }
//    ____активных____  потоков в синхронайзет не может быть больше одного!!!!!!!!!!

    public synchronized Integer get() throws InterruptedException{
        while (elem == null){
            this.wait();
        }
        int result = this.elem;
        this.elem = null;
        this.notifyAll();
        return result;
    }
}
//синхронайзет  -- взаимное исключение
//условное ожидание