package com.designpatterns.creationalpatterns.factorymethod;

public class Laptop implements Computer {
    @Override
    public void compute() {
        System.out.println("Laptop computes");
    }
}
