public class App {
    public static void main(String[] args) {

        // Creates a new object named "Knight" from Character class
        Character knight = new Character(10, 5, 0, "Chen");
        // Calls the sayMyName method
        knight.sayMyName();

        // Creates a new object named "mage" from Character class
        Character mage = new Character(0, 5, 10, "Akasha");
        // Calls the sayMyName method
        mage.sayMyName();

        // Creates a new object named "mage" from Character class
        Character thief = new Character(5, 10, 0, "Gondar");
        // Calls the sayMyName method
        thief.sayMyName();

        //Creates a new object named "priest" from Character class
        Character priest = new Character(0, 1, 20, "jesus");
        // Calls the sayMyName method
        priest.sayMyName();

        //Creates a new object named "archer" from Character class
        Character archer = new Character(2, 20, 5, "barrow");
        // Calls the sayMyName method
        archer.sayMyName();
    }
}
