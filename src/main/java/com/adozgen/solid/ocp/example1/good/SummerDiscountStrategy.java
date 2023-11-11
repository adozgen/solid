package com.adozgen.solid.ocp.example1.good;

import com.adozgen.solid.ocp.example1.Order;

class SummerDiscountStrategy implements IDiscountStrategy {
    public double applyDiscount(Order order) {
        return order.getPrice() * 0.1;
    }
}
