import java.util.Scanner;
public class PercabanganIf {
	static Scanner data = new Scanner (System.in);
	public static void main(String[] args)	{
	
	//bagian deklarasi
	int nilai;
	String StatusLulus;
	
	//bagian input
	System.out.println("Masukkan nilai yang dihitung :");
	nilai = data.nextInt();data.nextLine();
	
	//if tanpa else
	if(nilai==0)//dalam kurung harus punya nilai boolean (true/false)
	{ System.out.println("Siswa drop out.. ");}
	
	//if dengan else
	if(nilai>=60)
	{ System.out.println("Siswa dinyatakan lulus.. ");} else
	{ System.out.println("Siswa dinyatakan tidak lulus..");}
	
	if(nilai<60)
	{ StatusLulus="Tidak lulus";} else{StatusLulus="lulus";}
	System.out.println("Siswa dinyatakan "+StatusLulus);
	//nested if
	/*
	0 - 59 ----> C
	60 -79 ----> B
	80-100 ----> A
	*/
	
	char konversiNilai;
	
	if(nilai<60)
	{ konversiNilai='C';} else
	{if(nilai<80)
		{konversiNilai='B';} else
		{konversiNilai='A';}
	}
	System.out.println("Konversi Nilai Siswa "+konversiNilai);
	
	if(nilai<60)
	{ konversiNilai='C';} else
	if(nilai<80)
		{konversiNilai='B';} else
		{konversiNilai='A';}
	
	System.out.println("Konversi Nilai Siswa "+konversiNilai);
	
	/*
	0 - 49 ----> E
	50 -59 ----> D
	60 -69 ----> C
	70 -84 ----> B
	85-100 ----> A
	*/
	if(nilai<50)
	{ konversiNilai='E';} else
	if(nilai<60)
	{konversiNilai='D';} else
	if(nilai<70)
	{ konversiNilai='C';} else
	if(nilai<85)
	{konversiNilai='B';} else
		{konversiNilai='A';}
	
	System.out.println("Konversi Nilai Siswa "+konversiNilai);
	
	
}}