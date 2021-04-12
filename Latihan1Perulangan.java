import java.util.Scanner;
public class Latihan1Perulangan {
  static Scanner data = new Scanner (System.in);
  public static void main(String[] arguments) {
  
//deklarasi
	int i,a,b;

//input nilai a dan b
  System.out.println("masukkan angka awal :");
  a=data.nextInt();
  System.out.println("masukkan angka akhir :");
  b=data.nextInt();
  
//proses
	if(a>b)
	//apabila a>b
	{
	for(i=b;i<=a;i++)
	{System.out.print(i+", ");}
	}
	
	else
	//apabila b>a
	{
	for(i=a;i<=b;i++)
	
//output
	{System.out.print(i+", ");}
	}	
	
}}
  
  