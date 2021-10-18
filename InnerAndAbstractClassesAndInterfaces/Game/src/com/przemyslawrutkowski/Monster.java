package com.przemyslawrutkowski;

public class Monster {
    protected boolean bad;
    protected int health;
    protected int damage;
    protected String description;
    protected String Name;

    public Monster(boolean bad, int health, int damage, String name, String description) {
        this.bad = bad;
        this.damage = damage;
        this.description = description;
        this.Name = name;
        this.health = health;
    }

    public void attack(Monster other) {
        attack(other, damage);
    }

    public void attack(Monster other, int damage) {
        other.health -= damage;
        System.out.println(Name + " did " + damage + " damage to " + other.Name);
        if (other.health <= 0) {
            System.out.println(Name + ", " + description + " killed " + other.Name);
        }
    }

    public boolean isBad() {
        return bad;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return Name;
    }
}