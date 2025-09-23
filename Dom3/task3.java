package Dom3;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args){
        Scanner enter = new Scanner(System.in);
        int stroka = enter.nextInt();
        int stolbec = enter.nextInt();
        int finallcount = 0;
        int[][]matrix = new int[stroka][stolbec];
        for (int i = 0 ; stroka > i ; i++){
            for (int j = 0 ; stolbec > j ; j++){
                System.out.println("Введите число для индекса[" + i + "] [" + j + "]");
                matrix[i][j] = enter.nextInt();
            }
        }
        for (int x = 0 ; stroka > x ; x++){
            int count = 0;
            for (int z = 0 ; stolbec > z ; z++){
                int summa = 0;
                while (matrix[x][z] > 0){
                    summa = summa + matrix[x][z] % 10;
                    matrix[x][z] /= 10;
                }
                if (summa % 5 == 0){
                    count += 1;
                }
            }
            if (count >= 2){
                finallcount++;
            }
            else{
                System.out.println("Iba ne chetko");
                break;
            }
        }
        if (finallcount == stroka){
            System.out.println("Iba chetenko");
        }
        enter.close();
    }
}