package Dom2;
import java.util.Scanner;

public class task5{
    public static void main(String[]args){
        Scanner enter = new Scanner(System.in);
        int skokfaktorialov = enter.nextInt();
        int nachtoumn = 1;
        int summa = 0;
        for (int stremlusk = 0 ; stremlusk < skokfaktorialov ; stremlusk ++ ){
            nachtoumn = (stremlusk + 1) * nachtoumn;
            summa += nachtoumn;

        }
        System.out.println(summa);
        enter.close();
    }
}