package com.company.designPattern.chainOfResponsibility;

public class MoneyPaymentHandler extends PaymentHandler {
    @Override
    public void handle(Receiver receiver) {
        if (receiver.isMoneyTransfer() ){
            System.out.println("Pay cash");

        }
        else if  ( getSuccessor() != null){
             getSuccessor().handle(receiver); }

    }
}
