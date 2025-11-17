public class Mainforvehicle {
    public static void main(String[] args) {
        Vehicle[] vehicle = {new Car("BMW" , 200 , "Petrol" , 200) , new Motorcycle("Suzuzki" , 150 , 200 ) , new Bicycle("Stels" , 40 , 21)};
        for (int vehicles = 0 ; vehicles < vehicle.length ; vehicles++){
            if (vehicle[vehicles] instanceof Motorcycle){
                Motorcycle motorcycle1 = (Motorcycle) vehicle[vehicles];
                motorcycle1.move();
                motorcycle1.wheelie();
            }
            else if (vehicle[vehicles] instanceof Car){
                Car car1 = (Car) vehicle[vehicles];
                car1.displayInfo();
                car1.move();
            }
            else if (vehicle[vehicles] instanceof Bicycle){
                Bicycle bicycle1 = (Bicycle) vehicle[vehicles];
                bicycle1.changeGear(6);
            }
        }
    }
}
