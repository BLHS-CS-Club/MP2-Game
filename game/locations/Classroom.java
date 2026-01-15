package game.locations;
import game.Location;
import game.entities.*;

public class Classroom extends Location {
    public Classroom() {
        super("You are in the Classroom. Dim lights, desks everywhere! "
            + "Ash the Goblin lurks under the drawers");
        this.enemy = new Enemy("Ash The Goblin");  
        this.item = new Item("Health Potion", "Heals 30 HP", 30);
    }
}
