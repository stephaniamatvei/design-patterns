package com.designpatterns.structuralpatterns.adapter;

public class AccountCreationService {
    private int ID;
    private String name;
    private String email;
    private Long amount;

    public AccountCreationService(int ID, String name, String email, Long amount){
        this.ID = ID;
        this.name = name;
        this.email = email;
        this.amount = amount;
    }

    public void createAccount() {
        System.out.println("Account has been created");
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }
}
