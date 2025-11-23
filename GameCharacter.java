import java.util.Scanner;
public class GameCharacter{
    
    protected final Scanner enter = new Scanner(System.in);
    protected String name;
    protected int level;
    protected double health;
    protected double mana;
    protected boolean isAlive;
    protected static int totalCharacters ;
    protected final int MAX_LEVEL = 100;

    public GameCharacter(String name , int level , double health , double mana , boolean isAlive){
        while(name.equals("null") || name.equals("")){
            System.out.print("Wrong name write new one: ");
            name = enter.nextLine();
        } 
        this.name = name;
        while(level > MAX_LEVEL || level < 0){
            System.out.print("Wrong level write new ont: ");
            level = enter.nextInt();
        }
        this.level = level;
        while(health < 0){
            System.out.print("Wrong health amount write new ont: ");
            health = enter.nextDouble();
        }
        this.health = health;
        while(mana < 0){
            System.out.print("Wrong mana amount write new ont: ");
            mana = enter.nextDouble();
        }
        this.mana = mana;
        this.isAlive = isAlive;
    }

    public static int getTotalCharacters(){
        return totalCharacters;
    }
    public void displayInfo(){
        
    }
    public void useSpeacialAbility(){
        
    }
    public void attack(){
        System.out.println("Is attacking");
    }
    public void takeDamege(double damage){
        if(health > damage){
            health -= damage;
            System.out.println("Character get: "+ damage + " damage now you have" + health);
        }else{
            System.out.println("Wrong amount of damage");
        }
    }
    public void heal(double amount){
        if(amount > 0){
            health += amount;
            System.out.println("Character get healed: "+ amount+ " damage now you have " + health);
        }else{
            System.out.println("Wrong amount of heal");
        }
    }
    public String getname(){
        return name;
    }
    public int getlevel(){
        return level;
    }
    public double gethealth(){
        return health;
    }
    public double getmana(){
        return mana;
    }
    public boolean getisAlive(){
        return isAlive;
    }
    public String setname(String name1){
        while(name1.equals("null") || name1.equals("")){
            System.out.print("Wrong name wwrite new one: ");
            name1= enter.nextLine();
        }
        name = name1;
        return name;
    }
    public int setlevel(int level1){
        while(level1 > MAX_LEVEL || level1 < 0){
            System.out.print("Wrong level write new ont: ");
            level1 = enter.nextInt();
        }
        level = level1;
        return level;
    }
    public double sethealth(double health1){
        while(health1 < 0){
            System.out.print("Wrong health amount write new ont: ");
            health1 = enter.nextDouble();
        }
        health = health1;
        return health;
    }
    public double setmana(double mana1){
         while(mana1 < 0){
            System.out.print("Wrong mana amount write new ont: ");
            mana1 = enter.nextDouble();
        }
        mana = mana1;
        return mana;
    }
}