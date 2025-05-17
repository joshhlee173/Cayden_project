import java.util.*;

public class MainCharacter {
    String CharacterName;
    String Address;
    String memory;
    /*
    Some other attributes that might be necessary to the actual function of the person themself
    1. Are they a protagoonist or antagonist?
    2. Minor or major character?
    3. Would imagine that they might have some list of objects they have in possession
    4. Maybe another list of the friends/enemies that they keep track of.
    5. Memory? Things that they need to keep track of? maybe an overall goal?
        - the best way to have this might be a String, but it is difficult to keep track of this.. dictionary or hasmap
    */
    private boolean isProtagonist;
    private boolean isMajorCharacter;

    private List<NPC> friends;
    private List<NPC> enemies;

    private String goal;

    private Town town;

    private double money;

    public MainCharacter(String characterName, String address, boolean isProtagonist, boolean isMajorCharacter, Town town){
        this.CharacterName = characterName;
        this.Address = address;
        this.isProtagonist = isProtagonist;
        this.isMajorCharacter = isMajorCharacter;

        // set this to be something that is ur choice.
        this.goal = "Win the war";

        this.town = town;

        // Optional: find neighbors immediately
    //     List<NPC> neighbors = town.getNeighbors(address);
        System.out.println("Neighbors of " + characterName + ":");
    /*    for (NPC n : neighbors) {
            System.out.println(" - " + n.getName());
        }
            */
    }

    public String getName(){
        return this.CharacterName;
    }
    public String getAddress(){
        return this.Address;
    }
    public double getMoney(){
        return this.money;
    }
    public double spendMoney(int cost){
        this.money -=cost;
        return this.money;
    }

    public void build(String buildingType){
        switch(buildingType){
            case "house":
                
        }
    }

    /*
    We want to make sure that we can have different character interactions included in this
    how does this person interact with different characters?
    talk? trade? buy? sell? fight? 
    */

   public void talk(NPC person, String question) {
        System.out.println(this.CharacterName + " asks " + person.getName() + ": " + question);
        // Try to think about how we are going to be able to get a response from the NPC???
        //System.out.println(person.getName() + " says: " + response);
        // Does anything need to be done with this response?
    }

    //public void addItem(Item item) {
        // what should happen to the inventory given that this item is something we want to the inventory?
        
    //}

    /*public void showInventory() {
        // similar to most of the gets, but look into what should be done here, since the inventory is defined as a dictionary
        for(int i : this.inventory){
            System.out.println(i);
        }
    }

    public void remember(String key, String value) {
        // just an idea, if there is something that we would like to specifically remember, what would happen here?
    }

    public String recall(String key) {
        // trying to get the memory out of the person, given that we started with the key?
    }
*/
    public static void main(String[] args){
        //MainCharacter Cayden = new MainCharacter("Cayden", "12345 Main Street", true, true, Springfield);
        //System.out.println(Cayden.getName());
        //System.out.println(Cayden.getAddress());
    }
}
