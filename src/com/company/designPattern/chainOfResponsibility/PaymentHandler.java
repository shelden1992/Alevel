package com.company.designPattern.chainOfResponsibility;

public abstract class PaymentHandler {
    public PaymentHandler successor;

    public PaymentHandler getSuccessor() {
        return successor;
    }

    public void setSuccessor(PaymentHandler successor) {
        this.successor=successor;
    }

    public abstract void handle(Receiver receiver);
}
