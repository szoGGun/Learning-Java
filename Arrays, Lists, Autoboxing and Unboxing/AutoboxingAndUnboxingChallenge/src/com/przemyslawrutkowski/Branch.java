package com.przemyslawrutkowski;

import java.util.ArrayList;

public class Branch {

    private String branchName;
    ArrayList<Customer> customers = new ArrayList<Customer>();

    public Branch(String branchName) {
        this.branchName = branchName;
    }

    public String getBranchName() {
        return branchName = branchName;
    }

    public void addCustomer(String customerName, double initialTransaction) {
        Customer newCustomer = new Customer(customerName, initialTransaction);
        customers.add(newCustomer);
        System.out.println("Customer added");
    }

    public void addTransaction(String customerName, double amount) {
        int position = findCustomer(customerName);
        if (position != -1) {
            customers.get(position).addTransaction(amount);
        } else {
            System.out.println("Customer not found");
        }
    }

    public int findCustomer(String name) {
        for (int i = 0; i < this.customers.size(); i++) {
            Customer customer = this.customers.get(i);
            if (customer.getCustomerName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public void listOfCustomers(String name) {
        System.out.println("Branch: " + name);
        System.out.println("Customer list: ");
        for (int i = 0; i < customers.size(); i++) {
            System.out.println((i + 1) + "." + customers.get(i).getCustomerName());
        }
    }

    public int noOfCustomers() {
        return customers.size();
    }

    public void transactionDetails(String customerName) {
        int position = findCustomer(customerName);
        if (position != -1) {
            customers.get(position).transactionDetails();
        } else {
            System.out.println("Customer with that name doesn't exist");
        }
    }
}
