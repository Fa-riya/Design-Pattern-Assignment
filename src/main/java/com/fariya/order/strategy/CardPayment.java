package com.fariya.order.strategy;

public class CardPayment implements PaymentStrategy {
    private final String maskedCardNumber;

    public CardPayment(String maskedCardNumber) {
        this.maskedCardNumber = maskedCardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid BDT " + amount + " using card " + maskedCardNumber);
    }

    @Override
    public String getPaymentName() {
        return "Card";
    }
}
