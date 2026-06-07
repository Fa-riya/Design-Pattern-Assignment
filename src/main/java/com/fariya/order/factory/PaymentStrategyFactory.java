package com.fariya.order.factory;

import com.fariya.order.strategy.BkashPayment;
import com.fariya.order.strategy.CardPayment;
import com.fariya.order.strategy.CashOnDeliveryPayment;
import com.fariya.order.strategy.PaymentStrategy;

public class PaymentStrategyFactory {
    public static PaymentStrategy createPaymentStrategy(String paymentType) {
        if (paymentType == null) {
            throw new IllegalArgumentException("Payment type cannot be null.");
        }

        return switch (paymentType.toLowerCase()) {
            case "bkash" -> new BkashPayment("017XXXXXXXX");
            case "card" -> new CardPayment("**** **** **** 4521");
            case "cod" -> new CashOnDeliveryPayment();
            default -> throw new IllegalArgumentException("Unsupported payment type: " + paymentType);
        };
    }
}
