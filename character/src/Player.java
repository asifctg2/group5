import java.util.Random;

public class Player extends Character {

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

    @Override
    public int getHealth() {
        return this.health;
    }

    @Override
    public String getName() {
        return this.name;
    }
}