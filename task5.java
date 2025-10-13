import java.util.Scanner;
public class task1{
    public static void main(String[] args){
        Scanner enter = new Scanner(System.in);
        String slovo = enter.nextLine();
        slovo = Trim(slovo);
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
    public static String Trim(String str){
        int counter = 0;
        String konec = "";
        int secondc = str.length() - 1;
        while (str.charAt(counter) == ' '){
            konec = "";
            counter++;
        }
        while (str.charAt(secondc) == ' '){
            konec = "";
            secondc--;
        }
        for (int i = counter ; i < secondc + 1; i ++){
            konec = konec + str.charAt(i);
        }
        
        return konec;
    }
}
