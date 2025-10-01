import java.util.Scanner;

public class task2{
    public static void main(String[] args){
        Scanner enter = new Scanner(System.in);
        System.out.print("Введите высоту матрицы: ");
        int stroka = enter.nextInt();
        System.out.print("Введите ширину матрицы: ");
        int stolbec = enter.nextInt();
        int flag = 1;
        int finallcount = 0;
        int[][]matrix = new int[stroka][stolbec];
        for (int i = 0 ; stroka > i ; i++){
            for (int j = 0 ; stolbec > j ; j++){
                System.out.print("Введите число для индекса[" + i + "] [" + j + "]: ");
                matrix[i][j] = enter.nextInt();
            }
        }
        for (int j = 0 ; stolbec > j ; j++){
            for (int i = 0 ; stroka > i ; i++){
                int summa = 0;
                int summa2 = 0;
                if (i < stroka - 1){
                    int chislo1 = matrix[i][j];
                    int chislo2 = matrix[i + 1][j];
                    while (chislo1 > 0){
                        summa += chislo1 % 10;
                        chislo1 /= 10;
                    }
                    while (chislo2 > 0){
                        summa2 += chislo2 % 10;
                        chislo2 /= 10;
                    }
                }
                if (summa == summa2){
                    flag *= 1;
                }
                else {
                    flag *= 0;
                    break;
                }
            }
            if (flag == 1){
                finallcount ++;
            }
        }
        if (finallcount >= 1){
            System.out.print("Все четко");
        }
        else{
            System.out.print("Все не четко");
        }
        enter.close();
    }
}