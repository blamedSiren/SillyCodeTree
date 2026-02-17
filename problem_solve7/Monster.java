/**
 * The Monster class represents a monster character in the battle simulation.
 * Monsters have a name, health points (HP), and attack power.
 *
 * @author ITSC 1213
 * @version Feb 9, 2025
 */

public class Monster {
    // Attributes
    private String name;
    private int hp;
    private int attackPower;

    /**
     * Constructor to initialize a Monster object.
     * 
     * @param name        The name of the monster.
     * @param hp          The starting HP of the monster.
     * @param attackPower The attack power of the monster.
     */
    public Monster(String name, int hp, int attackPower) {
        this.name = name;
        this.hp = hp;
        this.attackPower = attackPower;
    }

    /**
     * Attacks a player, reducing their HP by the monster's attack power.
     * 
     * @param target The player being attacked.
     */
    public void attack(Player target) {
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
     * Determines if the monster is still alive (HP > 0).
     * 
     * @return True if HP is greater than 0, otherwise false.
     */
    public boolean isAlive() {
        return hp > 0;
    }

    /**
     * Gets the monster's name.
     * 
     * @return The monster's name.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the monster's current HP.
     * 
     * @return The current HP.
     */
    public int getHp() {
        return hp;
    }
}
