public class Piano extends MusicInstrument{
    private int pianokeys;
    private double volumeLvl;

    public Piano(int age , double cost , String ownerName , boolean doesAskarLikeIt , int pianokeys , double volumeLvl){
        super(age, cost, ownerName, doesAskarLikeIt);
        this.pianokeys = setpianokeys(pianokeys);
        this.volumeLvl = setvolumeLvl(volumeLvl);
    }
    public int setpianokeys(int newamount){
        while(newamount < 0 || newamount > 100){
            System.out.print("Write new amount: ");
            newamount = enter.nextInt();
        }
        pianokeys = newamount;
        return pianokeys;
    }
    public double setvolumeLvl(double newLvl){
        while(newLvl < 0 || newLvl > 100){
            System.out.print("Write new lvl: ");
            newLvl = enter.nextDouble();
        }
        volumeLvl = newLvl;
        return volumeLvl;
    }
    @Override
    public void makesound(){
        System.out.println("Tun-Tun-Tun *Piano sound*");
    }
    public String getReaction(){
        if(volumeLvl < 10){
            return "Very quite , ew";
        }
        else if (volumeLvl < 50){
            return "I like it";
        }
        else{
            return "Its too loud , can you make it quieter";
        }
    }
}
