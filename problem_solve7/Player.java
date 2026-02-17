/**
 * The Player class represents a player character in the battle simulation.
 * Players have a name, health points (HP), and attack power.
 *
 * @author ITSC 1213
 * @version Feb 9, 2025
 */

public class Player {
    // Attributes
    private String name;
    private int hp;
    private int attackPower;

    /**
     * Constructor to initialize a Player object.
     * 
     * @param name        The name of the player.
     * @param hp          The starting HP of the player.
     * @param attackPower The attack power of the player.
     */
    public Player(String name, int hp, int attackPower) {
        this.name = name;
        this.hp = hp;
        this.attackPower = attackPower;
    }

    /**
     * Attacks a monster, reducing its HP by the player's attack power.
     * 
     * @param target The monster being attacked.
     */
    public void attack(Monster target) {
        if (target.isAlive()) {
            target.takeDamage(attackPower);
            System.out.println(name + " attacks " + target.getName() + " for " + attackPower + " damage!");
        }
    }

    /**
     * Takes damage and reduces HP accordingly.
     * HP cannot go below zero.
     * 
     * @param damage The amount of damage taken.
     */
    public void takeDamage(int damage) {
        hp -= damage;
        if (hp < 0)
            hp = 0;
    }

    /**
     * Determines if the player is still alive (HP > 0).
     * 
     * @return True if HP is greater than 0, otherwise false.
     */
    public boolean isAlive() {
        return hp > 0;
    }

    /**
     * Gets the player's name.
     * 
     * @return The player's name.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the player's current HP.
     * 
     * @return The current HP.
     */
    public int getHp() {
        return hp;
    }
}
