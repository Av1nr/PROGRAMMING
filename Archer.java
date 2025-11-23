public class Archer extends GameCharacter{
    
    private double agility;
    private double accuracy;
    private String arrowType;

    public Archer(String name , int level , double health , double mana , boolean isAlive , double agility , double accuracy , String arrowType){
        super(name, level, health, mana, isAlive);
        while(agility < 0){
            System.out.print("Wrong amount of agility write new one: ");
            agility = enter.nextDouble();
        }
        this.agility = agility;
        while(accuracy < 0){
            System.out.print("Wrong amount of accuracy write new one: ");
            accuracy = enter.nextDouble();
        }
        this.accuracy = accuracy;
        while(arrowType.equals("null") || arrowType.equals("")){
            System.out.print("Wrong arrow type write new one: ");
            arrowType = enter.nextLine();
        }
        this.arrowType = arrowType;
    }

    @Override
    public void displayInfo(){
        System.out.println(name + "\n" +level + "\n" + health + "\n" + mana + "\n" + isAlive + "\n" + agility + "\n" + accuracy + "\n" + arrowType);
    }
    @Override
    public void useSpeacialAbility(){
        System.out.println("Is using AIMED SHOT");
    }
    public void attack(String target , double distance){
        while(!target.equals("null") || !target.equals("")){
            System.out.print("Wrong target write new one: ");
            target = enter.nextLine();
        }
        while(distance < 0){
            System.out.print("Wrong distance write new one: ");
            distance = enter.nextDouble();

        }
        System.out.println(target + " get shoted from " + distance + " m");
    }
    public double getagility(){
        return agility;
    }
    public double getaccuracy(){
        return accuracy;
    }
    public String getarrowType(){
        return arrowType;
    }
    public double setagility(double agility1){
        while(agility1 < 0){
            System.out.print("Wrong amount of agility write new one: ");
            agility1 = enter.nextDouble();
        }
        agility = agility1;
        return agility;
    }
    public double setaccuracy(double accuracy1){
        while(accuracy1 < 0){
            System.out.print("Wrong amount of accuracy write new one: ");
            accuracy1 = enter.nextDouble();
        }
        accuracy = accuracy1;
        return accuracy;
    }
    public String setarrowType(String arrowType1){
        while(arrowType1.equals("null") || arrowType1.equals("")){
            System.out.print("Wrong arrow type write new one: ");
            arrowType1 = enter.nextLine();
        }
        arrowType = arrowType1;
        return arrowType;
    }
     public String getclass(){
        return "Archer";
    }
}
