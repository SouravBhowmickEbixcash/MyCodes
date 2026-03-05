package com.example2;

public interface PaymentMethod {
    boolean validatePayment();
    void processPayment(double amount);
    String getReceipt();
}
