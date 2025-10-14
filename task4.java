import java.util.Scanner;
public class task4 {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        String slovo = enter.nextLine();
        String newslovo = "";
        boolean flag = false;
        for (int i = 0 ; i < slovo.length() ; i++){
            char bukva = slovo.charAt(i);
            if (bukva != ' ' && bukva != '.' && bukva != ',' && bukva != ':'){
                newslovo = newslovo + ToLower(slovo.charAt(i));
            }
        }
        for(int i = 0 ; i < newslovo.length() - 1; i++){
            char bukva = newslovo.charAt(i);
            char nextbukva = newslovo.charAt(i + 1);
            if ((bukva == 'a' || bukva == 'i' || bukva == 'e' || bukva == 'o' || bukva == 'u' || bukva == 'y') && (nextbukva != 'a' || nextbukva != 'i' || nextbukva != 'e' || nextbukva != 'o' || nextbukva != 'u' || nextbukva != 'y')){
                flag = true;
            }
            else if ((bukva != 'a' || bukva != 'i' || bukva != 'e' || bukva != 'o' || bukva != 'u' || bukva != 'y') && (nextbukva == 'a' || nextbukva == 'i' || nextbukva == 'e' || nextbukva == 'o' || nextbukva == 'u' || nextbukva == 'y')){
                flag = true;
            }
            else{
                flag = false;
                break;
            }
        }
        System.out.println(flag);
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
