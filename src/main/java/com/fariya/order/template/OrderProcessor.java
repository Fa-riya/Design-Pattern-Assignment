package com.fariya.order.template;

import com.fariya.order.model.CustomerOrder;
import com.fariya.order.model.OrderItem;

public abstract class OrderProcessor {
    public final void processOrder(CustomerOrder order) {
        validateOrder(order);
        prepareItems(order);
        handleServiceType(order);
        collectPayment(order);
        sendReceipt(order);
    }

    private void validateOrder(CustomerOrder order) {
        if (order.getItems().isEmpty()) {
            throw new IllegalArgumentException("Order must have at least one item.");
        }
        System.out.println("Order validated for " + order.getCustomerName());
    }

    private void prepareItems(CustomerOrder order) {
        System.out.println("Preparing ordered items:");
        for (OrderItem item : order.getItems()) {
            System.out.println(" - " + item.getDescription() + " = BDT " + item.getPrice());
        }
    }

    protected abstract void handleServiceType(CustomerOrder order);

    private void collectPayment(CustomerOrder order) {
        System.out.println("Selected payment method: " + order.getPaymentStrategy().getPaymentName());
        order.getPaymentStrategy().pay(order.getTotalAmount());
    }

    private void sendReceipt(CustomerOrder order) {
        System.out.println("Receipt sent. Total bill: BDT " + order.getTotalAmount());
        System.out.println("Order completed successfully.\n");
    }
}
