public class NPC {
    String NPCName;
    String NPCAddress;

    public NPC(String name, String address){
        this.NPCName = name;
        this.NPCAddress = address;
    }

    public String getName(){
        return this.NPCName;
    }
    public String getAddress(){
        return this.NPCAddress;
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
