package com.designpatterns.structuralpatterns.facade;

public class Facade {
    private final Computer computer;
    private final Robot robot;

    Facade() {
        computer = new Computer();
        robot = new Robot();
    }

    public void computerPerformOperation() {
        computer.performOperation();
    }

    public void robotPerformOperation() {
        robot.performOperation();
    }
}