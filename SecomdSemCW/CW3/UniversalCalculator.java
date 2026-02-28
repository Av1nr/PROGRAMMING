public class UniversalCalculator<T extends Number>{
    public static double add(Number a , Number b){
        return a.doubleValue() + b.doubleValue();
    }
    public static double substract(Number a , Number b){
        return a.doubleValue() - b.doubleValue();
    }
    public static double multiply(Number a , Number b){
        return a.doubleValue() * b.doubleValue();
    }
    public static double divide(Number a , Number b){
        if(b.doubleValue() == 0){
            throw new IllegalArgumentException("Ты идиот!!!");
        }
        return a.doubleValue() + b.doubleValue();
    }
}