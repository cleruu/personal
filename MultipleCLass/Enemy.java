public class Enemy {
    // Enemy Attributes
    int damage;
    int health;
    int armor;
    int healthPoints;
    boolean hasMagicImmunity;
    String name;

    // Enemy method
    public void enemyDialogue() {
        System.out.println("Fear me player for my name is " + name + " and I deal " + damage + " damage!");
    }

    // Constructor
    public Enemy(int enemyDamage, int enemyHealth, int enemyArmor, int hp, boolean enemyImmunity, String enemyName) {
        damage = enemyDamage;
        health = enemyHealth;
        armor = enemyArmor;
        healthPoints = hp;
        hasMagicImmunity = enemyImmunity;
        name = enemyName;
    }
}
