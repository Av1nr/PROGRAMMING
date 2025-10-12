import java.util.Scanner;

public class task6 {
    public static void main(String[] args){
        Scanner enter = new Scanner(System.in);
        System.out.print("Введите размер квадратной матрицы: ");
        int n = enter.nextInt();
        int centermatrix = n/2;
        int[][]matrix1 = new int[n][n];
        int[][]matrix2 = new int[n / 2][n];
        int[][]matrix3 = new int[n][n];
        for (int i = 0 ; i < n ; i++){
            for (int j = 0 ; j < n ; j ++){
                int ci = centermatrix - i;
                if (ci < 0 ){
                    ci = -ci;
                }
                int cj = centermatrix - j;
                if (cj < 0){
                    cj = -cj;
                }
                if ((ci + cj) <= centermatrix) {
                    matrix1[i][j] = 1;
                }
            }
        }
        for (int i = 0 ; i < n ; i++){
            for (int j = 0 ; j < n ; j++){
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }
        enter.close();
    }

}
