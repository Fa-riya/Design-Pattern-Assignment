package com.fariya.order.template;

import com.fariya.order.model.CustomerOrder;

public class DeliveryOrderProcessor extends OrderProcessor {
    @Override
    protected void handleServiceType(CustomerOrder order) {
        System.out.println("Assigning a rider for delivery to: " + order.getAddress());
    }
}
