import java.util.Scanner;

public class task9 {
    public static void main(String[] args){
        Scanner enter = new Scanner(System.in);
        System.out.print("Введите высоту матрицы: ");
        int stolbec = enter.nextInt();
        System.out.print("Введите длину матрицы: ");
        int stroka = enter.nextInt();
        int[][] matrix = new int[stolbec][stroka];
        for (int i = 0 ; i < stolbec ; i++){
            for (int j = 0 ; j < stroka ; j++){
                System.out.println("Введите число для [" + i + "] [" + j + "] индекса");
                matrix[i][j] = enter.nextInt();
            }
        }
        for (int i = 0 ; i < stolbec ; i++){
            for (int j = 0 ; j < stroka ; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Преобразую в ");
        System.out.println();
        for (int i = 0 ; i < stolbec ; i++){
            for (int j = 0 ; j < stroka ; j++){
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
        enter.close();
    }
}