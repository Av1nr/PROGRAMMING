import java.util.Scanner;

public class Task5{
	public static void main(String[] args){
		Scanner chislo = new Scanner(System.in);
		float pox = chislo.nextFloat();
		float poy = chislo.nextFloat();
		int kvadN = chislo.nextInt();
		int krai1poy = kvadN;
		int krai1pox = kvadN;
		int krai2poy = kvadN * (-1);
		int krai2pox = kvadN * (-1);
		if (((pox > krai2pox) && (pox < krai1pox)) && ((poy > krai2poy) && (poy < krai1poy))){
			System.out.println("Vse chetko bratan");
		}else{
			System.out.println("Vse ne chetko bratan");
		}
		chislo.close();
	}
}