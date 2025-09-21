package Dom2;
import java.util.Scanner;

public class Task1{
    public static void main(String[] args){
        Scanner enter = new Scanner(System.in);
        int chislom = enter.nextInt();
        int chislon = enter.nextInt();
        for (int iznach = 0; iznach < chislom; iznach++){
            System.out.print("1");
        }
        System.out.println();
        for (int chislo = 0; chislo < chislon - 2; chislo++){
            String popa = "";
            for (int iznach2 = 0 ; iznach2 < chislom - 2; iznach2++){
                popa += " ";
            }popa = "1" + popa + "1";
            System.out.println(popa);
        }for (int iznach3 = 0; iznach3 < chislom; iznach3++){

            System.out.print("1");
        }enter.close();
    }
}