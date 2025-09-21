package Dom2;

import java.util.Scanner;

public class task3{
    public static void main(String[] args){
        int summa = 0;
        Scanner enter = new Scanner(System.in);
        int num = enter.nextInt();
        int schetchik = num;
        for (int i = 1 ; i < schetchik + 1 ; i++ ){
            summa += num;
            num = num * schetchik; 
        }
        System.out.println(summa);
        enter.close();
    }
}