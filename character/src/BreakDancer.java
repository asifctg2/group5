import java.util.List;
import java.util.Random;

public class Enemy extends Character {

    List

    public Enemy(String name, int health) {
        super(name, health);
    }

    @Override
    public void decreaseHealth() {
        int min = 15;
        int max = 30;
        Random random = new Random();
        int number = random.nextInt(max - min + 1) + min;
        this.health = getHealth() - number;
    };

    @Override
    public int getHealth() {
        return health;
    }
}
