public class Warrior extends GameCharacter {
    
    private double strength;
    private double armor;
    private String weaponType;

    public Warrior(String name , int level , double health , double mana , boolean isAlive , double strength , double armor , String weaponType){
        super(name, level, health, mana, isAlive);
        while(strength < 0){
            System.out.print("Wrong amount of strength write new one: ");
            strength = enter.nextDouble();
        }
        this.strength = strength;
        while(armor < 0){
            System.out.print("Wrong amount of armor write new one: ");
            armor = enter.nextDouble();
        }
        this.armor = armor;
        while (weaponType.equals("null") || weaponType.equals("")) { 
            System.out.print("Wrong type of weapon write new one: ");
            weaponType = enter.nextLine();
        }
        this.weaponType = weaponType;
    }
    @Override
    public void displayInfo(){
        System.out.println(name + "\n" +level + "\n" + health + "\n" + mana + "\n" + isAlive + "\n" + strength + "\n" + armor + "\n" + weaponType );
    }
    @Override
    public void useSpeacialAbility(){
        System.out.println("Is using BERSERK");
    }
    public void attack(String weapon){
        while(weapon.equals("null") || weapon.equals("")){
            System.out.print("Wrong weapon write new one: ");
            weapon = enter.nextLine();
        }
        System.out.println("Is attacking with " + weapon);
    }
    public double getstrength(){
        return strength;
    }
    public double getarmor(){
        return armor;
    }
    public String getweaponType(){
        return weaponType;
    }
    public double setstrength(double strength1){
        while(strength1 < 0){
            System.out.print("Wrong amount of strength write new one: ");
            strength1 = enter.nextDouble();
        }
        strength = strength1;
        return strength;
    }
    public double setarmor(double armor1){
        while(armor1 < 0){
            System.out.print("Wrong amount of armor write new one: ");
            armor1 = enter.nextDouble();
        }
        armor = armor1;
        return armor;
    }
    public String setweaponType(String weaponType1){
        while (weaponType1.equals("null") || weaponType1.equals("")) { 
            System.out.print("Wrong type of weapon write new one: ");
            weaponType1 = enter.nextLine();
        }
        weaponType = weaponType1;
        return weaponType;
    }
     public String getclass(){
        return "Warrior";
    }
}
