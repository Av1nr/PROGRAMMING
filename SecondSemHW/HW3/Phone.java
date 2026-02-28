public class Phone extends Electronics{
    
    public Phone(String name){
        super(name);
    }
    @Override
    public String getName(){
        return name;
    }
}
