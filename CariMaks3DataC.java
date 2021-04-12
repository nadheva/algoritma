import java.util.Scanner;
	public class CariMaks3DataC {
	static Scanner input = new Scanner (System.in);
	public static void main(String[] abc) {

	int a,b,c,maks;
	
	System.out.print("Masukkan Nilai 1:");
	a = input.nextInt();
	System.out.print("Masukkan Nilai 2:");
	b = input.nextInt();
	System.out.print("Masukkan Nilai 3:");
	c = input.nextInt();
	
	if(a>=b)
	{
	if(a>=c){maks=a;}else{maks=c;}
	}
	else
	{
		if(b>=c){maks=b;}else{maks=c;}
	}
	
	System.out.println("Nilai maksimal :"+maks);
}
}