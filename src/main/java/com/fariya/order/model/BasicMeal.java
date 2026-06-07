package com.fariya.order.model;

public class BasicMeal implements OrderItem {
    private final String name;
    private final double price;

    public BasicMeal(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getDescription() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
