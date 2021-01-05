package com.przemyslawrutkowski;

public class Main {

    public static void main(String[] args) {
        Fridge theFridge = new Fridge(200,100,50,20,"red");

        Stove theStove = new Stove(4,"Bosh", "Gas");

        Celling theCelling = new Celling(400, 200, "white");

        Wall wall1 = new Wall(400,400, "blue");
        Wall wall2 = new Wall(400,400, "red");
        Wall wall3 = new Wall(400,400, "yellow");
        Wall wall4 = new Wall(400,400, "grey");

        Kitchen theKitchen = new Kitchen(theCelling, theFridge, theStove, wall4, wall3, wall2, wall1);
    }
}
