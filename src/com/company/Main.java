package com.company;

import com.company.builder.Product;
import com.company.decorator.EmailSender;
import com.company.decorator.NotificationSender;
import com.company.decorator.SmsSender;
import com.company.observer.NotificationMandager;

public class Main {

    public static void main(String[] args) {
//        <--------------------observer start --------------------->
//        PaymentManager paymentManager = new PaymentManager();
//
//        PaymentListener p1 = new NotificationMandager();
//        paymentManager.registerPaymentListener(p1);
//
//        PaymentListener p2 = new PaymentEventLogger();
//        paymentManager.registerPaymentListener(p2);
//
//        paymentManager.pay();
//        <--------------------observer end --------------------->


        //        <--------------------builder start --------------------->
//        Product p1 = new Product.Builder()
//                .id(1232)
//                .color("red")
//                .build();
//        System.out.println(p1);
//
//        Product p2 = Product.builder()
//                .color("green")
//                .build();
//        System.out.println(p2);
        //        <--------------------builder end --------------------->



        //        <--------------------decorator start --------------------->
//        NotificationSender n1 = new EmailSender(new SmsSender(null));
//        NotificationSender n2 = new SmsSender(new EmailSender(null));
//        n1.send();
//        n2.send();
        //        <--------------------decorator end --------------------->

    }
}
