package com.przemyslawrutkowski;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int myIntValue = 10;
        int anotherIntValue = myIntValue;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);

        anotherIntValue++;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);

        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;

        System.out.println("myIntArray " + Arrays.toString(myIntArray));
        System.out.println("anotherIntArray " + Arrays.toString(anotherArray));

        anotherArray[0] = 1;

        System.out.println("After change myIntArray " + Arrays.toString(myIntArray));
        System.out.println("After change anotherIntArray " + Arrays.toString(anotherArray));

        anotherArray = new int[]{4, 5, 6, 7, 8};
        modifyArray(myIntArray);

        System.out.println("After modify myIntArray " + Arrays.toString(myIntArray));
        System.out.println("After modify anotherIntArray " + Arrays.toString(anotherArray));

    }

    private static void modifyArray(int[] array) {
        array[0] = 2;
        array = new int[]{1, 2, 3, 4, 5};
    }
}
