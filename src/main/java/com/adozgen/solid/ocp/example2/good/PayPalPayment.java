package com.adozgen.solid.ocp.example2.good;

import com.adozgen.solid.ocp.example1.Order;

public class PayPalPayment implements IPaymentMethod{
    @Override
    public void processPayment(Order order) {
        // PayPal ödeme işlemleri
    }
}
