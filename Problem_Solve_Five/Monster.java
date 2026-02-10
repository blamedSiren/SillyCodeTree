public class Monster {
	int health;
	String name;
	int max = 100;

	public Monster(int health, String name) {
		this.health = health;
		this.name = name;
	}

	public void takeDamage(int dmg) {
		if (dmg > health) {
			System.out.println("You win!");
		}
		health = health - dmg;
	}

	public void heal(int amount) {
		if (amount + health == max) {
			health = max;
			System.out.println("There's a max health to this monster");
			health += amount;
		}
	}

	public void roar(Player p) {
		int newHealth = p.getHealth() - 20;
		p.setHealth(newHealth);
		System.out.println("You took 20 damage!");
	}

	public void displayStatus() {
		System.out.println(name + "\nCurrent Health " + health);
	}

	public int getHealth() {
		return this.health;
	}

	public void setHealth(int health) {
		this.health = health;
	}
}
