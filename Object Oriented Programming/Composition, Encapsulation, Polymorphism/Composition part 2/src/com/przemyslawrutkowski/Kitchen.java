package com.przemyslawrutkowski;

public class Kitchen {

    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private Celling theCelling;
    private Stove theStove;
    private Fridge theFridge;

    public Kitchen(Wall wall1, Wall wall2, Wall wall3, Wall wall4, Celling celling, Stove stove, Fridge fridge) {
        wall1 = wall1;
        wall2 = wall2;
        wall3 = wall3;
        wall4 = wall4;
        theCelling = celling;
        theStove = stove;
        theFridge = fridge;

    }

    public Wall getWall1() {
        return wall1;
    }

    public Wall getWall2() {
        return wall2;
    }

    public Wall getWall3() {
        return wall3;
    }

    public Wall getWall4() {
        return wall4;
    }

    public Celling getTheCelling() {
        return theCelling;
    }

    public Stove getTheStove() {
        return theStove;
    }

    public Fridge getTheFridge() {
        return theFridge;
    }
}
