package com.przemyslawrutkowski;

public class Stove {

    private int numberOfBurners;
    private String manufacturer;
    private String typeOfHotPlate;

    public Stove(int numberOfBurners, String manufacturer, String typeOfHotPlate) {
        this.numberOfBurners = numberOfBurners;
        this.manufacturer = manufacturer;
        this.typeOfHotPlate = typeOfHotPlate;
    }

    public int getNumberOfBurners() {
        return numberOfBurners;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getTypeOfHotPlate() {
        return typeOfHotPlate;
    }
}
