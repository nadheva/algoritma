import java.util.Scanner;
public class PercabanganIfKonversi {
	static Scanner data = new Scanner (System.in);
	public static void main(String[] args)	{
		
	char konversiNilai;
	int nilai;
	String StatusLulus;
	
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
	
	//if tanpa else
	if(nilai==0)//dalam kurung harus punya nilai boolean (true/false)
	{ System.out.println("Siswa drop out.. ");}
	
	//if dengan else
	if(nilai>=60)
	{ System.out.println("Siswa dinyatakan lulus.. ");} else
	{ System.out.println("Siswa dinyatakan Tidak Lulus");}
	
	if(nilai<60)
	{ StatusLulus="Tidak lulus";} else{StatusLulus="lulus";}
	System.out.println("Siswa dinyatakan "+StatusLulus);
	
	if(nilai<50){ konversiNilai='E';} else
		if(nilai<60){konversiNilai='D';} else
			if(nilai<70){ konversiNilai='C';} else
				if(nilai<85){konversiNilai='B';} else
					{konversiNilai='A';}
	System.out.println("Konversi Nilai Siswa "+konversiNilai);
	
	if(nilai>=85){ konversiNilai='A';} else
		if(nilai>=70){konversiNilai='B';} else
			if(nilai>=60){ konversiNilai='C';} else
				if(nilai>=50){konversiNilai='D';} else
					{konversiNilai='E';}	
	System.out.println("Konversi Nilai Siswa "+konversiNilai);
	
	//if dengan operator logika
	String kevalidan; //valid 0 s.d 100 selain itu tidak valid
	if(nilai>=0 && nilai <=100)
	{kevalidan="VALID";}
	else
	{kevalidan="TIDAK VALID";}
	System.out.println("Nilai yang diinput :"+kevalidan);
	
	if(nilai<0 || nilai >100)
	{kevalidan="TIDAK VALID";}
	else
	{kevalidan="VALID";}
	System.out.println("Nilai yang diinput :"+kevalidan);	
	
}
}