package com.company.designPattern.chainOfResponsibility;

public class PayPalPaymentHandler extends PaymentHandler {
    @Override
    public void handle(Receiver receiver) {
if (receiver.isPayPalTransfer()){
    System.out.println("PayPal pay");
}
else if(getSuccessor()!=null){
    getSuccessor().handle(receiver);
}
    }
}
