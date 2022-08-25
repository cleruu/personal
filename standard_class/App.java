public class App {
    public static void main(String[] args) {

        //knight
        Character knight = new Character();

        knight.strength = 10;
        knight.agility = 5;
        knight.intelligence = 0;
        knight.name = "Chen";
        knight.sayMyName();
        knight.sayMyStrength();
        knight.sayMyAgility();
        knight.sayMyIntelligence();
        System.out.println('\n');

        //mage
        Character mage = new Character();

        mage.strength = 0;
        mage.agility = 5;
        mage.intelligence = 10;
        mage.name = "Akasha";
        mage.sayMyName();
        mage.sayMyStrength();
        mage.sayMyAgility();
        mage.sayMyIntelligence();
        System.out.println('\n');
        
        //thief
        Character thief = new Character();

        thief.strength = 5;
        thief.agility = 10;
        thief.intelligence = 0;
        thief.name = "Gondar";
        thief.sayMyName();
        thief.sayMyStrength();
        thief.sayMyAgility();
        thief.sayMyIntelligence();
        System.out.println('\n');
        
        //priest
        Character priest = new Character();

        priest.strength = 0;
        priest.agility = 1;
        priest.intelligence = 30;
        priest.name = "Dawson";
        priest.sayMyName();
        priest.sayMyStrength();
        priest.sayMyAgility();
        priest.sayMyIntelligence();
        System.out.println('\n');

        //archer
        Character archer = new Character();

        archer.strength = 10;
        archer.agility = 20;
        archer.intelligence = 2;
        archer.name = "Brix";
        archer.sayMyName();
        archer.sayMyStrength();
        archer.sayMyAgility();
        archer.sayMyIntelligence();
    }
}
