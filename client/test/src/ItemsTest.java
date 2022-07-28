import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemsTest {

    @Test
    void useItem()throws InterruptedException {
        Location test = new Location("test");
        Player player = new Player("Andy", 20);
        Items items = new Items();
        test.addItem("health kit");
        System.out.println("Before using health kit, health = " + player.getHealth());
        items.useItem("health kit", player);
        boolean increase = player.getHealth() >= 20;
        Assert.assertEquals(increase, true);
        System.out.println(player.getHealth());


    }
}