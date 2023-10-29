package pkgLatihan28;
import java.util.Scanner;
/**
* author
* Nama      : A`isatul Iza
* Nim       : 22166008
* Deskripsi : Program ini adalah program yang menampilkan penggantian kata dalam sebuah kalimat dimana user sendiri yang menginputkan kalimatnya
*/
public class SIRegPagi22166008Latihan28 {
  public static void main(String[] args) {
   Scanner masukkan = new Scanner(System.in);
    System.out.println("========Program Mengganti Kata========");
    //input kalimat 
    System.out.print("Masukkan Kalimat : ");
    String kalimat = masukkan.nextLine();
    //input kata yang akan di ganti 
    System.out.print("Ganti kata : ");
    String ganti = masukkan.nextLine();
    //input kata yang diganti
    System.out.print("Menjadi kata : ");
    String menjadi = masukkan.nextLine();
    System.out.println("========Hasil Formatting========"); 
    //output kalimat awal
    System.out.print("Kalimat awal : "+ kalimat);
    //output kalimat yang sudah diganti
    System.out.print("\nKalimat baru : " + kalimat.replace(ganti, menjadi));
  }
}
