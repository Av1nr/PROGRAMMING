public class Movie{

    private String title;
    private String director;
    private int year;
    private int duration;
    private double rating;
    private boolean isAvailable;

    public Movie(){
        this("Nothing" , "Nobody" , 0 , 0 , 1 , false);
    }
    public Movie(String title , String director , int year){
        this(title , director , year , 0 , 1 , false);
    }
    public Movie(String title , String director , int year , int duration , double rating , boolean isAvailable){
        if (rating >= 1 && rating <= 10){
            this.title = title;
            this.director = director;
            this.year = year;
            this.duration = duration;
            this.rating = rating;
            this.isAvailable = isAvailable;
        }
        else{
            throw new IllegalArgumentException("Need more than 0 and less than 10");
        }
    }
    public void displayInfo(){
        System.out.println(title + "\n" + director + "\n" + year + "\n" + duration + "\n" + rating + "\n" + isAvailable);
    }
    public void updateRating(double newRating) {
        if (newRating >= 1 && newRating <= 10){
            rating = newRating;
            System.out.println("New rating is: " + newRating);
        }
        else{
            throw new IllegalArgumentException("Need more than 0 and less than 10");
        }
    }
    public void markAsAvailable(){
        if (!isAvailable){
            isAvailable = true;
            System.out.println("Now it is available");
        }
        else{
            System.out.println("Already available");
        }
    }
    public void markAsUnvailable(){
        if (isAvailable){
            isAvailable = false;
            System.out.println("Now it is unavailable");
        }
        else{
            System.out.println("Already unavailable");
        }
    }
    public void addToPlaylist(){
        System.out.println(title + " added to playlist");
    }
}