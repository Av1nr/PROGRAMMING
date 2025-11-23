public class Mage extends GameCharacter {
    
    private double intelligence;
    private double spellPower;
    private String element;

    public Mage(String name , int level , double health , double mana , boolean  isAlive , double intelligence , double spellPower , String element){
        super(name, level, health, mana, isAlive);
        while(intelligence < 0){
            System.out.print("Wrong amount of intelligence write new one: ");
            intelligence = enter.nextDouble();
        }
        this.intelligence = intelligence;
        while (spellPower < 0){
            System.out.print("Wrong amount of spell power write new one: ");
            spellPower = enter.nextDouble();
        }
        this.spellPower= spellPower;
        while (!element.matches("(fire|ice|lightning)")){ 
            System.out.print("Wrong element choose out of 3 fire/ice/lightning");
            element = enter.nextLine();
        }
        this.element = element;
    }
    public double setintellegence(double intelligence1){
        while(intelligence1 < 0){
            System.out.print("Wrong amount of intelligence write new one: ");
            intelligence1 = enter.nextDouble();
        }
        intelligence = intelligence1;
        return intelligence;
    }
    public double setspellPower(double spellPower1){
        while (spellPower1 < 0){
            System.out.print("Wrong amount of spell power write new one: ");
            spellPower1 = enter.nextDouble();
        }
        spellPower = spellPower1;
        return spellPower;
    }
    public String setelement(String element1){
        while (!element1.matches("(fire|ice|lightning)")){ 
            System.out.print("Wrong element choose out of 3 fire/ice/lightning");
            element1 = enter.nextLine();
        }
        element = element1;
        return element;
    }
    @Override
    public void displayInfo(){
        System.out.println(name + "\n" +level + "\n" + health + "\n" + mana + "\n" + isAlive + "\n" + intelligence + "\n" + spellPower + "\n" + element);
    }
    @Override
    public void useSpeacialAbility(){
        System.out.println("Is using MAGIC SHIELD");
    }
    public void castSpell(String spell){
        while(!spell.equals("null") || !spell.equals("")){
            System.out.print("Wrong spell write new one: ");
            spell = enter.nextLine();
        }
        System.out.println("Is using " + spell);
    }
    public void meditate(int time){
        while(time < 0){
            System.out.print("Wrong amount of time write new one: ");
            time = enter.nextInt();
        }
        mana += time;
        System.out.println("After meditation you have: ");
    }
    public double getintllegence(){
        return intelligence;
    }
    public String getclass(){
        return "Mage";
    }
    public double getspellPower(){
        return spellPower;
    }
    public String getelement(){
        return element;
    }
}
