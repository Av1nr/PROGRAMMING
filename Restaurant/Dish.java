import java.util.Scanner;
public class Dish {
    protected Scanner enter = new Scanner(System.in);
    private String name;
    private double cost;
    private boolean isAvailable;
    private String compositionofthedish;

    public Dish(String name ,double cost , boolean isAvailable , String compositionofthedish){
        this.name = setname(name);
        this.cost = setcost(cost);
        this.isAvailable = isAvailable;
        this.compositionofthedish = compositionofthedish;
    }
    public String setname(String newname){
        while(newname.equals("null") || newname.equals("")){
            System.out.print("Enter new name of dish: ");
            newname = enter.nextLine();
        }
        name = newname;
        return name;
    }
    public double setcost(double newcost){
        while(newcost < 0){
            System.out.print("Write new cost of dish: ");
            newcost = enter.nextDouble();
        }
        cost = newcost;
        return cost;
    }
    public double calculaterealcost(){
        return cost * 0.7;
    }
    public String getDiscription(){
        return "Description of the dish: " + compositionofthedish;
    }
    public double getcost(){
        return cost;
    }
}
