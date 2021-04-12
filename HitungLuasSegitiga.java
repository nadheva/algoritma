import java.util.Scanner;
public class HitungLuasSegitiga {
	static Scanner data = new Scanner (System.in);
	public static void main(String[] args)	{
		
//bagian deklarasi
		int alas,tinggi;
		double c,luas,keliling,sisimiring;
	
//bagian input
	System.out.println("Masukkan alas segitiga :"); 
	alas = data.nextInt();data.nextLine();
	System.out.println("Masukkan tinggi segitiga :");
	tinggi = data.nextInt();data.nextLine();
	
//bagian proses
	luas = alas*tinggi/2;
	sisimiring = ((alas/2)*(alas/2)+(tinggi*tinggi));
	c = Math.sqrt(sisimiring);
	keliling = c+c+alas;
	
//bagian output
	System.out.println("Diperoleh luas segitiga ="+luas);
	System.out.println("dan diperoleh kelilingnya ="+keliling);
	
}}