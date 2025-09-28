import java.util.Scanner;
public class task1 {
    public static void main(String[] args){
        Scanner enter = new Scanner(System.in);
        int n = enter.nextInt();
        int[] matrix = new int[n];
        int summa = 0;
        for (int i = 0 ; i < n ; i++){
            System.out.println("Введите число для [" + i + "] индеса");
            matrix[i] = enter.nextInt();
            summa += matrix[i];
        }
        System.out.println("Ваша сумма равна: " + summa);
        enter.close();
    }
}
