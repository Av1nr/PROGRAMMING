import java.util.Scanner;

public class task5 {
    public static void main(String[] args){
        Scanner enter = new Scanner(System.in);
        System.out.print("Введите длину строки: ");
        int stroka = enter.nextInt();
        int[] matrix = new int[stroka];
        for (int i = 0 ; stroka > i ; i++ ){
            System.out.print("Введите число ["+ i + "] индеса: ");
            matrix[i] = enter.nextInt();
        }
        for (int i = 0 ; stroka > i ; i++){
            if (matrix[i] < 0){
                matrix[i] = 0;
            }
        }
        for (int z = 0 ; z < stroka ; z++){
            System.out.print(matrix[z] + " ");
        }
        enter.close();
    }
}
