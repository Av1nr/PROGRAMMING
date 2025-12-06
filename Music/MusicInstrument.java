import java.util.Scanner;
public abstract class MusicInstrument{
    protected Scanner enter = new Scanner(System.in);
    private int age;
    private double cost;
    private String ownerName;
    private boolean doesAskarLikeIt;

    public MusicInstrument(int age , double cost , String ownerName , boolean doesAskarLikeIt){
        this.age = setage(age);
        this.cost = setcost(cost);
        this.ownerName = ownerName;
        this.doesAskarLikeIt = doesAskarLikeIt;
    }
    public int setage(int newage){
        while(newage < 0){
            System.out.print("Write new age: ");
            newage = enter.nextInt();
        }
        age = newage;
        return age;
    }
    public double setcost(double newcost){
        while(newcost < 0){
            System.out.print("Write new cost: ");
            newcost = enter.nextDouble();
        }
        cost = newcost;
        return cost;
    }
    public String setownerName(String newOwnerName){
        while(newOwnerName.equals("null") || newOwnerName.equals("")){
            System.out.print("Write new owner name: ");
            newOwnerName = enter.nextLine();
        }
        ownerName = newOwnerName;
        return ownerName;
    }
    public abstract void makesound();
    public String discounttime(int discount){
        while(discount < 0 || discount > 100){
            System.out.print("Write amount of discount 0-100: ");
            discount = enter.nextInt();
        }
        cost *= discount / 100;
        return "Now price is: " + cost;
    }
    public String discountByAskar(){
        if(doesAskarLikeIt){
            cost -= 1;
        }
        else{
            cost *= 1000;
        }
        return "Now price is: " + cost;
    }
}