public class TipeDataVariabel {
	public static void main(String [] abc){
	String nama; //deklarasi variabel
	nama = "Kanna Hashi"; //inisialisasi var(beri niai)
	int umur,tahunlahir;//2 deklarasi langsung
	tahunlahir=1999;
	//umur = 18;
	umur = 2019-tahunlahir;//perhitungan dgn operator -
	double ipk =3.5;//deklarasi sekaligus inisialisasi
	char kelas ='C';
	boolean mhsaktif=true;
	System.out.println("Nama saya "+nama);//cetak var
	System.out.println("Saya kelas "+kelas);
	System.out.println("IPK saya "+ipk);
	System.out.println("Umur saya "+umur);
	System.out.println("Tahun lahir saya "+tahunlahir);
	System.out.println("Status keaktifan "+mhsaktif);
	System.out.println("lima tahun lagi umur saya "+(umur+5)+" tahun");
	
	int empat_th_lalu;
	empat_th_lalu=umur-4;
	System.out.println("empat tahun yang lalu umur saya "+empat_th_lalu+" tahun");
	} //end main
}	//end class