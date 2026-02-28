public class CargoBay<T extends Cargo>{
    private int capacity;
    private T[] items;
    private int size;
    public CargoBay(int capacity){
        this.capacity = capacity;
        items = (T[]) new Cargo[capacity];
        this.size = 0;
    }
    public T[] getAll(){
        return items;
    }
    public void add(T item){
        if(size == capacity){
            capacity *= 2;
            T[] itemsTemp = (T[]) new Object[capacity];
        for(int i = 0 ; i < items.length ; i++){
            itemsTemp[i] = items[i];
        }
        itemsTemp[size] = item;
        items = (T[]) itemsTemp;
        size++;
        }else{
            items[size] = item;
            size++;
        }
    }
    public void setAll(T[] items){
        this.items = items;
        this.capacity = items.length;
        this.size = items.length;
    }
    public T get(int index){
        if(index >= 0 && index <= items.length - 1){
            return items[index];
        }
        else{
            throw new ArrayIndexOutOfBoundsException();
        }
    }
    public int getSize(){
        return size;
    }

}
