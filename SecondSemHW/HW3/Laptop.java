public class Laptop extends Electronics{
    
    public Laptop(String name){
        super(name);
    }
    @Override
    public String getName(){
        return name;
    }
}
