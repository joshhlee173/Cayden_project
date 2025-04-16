public class MainCharacter {
    String CharacterName;
    String Address;

    public MainCharacter(String CharacterName, String Address){
        this.CharacterName = CharacterName;
        this.Address = Address;
        
    }

    public String getName(){
        return this.CharacterName;
    }
    public String getAddress(){
        return this.Address;
    }

    public static void main(String[] args){
        MainCharacter Cayden = new MainCharacter("Cayden", "12345 Main Street");
        System.out.println(Cayden.getName());
        System.out.println(Cayden.getAddress());
    }
}
