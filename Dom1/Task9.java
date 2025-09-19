import java.util.Scanner;

public class Task9{
	public static void main(String[] args){
		Scanner iznchislvxod = new Scanner(System.in);
		int iznchisl = iznchislvxod.nextInt();
		int summa = 0;
		while (iznchisl > 0){
			int iskchisl = iznchisl % 10;
			summa = summa + iskchisl;
			iznchisl = (iznchisl / 10);
		}
		System.out.println(summa);
	}
}