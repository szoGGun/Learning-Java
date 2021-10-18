// You job is to create a simple banking application. ✓
// There should be a Bank class ✓
// It should have an arraylist of Branches ✓
// Each Branch should have an arraylist of Customers ✓
// The Customer class should have an arraylist of Doubles (transactions) ✓
// Customer: ✓
// Name, and the ArrayList of doubles. ✓
// Branch: ✓
// Need to be able to add a new customer and initial transaction amount. ✓
// Also needs to add additional transactions for that customer/branch ✓
// Bank: ✓
// Add a new branch ✓
// Add a customer to that branch with initial transaction ✓
// Add a transaction for an existing customer for that branch ✓
// Show a list of customers for a particular branch and optionally a list
// of their transactions ✓
// Demonstration autoboxing and unboxing in your code ✓
// Hint: Transactions ✓
// Add data validation. ✓
// e.g. check if exists, or does not exist, etc. ✓
// Think about where you are adding the code to perform certain actions ✓

package com.przemyslawrutkowski;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Bank bank = new Bank();


    public static void main(String[] args) {
        System.out.println("Welcome to Przemek Bank\n");
        printActions();
        boolean quit = false;
        while (!quit) {
            System.out.println("\nEnter action: (Actions can be selected with numbers from 0 to 7");
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("\nExiting...");
                    quit = true;
                    break;
                case 1:
                    bank.listBranches();
                    break;
                case 2:
                    addBranch();
                    break;
                case 3:
                    listOfCustomers();
                    break;
                case 4:
                    addCustomer();
                    break;
                case 5:
                    addTransaction();
                    break;
                case 6:
                    transactionDetails();
                    break;
                case 7:
                    printActions();
                    break;
            }
        }
    }

    private static void addBranch() {
        System.out.println("Enter branch name: ");
        String name = scanner.nextLine();
        bank.addBranch(name);
    }

    private static void listOfCustomers() {
        System.out.println("Enter Branch name: ");
        String name = scanner.nextLine();
        bank.listOfCustomer(name);
    }

    private static void addCustomer() {
        System.out.println("Enter the name of the branch which you want to add customer: ");
        String branchName = scanner.nextLine();
        if (bank.findBranch(branchName) != -1) {
            System.out.println("Enter name of Customer that you want to add: ");
            String customerName = scanner.nextLine();
            System.out.println("Enter the value of first transaction for that customer: ");
            double amount = scanner.nextDouble();
            bank.addCustomer(branchName, customerName, amount);
        } else {
            System.out.println("Branch doesn't exist");
        }
    }

    private static void addTransaction() {
        System.out.println("Enter the name of the branch in which your customer is placed: ");
        String branchName = scanner.nextLine();
        if (bank.findBranch(branchName) != -1) {
            System.out.println("Enter name of Customer for that you want to add transaction: ");
            String customerName = scanner.nextLine();
            if (bank.findCustomer(branchName, customerName) != -1) {
                System.out.println("Enter transaction amount: ");
                double amount = scanner.nextDouble();
                bank.addTransaction(branchName, customerName, amount);
            } else {
                System.out.println("Customer doesn't exist");
            }
        } else {
            System.out.println("Branch doesn't exist");
        }
    }

    public static void transactionDetails() {
        System.out.println("Enter the name of the branch in which your customer is placed: ");
        String branchName = scanner.nextLine();
        if (bank.findBranch(branchName) != -1) {
            System.out.println("Enter name of Customer for that you want check transactions: ");
            String customerName = scanner.nextLine();
            if (bank.findCustomer(branchName, customerName) != -1) {
                bank.transactionDetails(branchName, customerName);
            } else {
                System.out.println("Customer doesn't exist");
            }
        } else {
            System.out.println("Branch doesn't exist");
        }
    }

    public static void printActions() {
        System.out.println("\n Available actions: \npress");
        System.out.println("0 - to exit\n" +
                "1 - to view list of branches\n" +
                "2 - to add branch\n" +
                "3 - to view list of customers of given branch\n" +
                "4 - to add new customer to existing branch\n" +
                "5 - to add transaction to existing customer\n" +
                "6 - to view transaction details of existing customer\n" +
                "7 - to show available actions\n");
        System.out.println("Choose your actions: ");
    }
}