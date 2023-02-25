package com.company.observer;

public class PaymentEventLogger implements PaymentListener{
    private void logEvent(){
        System.out.println("payment received");
    }

    @Override
    public void paymentMade() {
        logEvent();
    }
}
