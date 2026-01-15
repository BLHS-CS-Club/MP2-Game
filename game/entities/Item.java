/* Gage K^2  1/15/2026      Additions:
- an effect amount (ex: defense boost +10, max health boost + 10, etc.)
*/

package game.entities;

public class Item {
    private String name;
    private String effect;
    private float effect_amount;
    public Item(String name, String effect, float effect_amount) {
        this.name = name;
        this.effect = effect;
        this.effect_amount = effect_amount;
    }
}
