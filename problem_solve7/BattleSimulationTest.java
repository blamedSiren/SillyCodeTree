/**
 * This file contains automated test cases to verify the correctness of methods
 * in BattleSimulation.java.
 * Each test method checks a specific functionality and prints whether the test
 * passed (✓✓✓) or failed (xxx).
 * 
 * @author ITSC 1213
 * @version Feb 9, 2025
 */

public class BattleSimulationTest {

    public static void main(String[] args) {
        // Run all test methods to verify correctness
        testPlayerAttack();
        testMonsterAttack();
        testArePlayersAlive();
        testAreMonstersAlive();
        testGetFirstAlivePlayer();
        testGetFirstAliveMonster();
    }

    /**
     * Tests the `attack()` method for a player attacking a monster.
     * Ensures that damage is correctly applied.
     */
    public static void testPlayerAttack() {
        Player player = new Player("Hero", 30, 10);
        Monster monster = new Monster("Goblin", 20, 8);

        // Player attacks monster (Expect: Goblin HP = 10)
        player.attack(monster);
        int result1 = monster.getHp();
        System.out.println("Test Player Attack (Goblin HP Expect: 10): " + result1);
        printTestResult(result1, 10);

        // Player attacks again (Expect: Goblin HP = 0)
        player.attack(monster);
        int result2 = monster.getHp();
        System.out.println("Test Player Attack (Goblin HP Expect: 0): " + result2);
        printTestResult(result2, 0);
    }

    /**
     * Tests the `attack()` method for a monster attacking a player.
     * Ensures that damage is correctly applied.
     */
    public static void testMonsterAttack() {
        Monster monster = new Monster("Orc", 35, 12);
        Player player = new Player("Mage", 25, 12);

        // Monster attacks player (Expect: Mage HP = 13)
        monster.attack(player);
        int result1 = player.getHp();
        System.out.println("Test Monster Attack (Mage HP Expect: 13): " + result1);
        printTestResult(result1, 13);

        // Monster attacks again (Expect: Mage HP = 1)
        monster.attack(player);
        int result2 = player.getHp();
        System.out.println("Test Monster Attack (Mage HP Expect: 1): " + result2);
        printTestResult(result2, 1);
    }

    /**
     * Tests the `arePlayersAlive()` method.
     * Ensures that it correctly identifies whether at least one player is still
     * alive.
     */
    public static void testArePlayersAlive() {
        Player[] players = { new Player("Hero", 30, 10), new Player("Mage", 25, 12) };

        // Check if players are alive (Expect: true)
        boolean result = BattleSimulation.arePlayersAlive(players);
        System.out.println("Test arePlayersAlive (Expect: true): " + result);
        printTestResult(result, true);

        // Simulate all players being defeated
        players[0].takeDamage(100);
        players[1].takeDamage(100);

        // Check again (Expect: false)
        boolean result2 = BattleSimulation.arePlayersAlive(players);
        System.out.println("Test arePlayersAlive (Expect: false): " + result2);
        printTestResult(result2, false);
    }

    /**
     * Tests the `areMonstersAlive()` method.
     * Ensures that it correctly identifies whether at least one monster is still
     * alive.
     */
    public static void testAreMonstersAlive() {
        Monster[] monsters = { new Monster("Goblin", 20, 8), new Monster("Orc", 35, 12) };

        // Check if monsters are alive (Expect: true)
        boolean result = BattleSimulation.areMonstersAlive(monsters);
        System.out.println("Test areMonstersAlive (Expect: true): " + result);
        printTestResult(result, true);

        // Simulate all monsters being defeated
        monsters[0].takeDamage(100);
        monsters[1].takeDamage(100);

        // Check again (Expect: false)
        boolean result2 = BattleSimulation.areMonstersAlive(monsters);
        System.out.println("Test areMonstersAlive (Expect: false): " + result2);
        printTestResult(result2, false);
    }

    /**
     * Tests the `getFirstAlivePlayer()` method.
     * Ensures that it correctly returns the first living player.
     */
    public static void testGetFirstAlivePlayer() {
        Player[] players = { new Player("Hero", 30, 10), new Player("Mage", 25, 12) };

        // Get first alive player (Expect: Hero)
        String result = BattleSimulation.getFirstAlivePlayer(players).getName();
        System.out.println("Test getFirstAlivePlayer (Expect: Hero): " + result);
        printTestResult(result, "Hero");

        // Simulate first player being defeated
        players[0].takeDamage(100);

        // Get first alive player (Expect: Mage)
        String result2 = BattleSimulation.getFirstAlivePlayer(players).getName();
        System.out.println("Test getFirstAlivePlayer (Expect: Mage): " + result2);
        printTestResult(result2, "Mage");

        // Simulate all players being defeated
        players[1].takeDamage(100);

        // Check for null return (Expect: null)
        Player result3 = BattleSimulation.getFirstAlivePlayer(players);
        System.out.println("Test getFirstAlivePlayer (Expect: null): " + result3);
        printTestResult(result3, null);
    }

    /**
     * Tests the `getFirstAliveMonster()` method.
     * Ensures that it correctly returns the first living monster.
     */
    public static void testGetFirstAliveMonster() {
        Monster[] monsters = { new Monster("Goblin", 20, 8), new Monster("Orc", 35, 12) };

        // Get first alive monster (Expect: Goblin)
        String result = BattleSimulation.getFirstAliveMonster(monsters).getName();
        System.out.println("Test getFirstAliveMonster (Expect: Goblin): " + result);
        printTestResult(result, "Goblin");

        // Simulate first monster being defeated
        monsters[0].takeDamage(100);

        // Get first alive monster (Expect: Orc)
        String result2 = BattleSimulation.getFirstAliveMonster(monsters).getName();
        System.out.println("Test getFirstAliveMonster (Expect: Orc): " + result2);
        printTestResult(result2, "Orc");

        // Simulate all monsters being defeated
        monsters[1].takeDamage(100);

        // Check for null return (Expect: null)
        Monster result3 = BattleSimulation.getFirstAliveMonster(monsters);
        System.out.println("Test getFirstAliveMonster (Expect: null): " + result3);
        printTestResult(result3, null);
    }

    /**
     * Helper method to print test results with ✓✓✓ for passed tests and "Failed"
     * for failed tests.
     * 
     * @param actual   The actual result obtained from method execution.
     * @param expected The expected result.
     */
    private static void printTestResult(Object actual, Object expected) {
        if (actual == expected || (actual != null && actual.equals(expected))) {
            System.out.println("\u2713\u2713\u2713 Passed");
        } else {
            System.out.println("xxx Failed");
        }
    }
}
