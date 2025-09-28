import java.util.Scanner;

public class task14 {
    public static void main(String[] args){
        Scanner enter = new Scanner(System.in);
        System.out.print("Введите длину первой строки: ");
        int strokam1 = enter.nextInt();
        System.out.print("Введите длину первого столбца: ");
        int stolbecm1 = enter.nextInt();
        System.out.print("Введите длину второй строки: ");
        int strokam2 = enter.nextInt();
        System.out.print("Введите длину второго столбца: ");
        int stolbecm2 = enter.nextInt();
        int[][] matrix1 = new int[strokam1][stolbecm1];
        int[][] matrix2 = new int[strokam2][stolbecm2];
        int[][] matrix3 = new int[strokam1][stolbecm1 + stolbecm2];
        for (int i = 0 ; i < strokam1 ; i++){
            for (int j = 0 ; j < stolbecm1 ; j++){
                System.out.print("Для первой матрицы число под [" + i + "] [" + j + "] индексом: ");
                matrix1[i][j] = enter.nextInt();
            }
            System.out.println();
        }
        for (int i = 0 ; i < strokam1 ; i++){
            for (int j = 0 ; j < stolbecm1 ; j++){
                System.out.print("Для второй матрицы число под [" + i + "] [" + j + "] индексом: ");
                matrix2[i][j] = enter.nextInt();
            }
            System.out.println();
        }
        for (int i = 0 ; i < strokam1 ; i++){
            for (int j = 0 ; j < (stolbecm1 + stolbecm2) ; j++){
                if (j % 2 == 0){
                    matrix3[i][j] = matrix1[i][j / 2];
                }
                else{
                    matrix3[i][j] = matrix2[i][j / 2];
                }
            }
        }
        for (int i = 0 ; i < strokam1 ; i++){
            for (int j = 0 ; j < stolbecm1 + stolbecm2 ; j++){
                System.out.print(matrix3[i][j]);
            }
            System.out.println();
        }
        enter.close();
    }
}
