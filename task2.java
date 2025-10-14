import java.util.Scanner;
public class task2 {
    public static void main(String[] args){
        Scanner enter = new Scanner(System.in);
        System.out.print("Vvedite x: ");
        int x = enter.nextInt();
        System.out.print("Vvedite n: ");
        int n = enter.nextInt();
        double konechnsumma = 0;
        for (int k = 1 ; k <= n ; k++){
            int factorialk1 = 1;
            int xvstepenk2 = 1;
            for (int i = 1 ; i <= k + 1; i++){
                factorialk1 *= i;
            }
            System.out.println(factorialk1);
            for (int i = 0 ; i < k + 2 ; i++){
                xvstepenk2 *= x;
            }
            System.out.println(xvstepenk2);
            double sverxu = k * xvstepenk2;
            double vichislenie = sverxu / factorialk1;
            if (k % 2 == 0){
                konechnsumma += vichislenie;
            }
            else{
                konechnsumma -= vichislenie;
            }
        }
        System.out.println(konechnsumma);
    }
}
