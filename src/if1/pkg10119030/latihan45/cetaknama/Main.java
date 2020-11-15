package if1.pkg10119030.latihan45.cetaknama;
import java.util.Scanner;

/**
 * NAMA                 : Rendy Dermawan
 * KELAS                : IF1
 * NIM                  : 10119030
 * Deskripsi Program    : Program perulangan pencetakan nama menggunakan metode 
 * pendekatan berbasis objek.
 */
public class Main {
    private static String nama;
    private static int jumlah;
    
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
        
        System.out.println("=====Aplikasi Pencetak Nama=====");
        System.out.print("Masukan nama anda : ");
        nama = input.nextLine();
        System.out.print("Mau cetak berapa kali? : ");
        jumlah = input.nextInt();
        
        Printer printer1 = new Printer();
        printer1.setNama(nama);
        printer1.setJmlCetak(jumlah);
        printer1.cetak(nama);
        printer1.cetak(jumlah, nama);
        
    }
}