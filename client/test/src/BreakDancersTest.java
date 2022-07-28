import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BreakDancersTest {



    @Test
    void dance() throws InterruptedException {
        Character soulStepper = new Player("Daniel", 100);
        Character enemy = new BreakDancers("enemyTest", 100);

        enemy.dance(soulStepper, enemy);
    }
}