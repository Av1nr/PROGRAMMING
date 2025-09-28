import java.util.Scanner;

public class task3 {
    public static void main(String[] args){
        Scanner enter = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int n = enter.nextInt();
        int[] matrix = new int[n];
        for (int i = 0 ; i < n ; i++){
            System.out.print("Введите число для [" + i + "] индекса: ");
            matrix[i] = enter.nextInt();
        }
        int[] matrix2 = new int[n];
        matrix2[0] = matrix[n - 1];
        for (int x = 1 ; x < n ; x++){
            matrix2[x] = matrix[x - 1];
        }
        for (int z = 0 ; z < n ; z++){
            System.out.print(matrix[z] + " ");
        }
        System.out.println();
        System.out.println("Преобразую в ");
        for (int z = 0 ; z < n ; z++){
            System.out.print(matrix2[z] + " ");
        }
        enter.close();
    }
}