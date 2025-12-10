package game.locations;
import game.Location;
import game.entities.*;

public class Classroom extends Location {
    public Classroom() {
        super("You are in the Classroom. Dim lights, desks everywhere. "
            + "A weak Goblin guards a Health Potion.");
        this.enemy = new Enemy("Goblin");  // 50 HP, 8 ATK
        this.item = new Item("Health Potion", "Heals 30 HP");
    }
}
