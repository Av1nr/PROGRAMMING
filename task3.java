import java.util.Scanner;
public class task3{
    public static void main(String[] args){
        int razmer = 2;
        String[][] matrix = new String[razmer][razmer];
        boolean flag = false;
        int number = 1;
        int count = 0;
        Scanner enter = new Scanner(System.in);
        for (int i = 0 ; i < razmer ; i++){
            for (int j = 0 ; j < razmer ; j++){
                System.out.print("Введите " + number + " слово: ");
                matrix[i][j] = enter.nextLine();
                number++;
            }
        }
        for (int i = 0 ; i < razmer ; i++){
            for (int j = 0 ; j < razmer ; j++){
                String slovo = matrix[i][j];
                int dlinaslova = slovo.length();
                char lastbukva = slovo.charAt(dlinaslova - 1);
                if (lastbukva == 'a' || lastbukva == 'i' || lastbukva == 'e' || lastbukva == 'o' || lastbukva == 'u' || lastbukva == 'y'){
                    count += 1;
                }
                if (lastbukva == 'а' || lastbukva == 'е' || lastbukva == 'ё' || lastbukva == 'и' || lastbukva == 'о' || lastbukva == 'у' || lastbukva == 'ы' || lastbukva == 'э' || lastbukva == 'ю' || lastbukva == 'я' ){
                    count += 1;
                }
            }
            if (count >= 1){
                flag = true;
                count = 0;
            }
            else{
                flag = false;
                break;
            }
        }
        System.out.println(flag);
        enter.close();
    }
}
