package com.company.hometask2.Interface;
//
public class Water implements Substance {
    private double t = 20;

 public String delition = "вкус";

//    public Water(String delition) {
//        this.delition = delition;
//    }

    @Override
    public State heatUp(double t) {
//        t = t + 20;
        this.t += t;
        if (( t > 0 ) && ( t < 100 )) {
            return State.LIQUIDS;
        }
        if (t <= 0) {
            return State.SOLIDS;
        } else
            return State.GASES;

    }

    @Override
    public double getTemperature() {
        return t;
    }


}
