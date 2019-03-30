package com.company.hometaskExeption;

public class ArithmeticProgression {
    private final int initial;

    public int getInitial() {
        return initial;
    }

    public int getStep() {
        return step;
    }

    private final int step;


    ArithmeticProgression(int initial, int step) throws ProgressionConfigurationException {
        if (step == 0) throw new ProgressionConfigurationException("The step is less than 1", step);
        this.initial=initial;
        this.step=step;
    }

    public int calculate(int n) throws ProgressionConfigurationException {
        if (n <= 0) throw new ProgressionConfigurationException("Is less than 1", n);
        n=initial + step * ( n - 1 );
        System.out.println(n);
        return n;
    }


}





