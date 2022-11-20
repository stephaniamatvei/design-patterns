package com.designpatterns.structuralpatterns.flyweight;

public class Product {
    private final String name;

    public Product(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}