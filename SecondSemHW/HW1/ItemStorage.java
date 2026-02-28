public class ItemStorage<T>{
    private T value;

    public ItemStorage(T value){
        this.value = value;
    }

    public void setValue(T value){
        this.value = value;
    }
    public T getValue(){
        return value;
    }
    public void compareWith(T otherValue){
        if(otherValue == null || value== null){
            throw new IllegalArgumentException("Оооопачки! Ревизия невозможна , объекты не найдены");
            //Вообще можно и просто SOU , но думаю это более угрожающе, хахаххаха
        }
        else if(otherValue.equals(value)){
            System.out.println("Ого , они совпадают , круто!  :3");
        }
        else{
            System.out.println("Эх , жалко , они не совпадают :(");
        }
    }
}