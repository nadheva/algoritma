import java.util.Scanner;
public class KonversiSuhu2 {
	static Scanner data = new Scanner (System.in);
	public static void main(String[] args)	{
		
	//bagian deklarasi
	double suhuc,hasil;
	String jenis;
	char pilih;
	
	//bagian input
	System.out.print("Masukkan suhu yang dikonversikan (dalam celcius): ");
    suhuc=data.nextDouble(); data.nextLine();
    
	System.out.println("Pilih konversi suhu : ");
    System.out.println("1 = menjadi Kelvin");
    System.out.println("2 = menjadi Reamur");
    System.out.println("3 = menjadi Fahrenheit");
    System.out.print("Pilihan anda : ");
    pilih=data.next().charAt(0); data.nextLine();
  
    switch(pilih)
    {
        case '1': 
            hasil=suhuc+273;
			jenis="Kelvin";break;
        case '2':
            hasil=suhuc*4/5;
			jenis="Reamur";break;
        case '3':
            hasil=(suhuc*9/5)+32;
			jenis="Fahrenheit";break;
		default :hasil=suhuc;
			jenis="Celcius";
    }
	System.out.println("Konversi suhu "+suhuc+" celcius adalah "+hasil+" "+jenis);
}}    