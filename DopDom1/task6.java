import java.util.Scanner;

public class task6 {
    public static void main(String[] args){
        Scanner enter = new Scanner(System.in);
        System.out.print("Введите длину строки: ");
        int stroka = enter.nextInt();
        int[] matrix = new int[stroka];
        int proiz = 1;
        for (int i = 0 ; stroka > i ; i++ ){
            System.out.print("Введите число ["+ i + "] индеса: ");
            matrix[i] = enter.nextInt();
        }
        for (int i = 0 ; stroka > i ; i++){
            if(matrix[i] != 0 ){
                proiz *= matrix[i];
            }
        }
        System.out.println("Произведение равно: " + proiz);
        enter.close();
    }
}