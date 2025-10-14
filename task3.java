import java.util.Scanner;
public class task3 {
    public static void main(String[] args){
        Scanner enter = new Scanner(System.in);
        int n = enter.nextInt();
        int[][] matrix = new int[n][n];
        int[] maximassiv = new int [n];
        int maxisumma = 0;
        for (int i = 0 ; i < n ; i++){
            for (int j = 0 ; j < n ; j++){
                System.out.print("Vvedite chislo dlya [" + i + "] index: ");
                matrix[i][j] = enter.nextInt();
            }
        }
        for(int i = 0 ; i < n ; i++){
            int summa = 0;
            for ( int j = 0 ; j < n ; j++){
                summa += matrix[i][j];
            }
            if (summa > maxisumma){
                maximassiv = matrix[i];
            }
        }
        for(int i = 0 ; i < n ; i++){
            System.out.print(maximassiv[i] + " ");
        }
    }
}
