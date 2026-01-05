package metode;

import data.Pesanan;
import java.util.Scanner;

public class HapusLayanan {
  //ambil data dri Pesanan.java dan hapus isi dari dataPesanan
  private static Scanner input = new Scanner(System.in);
  private static Pesanan pesanan = new Pesanan();

  public static void HapusPesanan(){
    System.out.print("HAPUS PESANAN: ");
    int pilih = input.nextInt();

    pesanan.dataPesanan.remove(pilih-1);
    pesanan.dataHarga.remove(pilih-1);
    pesanan.dataTotalLembar.remove(pilih-1);
  }

}