package com.designpatterns.structuralpatterns.bridge;

public class Red implements Colour {
    @Override
    public String toString() {
        return getClass().getName().toLowerCase();
    }
}