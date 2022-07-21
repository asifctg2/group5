import javax.naming.Name;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BreakDancers extends Character {


    public BreakDancers(String name, int health) {
        super(name, health);
    }

    @Override
    public void decreaseHealth() {
        this.health = getHealth() - randomInt(15, 30);
    }

    ;

    public int randomInt(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    public void enemyDance(Character Player) {
        List<String> danceMoves = new ArrayList<>(5);
        danceMoves.add("Windmill");
        danceMoves.add("Flare");
        danceMoves.add("Back Spin");
        danceMoves.add("Head Spin");
        danceMoves.add("Jack Hammer");

        int number = randomInt(0, 4);


        if (number == 0) {
            System.out.printf("The %s hit you with a %s", getName(), danceMoves.get(0));
            Player.decreaseHealth();
            System.out.printf("Soulsteppers current health is %s", Player.getHealth());

        } else if (number == 1) {
            System.out.printf("The %s hit you with a %s", getName(), danceMoves.get(1));
            Player.decreaseHealth();
            System.out.printf("Soulsteppers current health is %s", Player.getHealth());
        } else if (number == 2) {
            System.out.printf("The %s hit you with a %s", getName(), danceMoves.get(2));
            Player.decreaseHealth();
            System.out.printf("Soulsteppers current health is %s", Player.getHealth());
        } else if (number == 3) {
            System.out.printf("The %s hit you with a %s", getName(), danceMoves.get(3));
            Player.decreaseHealth();
            System.out.printf("Soulsteppers current health is %s", Player.getHealth());
        } else {
            System.out.printf("The %s tried hit you with a move but missed!", getName());
        }
    }


    @Override
    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }
}
