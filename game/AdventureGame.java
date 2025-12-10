package game;
import java.util.Scanner;

import game.entities.*;
import game.locations.*;

public class AdventureGame {
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        GameState state = GameState.getInstance();
        state.setPlayer(new Player("Crabitz"));
        state.setLocation(new Classroom()); 
        
        while (state.getPlayer().isAlive()) {
            Location loc = state.getLocation();
            System.out.println("Player is alive");
        }
        System.out.println("Game Over!");
    }
}
