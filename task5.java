import java.util.Scanner;

public class task5{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String predl = scanner.nextLine().trim();
        int c = 1;
        for (int i = 0; i < predl.length(); i++){
            if(predl.charAt(i) == ' '){
                c++;
            }
        }
        System.out.println(c);
    }
}
