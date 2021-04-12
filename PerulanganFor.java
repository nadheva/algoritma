import java.util.Scanner;
public class PerulanganFor {
  static Scanner data = new Scanner (System.in);
  public static void main(String[] arguments) {
  
  int i,n;
  
	//perintah for
	//cetak string sebanyak 3
	for(i=1;i<=3;i++) //nilai awal,kondisi,terminasi jadi 1 bagian
	
	{
	System.out.println("Selamat Pagi...");
	System.out.println("Ohayou Gozaimasu...");
	} //badan perulangan
	
	//cetak string sebanyak n kali
	{System.out.println("Masukkan banyaknya perulangan :");}
	n=data.nextInt();
	for(i=1;i<=n;i++)
	{System.out.println("Cetak String ke-"+i);}

	//cetak string sebanyak n kali (hitung mundur)
	{System.out.println("Masukkan banyaknya perulangan :");}
	n=data.nextInt();
	for(i=n;i>=1;i--)
	{System.out.print("Hitung mundur ke-"+i);}

	//cetak bilangan genap anatara 1-100
	System.out.println("----------cara 1----------");
	for(i=2;i<=100;i+=2)
		{System.out.print(i+", ");}

	//filter dengan if
	System.out.println("----------cara 2----------");
	for(i=1;i<=100;i++)
	{
		if(i%2==0)
		{System.out.print(i+", ");}
	}//dengan rumus deret atau asumsi bahwa soal adalah 50 bilangan genap asli pertama

	System.out.println("----------cara 3----------");	
	int Un;
	for(i=1;i<=50;i++)
	{Un=2*i;//rumus deret
	System.out.print(Un+", ");}
	
	//cetak deret n bilangan ganjil asli pertama
	System.out.println("----------deret n bilangan ganjil----------");	
	{System.out.println("Masukkan banyaknya deret ganjil :");}
	n=data.nextInt();
	for(i=1;i<=n;i++)
	{Un=2*i-1;//rumus deret
	System.out.println("Deret ganjil ke-"+i+":"+Un);}
	
}}