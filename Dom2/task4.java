package Dom2;

import java.util.Scanner;

public class task4{
    public static void main(String[] args){
        Scanner enter = new Scanner(System.in);
        int summa = 0;
        int koldvoek = enter.nextInt();
        int koef = 1;
        for (int stremlusk = 1 ; koldvoek  >= stremlusk; stremlusk ++){
            summa += (2 * koef);
            koef *= 2;
        }
        System.out.println(summa);
        enter.close();
    }
}