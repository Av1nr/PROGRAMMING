package Dom3;
import java.util.Scanner;

public class task5 {
    public static void main(String[] args){
        Scanner enter = new Scanner(System.in);
        int n = enter.nextInt();
        int[][]matrix = new int[n][n];
        for (int i = 0 ; i < n ; i++){
            for (int j = 0 ; j < n ; j++){
                if ((i + j) % 2 == 0){
                    matrix[i][j] = 1;
                }
                else{
                    matrix[i][j] = 0;
                }
            }
        }
            for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        enter.close();
    }
}
