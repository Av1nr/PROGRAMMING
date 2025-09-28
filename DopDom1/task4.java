import java.util.Scanner;

public class task4 {
    public static void main(String[] args){
        Scanner enter = new Scanner(System.in);
        System.out.print("Введите длину строки: ");
        int stroka = enter.nextInt();
        int[] matrix = new int[stroka];
        for (int i = 0 ; stroka > i ; i++ ){
            System.out.print("Введите число ["+ i + "] индеса: ");
            matrix[i] = enter.nextInt();
        }
        for (int x = 1 ; x < stroka ; x++){
            if (matrix[x] > matrix[x - 1]){
                if (x == stroka - 1){
                    System.out.println("Vse chetko bratan");
                }
            }
            else{
                System.out.println("Unluck dryg");
                break;
            }
        }
        enter.close();
    }
}
