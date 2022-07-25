package client.src;

import java.util.ArrayList;

class Controller {

    Location mainStreet = new Location("Main Street");
    Location trebleParkWay = new Location("Treble Parkway");
    Location baseCircle = new Location("Base Circle");
    Location riffRunWay = new Location("Riff Runway");
    Location bossPlace = new Location("Boss House");
    Location currentLocation;


    public Controller() {
        currentLocation = mainStreet;
        mainStreet.addNextLocation("north", baseCircle);
        mainStreet.setDescription("You see main street");

        baseCircle.addNextLocation("south", mainStreet);
        baseCircle.addNextLocation("west", riffRunWay);
        baseCircle.addNextLocation("east", trebleParkWay);
        baseCircle.setDescription("You see lights and you hear music");

        trebleParkWay.addNextLocation("west", baseCircle);
        trebleParkWay.addNextLocation("north", bossPlace);
        trebleParkWay.addItem("health kit");
        trebleParkWay.enemy = new BreakDancers("Treble Villain", 10);
        trebleParkWay.setDescription("You see flashing lights and it peaks your interest.");

        riffRunWay.addNextLocation("east", baseCircle);
        riffRunWay.addNextLocation("north", bossPlace);
        riffRunWay.addItem("health kit");
        riffRunWay.enemy = new BreakDancers("Riff Runway Villain", 7);
        riffRunWay.setDescription("You see a path going west");

        bossPlace.enemy = new BreakDancers("Boss Villain", 15);
    }

    public void look(Location currentLocation, String direction) {
        if (currentLocation.nextLocation.keySet().contains(direction)) {
            System.out.println(currentLocation.nextLocation.get(direction).description);
        } else {
            System.out.println("Location not found");
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