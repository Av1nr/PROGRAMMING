public class Saxophone extends MusicInstrument{
    //клапаны
    private int valves;
    //Песня с Евровиденья
    private boolean canPlayRunAway;

    public Saxophone(int age , double cost , String ownerName , boolean doesAskarLikeIt , int valves , boolean canPlayRunAway){
        super(age, cost, ownerName, doesAskarLikeIt);
        this.valves = setvalves(valves);
        this.canPlayRunAway = canPlayRunAway;
    }
    @Override
    public void makesound(){
        System.out.print("Pum-Pum-Pum *Saxophone sound*");
    }
    public String theBestQuestion(){
        if(canPlayRunAway){
            return "You won the Eurovision Song Contest";
        }
        else{
            return "The worst information i`ve received today";
        }
    }
    public int setvalves(int newamount){
        while(newamount < 19 || newamount > 22){
            System.out.print("Possible amount of valves is ranging from 19 to 22: ");
            newamount = enter.nextInt();
        }
        valves = newamount;
        return valves;
    }
    public String orderSong(String songName){
        while(songName.equals("null") || songName.equals("") || songName.equals("Марабу")){
            System.out.print("Write new song: ");
            songName = enter.nextLine();
        }
        return "Now we`re going to play a song: " + songName;
    }
}