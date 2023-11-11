package com.adozgen.solid.dip.example2.bad;

import com.adozgen.solid.dip.example2.Order;

class OrderService {
    private MySqlDatabase database;

    public OrderService() {
        database = new MySqlDatabase();
    }

    void processOrder(Order order) {
        database.connect();
        // Sipariş işleme kodları
        database.disconnect();
    }
}
