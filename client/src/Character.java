package client.src;

public abstract class Character {

        String name;
        int health;

    public Character(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public abstract void decreaseHealth();


}