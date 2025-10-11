import java.util.Scanner;
public class task1{
    public static void main(String[] args){
        Scanner enter = new Scanner(System.in);
        String slovo = enter.nextLine();
        slovo = slovo.replaceAll(" ", "");
        slovo = slovo.toLowerCase();
        boolean flag = false;
        for (int i = 0 ; i < slovo.length() ; i++){
            if (slovo.charAt(i) == slovo.charAt(slovo.length() - 1 - i)){
                flag = true;
            }
        }
        enter.close();
        System.out.println(flag);
    }
}