import java.util.Scanner;
public class MusicPlayer {
    protected Scanner enter = new Scanner(System.in);
    private int age;
    private int experience;
    private String musicInstrument;
    private String name;
    protected boolean isPlayingNow;
    private int lvlOfMusic;

    public MusicPlayer(int age , int experience , String musicInstrument , String name , boolean isPlayingNow , int lvlOfMusic){
        this.age = age;
        this.experience = experience;
        this.musicInstrument = musicInstrument;
        this.name = name;
        this.isPlayingNow = isPlayingNow;
        this.lvlOfMusic = lvlOfMusic;
    }
    public void playForABit(int time){
        while(time < 0){
            time = enter.nextInt();
        }
        lvlOfMusic += time / 60;
        if(lvlOfMusic > 100){
            lvlOfMusic = 100;
            System.out.println("You maxed music skill ^-^");
        }
        else{
            System.out.println("After Sometime you have "+ lvlOfMusic + " lvl of music");
        }
    }
    public String checkifplay(){
        if(isPlayingNow){
            return name + " is playing on " + musicInstrument; 
        }
        else{
            return "Bro is not playing now and its sad =(";
        }
    }
    public String getinstrument(){
        return musicInstrument;
    }
}
