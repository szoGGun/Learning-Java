package com.przemyslawrutkowski;

import java.util.Scanner;

public class Account {
    Scanner scanner = new Scanner(System.in);

    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;


    //CONSTRUCTORS
    public Account(int accountNumber, double balance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this. email = email;
        this.phoneNumber = phoneNumber;
    }

    public Account(int accountNumber, double balance, String customerName) {
        this(accountNumber, balance, customerName, "Default address", "141415152");
    }

    public Account(){
        this(56789, 2.50, "Default name", "Default address", "Default phone");
        System.out.println("Empty constructor");
    }

    //GETTERS AND SETTERS
    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        System.out.println("Balance is " + balance);
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds() {
        System.out.println("How much you want to deposit?");
        int deposit = scanner.nextInt();
        System.out.println("Balance before transaction " + balance);
        balance += deposit;
        System.out.println("Balance after transaction " + balance);
    }

    public void withdrawFunds() {
        System.out.println("How much you want to withdraw?");
        double withdraw = scanner.nextInt();
        if (balance - withdraw < 0) {
            System.out.println("Not enough funds. " + "Current balance is " + balance);
        } else {
            System.out.println("Balance before withdrawal " + balance);
            balance -= withdraw;
            System.out.println("Balance after withdrawal " + balance);
        }
    }
}
