package com.przemyslawrutkowski;

import java.util.ArrayList;
import java.util.Random;

public class Player extends Monster implements IMonster<Monster> {
    private int shield;
    private int newshield;
    private String attackname;
    private String attackname2;
    private int attack2;
    private ArrayList<Monster> army;

    public Player(int health, int damage, String name, String desc, int shield, int attack2, String attackname, String attackname2) {
        super(false, health, damage, name, desc);
        army = new ArrayList<Monster>();
        this.attack2 = attack2;
        this.attackname = attackname;
        this.attackname2 = attackname2;
        this.shield = shield;
        newshield = shield;
    }

    public int getShield() {
        return shield;
    }

    public void repairShield() {
        if (shield > 0) {
            shield = newshield;
        } else {
            System.out.println("Your shield is has been destroyed, you cannot repair it");
        }
    }

    public String getAttackname() {
        return attackname;
    }

    public String getAttackname2() {
        return attackname2;
    }

    public int getAttack2() {
        return attack2;
    }

    public ArrayList<Monster> display() {
        return army;
    }

    public void save(ArrayList<Monster> latte) {
        army.addAll(latte);
    }

    public void save(Monster latte) {
        army.add(latte);
    }

    public void attackTwo(Monster other) {
        Random random = new Random();
        attack(other, random.nextInt(attack2 - getDamage()) + getDamage());
    }

    public void damageShield(Monster other) {
        shield -= other.getDamage();
    }
}
