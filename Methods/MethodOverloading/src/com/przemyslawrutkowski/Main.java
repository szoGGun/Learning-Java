package com.przemyslawrutkowski;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Przemek", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();
        calcFeetAndInchesToCentimeters(6, 0);
        calcFeetAndInchesToCentimeters(157);

    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score.");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet < 0) || (inches < 0) || (inches > 12)) {
            System.out.println("Invalid feet or inches parameter");
            return -1;
        } else {
            double Centimeters = (feet / 0.032808) + (inches / 0.39370);
            System.out.print(feet + " feet, " + inches + " inches = " + Centimeters + " cm\n");
            return Centimeters;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            System.out.println("Invalid feet or inches parameter");
            return -1;
        } else {
            double feet = (int) inches / 12;
            double remainingInches = (int) inches % 12;
            System.out.print(inches + " inches are equal to " + feet + " feet and " + remainingInches + "\n");
            return calcFeetAndInchesToCentimeters(feet, remainingInches);
        }
    }
}
