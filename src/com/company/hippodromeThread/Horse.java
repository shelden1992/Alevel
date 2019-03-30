package com.company.hippodromeThread;
/*Есть ипподром с кругом в 1 км. По ипподрому бегут одновременно 4 лошади, представленные потоками (thread) jvm
Перед забегом, пользователь должен увидеть список лошадей и делает ставку на одну из них.
Движение лошади происходит следующим образом: она пробегает 200-300 метров (случайное значение), а потом спит 400-500 мс.
Когда лошадь завершает дистанцию, она останавливается (поток должен остановиться) - вывести соотв. сообщение
После того, как все лошади финишируют, вывести, успешной ли была ставка игрока.*/

import java.util.Random;

final class Horse implements Runnable {

    private static final int MIN_MOVE = 100;
    private static final int MAX_MOVE = 200;

    private static final int MIN_SLEEP = 400;
    private static final int MAX_SLEEP = 500;

    private final Random random = new Random();

    private final String name;

    private final Race race;

    private final int raceLength;

    private int position = 0;

    Horse(String name, Race race) {
        this.name = name;
        this.race = race;
        raceLength = race.getLength();
    }

    @Override
    public void run() {
        System.out.println(getName() + " started the race!");
        do {
            delay();
            move();
        } while (position < raceLength);
        race.finish(this);
    }

    private void delay() {
        int sleep = random.nextInt(MAX_SLEEP + 1 - MIN_SLEEP) + MIN_SLEEP;
        try {
            Thread.sleep(sleep);
        } catch (InterruptedException e) {
            System.err.println(getName() + " fell: " + e.getLocalizedMessage());
        }
    }

    private void move() {
        int move = random.nextInt(MAX_MOVE + 1 - MIN_MOVE) + MIN_MOVE;
        if (move + position > raceLength) {
            move = raceLength - position;
        }
        position += move;
        System.out.println(getName() + " ran " + move + " meters, total of " + position);
    }

    public String getName() {
        return name;
    }
}
