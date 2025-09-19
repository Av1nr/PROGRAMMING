import java.util.Scanner;

public class Task3{
	public static void main (String[] args){
		Scanner vvod = new Scanner(System.in);
		float chisl1 = vvod.nextFloat();
		float chisl2 = vvod.nextFloat();
		float chisl3 = vvod.nextFloat();
		if ((chisl1 > chisl2) && (chisl1 > chisl3)) {
			System.out.println(chisl1 + " Naibolshee");
		}else if ((chisl2 > chisl3) && (chisl2 > chisl1)){
			System.out.println(chisl2 + " Naibolshee");
		}else if ((chisl3 > chisl1) && (chisl3 > chisl2)){
			System.out.println(chisl3 + " Naibolshee");
		}else if ((chisl2 > chisl1) && (chisl1 > chisl3)) {
			System.out.println(chisl2 + " Naibolshee");
		}else if ((chisl1 > chisl3) && (chisl1 == chisl2)){
			System.out.println(chisl1 + " Naibolshee");
		}else if ((chisl1 > chisl2) && (chisl1 == chisl3)){
			System.out.println(chisl1 + " Naibolshee");
		}else if ((chisl2 > chisl3) &&(chisl2 == chisl1)){
			System.out.println(chisl2 + " Naibolshee");
		}else if ((chisl2 > chisl3) && (chisl2 == chisl3)){
			System.out.println(chisl2 + " Naibolshee");
		}else{
			System.out.println(chisl3 + " Naibolshee");
		}
		vvod.close();
	}
}