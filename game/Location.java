package game;
import game.entities.*;

public abstract class Location {
    protected String description;
    protected Enemy enemy;
    protected Item item;
    
    public Location(String desc) { 
        this.description = desc; 
    }
    
    public String getDescription() { 
        return description; 
    }
    public Enemy getEnemy() { 
        return enemy; 
    }
    public Item getItem() { 
        return item; 
    }
}
