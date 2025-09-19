import java.util.Scanner;

public class Task4{
	public static void main (String[] args){
		Scanner chislo = new Scanner(System.in);
		float chisl1 = chislo.nextFloat();
		float chisl2 = chislo.nextFloat();
		if (chisl1 == chisl2){
			System.out.println("Chisla ravni bratan");
		}else{
			System.out.println("Chisla ne ravni bratan");
		}
		chislo.close();
	}
} 