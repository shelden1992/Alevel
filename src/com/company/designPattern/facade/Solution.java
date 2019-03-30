package com.company.designPattern.facade;

public class Solution {
    /**
     * есть сложная структура, которая нафиг не нужна конечному пользователю, можно все классы/ фреймверки и т.д. скрыть
     * с пом. фасада
     */

    public static void main(String[] args) {
//        SubsystemA subsystemA=new SubsystemA();
//        subsystemA.operation_A();
//        new SubsystemB().operation_B();
//        new SubsystemC().operation_C();


        new Facade(new SubsystemA(), new SubsystemB(), new SubsystemC()).operation_ABC();

    }


}
