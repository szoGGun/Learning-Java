package com.przemyslawrutkowski;

public class Main {

    public static void main(String[] args) {
    //        int value = 1;
    //        if (value == 1) {
    //            System.out.println("Value was 1");
    //        } else if (value == 2) {
    //            System.out.println("Value was 2");
    //        } else {
    //            System.out.println("Value was nor 1 or 2");
    //        }

        int switchValue = 1;

        switch (switchValue) {
            case 1:
                System.out.println("Value is 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("Was not 3, 4 or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;

            default:
                System.out.println("Was not 1, 2, 3, 4 or 5");
                break;
        }

        char charValue = 'F';
        switch (charValue) {
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
                System.out.println(charValue + " was found");
                break;
            default:
                System.out.println("Char is not A, B, C, D or E");
                break;

        }

        String month = "JAnuAry";
        switch (month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
            default:
                System.out.println("Not sure");
        }
    }
}

