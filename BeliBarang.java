 import java.util.Scanner;
public class BeliBarang {
static Scanner data = new Scanner (System.in);
	public static void main(String[] args)	{
	
	double A,B,hargaA,hargaB,diskonA, diskonB,total;
	System.out.print(" masukan jumlah A :");
	A = data.nextDouble();data.nextLine();
	System.out.print(" masukan jumlah B :");
	B = data.nextDouble();data.nextLine();
	
	diskonA=1000*0.1*A;
	diskonB=2000*0.05*B;
	hargaA= A*1000;
	hargaB= B*2000;
	
	total=(hargaA - diskonA)+(hargaB-diskonB);
	
	System.out.print(" total :" +total);
	
}}