import java.util.Scanner;
public class DurasiWaktu {
	static Scanner data = new Scanner (System.in);
	public static void main(String[] abc)	{
	
	//bagian  deklarasi
	int jam1,menit1,detik1,jam2,menit2,detik2,jam,menit,detik;
	
	//bagian input
	System.out.println("Syarat waktu kedua harus lebih besar dari waktu pertama :");
	System.out.println("Masukkan jam pertama :");
	jam1 = data.nextInt();
	System.out.println("Masukkan menit pertama :");
	menit1 = data.nextInt();
	System.out.println("Masukkan detik pertama :");
	detik1 = data.nextInt();
	System.out.println("Masukkan jam kedua :");
	jam2 = data.nextInt();
	System.out.println("Masukkan menit kedua :");
	menit2 = data.nextInt();
	System.out.println("Masukkan detik kedua :");
	detik2 = data.nextInt();
	
	//bagian proses
	jam = jam2-jam1;
	menit = menit2-menit1;
	detik = detik2-detik1;
	
	//bagian output
	System.out.println("Waktu pertama adalah "+jam1+":"+menit1+":"+detik1);
	System.out.println("Waktu kedua adalah "+jam2+":"+menit2+":"+detik2);
	System.out.println("Lamanya durasi waktu : "+jam+" jam, "+menit+" menit, "+detik+" detik");
	
}}