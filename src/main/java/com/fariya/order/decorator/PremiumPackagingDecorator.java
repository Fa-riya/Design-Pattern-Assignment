package com.fariya.order.decorator;

import com.fariya.order.model.OrderItem;

public class PremiumPackagingDecorator extends OrderItemDecorator {
    public PremiumPackagingDecorator(OrderItem item) {
        super(item);
    }

    @Override
    public String getDescription() {
        return item.getDescription() + ", premium packaging";
    }

    @Override
    public double getPrice() {
        return item.getPrice() + 40.0;
    }
}
