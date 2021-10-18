package com.przemyslawrutkowski;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] array = {0, 1, 2, 3, 4, 5};
        System.out.println("Array before reversing: " + Arrays.toString(array));
        reverse(array);
    }

    private static void reverse(int[] array) {

        int[] reverse = new int[array.length];

        for(int i = 0; i < array.length; i++) {
            reverse[i] = array[array.length - 1 - i];

        }
        System.out.println("Array after reversing: " + Arrays.toString(reverse));

    }
}
