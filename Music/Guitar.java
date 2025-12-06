public class Guitar extends MusicInstrument{
    private int strings;
    private String bodyMaterial;
    
    public Guitar(int age , double cost , String ownerName , boolean doesAskarLikeIt , int strings , String bodyMaterial){
        super(age, cost, ownerName, doesAskarLikeIt);
        this.strings = setStrings(strings);
        this.bodyMaterial = bodyMaterial;
    }
    public int setStrings(int newstrings){
        while(newstrings < 4 || newstrings > 14){
            System.out.print("Choose out of this range 4 - 14: ");
            newstrings = enter.nextInt();
        }
        strings = newstrings;
        return strings;
    }
    @Override
    public void makesound(){
        System.out.print("Trun-Trun-Trun *Guitar sound*");
    }
    public String changeMaterial( String newMaterial){
        bodyMaterial =newMaterial;
        return "Now material is :" + bodyMaterial;
    }
}
