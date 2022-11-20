package com.designpatterns.structuralpatterns.decorator;

public class Navigation extends CarDecorator {
    public Navigation(Machine machine) {
        super(machine);
    }

    public String doOperation() {
        return machine.doOperation() + addNavigation();
    }

    public String addNavigation() {
        return " + Navigation";
    }
}