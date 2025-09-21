package Dom2;
import java.util.Scanner;

public class task6 {
    public static void main(String[] args){
        Scanner enter = new Scanner(System.in);
        int n = enter.nextInt();
        float summa = 0;
        float x = enter.nextFloat();
        int factorial = 1;
        float vozvojuvstepen = x;
        for (int k = 1 ; k <= n ; k++){
            factorial *= k;
            summa += (factorial * x);
            x *= vozvojuvstepen;
        }
        System.out.println(summa);
        enter.close();
    }
}
