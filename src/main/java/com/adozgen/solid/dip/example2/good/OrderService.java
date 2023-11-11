package com.adozgen.solid.dip.example2.good;

import com.adozgen.solid.dip.example2.Order;

class OrderService {
    private IDatabase database;

    public OrderService(IDatabase database) {
        this.database = database;
    }

    void processOrder(Order order) {
        database.connect();
        // Sipariş işleme kodları
        database.disconnect();
    }
}
