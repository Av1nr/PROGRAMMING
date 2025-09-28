import java.util.Scanner;

public class task10 {
    public static void main(String[] args){
        Scanner enter = new Scanner(System.in);
        System.out.print("Введите высоту матрицы: ");
        int stolbec = enter.nextInt();
        System.out.print("Введите длину матрицы: ");
        int stroka = enter.nextInt();
        int[][] matrix = new int[stolbec][stroka];
        for (int i = 0 ; i < stolbec ; i++){
            for (int j = 0 ; j < stroka ; j ++){
                System.out.println("Введите число для [" + i + "] [" + j + "] индеса");
                matrix[i][j] = enter.nextInt();
            }
        }
        for (int z = 0 ; z < stolbec ; z++){
            int maximumstr = 0;
            int krasota = z + 1;
            for (int j = 0 ; j < stroka ; j ++){
                if (matrix[z][j] > maximumstr){
                    maximumstr = matrix[z][j];
                }
            }
            System.out.println("Максимум для " + krasota + " строки: " + maximumstr);
        }
        for (int x = 0 ; x < stroka ; x++){
            int maximumstolb = 0;
            int krasota = x + 1;
            for (int j = 0 ; j < stolbec ; j ++){
                if (matrix[j][x] > maximumstolb){
                    maximumstolb = matrix[j][x];
                }
            }
            System.out.println("Максимум для " + krasota + " столбца: " + maximumstolb);
        }
        enter.close();
    }
}