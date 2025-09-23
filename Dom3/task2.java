package Dom3;
import java.util.Scanner;
public class task2{
    public static void main(String[] args){
        Scanner enter = new Scanner(System.in);
        int stroka = enter.nextInt();
        int stolbec = enter.nextInt();
        int zapopucount = 0;
        int[][]matrix = new int[stroka][stolbec];
        for (int i = 0 ; stroka > i ; i++){
            for (int j = 0 ; stolbec > j ; j++){
                System.out.println("Введите число для индекса[" + i + "] [" + j + "]");
                matrix[i][j] = enter.nextInt();
            }
        }
        for (int z = 0 ; stroka > z ; z++){
            int count = 0;
            int chcount = 0;
            int kratncount = 0;
            for (int x = 0 ; stolbec > x ; x++){
                while (matrix[z][x] > 0 ){
                    if (matrix[z][x] % 10 % 2 == 0){
                        kratncount++;
                    }matrix[z][x] /= 10;
                    chcount++;
                }if (chcount == kratncount++){
                    count++;
                    chcount = 0;
                    kratncount = 0;
                }
            }
            if (count == 1){
                zapopucount++;
                count = 0;
            }
        }
        if (zapopucount == stroka){
            System.out.println("Iba chetenko");
        }
        else{
            System.out.println("Iba ne chetenko");
        }
    }
}
