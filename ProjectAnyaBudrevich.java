import java.util.Scanner;
public class ProjectAnyaBudrevich{
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        String name = enter.nextLine();
        if (name.matches("[A-ZА-Я]{1}[a-zа-я]+")){
            System.out.println(name + " :Correct name");
        }
        else{
            System.out.println("Wrong name");
        }
    }
}
