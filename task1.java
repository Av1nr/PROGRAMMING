import java.util.Scanner;
public class task1{
    public static void main(String[] args){
        Scanner enter = new Scanner(System.in);
        int razmer = enter.nextInt();
        int[] matrix = new int[razmer];
        int counterchet = 0;
        int counternechet = 0;
        for (int i = 0 ; i < razmer ; i++){
            int number = i + 1;
            System.out.print("Vvedite chislo " + number + ": ");
            matrix[i] = enter.nextInt();
        }
        for (int i = 0 ; i < razmer ; i++){
            if (matrix[i] % 2 == 0){
                counterchet ++;
            }
            else{
                counternechet++;
            }
        }
        if (counterchet == counternechet){
            System.out.println("Oni ravni");
        }
        else{
            System.out.println("Oni ne ravni");
        }
        enter.close();
    }
}