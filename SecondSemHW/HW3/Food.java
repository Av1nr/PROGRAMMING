public class Food extends Cargo{
    
    public Food(String name){
        this.name = name;
    }
    @Override
    public String getName(){
        return name;
    }
}
