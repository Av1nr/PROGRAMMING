import java.util.Scanner;

public class task15 {
    public static void main(String[] args){
        Scanner enter = new Scanner(System.in);
        System.out.print("Введите размер квадрятной матрицы: ");
        int n = enter.nextInt();
        int maincounter = 0;
        int[][] matrix = new int[n][n];
        for (int i = 0 ; i < n ; i ++){
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
        int counter7 = 0; 
        for (int i = 0 ; i < n ; i++){
            for (int j = 0 ; j < n ; j++){
                int summacifr = 0;
                while (matrix[i][j] > 0){
                    summacifr += matrix[i][j] % 10;
                    matrix[i][j] /= 10;
                }
                if (summacifr % 7 == 0){
                    counter7++;
                }
            }
            if (counter7 >= 1){
                maincounter += 1;
                counter7 = 0;
            }
        }
        if (maincounter == n){
            System.out.println("Все как надо , БОСС");
        }
        else{
            System.out.println("Мы в дерьме");
        }
        enter.close();
    }
}
