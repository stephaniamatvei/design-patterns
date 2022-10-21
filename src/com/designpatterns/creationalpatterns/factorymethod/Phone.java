package com.designpatterns.creationalpatterns.factorymethod;

public class Phone implements Computer {
    @Override
    public void compute() {
        System.out.println("Phone computes");
    }
}
