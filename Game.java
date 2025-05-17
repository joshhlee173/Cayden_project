import java.util.*;
import java.time.Instant;

public class Game {
    private Town town;
    private MainCharacter player;
    private Scanner scanner;

    public Game(){
        scanner = new Scanner(System.in);
    }
    
    public void start() {
        System.out.println("Welcome to the Town Building Game!");

        // New town

        Town Springfield = new Town("Springfield", 0);
        System.out.println(Springfield.getName());

        System.out.println("The town is " + Springfield.getName());

        NPC Homer = new NPC("Homer", "8");
        NPC Bart = new NPC("Bart", "9");
        NPC Lisa = new NPC("Lisa", "10");
        NPC Marge = new NPC("Marge", "11");

        System.out.println("The NPCs are " + Homer.getName()+Bart.getName()+Lisa.getName()+Marge.getName());

        MainCharacter Cayden = new MainCharacter("Cayden", "1", true, true, Springfield);
        // create a new protagonist
        this.player = Cayden;
        System.out.println("Main protagonist is " + Cayden.getName());
        // a new antagonist

        MainCharacter ScaryEvilMonster = new MainCharacter("Scary Evil Monster", "666", false, false, Springfield);

        System.out.println("Main antagonist is " + ScaryEvilMonster.getName());

        play();
    }

    public void play(){
        String input = "";
        System.out.println("Welcome to the Game! What would you like to do today?");
        while(true){
            input = scanner.nextLine().trim();
            switch(input){
                case "build":
                    build_something();
                    break;
                case "travel":
                    travel_somewhere();
                    break;
                case "fundraise":
                    fundraise_something();
                    break;
                default:
                    System.out.println("Invalid command. Please try again");

            }
        }

    }

    private void build_something(){
        System.out.println("What would you like to build?");
        while(true){
            String input = scanner.nextLine().trim();
            this.player.build(input);
        }
    }

    private void travel_somewhere(){
        System.out.println("Where would you like to travel to?");
    }
    private void fundraise_something(){
        System.out.println("What would you like to fundraise?");
    }

    private void showGoals() {

    }
}