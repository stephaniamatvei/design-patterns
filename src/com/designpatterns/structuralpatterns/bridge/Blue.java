package com.designpatterns.structuralpatterns.bridge;

public class Blue implements Colour {
    @Override
    public String toString() {
        return getClass().getName().toLowerCase();
    }
}