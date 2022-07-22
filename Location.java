import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Location {
    String name;
    String description;
    ArrayList items = new ArrayList<>();
    HashMap<String, Location> nextLocation = new HashMap<String, Location>();
    //Enemy class instantiation


    public Location(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Location(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList getItems() {
        return items;
    }

    public void setItems(ArrayList items) {
        this.items = items;
    }

    public void addItem(String item){
        this.items.add(item);
    }

    public void addNextLocation(String direction, Location location){
        this.nextLocation.put(direction, location);
    }
}