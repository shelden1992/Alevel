package com.company.threadAndVolatile;

public class NewThread {
    //Процесс — это совокупность кода и данных, разделяющих общее виртуальное адресное пространство.
//    Один поток – это одна единица исполнения кода. Каждый поток последовательно выполняет инструкции процесса,
//    которому он принадлежит, параллельно с другими потоками этого процесса.
    public static void main(String[] args) throws InterruptedException {

        Thread thread=new Thread(new Runs());

        thread.start();

        for (int i=0; i < 100; i++) {
            Thread.sleep(1000);
            System.out.println("Я главный поток " + i);
        }


    }

}

class Runs implements Runnable {

    @Override
    public void run() {


        for (int i=0; i < 100; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Я новый поток " + i);
        }
    }
}

