import java.util.Scanner;
public class RerataSKS {
	static Scanner data = new Scanner (System.in);
	public static void main(String[] abc)	{
	
	//bagian deklarasi
	double sksmat, sksalgo, nilaimat, nilaialgo, jmlsks, jmlnilaimat, jmlnilaialgo, ratarata;
	
	sksmat = 2;
	sksalgo = 3;
	
	//bagian input
	System.out.println("Masukkan nilai Matematika :");
	nilaimat = data.nextDouble();data.nextLine();
	System.out.println("Masukkan nilai Algoritma :");
	nilaialgo = data.nextDouble();data.nextLine();
	
	//bagian proses
	jmlsks = sksmat+sksalgo;
	jmlnilaimat = nilaimat*sksmat;
	jmlnilaialgo = nilaialgo*sksalgo;
	ratarata = (jmlnilaimat+jmlnilaialgo)/jmlsks;
	
	//bagian output
	System.out.println("Nilai rata-rata adalah "+ratarata);
		
}}