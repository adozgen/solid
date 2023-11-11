package com.adozgen.solid.lsp.example1.bad;

public abstract class Payment {
    abstract void initializePayment();
    abstract void performPayment(double amount);
    abstract void endPayment();
}
