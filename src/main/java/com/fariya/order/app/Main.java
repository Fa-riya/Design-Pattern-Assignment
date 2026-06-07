package com.fariya.order.app;

import com.fariya.order.decorator.ExtraCheeseDecorator;
import com.fariya.order.decorator.PremiumPackagingDecorator;
import com.fariya.order.factory.OrderProcessorFactory;
import com.fariya.order.factory.PaymentStrategyFactory;
import com.fariya.order.model.BasicMeal;
import com.fariya.order.model.CustomerOrder;
import com.fariya.order.model.OrderItem;
import com.fariya.order.strategy.PaymentStrategy;
import com.fariya.order.template.OrderProcessor;

public class Main {
    public static void main(String[] args) {
        PaymentStrategy payment = PaymentStrategyFactory.createPaymentStrategy("bkash");

        CustomerOrder order = new CustomerOrder(
                "Fariya Ahmed",
                "IUT Campus, Gazipur",
                payment
        );

        OrderItem burger = new BasicMeal("Chicken Burger", 220.0);
        burger = new ExtraCheeseDecorator(burger);
        burger = new PremiumPackagingDecorator(burger);

        OrderItem pasta = new BasicMeal("Creamy Pasta", 280.0);
        pasta = new PremiumPackagingDecorator(pasta);

        order.addItem(burger);
        order.addItem(pasta);

        OrderProcessor processor = OrderProcessorFactory.createOrderProcessor("delivery");
        processor.processOrder(order);
    }
}
