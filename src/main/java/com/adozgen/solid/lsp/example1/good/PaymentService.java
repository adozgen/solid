package com.adozgen.solid.lsp.example1.good;



public class PaymentService {
    public void processPayment(Payment payment, double amount) {
        payment.initializePayment();
        //payment.performPayment(amount); // Paypal için hata atacak
        payment.endPayment();
        System.out.println("ok");
    }
}