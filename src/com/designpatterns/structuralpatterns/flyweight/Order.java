package com.designpatterns.structuralpatterns.flyweight;

public class Order {
    private final long orderNumber;
    private final Product product;

    public Order(long orderNumber, Product product) {
        this.orderNumber = orderNumber;
        this.product = product;
    }

    public void manageOrder() {
        System.out.println("Order number: " + orderNumber + " contains " + product);
    }
}