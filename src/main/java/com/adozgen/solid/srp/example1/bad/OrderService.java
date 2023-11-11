package com.adozgen.solid.srp.example1.bad;

import com.adozgen.solid.srp.example1.Order;
import org.springframework.stereotype.Service;

public class OrderService {
    public void createOrder(Order order) {
        // ...sipariş oluşturma işlemleri...

        // Ödeme işlemi
        processPayment(order);

        // Stoktan düşme
        reduceStock(order);
    }

    public void processPayment(Order order) {
        // ...ödeme işlemleri...
    }

    public void reduceStock(Order order) {
        // ...stoktan düşme işlemleri...
    }
}
