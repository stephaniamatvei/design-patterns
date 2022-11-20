package com.designpatterns.structuralpatterns.bridge;

public class Bag extends Store {
    private final Colour colour;

    public Bag(Colour colour) {
        this.colour = colour;
    }

    @Override
    public void getColour() {
        System.out.println("The colour of the bag is " + colour.toString());
    }
}