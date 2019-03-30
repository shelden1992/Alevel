package com.company.designPattern.templateMethod;

public class School extends Education {
    @Override
    public void enter() {
        System.out.println("enter to school");
    }

    @Override
    public void starStudy() {
        System.out.println("star study in school");

    }

    @Override
    public void study() {
        System.out.println("some learning");

    }


    @Override
    public void getDocumentFoFinishStudy() {
        System.out.println("f.. off school  ");

    }
}
