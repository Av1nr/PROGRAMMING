import java.util.Scanner;

public class Task6{
	public static void main(String[] args){
		Scanner chisl = new Scanner(System.in);
		float pox = chisl.nextFloat();
		float poy = chisl.nextFloat();
		int radius = chisl.nextInt();
		if (((pox * pox) + (poy * poy)) < radius * radius){
			System.out.println("Vse chetko bratan , tochka v krugu");
		}else if (((pox * pox) + (poy * poy)) == (radius * radius)){
			System.out.println("Vse chetko bratan , tochka na linii kruga");
		}else{
			System.out.println("Bratan mi v jope");
		}
		chisl.close();
	}
}