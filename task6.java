import java.util.Scanner;

public class task6{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String slovo = scanner.nextLine();
        int c = 0;
        for(int i = 0; i < slovo.length(); i++){
            if(slovo.charAt(i) == slovo.charAt(slovo.length() - i - 1)){
                c++;
            }
        }
        if(c == slovo.length()){
            System.out.println("DA");
        } else{
            System.out.println("NONONO");
        }
    }
}
