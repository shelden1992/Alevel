package com.company.threadAndVolatile;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class StringReverse implements Callable<String> {
private String strReverse;

    public StringReverse(String strReverse) {
        this.strReverse=strReverse;
    }

    @Override
    public String call() throws Exception {
StringBuilder stringBuilder = new StringBuilder(strReverse);
        String reverse=stringBuilder.reverse().toString();
        return reverse;
    }



}
