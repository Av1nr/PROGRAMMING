public class Motorcycle extends Vehicle{
    
    private double engineCapacity;

    public Motorcycle(String brand , int maxSpeed , double engineCapacity){
        super(brand, maxSpeed);
        this.engineCapacity = engineCapacity;
    }
    public void wheelie(){
        System.out.println("You made wheelie , yoooooupiiii");
    }
    @Override
    public void move(){
        System.out.println("A motorcycle rushes along the highway");
    }
}
