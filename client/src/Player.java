package client.src;

import java.util.ArrayList;
import java.util.Random;

public class Player extends Character {

    ArrayList<String> inventory = new ArrayList<>();

    public Player(String name, int health) {
        super(name, health);
    }

    @Override
    public void decreaseHealth() {
            this.health = getHealth() - randomInt(15, 30);
    }

    public void increaseHealth() {
        this.health = getHealth()+ 40;
    }

    //add boss decreaseHealth method in coming days

    public int randomInt(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    public void addItem(String item){
        inventory.add(item);
    }

    public void removeItem(String item){
        inventory.remove(item);
    }

    public void showInventory() {
        System.out.println("Your inventory: " + inventory.toString());
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