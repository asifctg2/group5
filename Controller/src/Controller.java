import java.util.ArrayList;

class Controller {

    Location mainStreet = new Location("Main Street");
    Location trebelParkWay = new Location("Trebel Parkway");
    Location baseCircle = new Location("Base Circle");
    Location riffRunWay = new Location("Riff Runway");
    Location bossPlace = new Location("Boss House");
    Location currentLocation;


    public Controller() {
        currentLocation = mainStreet;
        mainStreet.addNextLocation("north", baseCircle);
        mainStreet.setDescription("Place holder for mainStreet");

        baseCircle.addNextLocation("south", mainStreet);
        baseCircle.addNextLocation("west", riffRunWay);
        baseCircle.addNextLocation("east", trebelParkWay);
        baseCircle.setDescription("Place holder for baseCircle");

        trebelParkWay.addNextLocation("west", baseCircle);
        trebelParkWay.addNextLocation("north", bossPlace);
        trebelParkWay.addItem("Health Kit");
        trebelParkWay.enemy = new BreakDancers("Trebel Villain", 10);
        trebelParkWay.setDescription("Place holder for trebelParWay");

        riffRunWay.addNextLocation("east", baseCircle);
        riffRunWay.addNextLocation("north", bossPlace);
        riffRunWay.addItem("Health Kit");
        riffRunWay.enemy = new BreakDancers("Riff Runway Villain", 7);
        riffRunWay.setDescription("Place holder for riffRunWay");

        bossPlace.enemy = new BreakDancers("Boss Villain", 15);
    }

    public String look(Location currentLocation, String direction) {
        if (currentLocation.nextLocation.keySet().contains(direction)) {
            return currentLocation.nextLocation.get(direction).description;
        } else {
            return "Location not found";
        }
    }

    public void go(Location currentLocation, String direction) {
        if (currentLocation.nextLocation.keySet().contains(direction)) {
            this.currentLocation = currentLocation.nextLocation.get(direction);
        } else {
            System.out.println("Not a valid location");
        }
    }
    public void removeItem(String item){
        this.currentLocation.items.remove(item);
    }
}