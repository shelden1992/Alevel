package com.company.designPattern.facade;

public class Facade {
    SubsystemA subsystemA;
    SubsystemB subsystemB;
    SubsystemC subsystemC;

    public Facade(SubsystemA subsystemA, SubsystemB subsystemB, SubsystemC subsystemC) {
        this.subsystemA=subsystemA;
        this.subsystemB=subsystemB;
        this.subsystemC=subsystemC;
    }
    public   void operation_ABC (){
    subsystemA.operation_A();
    subsystemB.operation_B();
    subsystemC.operation_C();

    }
}
