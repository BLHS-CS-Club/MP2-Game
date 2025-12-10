package game.entities;

public class Player {
    private String name;
    private int health = 100;
    private int attack = 10;
    
    public Player(String name) {
        this.name = name; 
    }
    
    public void takeDamage(int dmg) { 
        health -= dmg; 
    }
    public boolean isAlive() { 
        return health > 0; 
    }
}
