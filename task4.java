import java.util.Scanner;

public class task4{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String predl = scanner.nextLine().trim();
        String bukvi = "уеёыаоэяию";
        int c = 0;
        int fin = 0;
        for(int i = 0; i < predl.length(); i++){
            for (int j = 0; j < bukvi.length(); j++){
                if(predl.charAt(i) == bukvi.charAt(j)) {
                    c++;
                }
            }if (c >= 1){
                fin++;
                c = 0;
            }
        }
        if(fin == predl.length()){
            System.out.println(true);
        } else{
            System.out.println(false);
        }
    }
}
