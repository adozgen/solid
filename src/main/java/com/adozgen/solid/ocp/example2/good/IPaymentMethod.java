package com.adozgen.solid.ocp.example2.good;

import com.adozgen.solid.ocp.example1.Order;

public interface IPaymentMethod {
    void processPayment(Order order);
}
