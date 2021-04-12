import java.util.Scanner;
public class Array2DMatrix {
  static Scanner data = new Scanner (System.in);
  public static void main(String[] arguments) {

	//deklarasi
	int i,j;
	int ordo=4;
	int [][]A=new int[ordo][ordo];
	int [][]B=new int[ordo][ordo];
	int [][]C=new int[ordo][ordo];
	
	//bagian input
	//matrix A
	for(i=1;i<ordo;i++)
	{
		for(j=1;j<ordo;j++)
		{
		System.out.print("Masukkan matrix A["+i+"]["+j+"]:");
		A[i][j] = data.nextInt();
		}
	}
	
	//matrix B
	for(i=1;i<ordo;i++)
	{
		for(j=1;j<ordo;j++)
		{
		System.out.print("Masukkan matrix B["+i+"]["+j+"]:");
		B[i][j] = data.nextInt();
		}
	}
	
	//matrix C adalah penjumlahan matrix A dan B
	for(i=1;i<ordo;i++)
	{
		for(j=1;j<ordo;j++)
		{
		C[i][j] = A[i][j]+B[i][j];
		}
	}
	
	//bagian output
	//matrix A
	System.out.println("Matrix A :");
	for(i=1;i<ordo;i++)
	{
		System.out.print("| ");
		for(j=1;j<ordo;j++)
		{
		System.out.print(A[i][j]+" ");
		}
		System.out.print("| ");
		System.out.println();
	}
	
	//matrix B
	System.out.println("Matrix B :");
	for(i=1;i<ordo;i++)
	{
		System.out.print("| ");
		for(j=1;j<ordo;j++)
		{
		System.out.print(B[i][j]+" ");
		}
		System.out.print("| ");
		System.out.println();
	}
	
	//matrix C
	System.out.println("Matrix C :");
	for(i=1;i<ordo;i++)
	{
		System.out.print("| ");
		for(j=1;j<ordo;j++)
		{
		System.out.print(C[i][j]+" ");
		}
		System.out.print("| ");
		System.out.println();
	}
}}