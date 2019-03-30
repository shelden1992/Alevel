package com.company.designPattern.templateMethod;

public abstract class Education {
    public abstract void enter();
    public abstract void starStudy();
    public abstract void study();
    public abstract  void getDocumentFoFinishStudy();

    public void learning(){ //templateMethod!!!!!!!

        enter();
        starStudy();
        study();
        getDocumentFoFinishStudy();
    }

}
