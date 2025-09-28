import java.util.Scanner;

public class task12{
    public static void main(String[] args){
        Scanner enter = new Scanner(System.in);
        System.out.print("Введите размер квадратной матрицы: ");
        int kvadr = enter.nextInt();
        int[][] matrix = new int[kvadr][kvadr];
        System.out.println();
        for (int i = 0 ; i < kvadr ; i++){
            for (int j = 0 ; j < kvadr ; j++){
                System.out.print("Введите число для [" + i + "] [" + j + "] индекса: ");
                matrix[i][j] = enter.nextInt();
            }
        }
        System.out.println();
        for (int i = 0 ; i < kvadr ; i++){
            for (int j = 0 ; j < kvadr ; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Преобразую в ");
        System.out.println();
        for (int i = 0 ; i < kvadr ; i ++){
            for (int j = 0 ; j < kvadr ; j++){
                if (i == j){
                    matrix[i][j] = 1;
                }
                else{
                    matrix[i][j] = 2;
                }
            }
        }
        for (int i = 0 ; i < kvadr ; i++){
            for (int j = 0 ; j < kvadr ; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        enter.close();
    }
}