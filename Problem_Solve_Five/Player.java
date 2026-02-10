public class Player {
	int health;
	int gold;
	int xp;

	public Player(int health, int gold, int xp) {
		this.health = health;
		this.gold = gold;
		this.xp = xp;
	}

	public void takeDamage(int dmg) {
		if (dmg > health) {
			System.out.println("You died!");
		}
		health = health - dmg;
	}

	public void Strike(Monster m) {
		int newHealth = m.getHealth() - 20;
		m.setHealth(newHealth);
		System.out.println("The monster took 20 damage!");
	}

	public void displayStatus() {
		System.out.println("Player Stats:\nCurrent Health " + health + "\nGold: " + gold + "\nXP: " + xp);
	}

	public int getHealth() {
		return this.health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

}
