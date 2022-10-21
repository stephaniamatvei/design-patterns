package com.designpatterns.creationalpatterns.factorymethod;

public class SmartTv implements Computer {
    @Override
    public void compute() {
        System.out.println("The Smart TV computes");
    }
}
