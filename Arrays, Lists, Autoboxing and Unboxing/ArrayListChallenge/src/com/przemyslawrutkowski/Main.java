package com.przemyslawrutkowski;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("0039 330 4404");

    public static void main(String[] args) {

        boolean quit = false;


        printInstructions();
        while (!quit) {
            System.out.println("\nEnter action: (0 to show available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    printInstructions();
                    break;

                case 1:
                    mobilePhone.printContacts();
                    break;

                case 2:
                    addNewContact();
                    break;

                case 3:
                    updateContact();
                    break;

                case 4:
                    removeContact();
                    break;

                case 5:
                    queryContact();
                    break;

                case 6:
                    System.out.println("\nShutting down...");
                    quit = true;
                    break;
            }

        }

    }


    private static void addNewContact() {
        System.out.print("Enter contact name: ");
        String name = (scanner.nextLine());
        System.out.println("Enter contact number: ");
        String phone = (scanner.nextLine());
        Contact newContact = Contact.createContact(name, phone);
        if (mobilePhone.addNewContact(newContact)) {
            System.out.println("New contact added: name = " + name + ", phone number = " + phone);
        } else {
            System.out.println("Cannot add, " + name + ", already on list");
        }
    }

    private static void updateContact() {
        System.out.println("Enter name of existing contact that you want to modify: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found");
            return;
        }

        System.out.println("Enter new contact name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter new number: ");
        String newNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(newName, newNumber);
        if (mobilePhone.updateContact(existingContactRecord, newContact)) {
            System.out.println("Successfully modified");
        } else {
            System.out.println("Error updating record");
        }
    }

    private static void removeContact() {
        System.out.println("Enter name of existing contact that you want to remove: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found");
            return;
        }

        if (mobilePhone.removeContact(existingContactRecord)) {
            System.out.println("Successfully deleted");
        } else {
            System.out.println("Error removing record");
        }
    }

    private static void queryContact() {
        System.out.println("Enter name of existing contact that you want to find: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found.");
            return;
        } else {
            System.out.println("Name " + existingContactRecord.getName() + " phone number is " + existingContactRecord.getPhoneNumber());
        }

    }

    public static void printInstructions() {
        System.out.println("\n Press");
        System.out.println("\t 0 - To print choice options");
        System.out.println("\t 1 - To print the list of contacts");
        System.out.println("\t 2 - To add an contact to the list");
        System.out.println("\t 3 - To modify an contact in the list");
        System.out.println("\t 4 - To remove an contact from the list");
        System.out.println("\t 5 - To search for an contact in the list");
        System.out.println("\t 6 - To quit the application");
    }
}
