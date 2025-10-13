import java.util.Scanner;

public class task2{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String bukvi = "aeiouy";
        int str = scanner.nextInt();
        int stol = scanner.nextInt();
        String[][] array = new String[str][stol];
        int c = 0;
        int fin = 0;
        for(int i = 0; i < str; i++){
            for(int j = 0; j < stol; j++) {
                System.out.print("Напиши что будет стоять на месте [" + i + "] [" + j + "]" + " : ");
                array[i][j] = scanner.next();
            }
        }

        for(int i = 0; i < stol; i++){
            for(int j = 0; j < str; j++) {
                if (bukvi.contains(array[j][i].charAt(0) + "")){
                    c++;
                }
            }
            if(c >= 1){
                fin++;
                c = 0;
            }
        }
        
        for(int i = 0; i < str; i++){
            for(int j = 0; j < stol; j++){
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }

        if(fin == stol){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}
