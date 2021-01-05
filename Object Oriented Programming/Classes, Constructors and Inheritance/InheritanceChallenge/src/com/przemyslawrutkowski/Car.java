package com.przemyslawrutkowski;

public class Car extends Vehicle {

    //FIELDS
    private int wheels;
    private int door;
    private String gear;

    //CONSTRUCTOR

    public Car(int speed, String direction, int wheels, int door, String gear) {
        super(speed, direction);
        this.wheels = wheels;
        this.door = door;
        this.gear = gear;
    }


    //METHODS
    public void changeGear(String gear) {
        this.gear = gear;
        System.out.println("Gear changed to " + gear);
    }

    public void drive(int speed, String direction) {
        move(speed, direction);
    }

    public void stop(){
    setSpeed(0);
        System.out.println("Car stopped");
    }
}