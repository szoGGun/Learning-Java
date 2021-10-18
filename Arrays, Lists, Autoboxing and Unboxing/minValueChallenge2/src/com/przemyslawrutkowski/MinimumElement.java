package com.przemyslawrutkowski;

import java.util.Scanner;

public class MinimumElement {

    private static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
        return number;
    }

    private static int[] readElements(int values) {
        Scanner scanner = new Scanner(System.in);
        int elements[] = new int[values];

        for (int i = 0; i < elements.length; i++) {
            int totalElementEntered = scanner.nextInt();
            scanner.nextLine();
            elements[i] = totalElementEntered;
        }
        return elements;
    }

    private static int findMin(int[] array) {
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
