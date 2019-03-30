package com.company.hometask2.Interface;

public class Oxygen implements Substance {

    private double t = 20;


    @Override
    public State heatUp(double t) {
        this.t += t;
        if (t < -200) {
            return State.LIQUIDS;
        } else
            return State.GASES;


    }

    @Override

    public double getTemperature() {

        return t;
    }
}
