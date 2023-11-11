package com.adozgen.solid.ocp.example1.good;

import com.adozgen.solid.ocp.example1.Order;

public class DiscountService {
    public double applyDiscount(Order order, IDiscountStrategy discountStrategy) {
        return discountStrategy.applyDiscount(order);
    }
}