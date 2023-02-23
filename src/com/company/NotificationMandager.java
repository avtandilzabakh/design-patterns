package com.company;

public class NotificationMandager implements PaymentListener{
    private void sendNotification(){
        System.out.println(" Notification send ");
    }

    @Override
    public void paymentMade() {
        sendNotification();
    }
}
