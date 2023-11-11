package com.adozgen.solid.ocp.example1.good;

import com.adozgen.solid.ocp.example1.Order;

class WinterDiscountStrategy implements IDiscountStrategy {
    public double applyDiscount(Order order) {
        return order.getPrice() * 0.2;
    }
}
