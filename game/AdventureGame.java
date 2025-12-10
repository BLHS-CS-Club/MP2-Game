package game;

import game.entities.*;
import game.locations.*;

public class AdventureGame {   
    public static void main(String[] args) {
        GameState state = GameState.getInstance();
        state.setPlayer(new Player("Crabitz"));
        state.setLocation(new Classroom()); 
        
        while (state.getPlayer().isAlive()) {
            System.out.println("Player is alive");
        }
        System.out.println("Game Over");
    }
}
