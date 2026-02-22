public class LabaratoryItem {
    private String serialNumber;
    private int biohazardLevel;
    private Integer sessionID;

    public LabaratoryItem(String serialNumber , int biohazardLevel , Integer sessionID){
        this.serialNumber = serialNumber;
        if(biohazardLevel < 0 && biohazardLevel > 10){
            throw new IllegalArgumentException("Wrong biohazard level");
        }
        this.biohazardLevel = biohazardLevel;
        this.sessionID = sessionID;
    }

    public int getBiohazardLevel() {
        return biohazardLevel;
    }

    public Integer getSessionID() {
        return sessionID;
    }

    public String getSerialNumber() {
        return serialNumber;
    }
}
