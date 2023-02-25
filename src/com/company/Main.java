package com.company;

import com.company.builder.Product;
import com.company.observer.NotificationMandager;
import com.company.observer.PaymentEventLogger;
import com.company.observer.PaymentListener;
import com.company.observer.PaymentManager;

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
        Product p1 = new Product.Builder()
                .id(1232)
                .color("red")
                .build();
        System.out.println(p1);

        Product p2 = Product.builder()
                .color("green")
                .build();
        System.out.println(p2);
        //        <--------------------builder end --------------------->

    }
}
