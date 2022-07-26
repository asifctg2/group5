package client.src;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Player extends Character {

    ArrayList<String> inventory = new ArrayList<>();

    public Player(String name, int health) {
        super(name, health);
    }

    //add boss decreaseHealth method in coming days

    public void addItem(String item){
        inventory.add(item);
    }

    public void removeItem(String item){
        inventory.remove(item);
    }

    public void showInventory() {
        System.out.println("Your inventory: " + inventory.toString());
    }

    @Override
    public void dance(Character enemy, Character soulStepper) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Uh oh! It looks like %s wants to challenge you to a dance off!", enemy.getName());
        System.out.println();
        while (enemy.getHealth() > 0) {

            System.out.println("" +
                    "Pick a number to select a dance move:\n" +
                    "            1. The Hustle\n" +
                    "            2. Bus Stop\n" +
                    "            3. Michael Jackson Robot\n" +
                    "            4. Funky Chicken");
            System.out.println();


            int userChoice = scanner.nextInt();

            switch (userChoice) {
                case 1:
                    System.out.println("Soulstepper hit em with the Hustle!");
                    System.out.println();
                    enemy.decreaseHealth();
                    System.out.printf("%s felt the soul, and there current health is %s !", enemy.getName(), enemy.getHealth());
                    System.out.println();
                    System.out.println();
                    if (enemy.getHealth() > 0){
                        enemy.dance(soulStepper, enemy);
                    } else {
                        System.out.printf("You defeated %s with your soul and can move on", enemy.getName());
                        System.out.println();
                        System.out.println();
                    }
                    break;

                case 2:
                    System.out.println("Soulstepper broke out the Bus Stop!");
                    System.out.println();
                    enemy.decreaseHealth();
                    System.out.printf("%s got hit by the bus, and there current health is %s !", enemy.getName(), enemy.getHealth());
                    System.out.println();
                    System.out.println();
                    if (enemy.getHealth() > 0){
                        enemy.dance(soulStepper, enemy);
                    } else {
                        System.out.printf("You defeated %s with your soul and can move on", enemy.getName());
                        System.out.println();
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("Soulstepper took it back to the 70's with the Michael Jackson Robot!");
                    System.out.println();
                    enemy.decreaseHealth();
                    System.out.printf("%s got hit by little Michael's spirit, and there current health is %s !", enemy.getName(), enemy.getHealth());
                    System.out.println();
                    System.out.println();
                    if (enemy.getHealth() > 0){
                        enemy.dance(soulStepper, enemy);
                    } else {
                        System.out.printf("You defeated %s with your soul and can move on", enemy.getName());
                        System.out.println();
                        System.out.println();
                    }
                    break;

                case 4:
                    System.out.println("Soulstepper was feeling a little weird and did the Funky Chicken!");
                    System.out.println();
                    enemy.decreaseHealth();
                    System.out.printf("%s got pecked by the chicken, and there current health is %s !", enemy.getName(), enemy.getHealth());
                    System.out.println();
                    System.out.println();
                    if (enemy.getHealth() > 0){
                        enemy.dance(soulStepper, enemy);
                    } else {
                        System.out.printf("You defeated %s with your soul and can move on", enemy.getName());
                        System.out.println();
                        System.out.println();
                    }
                    break;

                default:
                    System.out.println("Please enter a number 1-4");
                    System.out.println();
                    System.out.println();
            }
        }
    }

    public int getHealth() {
        return this.health;
    }

    public String getName() {
        return this.name;
    }

    public void setHealth(int health) {
        this.health = health;
    }




}