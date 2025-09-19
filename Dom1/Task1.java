import java.util.Scanner;

public class Task1 {
	public static void main (String[] args){
		Scanner vxod = new Scanner(System.in);
		float chislo1 = vxod.nextFloat();
		float chislo2 = vxod.nextFloat();
		float summa = chislo1 + chislo2;
		System.out.println("Summa chisel: " + summa);
	vxod.close();
	}
}