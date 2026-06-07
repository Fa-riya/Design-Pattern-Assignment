package com.fariya.order.strategy;

public class BkashPayment implements PaymentStrategy {
    private final String phoneNumber;

    public BkashPayment(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid BDT " + amount + " through bKash account " + phoneNumber);
    }

    @Override
    public String getPaymentName() {
        return "bKash";
    }
}
