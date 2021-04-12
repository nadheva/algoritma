//Bab 5 no 1

import java.util.Scanner;
public class Antara2Angka {
  static Scanner data = new Scanner (System.in);
  public static void main(String[] arguments) {
  
//deklarasi
	int i,n,a,b;

//input nilai a dan b
  System.out.println("masukkan angka awal :");
  a=data.nextInt();
  System.out.println("masukkan angka akhir :");
  b=data.nextInt();

//proses
	if
	(a>b)//apabila a>b
	{i=b;
	while(i<=a)//kondisi
	{//badan perulangan
		System.out.print(i+", ");
	i++;}//terminasi
	;}
	
	else
	//apabila b>a
		{i=a;
	while(i<=b)//kondisi
	{//badan perulangan
		System.out.print(i+", ");
	i++;}//terminasi
	;}	
	
}//end main
}//end class