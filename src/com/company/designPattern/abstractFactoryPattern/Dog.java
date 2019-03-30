package com.company.designPattern.abstractFactoryPattern;

public class Dog implements Animal{
    @Override
    public String toString() {
        final StringBuilder sb=new StringBuilder("Dog{");
        sb.append("voice='").append(voice).append('\'');
        sb.append('}');
        return sb.toString();
    }

    String voice = "Woof";

}
