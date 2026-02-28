public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(30.0 , 20.1));
        System.out.println(calculator.divide(20 , 0));
        System.out.println(calculator.multiply(20 , 20));
        System.out.println(calculator.substract(30.5 , 10.1));
        System.out.println(calculator.add(new RationalFraction(10 , 20) , new RationalFraction(25 , 50)));
    }
}
