package com.company.designPattern.chainOfResponsibility;

public class Solution {
    public static void main(String[] args) {
        Receiver receiver = new Receiver(true, true,true);
PaymentHandler bankPaymentHandler  = new BankPaymentHandler();
PaymentHandler moneyPaymentHandler = new MoneyPaymentHandler();
PaymentHandler payPalPaymentHandler = new PayPalPaymentHandler();
bankPaymentHandler.setSuccessor(payPalPaymentHandler);
payPalPaymentHandler.setSuccessor(moneyPaymentHandler);
bankPaymentHandler.handle(receiver);
    }
}
