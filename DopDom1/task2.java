import java.util.Scanner;

public class task2{
    public static void main(String[] args){
        Scanner enter = new Scanner(System.in);
        int matrrazm = enter.nextInt();
        int[] matrix = new int[matrrazm];
        int counterchet = 0;
        int counternechet = 0;
        for (int i = 0 ; matrrazm > i ; i++){
            System.out.println("Введите число для [" + i + "] индекса");
            matrix[i] = enter.nextInt();
            if (matrix[i] % 2 == 0){
                counterchet++;
            }
            else{
                counternechet++;
            }
        }
        System.out.println("В вашем массиве " + counterchet + " четных");
        System.out.println("В вашем массиве " + counternechet + " нечетных");
        enter.close();
    }
}