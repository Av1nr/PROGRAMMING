public class Box <T> implements Creator{
    public T t;
    public Box(T t){
        this.t = t;
    }
    public T createNew(){
        return new Box.getClass();
    }
}
