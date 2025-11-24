import java.util.Scanner;
public class SmartDevice{
    protected Scanner enter = new Scanner(System.in);
    protected String deviceId;
    protected String deviceName;
    protected String location;
    protected boolean isPoweredOn;
    protected double powerConsumption;
    protected static int totalDevices;
    protected final int MAX_POWER_CONSUMPTION = 5000;

    public SmartDevice(){
        this("0" , "0" , "0" , false , 0);
        totalDevices++;
    }
    public SmartDevice(String deviceId , String deviceName , String location){
        this(deviceId , deviceName , location , false , 0);
        totalDevices++;
    }
    public SmartDevice(String deviceId , String deviceName , String location , boolean isPoweredOn , double powerConsumption){
        this.deviceId = setdeviceId(deviceId);
        this.deviceName = deviceName;
        this.location = location;
        this.isPoweredOn = isPoweredOn;
        this.powerConsumption = setpowerConsumption(powerConsumption);
        totalDevices++;
    }
    public static int getTotalDevices(){
        return totalDevices;
    }
    public void turnOn(){
        isPoweredOn = true;
        System.out.println("Now is turned on");
    }
    public void turnOff(){
        isPoweredOn = false;
        System.out.println("Now is turned off");
    }
    public String getStatus(){
        return deviceId +"\n"+ deviceName +"\n"+ location +"\n"+ isPoweredOn +"\n"+ powerConsumption +"\n"+ totalDevices +"\n"+ MAX_POWER_CONSUMPTION;
    }
    public double setpowerConsumption(double newpowerConsumption){
        while(newpowerConsumption < 0){
            System.out.println("Wrong amount of power: ");
            newpowerConsumption = enter.nextDouble();
        }
        powerConsumption = newpowerConsumption;
        return powerConsumption;
    }
    public String setdeviceId(String newdeviceId){
        while(newdeviceId.equals("") || newdeviceId.equals("null")){
            System.out.println("Wrond deviceId: ");
            newdeviceId = enter.nextLine();
        }
        deviceId = newdeviceId;
        return deviceId;
    }
    public String getDeviceType(){
        return deviceName;
    }
    public String performAction(){
        return "Is doing ";
    }
    public String getdeviceId(){
        return deviceId;
    }
    public double getPowerConsumption(){
        return powerConsumption;
    }
}