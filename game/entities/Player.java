/* Gage K^2    1/14/2026 & 1/15/2026    Additions:
- "mana" (magic) variable and "defense"
- max values for health and mana
- added a gain hp/mana/effect method
*/

package game.entities;

public class Player {
    private String name;

    int max_health = 100;
    int max_mana = 50;

    private int health = max_health;
    private int mana = max_mana;
    private int attack = 10;
    private int defense = 0;
    
    public Player(String name) {
        this.name = name; 
    }
    
    public void takeDamage(int dmg) { 
        health -= dmg;
    }

    public void alterStat(int amount, int target, int max_value) {
        /*   adds an "amount" to a "target".if the amount is negative then it subtracts.
        Ex: add 10 health (amount) to the players HP (target); or subract 10 (target) from the players Mana (target)
        can also be used to add a value from non-timed effects from items.
        Ex 2: +10 attack, + 10 defense

        if the target's new value is higher than the max allowed for the target, then it's just set to the max
        if there is no maximum value for the target then set it to -1 so that the program ignores that parameter  
        if youres subtracting from the target, put the minimum value instead of the max; usually should be 0  */
        target += amount;
        if (target > max_value && max_value != -1) {
            target = max_value;
        }
    }

    public boolean isAlive() { 
        return health >= 0; 
    }
}
