package com.fariya.order.model;

import com.fariya.order.strategy.PaymentStrategy;
import java.util.ArrayList;
import java.util.List;

public class CustomerOrder {
    private final String customerName;
    private final String address;
    private final List<OrderItem> items;
    private final PaymentStrategy paymentStrategy;

    public CustomerOrder(String customerName, String address, PaymentStrategy paymentStrategy) {
        this.customerName = customerName;
        this.address = address;
        this.paymentStrategy = paymentStrategy;
        this.items = new ArrayList<>();
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getAddress() {
        return address;
    }

    public PaymentStrategy getPaymentStrategy() {
        return paymentStrategy;
    }

    public double getTotalAmount() {
        return items.stream().mapToDouble(OrderItem::getPrice).sum();
    }
}
