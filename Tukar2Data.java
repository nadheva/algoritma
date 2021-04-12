import java.util.Scanner;
public class Tukar2Data {
	static Scanner data = new Scanner (System.in);
	public static void main(String[] abc)	{
	
	//bagian deklarasi
	int a,b,swap;
	
	//bagian input
	System.out.println("Masukkan data 1 :");
	a = data.nextInt();data.nextLine();
	System.out.println("Masukkan data 2 :");
	b = data.nextInt();data.nextLine();
	
	//bagian proses
	swap=a;
	a=b;
	b=swap;
	
	//bagian output
	System.out.println("Data yang dimasukkan telah ditukar, sehingga :");
	System.out.println("Data 1' = "+a);
	System.out.println("Data 2' = "+b);
	
}}