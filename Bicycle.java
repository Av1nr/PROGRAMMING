public  class Bicycle extends Vehicle {
    
    private int gearCount;

    public Bicycle(String name , int maxSpeed , int gearCount){
        super(name, maxSpeed);
        this.gearCount = gearCount;
    }
    public void changeGear(int newAmountOfGear){
        if (newAmountOfGear > 0){
            gearCount = newAmountOfGear;
            System.out.println("Now you have: " + gearCount+" gears" );
        }
        else{
            System.out.println("You enter negative amount of gears");
        }
    }
    @Override
    public void move(){
        System.out.println(" A bike rides on a bike path");
    }
}
