package com.adozgen.solid.lsp.example1.good;



public class CreditCardPayment extends Payment implements IPerform{
    void initializePayment() {
        // Kredi kartı ödemesi başlatma işlemleri
    }



    void endPayment() {
        // Kredi kartı ödemesi sonlandırma işlemleri
    }

    @Override
    public void performPayment(double amount) {
        //perform artık bu destekliyor
    }
}
