import java.util.Scanner;

public class Task13{
	public static void main(String[] args){
		Scanner vvodchisla = new Scanner(System.in);
		int zapomni = -1;
		int chislo = 0;
		while (chislo > zapomni){
			zapomni = chislo;
			chislo = vvodchisla.nextInt();
		}
	}
}