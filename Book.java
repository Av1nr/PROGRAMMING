public class Book {
    
    private String title;
    private String author;
    private int year;
    private boolean isAvailable;
    private int pageCount;

    public Book(){

        this("Мишкина Каша"  , "Носов" , 1938 , true , 96);

    }
    public Book(String title , String author , int year){
        
        this(title , author , year , true , 96);

    }
    public Book(String title , String author , int year , boolean isAvailable , int pageCount){

        this.title = title;
        this.author = author;
        this.year = year;
        this.isAvailable = isAvailable;
        this.pageCount = pageCount;

    }
    public String displayInfo(){
        return title + "\n" + author + "\n" + year + "\n" + isAvailable + "\n" + pageCount;
    }
    public void borrowBook(){
        if (isAvailable){
            isAvailable = false;
        }else{
            System.out.println("Ее уже кто-то взял , ты не успел");
        }
    }
    public void returnBook(){
         if (!isAvailable){
            isAvailable = true;
        }else{
            System.out.println("У нас уже есть эта книга");
        }
    }
    public void updateYear(int newYear){
        year = newYear;
    }
}
