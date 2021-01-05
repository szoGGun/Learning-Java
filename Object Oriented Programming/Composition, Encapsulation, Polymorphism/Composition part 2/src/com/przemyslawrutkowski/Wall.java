package com.przemyslawrutkowski;

public class Wall {
    private int width;
    private int height;
    private String color;

    public Wall(int width, int height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getColor(){
        return color;
    }
}
