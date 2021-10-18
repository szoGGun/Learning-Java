package com.przemyslawrutkowski;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("York");
        Parrot parrot = new Parrot("Australian ringneck");
        Penguin penguin = new Penguin("Emperor");
        dog.eat();
        dog.breath();
        parrot.eat();
        parrot.breath();
        penguin.fly();
    }
}
