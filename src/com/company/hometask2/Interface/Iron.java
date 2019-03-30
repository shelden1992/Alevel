package com.company.hometask2.Interface;

public class Iron implements Substance {
    private double t = 20;


    @Override
    public State heatUp(double t) {
        this.t += t;
        if (( t > 1500 ) && ( t < 3000 )) {
            return State.LIQUIDS;
        }
        if (t > 3000) {
            return State.GASES;
        } else
            return State.SOLIDS;
    }

    @Override
    public double getTemperature() {
        return t;
    }
}

