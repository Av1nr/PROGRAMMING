public class AskarBestMusicPlayer extends MusicPlayer implements MakeBackFlip{
    private final boolean abilityForEverything = true;
    private final int iq = 200;
    private String locationofplaying;

    public AskarBestMusicPlayer(int age , int experience , String musicInstrument , String name , boolean isPlayingNow , int lvlOfMusic , String locationofplaying){
        super(age, experience, musicInstrument, name, isPlayingNow, lvlOfMusic);
        this.locationofplaying = locationofplaying;
    }
    @Override
    public String checkifplay(){
        isPlayingNow = true;
        return "This bro is on FIREEEEE";
    }
    public String bragIQ(){
        return "Askar have " + iq;
    }
    public String songbylocation(){
        isPlayingNow = true;
        if(locationofplaying.equals("outside")){
            return "Is singing ALL THAT SHE WANTS - TRPJRK";
        }
        else if(locationofplaying.equals("bathroom")){
            return "Is singing I LOVED YOU X HOODTRAP";
        }
        else if(locationofplaying.equals("university")){
            return "Bro is not singing at university XD";
        }
        else{
            return "He is not singing";
        }
    }
    @Override
    public void makeBackFlip(){
        System.out.println("Bro made a backflip with " + getinstrument());
    }
}
