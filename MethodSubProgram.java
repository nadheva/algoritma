import java.util.Scanner;
	public class MethodSubprogram {
	static Scanner input = new Scanner (System.in);
	public static void main (String[] args)  
	{
	garis();
	//cetaknama("Hiratake Ichiya");
	String nim="E0119001"; int usia=19;
	cetakID(nim,usia);
	int a=3,b=5;
	System.out.println("Hasil "+a+"+"+b+"="+jumlah(a,b));
	int c=jumlah(a,b);
	System.out.println("Hasil "+a+"+"+b+"="+c);
	jumlah2(a,b);
	garis();
	}//end main
	
	//method dengan parameter tanpa return
	public static int jumlah(int x, int y)
	{
		int z;
		z=x+y;
		return z;
	}//end method jumlah
	
	//method tanpa parameter tanpa return
	public static void jumlah2(int x, int y)
	//apabila menggunakan void, tidak boleh menggunakan return
	{
		int z;
		z=x+y;
		System.out.println("Hasil "+x+"+"+y+"="+z);
	}//end method jumlah2

	//method tanpa parameter tanpa return
	public static void garis()
	{
		System.out.println("|--------------------**--------------------|");
	}//end method garis

	//method dengan parameter tanpa return
	public static void cetaknama(String nama)
	{
		System.out.println("Nama saya adalah : "+nama);
	}//end method cetaknama
	public static void cetakID(String nim, int umur)//ada 2 parameter
	{
	cetaknama("Hiratake Ichiya"); //method boleh memanggil method //saling memanggil
	//namun jangan method A memanggil method B dan method B memanggil method A (nanti kapan selesainya)
		System.out.println("NIM "+nim+" memiliki umur "+umur);
	}//end method cetakID
}//end class

/*
Buat method dengan parameter dan return
1. Mencari nilai mutlak dari bilangan bulat
2. Mencari maksimal dari 3 data integer
3. Menentukan jenis segitiga dari 3 sisi yang diinputkan (sama sisi, sama kaki, sembarang)
4. Mencari n faktorial
5. Mencari x pangkat y
*/