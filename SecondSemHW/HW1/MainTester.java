public class MainTester {
    public static void main(String[] args) {
        ItemStorage<Integer> number = new ItemStorage<Integer>(100);
        //Второй раз можно было и без Integer конечно же, я просто для себя написал 
        number.compareWith(100);
        ItemStorage<Integer> number2 = new ItemStorage<Integer>(200);
        number2.compareWith(200);
        RationalFraction rational1 = new RationalFraction(1 , 2);
        RationalFraction rational2 = new RationalFraction(1,2);
        ItemStorage<RationalFraction>  vstorage = new ItemStorage<RationalFraction>(rational1);
        vstorage.compareWith(rational2);
    }
}
