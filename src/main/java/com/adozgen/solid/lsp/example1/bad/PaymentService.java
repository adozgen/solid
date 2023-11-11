package com.adozgen.solid.lsp.example1.bad;

import java.io.Console;

public class PaymentService {
    public void processPayment(Payment payment, double amount) {
        payment.initializePayment();
        payment.performPayment(amount); // Paypal için hata atacak
        payment.endPayment();
        System.out.println("ok");
    }
}