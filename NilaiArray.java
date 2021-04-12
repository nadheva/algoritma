import java.util.Scanner;
public class NilaiArray {
  static Scanner data = new Scanner (System.in);
  public static void main(String[] arguments) {

	//deklarasi
	int i;
	int jml=5;
	int [] nilaiMath=new int[jml];
	int [] nilaiAlgo=new int[jml];
	String [] nama={"AA","BB","CC","DD","EE"};
	
	//bagian input
	for(i=0;i<jml;i++)
	{
			System.out.print("Masukkan Nilai Matematika Siswa Ke-"+(i+1)+" :");
			nilaiMath[i] = data.nextInt();
	}
	
	for(i=0;i<jml;i++)
	{
			System.out.print("Masukkan Nilai Algoritma Siswa Ke-"+(i+1)+" :");
			nilaiAlgo[i] = data.nextInt();
	}
	
	//bagian proses / hitung rata-rata tiap kelas
	int totalMath=0,totalAlgo=0;
	double [] rataindividu=new double[jml];
	for(i=0;i<jml;i++)
	{
		totalMath=totalMath+nilaiMath[i];
		totalAlgo=totalAlgo+nilaiAlgo[i];
		rataindividu[i]=(double)(nilaiMath[i]+nilaiAlgo[i])/2;
	}
	double rataMath,rataAlgo;
	rataMath=(double)totalMath/jml;
	rataAlgo=(double)totalAlgo/jml;
	
	//bagian output
	for(i=0;i<jml;i++)
	{
		System.out.println("Nama Siswa Ke-"+(i+1)+" :"+nama[i]);
		System.out.println("Nilai Matematika Siswa Ke-"+(i+1)+" :"+nilaiMath[i]);
		System.out.println("Nilai Algoritma Siswa Ke-"+(i+1)+" :"+nilaiAlgo[i]);
		System.out.println("Rata-rata Siswa ke-"+(i+1)+" :"+rataindividu[i]);
	}
	System.out.println("-----------------------------------------------------");
	System.out.println("Rata-rata Kelas Matematika : "+rataMath);
	System.out.println("Rata-rata Kelas Algoritma : "+rataAlgo);

}}