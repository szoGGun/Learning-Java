package com.przemyslawrutkowski;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myIntegers = readIntegers(5);

        for (int i = 0; i < myIntegers.length; i++) {
            System.out.println("Element " + i + ", value is " + myIntegers[i]);
        }
        System.out.println("The minimal value is " + findMin(myIntegers));
    }

    public static int[] readIntegers(int number){
        System.out.println("Enter " + number + " integer values.\r");
        int values[] = new int[number];

        for(int i = 0; i < values.length; i++){
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static int findMin(int[] array){
        int min = array[0];

        for (int i = 0; i < array.length; i++){
            if (array[i] < min){
                min = array[i];
            }
        }
        return min;
    }
}
