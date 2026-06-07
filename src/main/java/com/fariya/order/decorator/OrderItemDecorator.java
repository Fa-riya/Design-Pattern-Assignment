package com.fariya.order.decorator;

import com.fariya.order.model.OrderItem;

public abstract class OrderItemDecorator implements OrderItem {
    protected final OrderItem item;

    protected OrderItemDecorator(OrderItem item) {
        this.item = item;
    }
}
