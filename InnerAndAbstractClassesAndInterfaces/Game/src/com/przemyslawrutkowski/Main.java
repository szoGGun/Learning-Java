package com.przemyslawrutkowski;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanny = new Scanner(System.in);
        Player me = new Player(100, 15, "You", "The player", 35, 45, "Sword Swing", "Sword Stab");
        boolean collected = false;
        ArrayList<Monster> temp = new ArrayList<Monster>();
        temp.add(new Monster(false, 75, 5, "Earl", "Your brother's second cousin"));
        temp.add(new Monster(false, 15, 2, "a swordsman", "a Dude with a pointy stick"));
        temp.add(new Monster(false, 15, 2, "a swordsman", "a Dude with a pointy stick"));
        temp.add(new Monster(false, 15, 2, "a swordsman", "a Dude with a pointy stick"));
        temp.add(new Monster(false, 15, 2, "a swordsman", "a Dude with a pointy stick"));
        temp.add(new Monster(false, 15, 2, "a swordsman", "a Dude with a pointy stick"));
        temp.add(new Monster(false, 15, 2, "a swordsman", "a Dude with a pointy stick"));
        temp.add(new Monster(false, 15, 2, "a swordsman", "a Dude with a pointy stick"));
        temp.add(new Monster(false, 15, 2, "a swordsman", "a Dude with a pointy stick"));
        temp.add(new Monster(false, 15, 2, "a swordsman", "a Dude with a pointy stick"));
        temp.add(new Monster(false, 15, 2, "a swordsman", "a Dude with a pointy stick"));
        temp.add(new Monster(false, 10, 3, "a spearman", "a Dude with a long pointy stick"));
        temp.add(new Monster(false, 10, 3, "a spearman", "a Dude with a long pointy stick"));
        temp.add(new Monster(false, 10, 3, "a spearman", "a Dude with a long pointy stick"));
        temp.add(new Monster(false, 10, 3, "a spearman", "a Dude with a long pointy stick"));
        temp.add(new Monster(false, 10, 3, "a spearman", "a Dude with a long pointy stick"));
        temp.add(new Monster(false, 5, 3, "an archer", "a Dude with a bow"));
        temp.add(new Monster(false, 5, 3, "an archer", "a Dude with a bow"));
        temp.add(new Monster(false, 5, 3, "an archer", "a Dude with a bow"));
        temp.add(new Monster(false, 15, 10, "a catapult", "a Dude with a massive piece of medival artillery"));
        temp.add(new Monster(false, 25, 3, "a knight", "an elite swordsman"));
        temp.add(new Monster(false, 25, 3, "a knight", "an elite swordsman"));
        temp.add(new Monster(false, 25, 3, "a knight", "an elite swordsman"));
        temp.add(new Monster(false, 5, 1, "a man-at-arms", "a bumbling conscript"));
        temp.add(new Monster(false, 5, 1, "a man-at-arms", "a bumbling conscript"));
        temp.add(new Monster(false, 5, 1, "a man-at-arms", "a bumbling conscript"));
        temp.add(new Monster(false, 5, 1, "a man-at-arms", "a bumbling conscript"));
        temp.add(new Monster(false, 5, 1, "a man-at-arms", "a bumbling conscript"));
        temp.add(new Monster(false, 5, 1, "a man-at-arms", "a bumbling conscript"));
        temp.add(new Monster(false, 5, 1, "a man-at-arms", "a bumbling conscript"));
        temp.add(new Monster(false, 5, 1, "a man-at-arms", "a bumbling conscript"));
        temp.add(new Monster(false, 5, 1, "a man-at-arms", "a bumbling conscript"));
        temp.add(new Monster(false, 5, 1, "a man-at-arms", "a bumbling conscript"));
        temp.add(new Monster(false, 5, 1, "a man-at-arms", "a bumbling conscript"));
        temp.add(new Monster(false, 5, 1, "a man-at-arms", "a bumbling conscript"));

        me.save(temp);
        temp.clear();
        Boss boss = new Boss(150, 7, "The Ogre King", "the King of the Ogres, what else?");
        Random random = new Random();

        temp.add(new Monster(false, 5, random.nextInt(2) + 1, "a Goblin", "Like yoda, but more annoying"));
        temp.add(new Monster(false, 5, random.nextInt(2) + 1, "a Goblin", "Like yoda, but more annoying"));
        temp.add(new Monster(false, 5, random.nextInt(2) + 1, "a Goblin", "Like yoda, but more annoying"));
        temp.add(new Monster(false, 5, random.nextInt(2) + 1, "a Goblin", "Like yoda, but more annoying"));
        temp.add(new Monster(false, 5, random.nextInt(2) + 1, "a Goblin", "Like yoda, but more annoying"));
        temp.add(new Monster(false, 5, random.nextInt(2) + 1, "a Goblin", "Like yoda, but more annoying"));
        temp.add(new Monster(false, 5, random.nextInt(2) + 1, "a Goblin", "Like yoda, but more annoying"));
        temp.add(new Monster(false, 5, random.nextInt(2) + 1, "a Goblin", "Like yoda, but more annoying"));
        temp.add(new Monster(false, 5, random.nextInt(2) + 1, "a Goblin", "Like yoda, but more annoying"));
        temp.add(new Monster(false, 5, random.nextInt(2) + 1, "a Goblin", "Like yoda, but more annoying"));
        temp.add(new Monster(false, 5, random.nextInt(2) + 1, "a Goblin", "Like yoda, but more annoying"));
        temp.add(new Monster(false, 5, random.nextInt(2) + 1, "a Goblin", "Like yoda, but more annoying"));
        temp.add(new Monster(false, 5, random.nextInt(2) + 1, "a Goblin", "Like yoda, but more annoying"));
        temp.add(new Monster(false, 5, random.nextInt(2) + 1, "a Goblin", "Like yoda, but more annoying"));
        temp.add(new Monster(false, 5, random.nextInt(2) + 1, "a Goblin", "Like yoda, but more annoying"));
        temp.add(new Monster(false, 5, random.nextInt(2) + 1, "a Goblin", "Like yoda, but more annoying"));
        temp.add(new Monster(false, 5, random.nextInt(2) + 1, "a Goblin", "Like yoda, but more annoying"));
        temp.add(new Monster(false, 5, random.nextInt(2) + 1, "a Goblin", "Like yoda, but more annoying"));
        temp.add(new Monster(false, 5, random.nextInt(2) + 1, "a Goblin", "Like yoda, but more annoying"));
        temp.add(new Monster(false, 5, random.nextInt(2) + 1, "a Goblin", "Like yoda, but more annoying"));
        temp.add(new Monster(false, 5, random.nextInt(2) + 1, "a Goblin", "Like yoda, but more annoying"));
        temp.add(new Monster(false, 5, random.nextInt(2) + 1, "a Goblin", "Like yoda, but more annoying"));
        temp.add(new Monster(false, 5, random.nextInt(2) + 1, "a Goblin", "Like yoda, but more annoying"));
        temp.add(new Monster(false, 5, random.nextInt(2) + 1, "a Goblin", "Like yoda, but more annoying"));
        temp.add(new Monster(false, 5, random.nextInt(2) + 1, "a Goblin", "Like yoda, but more annoying"));
        temp.add(new Monster(false, 5, random.nextInt(2) + 1, "a Goblin", "Like yoda, but more annoying"));
        temp.add(new Monster(false, 5, random.nextInt(2) + 1, "a Goblin", "Like yoda, but more annoying"));
        temp.add(new Monster(false, 5, random.nextInt(2) + 1, "a Goblin", "Like yoda, but more annoying"));
        temp.add(new Monster(false, 5, random.nextInt(2) + 1, "a Goblin", "Like yoda, but more annoying"));
        temp.add(new Monster(false, 20, random.nextInt(3) + 1, "a Goblin Champion", "a Like Yoda but EXTREMELY more annoying"));
        temp.add(new Monster(false, 20, random.nextInt(3) + 1, "a Goblin Champion", "a Like Yoda but EXTREMELY more annoying"));
        temp.add(new Monster(false, 20, random.nextInt(3) + 1, "a Goblin Champion", "a Like Yoda but EXTREMELY more annoying"));
        temp.add(new Monster(false, 50, random.nextInt(3) + 1, "an Ogre", "Basically Shrek"));
        temp.add(new Monster(false, 50, random.nextInt(3) + 1, "an Ogre", "Basically Shrek"));
        temp.add(new Monster(false, 50, random.nextInt(3) + 1, "an Ogre", "Basically Shrek"));
        temp.add(new Monster(false, 50, random.nextInt(3) + 1, "an Ogre", "Basically Shrek"));
        temp.add(new Monster(false, 30, random.nextInt(3) + 2, "a Wolf Rider", "Awoooooo I'm a Wolf"));
        temp.add(new Monster(false, 30, random.nextInt(3) + 2, "a Wolf Rider", "Awoooooo I'm a Wolf"));
        temp.add(new Monster(false, 30, random.nextInt(3) + 2, "a Wolf Rider", "Awoooooo I'm a Wolf"));
        temp.add(new Monster(false, 30, random.nextInt(3) + 2, "a Wolf Rider", "Awoooooo I'm a Wolf"));
        temp.add(new Monster(false, 75, random.nextInt(5) + 2, "an Elite Wolf Rider", "Awoooooo I'm ze uber Wolf ya"));
        temp.add(new Monster(false, 100, 5, "Giant Troll", "a murderous beast"));
        boss.save(temp);
        boss.addPrisoner(new Monster(false, 3, 1, "a peasant", "an abducted farmer"));
        boss.addPrisoner(new Monster(false, 3, 1, "a peasant", "an abducted farmer"));
        boss.addPrisoner(new Monster(false, 3, 1, "a peasant", "an abducted farmer"));
        boss.addPrisoner(new Monster(false, 10, 2, "a guard", "an abducted village guardsmen"));
        System.out.println("Press any key to start\n");
        scanny.nextLine();
        System.out.println("Hint: If you get five or more battlepoints, you'll get three per turn instead of two!");
        System.out.println("You have encountered " + boss.getName() + ", " + boss.getDescription());
        System.out.println("You have " + me.getHealth() + " health\n" + "You have two attacks:\n " + me.getAttackname() + " does " + me.damage + " damage\n " + me.getAttackname2() + " does " + me.getDamage() + " damage to " + me.getAttack2() + " damage\n You also have a shield with " + me.getShield() + " hitpoints, don't let it be destroyed");
        System.out.println("Your enemy, the " + boss.Name + " does " + boss.getDamage() + " damage and has " + boss.getHealth() + " health");
        System.out.println();
        System.out.println("\nPress any key to continue");
        scanny.nextLine();
        System.out.println("\nLuckily, you have backup:");
        for (int i = 0; i < me.display().size(); i++) {
            System.out.println(me.display().get(i).getName() + ", " + me.display().get(i).getDescription());
        }
        System.out.println("\nPress any key to continue");
        scanny.nextLine();
        System.out.println("The enemy has backup too:");
        for (int i = 0; i < boss.display().size(); i++) {
            System.out.println(boss.display().get(i).getName() + ", " + boss.display().get(i).getDescription());
        }
        int battlepts = 1;
        int cooonter = 0;
        int boonter = 0;
        while (true) {
            boolean skip = false;
            if (cooonter >= 3) {
                System.out.println("\nA goblin has snuck out from the forest and has joined the battle! We must be attracting the attention of all sorts of nasties");
                boss.save(new Monster(false, 5, random.nextInt(2) + 1, "a Forest Goblin", "a sneaky ol' chap"));
                cooonter = 0;
                boonter++;
            }
            if (boonter >= 5) {
                System.out.println("\nFive goblins have emerged from the forest along with an ogre and have joined the battle! We really must finish this fight soon");
                boss.save(new Monster(false, 5, random.nextInt(2) + 1, "a Forest Goblin", "a sneaky ol' chap"));
                boss.save(new Monster(false, 5, random.nextInt(2) + 1, "a Forest Goblin", "a sneaky ol' chap"));
                boss.save(new Monster(false, 5, random.nextInt(2) + 1, "a Forest Goblin", "a sneaky ol' chap"));
                boss.save(new Monster(false, 5, random.nextInt(2) + 1, "a Forest Goblin", "a sneaky ol' chap"));
                boss.save(new Monster(false, 5, random.nextInt(2) + 1, "a Forest Goblin", "a sneaky ol' chap"));
                boss.save(new Monster(false, 50, random.nextInt(3) + 1, "a Forest Ogre", "Sneaky Shrek"));

                cooonter = 0;
                boonter = 0;
            }
            cooonter++;
            battlepts += 2;
            if (battlepts > 5) {
                battlepts++;
            }
            boolean blocking = false;
            while (true) {
                if (battlepts <= 0) {
                    break;
                }
                System.out.println("\nYou have " + battlepts + " battle points! Do you want to:\n a) Swing your sword 1 bpt.\n b) Stab with your sword 2 bpts. \n c) Block with your shield 1 bpt.\n d) Look at your troops\n e) Look at the enemy troops\n f) Repair your shield 3 btp\n g) Continue");
                String answer = scanny.nextLine();
                if (answer.equals("a")) {
                    me.attack(boss);
                    battlepts--;
                } else if (answer.equals("b")) {
                    if (battlepts >= 2) {
                        me.attackTwo(boss);
                        battlepts -= 2;
                    } else {
                        System.out.println("Not enough battle points!");
                    }
                } else if (answer.equals("c")) {
                    if (me.getShield() > 0) {
                        blocking = true;
                        battlepts--;
                    } else {
                        System.out.println("You lost your shield! You can't block!");
                    }
                } else if (answer.equals("d")) {
                    System.out.println("You have:");
                    for (int i = 0; i < me.display().size(); i++) {
                        System.out.println(me.display().get(i).getName() + " with " + me.display().get(i).getHealth() + " health");
                    }
                } else if (answer.equals("e")) {
                    System.out.println("The enemy has:");
                    for (int i = 0; i < boss.display().size(); i++) {
                        System.out.println(boss.display().get(i).getName() + " with " + boss.display().get(i).getHealth() + " health");
                    }
                } else if (answer.equals("f")) {
                    me.repairShield();
                    battlepts--;
                    break;
                } else if (answer.equals("g")) {
                    break;
                }
            }
            if (boss.getHealth() > 0) {
                if (!blocking) {
                    boss.attack(me);
                } else {
                    me.damageShield(boss);
                    if (me.getShield() > 0) {
                        System.out.println("You blocked the " + boss.Name + "'s blow!\n Your shield has " + me.getShield() + " hitpoints left");
                    } else {
                        System.out.println("You have lost your shield leaving you stunned! The " + boss.getName() + " landed another hit on you in your dazed state and you lost a battle point!");
                        boss.attack(me);
                        battlepts--;
                    }
                }
            } else {
                if (boss.display().size() == 0) {
                    break;
                } else {
                    if (!collected) {
                        boss.death(me);
                        collected = true;
                    }
                    boss.display().get(boss.display().size() - 1).health *= 3;
                    boss.setAs(boss.display().size() - 1);
                    System.out.println("Your opponent is dead and has been replaced by a " + boss.getName());
                    skip = true;
                    if (battlepts > 5) {
                        battlepts -= 2;
                    } else {
                        battlepts -= 1;
                    }
                }
            }
            if (!skip) {
                System.out.println("Press any key to continue");
                scanny.nextLine();
                for (int i = 0; i < me.display().size(); i++) {
                    if (me.display().get(i).getHealth() <= 0) {
                        continue;
                    }
                    if (boss.display().size() > 0) {
                        int counter = 0;
                        int blah = random.nextInt(boss.display().size());
                        while (boss.display().get(blah).getHealth() <= 0 && counter < 150) {
                            counter++;
                            blah = random.nextInt(boss.display().size());
                        }
                        me.display().get(i).attack(boss.display().get(blah));
                    } else {
                        me.display().get(i).attack(boss);
                    }
                }
                for (int i = 0; i < boss.display().size(); i++) {
                    if (boss.display().get(i).getHealth() <= 0) {
                        continue;
                    }
                    if (me.display().size() > 0) {
                        int counter = 0;
                        int blah = random.nextInt(me.display().size());
                        while (me.display().get(blah).getHealth() <= 0 && counter < 150) {
                            counter++;
                            blah = random.nextInt(me.display().size());
                        }
                        boss.display().get(i).attack(me.display().get(blah));
                    }
                }
            }
            int blah = 0;
            while (true) {
                for (int i = blah; i < me.display().size(); i++) {
                    blah = i;
                    if (me.display().get(i).getHealth() <= 0) {
                        me.display().remove(i);
                        break;
                    }
                }
                if (blah >= me.display().size() - 1) {
                    break;
                }
            }
            blah = 0;
            while (true) {
                for (int i = blah; i < boss.display().size(); i++) {
                    blah = i;
                    if (boss.display().get(i).getHealth() <= 0) {
                        boss.display().remove(i);
                        break;
                    }
                }
                if (blah >= boss.display().size() - 1) {
                    break;
                }
            }
            if (boss.health <= 0 && boss.display().size() <= 0) {
                break;
            }
            if (me.health <= 0) {
                break;
            }
        }
        if (me.health <= 0) {
            System.out.println("You died a failure ");
        } else {
            System.out.println("Good job! You and your men have rid the land of the monsters!");
        }
    }
}
