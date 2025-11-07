public class Car{

    private String brand;
    private String model;
    private int year;
    private String color;
    private double price;
    private boolean isRunning;
    private int mileage;

    public Car(){

        this("Renault" , "Fluence" , 2009 , "Black" , 1000000 , true , 300000);

    }
    public Car(String brand , String model , int year){

        this(brand , model , year , "Black" , 1000000 , true , 300000);

    }
    public Car(String brand ,String model , int year , String color , double price , boolean isRunning , int mileage){

        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
        this.isRunning = isRunning;
        this.mileage = mileage;

    }
    public void displayInfo(){
        System.out.println(brand + "\n" + model + "\n" + year + "\n" + color + "\n" + price + "\n" + isRunning + "\n" + mileage);
    }
    public void startEngine(){
        if (!isRunning){
            isRunning = true;
            System.out.println("Now is running");
        }
        else{
            System.out.println("It is already running");
        }
    }
    public void stopEngine(){
        if (isRunning){
            isRunning = false;
            System.out.println("Now it is turned off");
        }
        else{
            System.out.println("It is already turned off");
        }
    }
    public void drive(double distance){
        if(distance > 0){
            mileage += distance;
            System.out.println("Current distance is: "+ mileage);
        }
        else{
            System.out.println("Distance cant be negative");
        }
    }
    public void repaint(String newColor){
        if(!color.equalsIgnoreCase(newColor)){
            color = newColor;
            System.out.println("Good choice , now it is: " + color);
        }
        else{
            System.out.println("It is already " + color);
        }
    }
    public void updatePrice(int newPrice){
        if (newPrice >= 0){
            price = newPrice;
            System.out.println("New price is: "+ price);
        }
        else{
            System.out.println("Price can`t be negative");
        }
    }
}