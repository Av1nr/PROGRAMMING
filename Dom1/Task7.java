import java.util.Scanner;

public class Task7{
	public static void main(String[] args){
		Scanner enter = new Scanner(System.in);
		float x = enter.nextFloat();
		float y = enter.nextFloat();
		int count = 0;
		for (int radius = 0; radius < 11; radius++){
			if ((radius * radius) + (radius * radius) >= ((x * x) + (y * y))){
				System.out.println("Ты в радиусе " + radius);
				count++;
				break;
			}
		}
		if (count == 0){
			System.out.println("Промазал");
		}
		enter.close();
	}
}