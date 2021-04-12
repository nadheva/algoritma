import java.util.Scanner;
public class PerulanganWhile {
  static Scanner data = new Scanner (System.in);
  public static void main(String[] arguments) {
  
  int i,n;
  
	//perintah While
	//cetak string sebanyak 3
	i=1; //nilai awal
	while(i<=3) //kondisi
	
	{//badan perulangan
	System.out.println("Selamat Siang...");
	System.out.println("Konnichiwa...");
	i++; //terminasi
	}
	
	//cetak string sebanyak n kali
	{System.out.println("Masukkan banyaknya perulangan :");}
	n=data.nextInt();
	i=1;
	while(i<=n)
	{System.out.println("Cetak String ke-"+i);
	i++;}

	//cetak string dengan konfirmasi
	char lagi;
	lagi='y'; //nilai awal
	while(lagi=='y'|| lagi=='Y')//kondisi
	{ //badan perulangan
		System.out.println("Selamat Sore... ");
		System.out.println("Cetak lagi? (y/n):");
		lagi = data.next().charAt(0);data.nextLine();//terminasi
	}
	
	//cetak string dengan konfirmasi do while
	System.out.println("----------cetak string dengan konfirmasi do while----------");
	do	
	{ //badan perulangan
		System.out.println("Selamat Sore... ");
		System.out.println("Cetak lagi? (y/n):");
		lagi = data.next().charAt(0);data.nextLine();//terminasi
	}
	while(lagi=='y'|| lagi=='Y'); //kondisi
}}