import java.util.Scanner;
public class HitungGajiBersih {
	static Scanner data = new Scanner (System.in);
	public static void main(String[] args)	{

//bagian deklasrasi
	double gajipokok,tunjangan,gajikotor,pajak,gajibersih;
	
//bagian input
	System.out.println("Masukkan gaji pokok pegawai :"); 
	gajipokok = data.nextDouble();data.nextLine();
	
//bagian proses
	tunjangan = 0.1*gajipokok;
	gajikotor = gajipokok+tunjangan;
	pajak = 0.05*gajikotor;
	gajibersih = gajikotor-pajak;
	
//bagian output
	System.out.println("maka gaji bersihnya ="+gajibersih);
	
}}