package com.designpatterns.structuralpatterns.adapter.legacy;

public class LegacyBankAccount {
    private final int ID;
    private final String name;

    public LegacyBankAccount(int ID, String name){
        this.ID = ID;
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }
}
