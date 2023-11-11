package com.adozgen.solid.ocp.example1.bad;

import com.adozgen.solid.ocp.example1.Order;

public class DiscountService {
    public double applyDiscount(Order order, String discountType) {
        if ("SUMMER".equals(discountType)) {
            return order.getPrice() * 0.1;
        } else if ("WINTER".equals(discountType)) {
            return order.getPrice() * 0.2;
        }
        return order.getPrice();
    }
}

