import java.util.Scanner;

public class Task10{
    public static void main(String[] args){
        Scanner vxod = new Scanner(System.in);
        int vxodchislo = vxod.nextInt();
        int koef = 1;
		String strokaotveta = "";
        System.out.print(vxodchislo + " = ");
        while (vxodchislo > 0)
        {
            if (vxodchislo % 10 != 0)
            {
                strokaotveta = ((vxodchislo % 10 * koef)+("+")) + strokaotveta;
            }
            vxodchislo /= 10;
            koef *= 10;
		}StringBuffer stringBuffer = new StringBuffer(strokaotveta);
		if(stringBuffer.length() > 0) {
			stringBuffer.deleteCharAt(stringBuffer.length() - 1);}
			System.out.println(stringBuffer.toString());
    }
}