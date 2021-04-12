import java.util.Scanner;
public class KonversiNilai {
  static Scanner data = new Scanner (System.in);
  public static void main(String[] args) {
  
  //deklarasi
  int nilai;
  String kevalidan,kelulusan,kriteria = "-";
  
  //input
  System.out.print("Masukkan Nilai Anda: ");
  nilai=data.nextInt(); data.nextLine();
   
  //proses
   if(nilai<0 || nilai>100)
     {kevalidan="TIDAK VALID";} else
     {kevalidan="VALID";
      if(nilai<60)
          {kelulusan="Gagal";} else    {
        if(nilai<70)
          {kelulusan="Lulus";kriteria="Cukup";} else 
          if (nilai<80)
              {kelulusan="Lulus";kriteria="Baik";} else
              {kelulusan="Lulus";kriteria="Sangat Baik";}
   //output
      System.out.println("Kriteria Kelulusan: "+kriteria);}
      System.out.println("Stastus Kelulusan: "+kelulusan);
     }
  System.out.println(kevalidan);
  }//end main
  }//end class