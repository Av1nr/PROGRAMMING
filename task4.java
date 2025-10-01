import java.util.Scanner;

public class task4 {
    public static void main(String[] args){
        Scanner enter = new Scanner(System.in);
        System.out.print("Введите высоту матрицы: ");
        int stroka = enter.nextInt();
        System.out.print("Введите ширину матрицы: ");
        int stolbec = enter.nextInt();
        int flag = 1;
        int strokacount = 0;
        int[][]matrix = new int[stroka][stolbec];
        for (int i = 0 ; stroka > i ; i++){
            for (int j = 0 ; stolbec > j ; j++){
                System.out.print("Введите число для индекса[" + i + "] [" + j + "]: ");
                matrix[i][j] = enter.nextInt();
            }
        }
        for (int i = 0 ; stroka > i ; i++){
            for (int j = 0 ; j < stolbec ; j++){
                int zapomni = matrix[i][j] % 10;
                int chislo = matrix[i][j];
                int dlina = 0;
                int counter = 0;
                matrix[i][j] /= 10;
                while (chislo > 0){
                    chislo /= 10;
                    dlina++;
                }
                while (matrix[i][j] > 0){
                    if (zapomni > matrix[i][j] % 10){
                        zapomni = matrix[i][j] % 10;
                        matrix[i][j] /= 10;
                        counter++;
                    }
                    else{
                        break;
                    }
                }
                if (counter == dlina - 1){
                    strokacount++;
                }
            }
            if (strokacount == 2){
                flag *= 1;
                strokacount = 0;
            }
            else{
                flag *= 0;
            }
        }
        if (flag == 1){
            System.out.println("Kak nado");
        }
        else{
            System.out.println("Tak ne nado , davai zanovo");
        }
        enter.close();
    }
}
