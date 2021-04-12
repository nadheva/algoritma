import java.util.Scanner;
public class HitungJarakWaktuMobil {
	static Scanner data = new Scanner (System.in);
	public static void main(String[] args)	{

//bagian deklarasi
	double kecepatanA,kecepatanB,jarakA,jarakB,jarak,waktuberpapasan;
	
//bagian input
	System.out.println("Masukkan kecepatan mobil A (dalam km/jam) :"); 
	kecepatanA = data.nextDouble();data.nextLine();
	System.out.println("Masukkan kecepatan mobil B (dalam km/jam) :"); 
	kecepatanB = data.nextDouble();data.nextLine();
	System.out.println("Masukkan panjang jarak awal antara mobil A dan mobil B (dalam km) :"); 
	jarak = data.nextDouble();data.nextLine();

//bagian proses
	waktuberpapasan = jarak/(kecepatanA+kecepatanB);
	jarakA = kecepatanA*waktuberpapasan;
	jarakB = kecepatanB*waktuberpapasan;
	
//bagian output
	System.out.println("Waktu kedua mobil berpapasan (dalam jam) adalah ="+waktuberpapasan);
	System.out.println("dengan jarak dari mobil A (dalam km) adalah ="+jarakA);
	System.out.println("dengan jarak dari mobil B (dalam km) adalah ="+jarakB);

}}