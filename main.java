// Starter file for project


public class main {

    /*
    Here is the part that we would like to make sure that we have all the methods and functions imported
    Overall function of the game.
    */
    public static void main(String[] args) {
        // Program execution starts here
        System.out.println("Hello, World!");
        System.out.println("Hi, Cayden");
        // Lets create a new town here
        
        Town Springfield = new Town("Springfield", 6);
        System.out.println(Springfield.getName());

        NPC Homer = new NPC("Homer", "8");
        NPC Bart = new NPC("Bart", "9");
        NPC Lisa = new NPC("Lisa", "10");
        NPC Marge = new NPC("Marge", "11");

        MainCharacter Cayden = new MainCharacter("Cayden", "1", true, true, Springfield);
        // create a new protagonist

        // a new antagonist

        MainCharacter ScaryEvilMonster = new MainCharacter("Scary Evil Monster", "666", false, false, Springfield);
    }
}
