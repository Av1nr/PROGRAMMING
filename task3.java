import java.util.Scanner;

public class task3 {
    public static void main(String[] args){
        Scanner enter = new Scanner(System.in);
        System.out.print("Введите высоту матрицы: ");
        int stroka = enter.nextInt();
        System.out.print("Введите ширину матрицы: ");
        int stolbec = enter.nextInt();
        int flag = 1;
        int[][]matrix = new int[stroka][stolbec];
        for (int i = 0 ; stroka > i ; i++){
            for (int j = 0 ; stolbec > j ; j++){
                System.out.print("Введите число для индекса[" + i + "] [" + j + "]: ");
                matrix[i][j] = enter.nextInt();
            }
        }
        for (int i = 0 ; i < stroka ; i++){
            int counter = 0;
            for (int j = 0 ; j < stolbec ; j++){
                int summa = 0;
                int chislo = matrix[i][j];
                while (chislo > 0){
                    summa += chislo % 10;
                    chislo /= 10;
                }
                if ((Prostoe(matrix[i][j]) == true) && ((Prostoe(summa) == true))){
                    counter++;
                }
            }
            if (counter == 1){
                flag *= 1;
            }
            else{
                flag *= 0;
            }
        }
        if(flag == 1){
            System.out.println("Vse po planu");
        }
        else{
            System.out.println("Vot der'mo");
        }
        enter.close();
    }
    public static boolean Prostoe(int x){
        int count = 0;
            for(int j = 1; j < x; j++){
                if (x % j == 0){
                    count++;
                }
        }
        if (count == 1){
            return true;
        }
        else{
            return false;
        }
    }
}