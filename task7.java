import java.util.Scanner;

public class task7{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String slovo = scanner.nextLine();
        int c = 0;
        for(int i = 0; i < slovo.length(); i++){
            if(slovo.charAt(i) == 'a'){
                c++;
            }
        }
        System.out.println(c);
    }
}
