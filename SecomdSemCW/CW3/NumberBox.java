import java.util.Random;
public class NumberBox <T extends Number> {
    private T[] values;
    public NumberBox(T[] values){
        this.values = values;
    }

    public T[] getValues() {
        return values;
    }

    public void setValues(T[] values) {
        this.values = values;
    }
    public static void printSquare(NumberBox<Number> array){
        for(int i = 0 ; i < array.getValues().length ; i++){
            array.getValues()[i] = UniversalCalculator.multiply(array.getValues()[i] , array.getValues()[i]);
        }
    }
    public static void sum(NumberBox<Number> array){
        double sum = 0;
        for (int i = 0 ; i < array.getValues().length ; i++){
            sum = UniversalCalculator.add(sum , array.getValues()[i]);
        }
    }
    public static void fillWithRandom(NumberBox<Number> array){
        Random random = new Random();
        for(int i = 0 ; i < array.getValues().length ;i++){
            array.getValues()[i] = random.nextDouble()*100;
        }
    }
    public static void copy(NumberBox<Number> array1 , NumberBox<Number> array2){
        for(int i = 0 ; i < array1.getValues().length ;i++){
            array1.getValues()[i] = array2.getValues()[i];
        }
    }
    public static NumberBox<Double> addBox(NumberBox<Number> array1 , NumberBox<Number> array2){
        int length3 = array1.getValues().length;
        if(array1.getValues().length != array2.getValues().length){
            throw new IllegalArgumentException("Разная длина");
        }
        Double[] newarray = new Double[length3];
        for(int i = 0 ; i < length3 ; i++){
            newarray[i] = UniversalCalculator.add(array1.getValues()[i] ,array2.getValues()[i]);
        }
        return new NumberBox<Double>(newarray);
    }
    public void append(NumberBox<? extends T> array1){
        Number[] array3 = new Number[array1.getValues().length + getValues().length];
        for(int i = 0 ; i < array1.getValues().length ; i++){
            array3[i] = array1.getValues()[i];
        }
        for(int i = 0;i <  array3.length; i++){
            array3[i + getValues().length] = getValues()[i]; 
        }
        setValues((T[]) array3);
    }
}
