package com.designpatterns.structuralpatterns.facade;

public class Main {
    public static void main(String[] args) {
        Facade facade = new Facade();

        facade.computerPerformOperation();
        facade.robotPerformOperation();
    }
}