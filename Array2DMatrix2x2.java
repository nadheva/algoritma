import java.util.Scanner;
public class Array2DMatrix2x2 {
  static Scanner data = new Scanner (System.in);
  public static void main(String[] arguments) {

	//deklarasi
	int i,j;
	int ordo=4;
	int [][]A=new int[ordo][ordo];
	int [][]B=new int[ordo][ordo];
	int [][]D=new int[ordo][ordo];
	
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
	
	//matrix D adalah penjumlahan matrix A dan B
	for(i=1;i<ordo;i++)
	{
		for(j=1;j<ordo;j++)
		{
		D[i][j] = A[i][1]*B[1][j]+A[i][2]*B[2][j]+A[i][3]*B[3][j];
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
	
	//matrix D
	System.out.println("Matrix D :");
	for(i=1;i<ordo;i++)
	{
		System.out.print("| ");
		for(j=1;j<ordo;j++)
		{
		System.out.print(D[i][j]+" ");
		}
		System.out.print("| ");
		System.out.println();
	}
}}