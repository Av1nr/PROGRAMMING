import java.util.Scanner;

public class task11{
    public static void main(String[] args){
        Scanner enter = new Scanner(System.in);
        System.out.print("Введите размер вашей квадратной матрицы:");
        int kvadr = enter.nextInt();
        int count = 0;
        int[][] matrix = new int[kvadr][kvadr];
        for (int i = 0 ; i < kvadr ; i++){
            for (int j = 0 ; j < kvadr ; j++){
                System.out.println("Введите число для [" + i  + "] [" + j  + "] индекса");
                matrix[i][j] = enter.nextInt();
            }
        }
        for (int i = 0 ; i < kvadr ; i++){
            for ( int j = 0 ; j < kvadr ; j++){
                if ((i != j) && (matrix[i][j] == 0)){
                    count += 1;
                }
            }
        }
        for (int i = 0 ; i < kvadr ; i++){
            for (int j = 0 ; j < kvadr ; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        if (count == kvadr * kvadr - kvadr){
            System.out.println("Chetko");
        }
        else{
            System.out.println("Ne chentko");
        }
        enter.close();
    }
}