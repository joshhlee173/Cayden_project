// Going to try to enumerate all the roles together
// this would make sure that we can categorize all the NPC's, think this might be a better implementation than the subclasses
public enum NPCRole {
    MERCHANT,
    SOLDIER,
    VILLAGER,
    GUIDE,
    FARMER,
    CRAFTSMEN,
    SERVANT,
}

public enum NPCClass {
    COMMONER,
    NOBLE,
}

public class NPC {
    private String NPCName;
    private String NPCAddress;
    /*
    What is their role in the game? What is their purpose?
    Don't define everything as strings.
    import a dictionary into this part so that you can include some more information based on the NPC
    */
    private NPCRole role;
    private NPCClass characterClass;

    private Map<String, String> knowledgeBase;

    public NPC(String name, String address, int class, int role){
        this.NPCname = name;
        this.NPCaddress = address;
        this.characterClass = characterClass;
        this.role = role;

        this.knowledgeBase = new HashMap<>();

        // Preload responses depending on role/class : this needs to be a method that we define explicitly. 
        // take a look at the general function below
        initializeKnowledge();
    }
    private void initializeKnowledge() {
        if (role == NPCRole.MERCHANT) {
            knowledgeBase.put("what do you sell", "I sell stuff");
        } else if (role == NPCRole.GUARD) {
            knowledgeBase.put("is the town safe", "Safer than it looks.");
        } else if (role == NPCRole.GUIDE) {
            knowledgeBase.put("what's your quest", "Do the thing that Cayden tells you to do");
        }
        // Add default
        knowledgeBase.put("hello", "hello");
    }

    public String getName(){
        return this.NPCName;
    }
    public String getAddress(){
        return this.NPCAddress;
    }
    public String respond(String question){
        // In this function, what I would like to happen is that given a String prompt, 
        // the NPC character responds, depending on the role and tier. ideally, *hint* 
        // there is a way to look up a question from within a specific dude's memory
        String response = this.knowledgeBase.get(question);
        if (response == null){
            return "Sorry, I don't know.";
        }
        return response;
        
    }
    public NPCRole getRole() {
        return this.role;
    }

    public NPCClass getCharacterClass() {
        return this.characterClass;
    }

    public void learn(String question, String answer) {
        // think about how a new question answer pair can be added here
        return
    }

    public static void main(String[] args){
        NPC John = new NPC("John", "31415 Pi Avenue");
        System.out.println(John.getName());
        System.out.println(John.getAddress());        
    }

}

public class Resident extends NPC{
    String town;

    public Resident(String Name, String Address, String town){
        super(Name, Address);
        this.town = town;
    }

    public String getTown(){
        return this.town;
    }

}
