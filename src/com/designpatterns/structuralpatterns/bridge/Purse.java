package com.designpatterns.structuralpatterns.bridge;

public class Purse extends Store {
    private final Colour colour;

    public Purse(Colour colour) {
        this.colour = colour;
    }

    @Override
    public void getColour() {
        System.out.println("The colour of the purse is " + colour.toString());
    }
}