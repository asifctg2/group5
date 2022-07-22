public abstract class Character {

        String name;
        int health;

    public Character(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public abstract void decreaseHealth();

    public abstract int getHealth();

    public abstract String getName();


}