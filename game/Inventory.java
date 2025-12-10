package game;

import java.util.ArrayList;
import java.util.List;
import game.entities.*;

public class Inventory {
    private List<Item> items = new ArrayList<>();
    
    public void addItem(Item item) { items.add(item); }
    public List<Item> getItems() { return new ArrayList<>(items); }
    public void useItem(Item item) { 
        items.remove(item); 
    }
}
