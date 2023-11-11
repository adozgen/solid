package com.adozgen.solid.ocp.example2.good;

import com.adozgen.solid.ocp.example1.Order;

public class PaymentService {
    public void processPayment(Order order, IPaymentMethod paymentMethod) {
        paymentMethod.processPayment(order);
    }
}
