import java.util.Scanner;
public class task1{
    public static void main(String[] args){
        Scanner enter = new Scanner(System.in);
        String slovo = enter.nextLine();
        String newslovo = "";
        for (int i = 0 ; i < slovo.length() ; i++){
            char bukva = slovo.charAt(i);
            if (bukva != ' ' && bukva != '.' && bukva != ',' && bukva != ':'){
                newslovo = slovo.charAt(i) + newslovo;
            }
        }
        boolean flag = false;
        for (int i = 0 ; i < newslovo.length() ; i++){
            if (ToLower(newslovo.charAt(i)) == ToLower(newslovo.charAt(newslovo.length() - 1 - i))){
                flag = true;
            }
            else{
                flag = false;
            }
        }
        enter.close();
        System.out.println(newslovo);
        System.out.println(flag);
    }
    public static char ToLower(char x){
        if ('A' <= x && x >= 'Z'){
            int y = x;
            y = y + 32;
            return (char) y;
        }
        else{
            return x;
        }
    }
}
