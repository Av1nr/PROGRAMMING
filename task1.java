import java.util.Scanner;
public class task1{
    public static void main(String[] args){
        Scanner enter = new Scanner(System.in);
        String slovo = enter.nextLine();
        String newslovo = "";
        for (int i = 0 ; i < slovo.length() ; i++){
            char bukva = slovo.charAt(i);
            if (bukva != ' ' && bukva != '.' && bukva != ',' && bukva != ':'){
                newslovo = newslovo + ToLower(slovo.charAt(i));
            }
        }
        int count = 0;
        for (int i = 0 ; i < newslovo.length() ; i++){
            if (newslovo.charAt(i) != newslovo.charAt(newslovo.length() - 1 - i)){
                count++;
            }  
        }
        if (count == 0){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
    public static char ToLower(char x){
        if ('A' <= x && x <= 'Z'){
            int y = x + 32;
            return (char) y;
        }
        else{
            return x;
        }
    }
}
