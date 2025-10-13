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
        newslovo = newslovo.toLowerCase();
        boolean flag = false;
        for (int i = 0 ; i < newslovo.length() ; i++){
            if (newslovo.charAt(i) == newslovo.charAt(newslovo.length() - 1 - i)){
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
}

