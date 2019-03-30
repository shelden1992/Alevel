package com.company.designPattern.singleton;

public class CreateSingleton {
    public static void main(String[] args) {


        Sun firstSun=Sun.getInstance(1);
        Sun secondSun=Sun.getInstance(2);
        System.out.println(firstSun.getId());
        System.out.println(secondSun.getId());
    }


}
