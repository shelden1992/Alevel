package com.company.designPattern.templateMethod;

public class University extends Education {
    @Override
    public void enter() {
        System.out.println("enter to univer");
    }

    @Override
    public void starStudy() {
        System.out.println("start study");

    }

    @Override
    public void study() {
        System.out.println("the most hard part of this moving");

    }

    @Override
    public void getDocumentFoFinishStudy() {
        System.out.println("finaly it's happened");

    }
}
