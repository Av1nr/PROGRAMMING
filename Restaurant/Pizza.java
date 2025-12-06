public class Pizza extends Dish{
    private String typeOfPizza;
    private boolean isSpicy;
    private boolean feedBack;

    public Pizza(String name ,double cost , boolean isAvailable , String compositionofthedish , String typeOfPizza , boolean isSpicy){
        super(name, cost, isAvailable, compositionofthedish);
        this.typeOfPizza = typeOfPizza;
        this.isSpicy = isSpicy;
    }
    public void makePizzaSpicy(){
        if(!isSpicy){
            isSpicy = true;
            System.out.print("Now your pizza is spicy! Be careful!");
        }
        else{
            System.out.print("Your pizza is already spicy :3");
        }
    }
    public void getCustomerOpinion(){
        if (feedBack){
            System.out.print("We are glad tgat you enjoyed it. Come back later");
        }
        else{
            System.out.print("Sorry , you will receive 20% discount on this order");
            setcost(getcost() * 0.8);
        }
    }
}
