package com.fariya.order.strategy;

public interface PaymentStrategy {
    void pay(double amount);
    String getPaymentName();
}
