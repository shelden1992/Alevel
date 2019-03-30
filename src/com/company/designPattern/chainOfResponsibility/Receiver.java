package com.company.designPattern.chainOfResponsibility;

public class Receiver {
    private boolean BankTransfer;
    private boolean MoneyTransfer;

    public boolean isBankTransfer() {
        return BankTransfer;
    }

    public void setBankTransfer(boolean bankTransfer) {
        BankTransfer=bankTransfer;
    }

    public boolean isMoneyTransfer() {
        return MoneyTransfer;
    }

    public void setMoneyTransfer(boolean moneyTransfer) {
        MoneyTransfer=moneyTransfer;
    }

    public boolean isPayPalTransfer() {
        return PayPalTransfer;
    }

    public void setPayPalTransfer(boolean payPalTransfer) {
        PayPalTransfer=payPalTransfer;
    }

    public Receiver(boolean bankTransfer,  boolean payPalTransfer,boolean moneyTransfer) {
        BankTransfer=bankTransfer;
        MoneyTransfer=moneyTransfer;
        PayPalTransfer=payPalTransfer;
    }

    private boolean PayPalTransfer;
}
