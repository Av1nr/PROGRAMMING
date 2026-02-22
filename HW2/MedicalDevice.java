public class MedicalDevice extends LabaratoryItem{
    private String deviceName;
    private double precision;

    public MedicalDevice(String serialNumber , int biohazardLevel , Integer sessionID , String deviceName  ,double precision){
        super(serialNumber, biohazardLevel, sessionID);
        this.deviceName = deviceName;
        this.precision = precision;
    }

    public String getDeviceName() {
        return deviceName;
    }
    
}
