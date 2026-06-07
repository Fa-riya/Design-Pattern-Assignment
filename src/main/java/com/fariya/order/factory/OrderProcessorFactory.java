package com.fariya.order.factory;

import com.fariya.order.template.DeliveryOrderProcessor;
import com.fariya.order.template.OrderProcessor;
import com.fariya.order.template.PickupOrderProcessor;

public class OrderProcessorFactory {
    public static OrderProcessor createOrderProcessor(String orderType) {
        if (orderType == null) {
            throw new IllegalArgumentException("Order type cannot be null.");
        }

        return switch (orderType.toLowerCase()) {
            case "delivery" -> new DeliveryOrderProcessor();
            case "pickup" -> new PickupOrderProcessor();
            default -> throw new IllegalArgumentException("Unsupported order type: " + orderType);
        };
    }
}
