public class VideoGame {

    private String title;
    private String platform;
    private double price;
    private double rating;
    private boolean isMultiplayer;

    public VideoGame(){
        this("Nothing" , "PC" , 0 , 1 , false);
    }
    public VideoGame(String title , String platform , double price){
        this(title , platform , price , 1 , false);
    }
    public VideoGame(String title , String platform , double price , double rating , boolean isMultiplayer){
        if ((rating >= 1 && rating <= 10) && (platform.equals("PC") || platform.equals("XBOX") || platform.equals("PS") || platform.equals("Mobile"))){
            this.title = title;
            this.platform = platform;
            this.price = price;
            this.rating = rating;
            this.isMultiplayer = isMultiplayer;
        }
        else if(!(platform.equals("PC") || platform.equals("XBOX") || platform.equals("PS") || platform.equals("Mobile"))){
            throw new IllegalArgumentException("Wrong platfrom, choose from : PC , PS , Mobile , XBOX");
        }
        else{
            throw new IllegalArgumentException("Rating can be from 1-10 only");
        }
    }
    public void displayInfo(){
        System.out.println(title + "\n" + platform + "\n" + price + "\n" + rating + "\n" + isMultiplayer);
    }
    public void updateRating(double newRating){
        if (newRating >= 1 && newRating <= 10){
            rating = newRating;
            System.out.println("New rating is: " + newRating);
        }
        else{
            throw new IllegalArgumentException("Need more than 0 and less than 10");
        }
    }
    public void applySale(double discount){
        if (discount > 0 && discount <= 100){
            price -= price * discount / 100;
            System.out.println("Current price is: " + price);
        }
        else{
            throw new IllegalArgumentException("Discount should be more than 0 and less than 100 (100 is fine)");
        }
    } 
    public void enableMultiplayer(){
        if (!isMultiplayer){
            isMultiplayer = true;
            System.out.println("Now it is multiplayer");
        }
        else{
            System.out.println("It is already multiplayer");
        }
    }
    public void disableMultiplayer(){
        if (isMultiplayer){
            isMultiplayer = false;
            System.out.println("Now it is not multiplayer");
        }
        else{
            System.out.println("It is already multiplayer");
        }
    }
}