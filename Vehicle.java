public class Vehicle{

    protected String brand;
    protected int maxSpeed;

    public Vehicle(String brand , int maxSpeed ){
        this.brand = brand;
        this.maxSpeed = maxSpeed;

    }
    public void move(){
        System.out.println("It is moving now");
    }
    public void stop(){
        System.out.println("It is not moving");
    }
    public String displayInfo(){
        return brand + "\n" + maxSpeed;
    }
}