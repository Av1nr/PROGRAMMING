import java.util.Scanner;

public class Task2{
	public static void main(String[] args){
		Scanner vvod = new Scanner(System.in);
		float chisl1 = vvod.nextFloat();
		float chisl2 = vvod.nextFloat();
		if (chisl1 > chisl2){
			System.out.println(chisl1 + " Naibolshee");
		}else if (chisl1 < chisl2){
			System.out.println(chisl2 + " Naibolshee");
		}else{
			System.out.println("Chisla ravni");
        }
		vvod.close();
	}
}