package com.przemyslawrutkowski;

public class Tesla extends Car{

    //FIELDS
    public boolean autoPilot;

    //CONSTRUCTOR
    public Tesla(int speed, String direction, int wheels, int door, String gear, boolean autoPilot) {
        super(speed, direction, wheels, door, gear);
        this.autoPilot = autoPilot;
    }

    //METHODS
    public void changeMode(){
        System.out.println("Mode has changed");
    }

    public void restart(){
        System.out.println("Autopilot was restarted");
    }
}
