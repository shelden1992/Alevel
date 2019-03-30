package com.company.designPattern.chainOfResponsibility;

public class BankPaymentHandler extends  PaymentHandler {
    @Override
    public void handle(Receiver receiver) {
if (receiver.isBankTransfer()){
    System.out.println("pay from bank");
}
else if(getSuccessor()!=null){
    getSuccessor().handle(receiver);
}
    }
}
