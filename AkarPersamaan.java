import java.util.Scanner;
public class AkarPersamaan {
  static Scanner input = new Scanner (System.in);
  public static void main(String[] args) {
	  
	//deklarasi
    double a,b,c,D,x1,x2;
  
	//input
    System.out.println("Bentuk Umum: ax^2 + bx + c");
      
      System.out.print("Masukkan nilai a: ");
        a = input.nextDouble();input.nextLine();
      System.out.print("Masukkan nilai b: ");
        b = input.nextDouble();input.nextLine();
      System.out.print("Masukkan nilai c: ");
        c = input.nextDouble();input.nextLine();
  
	//proses
      D = (b * b) - (4 * a * c);
      x1 = (-b + Math.sqrt(D)) / 2 * a;
      x2 = (-b - Math.sqrt(D)) / 2 * a;
        
    if (D>0) {System.out.println("Akarnya Real");System.out.println("Akar pertama : " + x1);System.out.println("Akar kedua : " + x2);} else 
        if (D==0){System.out.println("Akar Kembar"); System.out.println("Akarnya : " + x1);} else 
            if (a > 0) {System.out.println("Akarnya Imajiner");System.out.println("Definit Positif");} else
               {System.out.println("Akarnya Imajiner");System.out.println("Definit Negatif");}
      
  }//end main
  }//end class