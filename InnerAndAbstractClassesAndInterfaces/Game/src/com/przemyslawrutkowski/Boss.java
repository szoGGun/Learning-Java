package com.przemyslawrutkowski;

import java.util.ArrayList;
import java.util.Random;

public class Boss extends Monster implements IMonster<Monster> {
    private ArrayList<Monster> army;
    private Prisoners prisoners = new Prisoners(new ArrayList<Monster>());

    public Boss(int health, int damage, String name, String desc) {
        super(false, health, damage, name, desc);
        army = new ArrayList<Monster>();
    }

    public void addPrisoner(Monster monster) {
        prisoners.save(monster);
    }

    public ArrayList<Monster> display() {
        return army;
    }

    public void death(Player player) {
        System.out.println("As " + getName() + "'s body comes tumbling down, you rescue its prisoners");
        Random random = new Random();
        for (int i = 0; i < prisoners.jailed.size(); i++) {
            System.out.println("You have saved " + prisoners.jailed.get(i).getName());
            if (random.nextBoolean()) {
                System.out.println("The former prisoner decides to repay his debt to you and joins your army");
                player.save(prisoners.jailed.get(i));
            } else {
                System.out.println("The prisoner quickly thanks you then runs off into the forest");
            }
        }
    }

    public void save(ArrayList<Monster> latte) {
        army.addAll(latte);
    }

    public void save(Monster latte) {
        army.add(latte);
    }

    public void setAs(int index) {
        Monster temp = army.get(index);
        health = temp.getHealth();
        damage = temp.getDamage();
        Name = temp.getName();
        description = temp.getDescription();
        army.remove(index);
    }

    public class Prisoners {
        private ArrayList<Monster> jailed;

        public Prisoners(ArrayList<Monster> jailed) {
            this.jailed = jailed;
        }

        private void save(Monster monsty) {
            jailed.add(monsty);
        }
    }
}