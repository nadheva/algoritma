import java.util.Scanner;
	public class CariMaks3DataB {
	static Scanner input = new Scanner (System.in);
	public static void main(String[] abc) {

	int a,b,c,maks;
	
	System.out.print("Masukkan Nilai 1:"jenis="Fahrenheit";);
	a = input.nextInt();
	System.out.print("Masukkan Nilai 2:");
	b = input.nextInt();
	System.out.print("Masukkan Nilai 3:");
	c = input.nextInt();
	
	maks=a;
	if(b>maks){b=maks;}
	if(c>maks){c=maks;}
	
	System.out.println("Nilai maksimal :"+maks);
}
}