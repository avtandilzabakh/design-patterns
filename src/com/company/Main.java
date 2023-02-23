package com.company;

public class Main {

    public static void main(String[] args) {
        PaymentManager paymentManager = new PaymentManager();

        PaymentListener p1 = new NotificationMandager();
        paymentManager.registerPaymentListener(p1);

        PaymentListener p2 = new PaymentEventLogger();
        paymentManager.registerPaymentListener(p2);


        paymentManager.pay();
    }
}
