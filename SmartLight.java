public class SmartLight extends SmartDevice{
    private int brightness;
    private String color;
    private boolean isColorChanging;

    public SmartLight(String deviceId , String deviceName , String location , boolean isPoweredOn , double powerConsumption , int brightness , String color , boolean isColorChanging){
        super(deviceId, deviceName, location , isPoweredOn ,powerConsumption);
        this.brightness = setbrightness(brightness);
        this.color = changecolor(color);
        this.isColorChanging = isColorChanging;
    }
    @Override
    public String getDeviceType(){
        return "SmartLight";
    }
    @Override
    public String performAction(){
        if(isPoweredOn = true){
            isPoweredOn = false;
            return "Turn off light";
        }
        else{
            isPoweredOn = true;
            return "Turn on light";
        }
    }
    public int setbrightness(int level){
        while (level < 0 || level > 100){
            System.out.println("Wrong level of brightness: ");
            level = enter.nextInt();
        }
        brightness = level;
        return brightness;
    }
    public String changecolor(String newcolor){
        while(newcolor.equals("")|| newcolor.equals("null")){
            System.out.println("Wrong color: ");
            newcolor = enter.nextLine();
        }
        color = newcolor;
        return color;
    }
    public String setbrightness(int level , String newcolor){
        while (level < 0 || level > 100){
            System.out.println("Wrong level of brightness: ");
            level = enter.nextInt();
        }
        brightness = level;
        changecolor(newcolor);
        return "Now color is " + color + " and brightness level is " + brightness;
    }
    public int dimlight(int level){
        while (level < 0 || level > brightness){
            System.out.println("Wrong level of brightness: ");
            level = enter.nextInt();
        }
        brightness -= level;
        return brightness;
    }
}
