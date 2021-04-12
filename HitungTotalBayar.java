import java.util.Scanner;
public class HitungTotalBayar {
	static Scanner data = new Scanner (System.in);
	public static void main(String[] args)	{
		
//bagian deklarasi
	double A,B,totalbayar,diskonA,diskonB;
	
//bagian input
	System.out.println("Jumlah item A yang dibeli :");
	A = data.nextDouble();data.nextLine();
	System.out.println("Jumlah item B yang dibeli :");
	B = data.nextDouble();data.nextLine();
	
//bagian proses
	diskonA = 1000*0.9*A;
	diskonB = 2000*0.95*B;
	totalbayar = diskonA+diskonB;
	
//bagian output
	System.out.println("Total bayarnya adalah ="+totalbayar); 

}}