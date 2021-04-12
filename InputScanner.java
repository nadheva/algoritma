import java.util.Scanner;
public class InputScanner {
	static Scanner data = new Scanner (System.in);
	public static void main(String[] abc) {
		int umur;
		double tinggi;
		String nama;
		char jk;
		boolean aktif;
		
	System.out.println("Masukan umur anda :");
	umur = data.nextInt();data.nextLine(); //inputan integer/Angkat Bulat
	System.out.println("Masukan nama anda :");
	nama = data.nextLine(); //inputan String /Kata-Kata
	System.out.println("Masukan tinggi badan anda (dlm meter) :");
	tinggi = data.nextDouble();data.nextLine();//inputan Angka Desimal
	System.out.println("Masukan jenis kelamin (L/P) :");
	jk = data.next().charAt(0);data.nextLine();//inputan char /karakter
	System.out.println("Aktif? :");
	aktif = data.nextBoolean();data.nextLine();//inputan boolean(true/false)
	System.out.println(nama+" mempunyai umur "+umur+" ,tinggi "+tinggi);
	System.out.println("Jenis Kelamin "+jk+" Status Aktif "+aktif);
}}