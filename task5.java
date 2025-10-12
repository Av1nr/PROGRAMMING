import java.util.Scanner;
public class task5 {
    public static void main (String[] args){
        Scanner enter = new Scanner(System.in);
        System.out.print("Введите длину матрицы: ");
        int matrixsized = enter.nextInt();
        System.out.print("Введите ширину матрицы: ");
        int matrixsizesh = enter.nextInt();
        enter.nextLine();
        String[][] matrix = new String[matrixsizesh][matrixsized];
        String[][] matrix2 = new String[matrixsized][matrixsizesh];

        for (int i = 0 ; i < matrixsizesh ; i++){
            for (int j = 0 ; j < matrixsized ;j++){
                matrix[i][j] = enter.nextLine();
            }
        }
        for (int i = 0 ; i < matrixsizesh ; i++){
            for (int j = 0 ;j < matrixsized ;j ++){
                matrix2[j][i] = matrix[i][j];
            }
        }
        for (int i = 0 ; i < matrixsized ; i++){
            for (int j = 0 ; j < matrixsizesh ; j++){
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }
        enter.close();
    }
}
