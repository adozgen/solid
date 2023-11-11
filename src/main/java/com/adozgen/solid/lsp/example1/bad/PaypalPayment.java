package com.adozgen.solid.lsp.example1.bad;

public class PaypalPayment extends Payment {
    void initializePayment() {
        // PayPal ödemesi başlatma işlemleri
    }

    void performPayment(double amount) {
        throw new UnsupportedOperationException("PayPal doesn't support direct payment without redirect.");
    }

    void endPayment() {
        // PayPal ödemesi sonlandırma işlemleri
    }
}