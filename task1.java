import java.util.Scanner;
public class task1{
    public static void main(String[] args){
        Scanner enter = new Scanner(System.in);
        System.out.print("Введите высоту матрицы: ");
        int stroka = enter.nextInt();
        System.out.print("Введите ширину матрицы: ");
        int stolbec = enter.nextInt();
        int counter = 0;
        int flag = 0;
        int finallcount = 0;
        int[][]matrix = new int[stroka][stolbec];
        for (int i = 0 ; stroka > i ; i++){
            for (int j = 0 ; stolbec > j ; j++){
                System.out.print("Введите число для индекса[" + i + "] [" + j + "]: ");
                matrix[i][j] = enter.nextInt();
            }
        }
        for (int i = 0 ; stroka > i ; i++){
            for (int j = 0 ; stolbec > j ; j++){
                float koef = 0.1f;
                int chislo = matrix[i][j];
                while (chislo > 0){
                    koef *= 10;
                    chislo /= 10;
                }
                int koefint = (int) koef;
                while (matrix[i][j] > 0){
                    if ((matrix[i][j] / koefint) == (matrix[i][j] % 10)){
                        matrix[i][j] /= 10;
                        matrix[i][j] %= 10;
                        flag = 1;
                    }
                    else if (((matrix[i][j] / 10) == 0)){
                        flag = 1;
                        break;
                    }
                    else{
                        flag = 0;
                        break;
                    }
                }

                if (flag == 1){
                    counter++;
                }
            }
            if (counter == 1){
                finallcount++;
                counter = 0;
            }
        }
        if (finallcount == stroka){
            System.out.println("В каждой строке есть число палендром");
        }
        else{
            System.out.println("Не в каждой  , или нет вообще , или больше одного");
        }
        enter.close();
    }
}