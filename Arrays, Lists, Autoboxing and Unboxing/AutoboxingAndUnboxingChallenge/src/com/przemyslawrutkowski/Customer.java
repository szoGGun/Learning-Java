package com.przemyslawrutkowski;

import java.util.ArrayList;

public class Customer {
    private String customerName;
    ArrayList<Double> transactions = new ArrayList<Double>();

    public Customer(String name, double transaction) {
        customerName = name;
        transactions.add(transaction);
    }

    public String getCustomerName() {
        return customerName;
    }

    public void addTransaction(double amount) {
        transactions.add(amount);
        System.out.println("Transaction added");
    }

    public void transactionDetails() {
        System.out.println(customerName);
        System.out.println("Transaction details: ");
        for (int i = 0; i < transactions.size(); i++) {
            System.out.println((i + 1) + "." + transactions.get(i));
        }
    }
}
