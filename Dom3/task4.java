package Dom3;
import java.util.Scanner;
public class task4{
    public static void main(String[] args){
        Scanner enter = new Scanner (System.in);
        int n = enter.nextInt();
        int[][]matrix = new int[n][n];
        for (int i = 0 ; i < n ; i++){
            for (int x = 0 ; x < n ; x++){
                matrix[i][x] = 0;
            }
        }
        for (int z = 0 ; z < n ; z++){
            for (int w = 0 ; w < n ; w ++){
                if (z == w){
                    matrix[z][w] = 1;
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
