import java.util.Scanner;
public class task4 {
    public static void main(String[] args){
        Scanner enter = new Scanner(System.in);
        int n = enter.nextInt();
        int zapomnin = n;
        int razmer = 1;
        while (n > 0){
            razmer *= 10;
            n--;
        }
        String letters = "аеёиоуыэюя";
        for(int i = 0 ; i < razmer ; i++){
            int number = i;
            String slovo = "";
            while (number > 0){
                slovo = letters.charAt(number % 10) + slovo;
                number /= 10;
            }
            
            if (slovo.length() == zapomnin){ 
                System.out.print(slovo + "  ");
            }
            else{
                while (slovo.length() < zapomnin){
                    slovo = "a" + slovo;
                }
                System.out.print(slovo + "  ");
            }
        }
        enter.close();
    }
}
