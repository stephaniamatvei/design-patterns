package com.designpatterns.structuralpatterns.decorator;

public abstract class CarDecorator implements Machine {

    Machine machine;

    public CarDecorator(Machine machine) {
        this.machine = machine;
    }

    public String doOperation() {
        return machine.doOperation();
    }

}