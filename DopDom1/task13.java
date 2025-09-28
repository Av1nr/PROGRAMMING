import java.util.Scanner;

public class task13 {
    public static void main(String[] args){
        Scanner enter = new Scanner(System.in);
        System.out.print("Введите размер матрицы(нечетные): ");
        int n = enter.nextInt();
        int summa = 0;
        int[][] matrix = new int[n][n];
        for (int i = 0 ; i < n ; i++){
            for (int j = 0 ; j < n ; j++){
                System.out.print("Введите число для [" + i + "] [" + j + "] индекса: ");
                matrix[i][j] = enter.nextInt();
            }
        }
        for (int i = 0 ; i < n ; i++){
            for (int j = 0 ; j < n ; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0 ; i < n ; i++){
            for (int j = 0 ; j < n ; j++){
                if ((i + 1 == n/2 + 1) && (j + 1 == n / 2 + 1)){
                }
                else{
                    summa += matrix[i][j];
                }
            }
        }
        System.out.println("Сумма равна: " + summa);
        enter.close();
    }
}
