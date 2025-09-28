import java.util.Scanner;

public class task8 {
    public static void main(String[] args){
        Scanner enter = new Scanner(System.in);
        System.out.print("Введите длину матрицы: ");
        int stroka = enter.nextInt();
        System.out.print("Введите высоту матрицы: ");
        int stolbec = enter.nextInt();
        int[][] matrix = new int[stolbec][stroka];
        for(int i = 0 ; i < stolbec ; i++){
            for (int j = 0 ; j < stroka ; j++){
                System.out.println("Введите число для [" + i + "] [" + j + "]индекса");
                matrix[i][j] = enter.nextInt();
            }
        }
        for (int z = 0 ; z < stolbec ; z++){
            int summa = 0;
            for (int m = 0 ; m < stroka ; m ++){
                summa += matrix[z][m];
            }
            System.out.println("Для " + z + 1 +" строки сумма будет равна: " + summa);
        }
        enter.close();
    }
}