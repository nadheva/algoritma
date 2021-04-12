import java.util.Scanner;
public class PercabanganSwitch {
	static Scanner data = new Scanner (System.in);
	public static void main(String[] args)	{
	
	int pilih,harga;
	char pilih2;
	
	System.out.println("Menu Warung Makan GohanGoreng :");
	System.out.println("1. Nasi Goreng ");
	System.out.println("2. Bakmi Goreng");
	System.out.println("3. Nasi Mawut");
	System.out.println("4. Bakmi Godog ");
	System.out.println("5. Capjay");
	System.out.println("6. Pak lay");
	System.out.println("Masukkan favoritmu <3 :");
	//pilih = input.nextInt
	pilih2 = data.next().charAt(0);data.nextLine();
	harga = 0;
	switch(pilih2)
	{
		case 1:
		System.out.println("Kamu pilih Nasi Goreng");
		harga=15000;break;
		case 2:
		System.out.println("Kamu pilih Bakmi Goreng");
		harga=17000;break;
		case 3:
		System.out.println("Kamu pilih Nasi Mawut");
		harga=18000;break;
		case 4:
		System.out.println("Kamu pilih Bakmi Godog");
		harga=17000;break;
		case 5:
		System.out.println("Kamu pilih Capjay");
		harga=15000;break;
		case 6:
		System.out.println("Kamu pilih Paklay");
		harga=18000;break;
		default :System.out.println("Pilihan kamu tidak tersedia");
		harga=0;break;
	}
	System.out.println("Harga menu :"+harga);
}}