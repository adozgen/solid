package com.adozgen.solid.srp.example1.good;

import com.adozgen.solid.srp.example1.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    private PaymentService paymentService;
    @Autowired
    private StockService stockService;

    public void createOrder(Order order) {
        paymentService.processPayment(order);
        stockService.reduceStock(order);
    }
}