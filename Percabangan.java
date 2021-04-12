import java.util.Scanner;
public class Percabangan {
	static Scanner data = new Scanner (System.in);
	public static void main(String[] args)	{
		
	char konversiNilai;
	int nilai;
	
	//bagian input
	System.out.println("Masukkan nilai yang dihitung :");
	nilai = data.nextInt();data.nextLine();
	
	/*
	0 - 49 ----> E
	50- 59 ----> D
	60- 69 ----> C
	70- 84 ----> B
	85-100 ----> A
	*/
	
	//bagian proses
	if(nilai>=85){ konversiNilai='A';} else
		if(nilai>=70){konversiNilai='B';} else
			if(nilai>=60){ konversiNilai='C';} else
				if(nilai>=50){konversiNilai='D';} else
					{konversiNilai='E';}
	//bagian output
	System.out.println("Konversi Nilai Siswa "+konversiNilai);
		
}}