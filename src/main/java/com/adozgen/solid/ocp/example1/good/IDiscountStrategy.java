package com.adozgen.solid.ocp.example1.good;

import com.adozgen.solid.ocp.example1.Order;

public interface IDiscountStrategy {
    double applyDiscount(Order order);
}
