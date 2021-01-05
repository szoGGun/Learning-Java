package com.przemyslawrutkowski;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 1;
        int sum = 0;
        int x = 0;


        while (counter <= 10) {
            System.out.println("Enter number #" + counter);
            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {
                x = scanner.nextInt();
                sum += x;
                counter++;
            } else {
                System.out.println("Invalid Number");
            }
            scanner.nextLine();
        }
        System.out.println("Sum = " + sum);
        scanner.close();
    }
}