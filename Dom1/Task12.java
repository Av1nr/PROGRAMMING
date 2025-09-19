import java.util.Scanner;

public class Task12{
    public static void main (String[] args){
        Scanner vvod = new Scanner(System.in);
        int chislov10 = vvod.nextInt();
        String chislov2 = "";
        while (chislov10 > 0) {
            String pervchislov2 = String.valueOf(chislov10 % 2);
            chislov2 = pervchislov2 + chislov2;
            chislov10 = chislov10 / 2;
        } {
            System.out.println(chislov2);
        }
    }
}