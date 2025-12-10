package game;
import game.entities.*;

public class GameState {
    private static GameState instance = new GameState();
    private Player player;
    private Location currentLocation;
    
    private GameState() {}
    public static GameState getInstance() {
        return instance; 
    }
    
    public void setPlayer(Player p) { 
        player = p; 
    }
    public Player getPlayer() { 
        return player; 
    }
    public void setLocation(Location loc) { 
        currentLocation = loc; 
    }
    public Location getLocation() { 
        return currentLocation; 
    }
}
