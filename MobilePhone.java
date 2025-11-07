public class MobilePhone{

    private String brand;
    private String model;
    private int storageGB;
    private int batteryLevel;
    private boolean isPoweredOn;

    public MobilePhone(){

        this("Poco" , "X3 Pro" , 128 , 100 , true);
    
    }
    public MobilePhone(String brand , String model , int storageGB){

        this(brand , model , storageGB , 100 , true);

    }
    public MobilePhone(String brand , String model , int storageGB ,int batteryLevel , boolean isPoweredOn){

        this.brand = brand;
        this.model = model;
        this.storageGB = storageGB;
        this.batteryLevel = batteryLevel;
        this.isPoweredOn = isPoweredOn;
    
    }

    public String displayInfo(){
        return brand + "\n" + model + "\n" + storageGB + "\n" + batteryLevel + "\n" + isPoweredOn;
    }
    public void powerOn(){
        if (!isPoweredOn){
            isPoweredOn = true;
        }else{
            System.out.println("Уже включен");
        }
    }public void powerOff(){
        if (isPoweredOn){
            isPoweredOn = false;
        }else{
            System.out.println("Уже выключен");
        }
    }
    public void chargeBattery(int waittime){
        if ((batteryLevel + waittime <=100) && (waittime >= 0)){
            batteryLevel += waittime;
            System.out.println("Current batterylvl: " + batteryLevel);
        }
        else if (waittime < 0){
            System.out.println("Э , Ишак , как можно было зарядить телефон на отрицательный процент?");
        }
        else{
            batteryLevel = 100;
            System.out.println("Current batterylvl: " + batteryLevel);
        }
    }
    public void useBattery(int usetime){
        if( (batteryLevel >= usetime) && (usetime >= 0)){
            batteryLevel -= usetime;
            System.out.println("Current batterylvl: " + batteryLevel);
        }
        else if(usetime < 0){
            System.out.println("Ты безнадежен");
        }
        else{
            System.out.println(-(batteryLevel - usetime) + ": столько процентов ты просидел в пялясь в пустой экран" );
            batteryLevel = 0;
        }
    }
}