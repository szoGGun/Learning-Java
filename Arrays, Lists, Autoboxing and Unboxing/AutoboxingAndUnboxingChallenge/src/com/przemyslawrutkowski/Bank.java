package com.przemyslawrutkowski;

import java.util.ArrayList;

public class Bank {

    ArrayList<Branch> branches = new ArrayList<Branch>();


    public void addBranch(String branchName) {
        int position = findBranch(branchName);
        if (position == -1) {
            Branch newBranch = new Branch(branchName);
            branches.add(newBranch);
            System.out.println("Branch added successfully");
        } else {
            System.out.println("Branch with name " + branchName + " already exists");
        }
    }

    public int findBranch(String name) {
        for (int i = 0; i < this.branches.size(); i++) {
            Branch branch = this.branches.get(i);
            if (branch.getBranchName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public void addCustomer(String branchName, String customerName, double amount) {
        int position = findBranch(branchName);
        if (position != -1) {
            branches.get(position).addCustomer(customerName, amount);
        } else {
            System.out.println("Branch doesn't exist");
        }
    }

    public void listOfCustomer(String name) {
        int position = findBranch(name);
        if (position != -1) {
            branches.get(position).listOfCustomers(name);
        } else {
            System.out.println("Branch doesn't exist");
        }
    }

    public void listBranches() {
        System.out.println("Branches:");
        for (int i = 0; i < branches.size(); i++) {
            System.out.println("Name: " + branches.get(i).getBranchName()
                    + ", No. of customers: " + branches.get(i).noOfCustomers());
        }
    }

    public void transactionDetails(String branchName, String customerName) {
        int position = findBranch(branchName);
        if (position != -1) {
            branches.get(position).transactionDetails(customerName);
        } else {
            System.out.println("Branch doesn't exist");
        }
    }

    public void addTransaction(String branchName, String customerName, double amount) {
        int position = findBranch(branchName);
        if (position != -1) {
            branches.get(position).addTransaction(customerName, amount);
        } else {
            System.out.println("Branch with that name doesn't exist");
        }
    }

    public int findCustomer(String branchName, String customerName) {
        int position = findBranch(branchName);
        return branches.get(position).findCustomer(customerName);
    }
}