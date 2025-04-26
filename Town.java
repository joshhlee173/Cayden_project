import java.util.*;

public class Town {
    String TownName;
    int population;
    NPC[] inhabitants = new NPC[population];
    NPC[] soldiers = new NPC[1];
    NPC[] commoners = new NPC[0];
    NPC[] merchants = new NPC[0];

    Map <String, Integer> defenses = new HashMap<>();
    Map <String, String> stores = new Hashmap<>();
    // lets also include the different buildings and places that would be included here

    public Town(String name, int pop){
        this.TownName = name;
        this.population = pop;
        String[] names = new String[]{"Jack", "Joseph", "Jim", "James"};
        String[] address = new String[]{"6666 G Street", "1600 Pennsylvania Ave", "5089 Penny Lane", "1285 Main Street"};

        stores.put("","Food");

        defenses.put("", 1);

        soldiers[0] = new NPC("John", "500 Militia ave.")

        for(int i = 0; i <this.population; i++){
            this.inhabitants[i] = new NPC(names[i], address[i]);
        }
    }

    public String getName(){
        return this.TownName;
    }
    public int getPop(){
        return this.population;
    }
    public NPC[] getInhabitants(){
        return this.inhabitants;
    }

    public static void main(String[] args){
        Town Oakville = new Town("Oakville", 4);
        System.out.println(Oakville.getName());
        System.out.println(Oakville.getPop());
        System.out.println(Oakville.getInhabitants());
    }

}
