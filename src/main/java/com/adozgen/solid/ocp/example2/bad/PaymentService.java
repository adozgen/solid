package com.adozgen.solid.ocp.example2.bad;

import com.adozgen.solid.ocp.example1.Order;

public class PaymentService {
    public void processPayment(Order order, String paymentType) {
        if ("CREDIT_CARD".equals(paymentType)) {
            // Kredi kartı ödeme işlemleri
        } else if ("PAYPAL".equals(paymentType)) {
            // PayPal ödeme işlemleri
        }
        // ...diğer ödeme yöntemleri
    }
}
