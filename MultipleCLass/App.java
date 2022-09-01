public class App {
    private static void entityFight(Character player, Enemy opponent) {
        int index = player.strength;
        int enemyIndex = opponent.damage;
        int enemyArmor = opponent.armor;

        opponent.healthPoints = opponent.healthPoints - (index - enemyArmor);
        System.out.println(opponent.healthPoints);
    }

    public static void main(String[] args) {

        // Character Class
        Character knight = new Character(150, 5, 0, "Chen");
        knight.sayMyName();

        Character mage = new Character(0, 5, 10, "Akasha");
        mage.sayMyName();

        Character thief = new Character(5, 10, 0, "Gondar");
        thief.sayMyName();

        // Enemy Class
        Enemy boss = new Enemy(50, 500, 100, 100, true, "Roshan");
        boss.enemyDialogue();

        Enemy skeleton = new Enemy(5, 10, 5, 100, false, "Common Skeleton Warrior");
        skeleton.enemyDialogue();

        Enemy dragon = new Enemy(40, 400, 75, 100, false, "Ancient Wyvern");
        dragon.enemyDialogue();

        // Item Class
         Item wings = new Item(1_000_000_000, 0.00000001, 1, "This will let you fly like an angel", true);
        wings.getDescription();
        
        Item sunglasses = new Item(20, 1.9, 2, "This will make you look cool", false);
        sunglasses.getDescription();

        Item helloWorld = new Item(30, 0, 1, "This will say hello to the world", false);
        helloWorld.getDescription();

        Pet cat = new Pet("Caterpie", 10, 5, true);
        cat.myPet();

        Pet dog = new Pet("Ruby", 8, 10, true);
        dog.myPet();

        Pet lizard = new Pet("Treecko", 10, 1_000_000_000, true);
        lizard.myPet();

        entityFight(knight, boss);
        entityFight(knight, boss);
    }
}
