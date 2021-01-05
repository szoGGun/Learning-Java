package com.przemyslawrutkowski;

public class Fridge {

    private int width;
    private int height;
    private int length;
    private int volume;
    private String color;

    public Fridge(int width, int height, int length, int volume, String color) {
        this.width = width;
        this.height = height;
        this.length = length;
        this.volume = volume;
        this.color = color;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getLength() {
        return length;
    }

    public int getVolume() {
        return volume;
    }

    public String getColor() {
        return color;
    }
}
