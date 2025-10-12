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
            int z = zapomnin;
            String slovo = "";
            while (number > 0){
                slovo = letters.charAt(number % 10) + slovo;
                number /= 10;
            }
            if (slovo.length() < z){
                while (z > 0){
                    slovo = "a" + slovo;
                    z--;
                    if (slovo.length() >= zapomnin){
                        break;
                    }
                    System.out.print(slovo + "  ");
                }
            }
            if (slovo.length() >= zapomnin){ 
                System.out.print(slovo + "  ");
            }
        }
        enter.close();
    }
}
