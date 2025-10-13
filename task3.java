import java.util.Scanner;

public class task3{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String predl = scanner.nextLine().trim();
        String bukvi = "уеёыаоэяию";
        int c = 0;
        int fin = 0;
        for (int i = 0; i < predl.length(); i++){
            if (bukvi.contains(predl.charAt(i) + "")){
                fin++;
            }
        }
        if(fin == 3){
            System.out.println(true);
        } else{
            System.out.println(false);
        }
    }
}
