package com.company.hometask3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Введите имя посылки");

        String getName = scan.next();


        System.out.println("Введите обьем посылки и массу");

        double getVolume = scan.nextInt();
        double getMass = scan.nextInt();


        System.out.println("Введите пунк отправления и назначение");
        String city1 = scan.next();
        String city2 = scan.next();

        System.out.println("Введите транспорт");
        String transportEnter = scan.next();

        Transport t = null;
        switch (transportEnter)

        {
            case "train":
                t = Transport.TRAIN;

                break;
            case "car":
                t = Transport.CAR;

                break;
            case "plane":
                t = Transport.PLANE;

                break;
        }
        System.out.println("Имя вашей посылки " + getName + " Посылка отправляется из города" + " " + city1 + "в город" + " " + city2 + " " + "Стоймость посылки " + t.calculateCost(getVolume, getMass));

    }
}

