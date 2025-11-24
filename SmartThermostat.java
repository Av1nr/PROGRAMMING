public class SmartThermostat extends SmartDevice{
    
    private double currentTemperature;
    private double targetTemperature;
    private String mode;

    public SmartThermostat(String deviceId , String deviceName , String location , boolean isPoweredOn , double powerConsumption , double currentTemperature , double targetTemperature , String mode){
        super(deviceId, deviceName, location, isPoweredOn, powerConsumption);
        this.currentTemperature = setTemperature(currentTemperature);
        this.targetTemperature = targetTemperature;
        this.mode = setmode(mode);
    }
    public String setmode(String newMode){
        while (!newMode.equals("cooling") || !newMode.equals("heating")){
            System.out.println("Write new mode cooling/heating");
            newMode = enter.nextLine();
        }
        mode = newMode;
        return mode;
    }
    public double setTemperature(double newTemperature){
        while (newTemperature < 0 || newTemperature > 100){
            System.out.println("Wrong temperature: ");
            newTemperature = enter.nextDouble();
        }
        currentTemperature = newTemperature;
        return currentTemperature;
    }
    @Override
    public String getDeviceType(){
        return "Smart Thermostat";
    }
    @Override
    public String performAction(){
        return "Is regulating temperature";
    }
    public String setTemperature(double newTemperature , String newmode){
        mode = setmode(newmode);
        currentTemperature = setTemperature(newTemperature);
        return "Now mode is "+ mode + " and temperature is " + currentTemperature;
    }
    public String scheduleTemperature(double newTemperature , int hour){
        return "After " + hour + " hours there will be " + newTemperature;
    }
}
