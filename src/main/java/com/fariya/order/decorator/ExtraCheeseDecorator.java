package com.fariya.order.decorator;

import com.fariya.order.model.OrderItem;

public class ExtraCheeseDecorator extends OrderItemDecorator {
    public ExtraCheeseDecorator(OrderItem item) {
        super(item);
    }

    @Override
    public String getDescription() {
        return item.getDescription() + ", extra cheese";
    }

    @Override
    public double getPrice() {
        return item.getPrice() + 60.0;
    }
}
