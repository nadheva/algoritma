import java.util.Scanner;
public class TotalGaji {
  static Scanner data = new Scanner (System.in);
  public static void main(String[] args) {
	  
	//deklarasi
      char gol;
      double pajak,gaji,total = 0;
    
	//input
      System.out.println("Pilihlah Golongan anda: ");
      System.out.println("1. Golongan 1");
      System.out.println("2. Golongan 2");
      System.out.println("3. Golongan 3");
      System.out.print("Golongan anda: ");
      gol=data.next().charAt(0);data.nextLine();
    
	//proses
      pajak=(double)2/100;
      
      switch (gol)
      {  
          case '1':
              gaji=1000000;
              total=gaji;
              break;
          case '2':
              gaji=2000000;
              total=gaji;
              break;
          case '3':
              gaji=3000000;
              total=gaji-(pajak*gaji);
              break;
          default :
              System.out.println("Inputan Salah");
      }
	  
	  //output
      System.out.print("Total Gaji yang Anda Terima Rp "+total);

}//end main
}//end class