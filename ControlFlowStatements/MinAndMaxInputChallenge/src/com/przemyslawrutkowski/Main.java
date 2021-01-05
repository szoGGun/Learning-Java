package com.przemyslawrutkowski;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = 0;
        int min = 0;
        boolean first = true;

        while (true) {
            System.out.println("Enter number: ");
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                int number = scanner.nextInt();

                if(first) {
                    first = false;
                    max = number;
                    min = number;
                }

                if (number > max) {
                    max = number;
                }

                if (number < min) {
                    min = number;
                }
            } else {
                System.out.println("Min : " + min);
                System.out.println("Max : " + max);
                break;
            }
            scanner.nextLine();
        }
        scanner.close();
    }
}