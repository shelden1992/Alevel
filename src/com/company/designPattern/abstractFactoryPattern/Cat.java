package com.company.designPattern.abstractFactoryPattern;

public class Cat implements Animal{
    String voice= "Mau";

    @Override
    public String toString() {
        final StringBuilder sb=new StringBuilder("Cat{");
        sb.append("voice='").append(voice).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
