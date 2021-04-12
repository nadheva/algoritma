import java.util.Scanner;
public class HitungLuasPersegiPanjang {
	static Scanner data = new Scanner (System.in);
	public static void main(String[] args)	{

//bagian deklarasi
		double panjang,lebar,luas;

//bagian input
	System.out.println("Masukkan panjang persegi panjang :"); 
	panjang = data.nextDouble();data.nextLine();
	System.out.println("Masukkan lebar persegi panjang :");
	lebar = data.nextDouble();data.nextLine();

//bagian proses
	luas = panjang*lebar;

//bagian output
	System.out.println(panjang+" * "+lebar+" = "+luas);

}}