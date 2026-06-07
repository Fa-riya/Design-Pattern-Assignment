package com.fariya.order.template;

import com.fariya.order.model.CustomerOrder;

public class PickupOrderProcessor extends OrderProcessor {
    @Override
    protected void handleServiceType(CustomerOrder order) {
        System.out.println("Keeping the order ready at the pickup counter.");
    }
}
