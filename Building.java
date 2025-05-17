import java.util.*;

class Building {
    String buildType;
    int cost;
    int time;

    public Building(String buildType, int cost, int time){
        this.buildType = buildType;
        this.cost = cost;
        this.time = time;
    }

    public String getBuildType(String Building){
        return this.buildType;
    }
    public int getCost(int Cost){
        return this.cost;
    }
}

class House extends Building{
    
    List<NPC> residents;
    String address;

    public House(String buildType, int cost, int time, String address){
        super(buildType, cost, time);
        this.address = address;
        this.residents = new ArrayList<NPC>();
        residents.add(new NPC("John", address));
        residents.add(new NPC("Luke", address));
    }

    String getAddress(){
        return address;
    }
    List getResidents(){
        return residents;
    }
    void addResidents(NPC resident){
        residents.add(resident);
    }
}