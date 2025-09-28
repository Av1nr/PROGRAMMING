import java.util.Scanner;

public class task7 {
    public static void main(String[] args){
        Scanner enter = new Scanner(System.in);
        System.out.print("Введите длину строки: ");
        int stroka = enter.nextInt();
        int[] matrix = new int[stroka];
        System.out.print("диапазон [a, b] a: ");
        int a = enter.nextInt();
        System.out.print("диапазон [a, b] b: ");
        int b = enter.nextInt();
        int counter = 0;
        for (int i = 0 ; stroka > i ; i++ ){
            System.out.print("Введите число ["+ i + "] индеса: ");
            matrix[i] = enter.nextInt();
        }
        for (int i = 0 ; stroka > i ; i++){
            if ((a <= matrix[i]) && (matrix[i] <= b)){
                counter++;
            }
        }
        System.out.println("Вот столько попадают в диапозон [a, b]: " + counter);
        enter.close();
    }
}
