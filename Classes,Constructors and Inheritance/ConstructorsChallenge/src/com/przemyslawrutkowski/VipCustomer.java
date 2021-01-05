package com.przemyslawrutkowski;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String email;

    //CONSTRUCTORS
    public VipCustomer() {
        this("Default name", 000000000 ,"Default email");
    }

    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "Default email");
    }

    public VipCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    //GETTERS AND SETTERS
    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
