public class Car extends Vehicle{
    
    private String fuelType;
    private int amountoffuel;

    public Car(String brand , int maxSpeed , String fuelType , int amountoffuel){
        super(brand, maxSpeed);
        this.fuelType = fuelType;
        this.amountoffuel = amountoffuel;
    }
    @Override
    public void move(){
        System.out.println("Car drive on the roud");
    }
    public void refuel(int newamountoffuel){
        if (newamountoffuel > 0){
            amountoffuel += newamountoffuel;
            System.out.println("Refuel your car by " + newamountoffuel +"L of"+ fuelType + " now you have "+ amountoffuel );
        }
        else{
            System.out.println("Amount of fuel you enter is negative");
        }
    }
}
