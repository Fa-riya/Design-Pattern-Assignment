package com.fariya.order.strategy;

public class CashOnDeliveryPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Payment of BDT " + amount + " will be collected during delivery.");
    }

    @Override
    public String getPaymentName() {
        return "Cash on Delivery";
    }
}
