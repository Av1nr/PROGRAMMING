public class SmartSecurityCamera extends SmartDevice{
    private boolean isRecording;
    private boolean motionDetection;
    private String videoQuality;

    public SmartSecurityCamera(String deviceId, String deviceName, String location, boolean isPoweredOn, double powerConsumption, boolean isRecording, boolean motionDetection, String videoQuality) {
        super(deviceId, deviceName, location, isPoweredOn, powerConsumption);
       this.isRecording  = isRecording;
       this.motionDetection = motionDetection;
       this.videoQuality = videoQuality;
    }

    @Override
    public String getDeviceType() {
        return "Smart Camera";
    }

    @Override
    public String performAction() {
        if (isRecording){
            isRecording = false;
            return "Stop recording";
        }
        else{
            isRecording = true;
            return "Is recording";
        }
    }
    public String startRecording(){
        isRecording = true;
        return "Now is recording";
    }
    public String startRecording(boolean motionDetection){
        if (motionDetection){
            return "Is recording with motiondetection";
        }
        else{
            return "Is recording without motiondetection";
        }
    }
    public String detectMotion(boolean isSomeoneOnCamera){
        if (motionDetection){
            if(isSomeoneOnCamera){
                return "There is someone on camera";
            }
            else{
                return "There is no one on camera";
            }
        }
        else{
            return "Motion detection is turned off";
        }
    }
    public String getLiveFeed(){
        return "You get live feed";
    }
}