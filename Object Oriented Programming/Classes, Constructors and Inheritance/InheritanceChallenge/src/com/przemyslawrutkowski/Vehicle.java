package com.przemyslawrutkowski;

public class Vehicle {

    //FIELDS
    private int speed;
    private String direction;

    // CONSTRUCTOR
    public Vehicle(int speed, String direction) {
        this.speed = speed;
        this.direction = direction;
    }

    //METHODS
    public void steer(String direction) {
        this.direction = direction;
        System.out.println("Vehicle is steering at" + direction + " direction");
    }

    public void move(int speed, String direction) {
        this.speed = speed;
        System.out.println("Vehicle is moving at " + speed + "km/h and at " + direction);
    }


    //GETTERS AND SETTERS
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }
}