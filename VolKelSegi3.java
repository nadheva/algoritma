import java.util.Scanner;
public class VolKelSegi3 {
	static Scanner data = new Scanner (System.in);
	public static void main(String[] args)	{
	
	double alas,tinggi,simir,kel,luas;
	
	System.out.println("Masukkan panjang alas :");
	alas = data.nextDouble();data.nextLine();
	System.out.println("Masukkan tinggi :");
	tinggi = data.nextDouble();data.nextLine();
	
	luas = 0.5*alas*tinggi;
	simir = Math.sqrt(Math.pow(0.5*alas,2)+Math.pow(tinggi,2));
	kel = 2*simir+alas;
	
	System.out.println("Luas segitiga : "+luas);
	System.out.println("Keliling segitiga : "+kel);
	
}}