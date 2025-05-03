import java.util.*;

public class Goals {
    String name;
    String description;
    List<Goals> subgoals;
    Boolean completed;
    Integer money;
    Integer people;
    Integer days;

    public Goals(String name, String description, Integer money, Integer people, Integer days){
        this.name = name;
        this.description = description;
        this.subgoals = new ArrayList<Goals>();
        this.completed = false;
        this.money = money;
        this.people = people;
        this.days = days;
    }

    public String getName(){
        return this.name;
    }
    public String getDescription(){
        return this.description;
    }
    public List<String> getSubgoals(){
        List<String> subgoalList = new ArrayList<>(); 
        for(Goals sgoal : this.subgoals){
             subgoalList.add(sgoal.getName());
        }
        return subgoalList;
    }

    public Boolean isCompleted(){
        return this.completed;
    }

    public void addSubgoal(Goals subgoal){
        subgoals.add(subgoal);
    }
    public double getSubgoalProgress(){
        if(subgoals.size() == 0){
            return 1;
        }
        int counter = 0;
        for(int i = 0; i < subgoals.size(); i++){
            if(subgoals.get(i).isCompleted()){
                counter++;
            }
        }
        return counter/subgoals.size();
    } 

    public Boolean complete(){
        if (this.getSubgoalProgress() == 1){
            this.completed = true;
            return true;
        }
        return false;
    }

    public List<Integer> getRequirements(){
        List<Integer> requirements = new ArrayList<>();
        requirements.add(this.money);
        requirements.add(this.people);
        requirements.add(this.days);
        return requirements;
    }

    public static void main(String args[]){
        Goals buildHouse = new Goals("buildHouse", "Build a house", 500, 5, 30);
        System.out.println("The name of this project is: " + buildHouse.getName());
        System.out.println("The name of this project is: "+ buildHouse.getDescription());
        System.out.println("The name of this project is: "+ buildHouse.getRequirements());
        buildHouse.addSubgoal(new Goals("getLand", "Get land for house", 100, 3, 2));
        System.out.println("The name of this project is: "+ buildHouse.getSubgoals());

    }
    
}
