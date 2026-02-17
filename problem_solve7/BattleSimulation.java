/**
 * BattleSimulation - A simple turn-based battle game between Players and
 * Monsters.
 * 
 * @author ITSC 1213
 * @version Feb 9, 2025
 */

public class BattleSimulation {
	public static void main(String[] args) {
		// Initialize players and monsters
		Player[] players = {
				new Player("Hero", 30, 10),
				new Player("Mage", 25, 12)
		};

		Monster[] monsters = new Monster[2];
		// TO-DO: Create two Monster objects and store them on the monsters array
		Monster one = new Monster("Medusa", 40, 10);
		Monster two = new Monster("Basilisk", 60, 5);
		monsters[0] = one;
		monsters[1] = two;
		// Start the battle loop
		while (arePlayersAlive(players) && areMonstersAlive(monsters)) {
			System.out.println("\n--- New Round ---");

			// Players' turn
			for (Player player : players) {
				if (player.isAlive()) {
					Monster target = getFirstAliveMonster(monsters);
					if (target != null) {
						player.attack(target);
					}
				}
			}

			// Monsters' turn
			for (Monster monster : monsters) {
				if (monster.isAlive()) {
					Player target = getFirstAlivePlayer(players);
					if (target != null) {
						monster.attack(target);
					}
				}
			}

			// Display status
			displayStatus(players, monsters);
		}

		// Determine the winner
		System.out.println("\n--- Battle Over ---");
		if (arePlayersAlive(players)) {
			System.out.println("Players win!");
		} else {
			System.out.println("Monsters win!");
		}
	}

	/**
	 * Checks if any player is still alive.
	 * 
	 * @param players Array of Player objects.
	 * @return true if at least one player is alive, false otherwise.
	 */
	public static boolean arePlayersAlive(Player[] players) {
		for (Player p : players) {
			if (p.isAlive())
				return true;
		}
		return false;
	}

	/**
	 * Checks if any monster is still alive.
	 * 
	 * @param monsters Array of Monster objects.
	 * @return true if at least one monster is alive, false otherwise.
	 */
	public static boolean areMonstersAlive(Monster[] monsters) {
		// Iterate through the monsters array.
		// Check if any monster's isAlive() method returns true.
		// If a living monster is found, return true.
		// If the loop completes without finding a living monster, return false.
		// TO-DO: Implement this method
		for (Monster m : monsters) {
			if (m.isAlive()) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Finds and returns the first alive player from the array.
	 * 
	 * @param players Array of Player objects.
	 * @return The first alive Player object, or null if none are alive.
	 */
	public static Player getFirstAlivePlayer(Player[] players) {
		// Iterate through the players array.
		// Check if each player's isAlive() method returns true.
		// As soon as a living player is found, return that player object.
		// If no living player is found, return null.
		// TO-DO: Implement this method
		for (Player p : players) {
			if (p.isAlive()) {
				return p;
			}
		}
		return null;
	}

	/**
	 * Finds and returns the first alive monster from the array.
	 * 
	 * @param monsters Array of Monster objects.
	 * @return The first alive Monster object, or null if none are alive.
	 */
	public static Monster getFirstAliveMonster(Monster[] monsters) {
		// Iterate through the monsters array.
		// Check if each monster's isAlive() method returns true.
		// As soon as a living monster is found, return that monster object.
		// If no living monster is found, return null.
		// TO-DO: Implement this method
		for (Monster m : monsters) {
			if (m.isAlive()) {
				return m;
			}
		}
		return null;
	}

	/**
	 * Displays the current health status of all players and monsters.
	 * 
	 * @param players  Array of Player objects.
	 * @param monsters Array of Monster objects.
	 */
	public static void displayStatus(Player[] players, Monster[] monsters) {
		// Print a header message (e.g., "Current Battle Status:").
		// Use a for loop to iterate through the players array.
		// Print each player's name and HP using getName() and getHp().
		// Use a for loop to iterate through the monsters array.
		// Print each monster's name and HP using getName() and getHp().
		// TO-DO: Implement this method
		System.out.println("Current Battle Status: ");
		for (Player p : players) {
			System.out.println(p.getName());
			System.out.println(p.getHp());
		}
		for (Monster m : monsters) {
			System.out.println(m.getName());
			System.out.println(m.getHp());
		}
	}
}
