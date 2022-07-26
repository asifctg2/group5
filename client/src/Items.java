

public class Items {

    public void useItem(String item, Player player){
        switch (item) {
            case "health kit":
                int number = player.getHealth() + player.randomInt(30, 70);
                player.setHealth(number);
                System.out.println("Soul Steppers health is now at " + player.getHealth());
                break;
//            case "Michael Jackson Beat it Jacket":
//                break;
        }
    }



}