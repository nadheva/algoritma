import java.util.Scanner;
public class Ascending3Data {
	static Scanner data = new Scanner (System.in);
	public static void main(String[] abc)	{
	
	//bagian deklarasi
	int a,b,c,swap;
	
	//bagian input
	System.out.println("Masukkan data 1 :");
	a = data.nextInt();data.nextLine();
	System.out.println("Masukkan data 2 :");
	b = data.nextInt();data.nextLine();
	System.out.println("Masukkan data 3 :");
	c = data.nextInt();data.nextLine();
	System.out.println("Urutan data sebelum ditukar : "+a+", "+b+", "+c);
	
	//bagian proses
	if(b>c){swap=b;b=c;c=swap;}
	if(a>b){swap=a;a=b;b=swap;} //paling depan pasti paling kecil
	if(b>c){swap=b;b=c;c=swap;}
	
	//bagian output
	System.out.println("Urutan data setelah ditukar : "+a+", "+b+", "+c);
	
	
}}