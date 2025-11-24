public class SmartHome {
    private String homeName;
    private SmartDevice[] devices;

    public void addDevice(SmartDevice device) {
        SmartDevice[] devices1 = new SmartDevice[devices.length + 1];
        for (int i = 0; i < devices.length; i++) {
            devices1[i] = devices[i];
        }
        devices1[devices.length + 1] = device;
        devices = devices1;
    }

    public void removeDevice(String deviceId) {
        SmartDevice[] devices1 = new SmartDevice[devices.length - 1];
        int n = 0;
        for (int i = 0 ; i < devices.length ; i++){
            if(!(devices[i].getdeviceId().equals(deviceId))){
                devices1[n] = devices[i];
                n++;
            }
        }
        devices  = devices1;
    }

    public void turnOnAllDevices() {
        for (int i = 0; i < devices.length; i++) {
            devices[i].turnOn();
        }
    }

    public void turnOffAllDevices() {
        for (int i = 0; i < devices.length; i++) {
            devices[i].turnOff();
        }
    }

    public SmartDevice[] getDevicesByType(String type) {
        int d = 0;
        for (SmartDevice i: devices) {
            if (i.getDeviceType().equals(type)) {d++;}
        }
        SmartDevice[] ret = new SmartDevice[d];
        int n = 0;
        for (SmartDevice i: devices) {
            if (i.getDeviceType().equals(type)) {
                ret[n]=i; n++;
            }
        }
        return ret;
    }

    public double calculateTotalPowerConsumption() {
        double SumpowerConsumption = 0;
        for (int i = 0; i < devices.length; i++) {
            SumpowerConsumption += devices[i].getPowerConsumption();
        }
        return SumpowerConsumption;
    }

    public String getDeviceStatus(String deviceId) {
        for (int i = 0; i < devices.length; i++) {
            if (devices[i].getdeviceId().equals(deviceId)) {
                return devices[i].getStatus();
            }
        }
        return "There is no device with this deviceid";
    }
}