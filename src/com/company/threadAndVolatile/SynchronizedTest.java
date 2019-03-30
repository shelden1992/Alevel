package com.company.threadAndVolatile;

public class SynchronizedTest {
    private  int counter;
    public static void main(String[] args) throws InterruptedException {

        SynchronizedTest test = new SynchronizedTest();//обьект класс - сущность монитор
        test.doWork(); //только один поток может завладеть монитором одного обьекта
//
    }
    private synchronized void increment() {//только оин поток получает доступ к теле методу в один момент времени
        //для синхронизации нужен ОБЬЕКТ
        //синхронизация неявная на this
        counter++;
    }




    public void doWork() throws InterruptedException {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i =0; i<10000; i++){

                   increment();

                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0; i < 10000; i++)

                    increment();
            }


        });
        thread1.start();//когда запускаем метод doWork поток main доходит до этих двух
        thread2.start();//вызовов мгновенно вызывает 2 этих потока
        //и если не вызвать join(), то поток мейн мнгновенно вызвал бы sout на экран

        thread1.join();//подождать пока поток завершит свое действие и поток мейн останавливается на данном моменте
        thread2.join();//теперь поток ТОЧНО НЕ равняется 0!!!
        //все равно происходит race Condition(состояние гонки)
        System.out.println(counter);//

}
}

