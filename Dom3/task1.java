package Dom3;
import java.util.Scanner;

public class task1{
    public static void main(String[] args){
        Scanner enter = new Scanner(System.in);
        int stolbec = enter.nextInt();
        int stroka = enter.nextInt();
        int[][] massiv = new int[stolbec][stroka];
        for (int x = 0 ; x < stolbec ; x++){
            for (int i = 0 ; i < stroka ; i++){
                System.out.println("Введите число для индекса[" + i + "] [" + x + "]");
                massiv[i][x] = enter.nextInt();
            }
        }
        for (int x = 0 ; x < stolbec ; x++){
            int count = 0;
            for (int i = 0 ; i < stroka ; i++){
                if (massiv[i][x] % 3 == 0){
                    count += 1;
                }
            }
            if (count == stolbec){
                System.out.println("iba chetko");
                break;
            }else{
                System.out.println(x + 1 + " ne chentkii stolbec");
            }
        }
        enter.close();
    }
}
