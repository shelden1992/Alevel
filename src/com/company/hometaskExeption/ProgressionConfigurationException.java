package com.company.hometaskExeption;

public class ProgressionConfigurationException extends Exception {

    private int n;
    private int step;

    public ProgressionConfigurationException(String message, int num) {

        super(message);
        n=num;
    }

    public int getN() {
        return n;
    }
}
