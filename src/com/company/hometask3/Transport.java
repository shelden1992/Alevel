package com.company.hometask3;

public enum Transport {

    TRAIN(1), CAR(2), PLANE(5);

    private final int costMultiplier;//это поле

    Transport(int costMultiplier) {
        this.costMultiplier = costMultiplier;
    }

    public double calculateCost(double getVolume, double getMass) {
        return costMultiplier * getVolume * getMass;
    }

}