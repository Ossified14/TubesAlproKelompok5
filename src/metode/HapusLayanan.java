package metode;

import data.Pesanan;
import java.util.Scanner;

public class HapusLayanan {
  //ambil data dri Pesanan.java dan hapus isi dari dataPesanan
  private static Scanner input = new Scanner(System.in);
  private static Pesanan pesanan = new Pesanan();

  public static void HapusPesanan(){
    System.out.print("hapus nomor berapa: ");
    int pilih = input.nextInt();

    pesanan.dataPesanan.remove(pilih-1);
    pesanan.dataHarga.remove(pilih-1);
    pesanan.dataTotalLembar.remove(pilih-1);
  }

  public static void main(String[] args) {
    HapusLayanan x = new HapusLayanan();

    pesanan.dataPesanan.add("Pulpen");
    pesanan.dataHarga.add(5000);
    pesanan.dataTotalLembar.add(1);
    pesanan.dataPesanan.add("pensil");
    pesanan.dataHarga.add(3500);
    pesanan.dataTotalLembar.add(1);


    System.out.println("awaln");
      for (String layanan : pesanan.dataPesanan) {
        System.out.println(layanan);
      }
      for (Integer harga : pesanan.dataHarga) {
        System.out.println(harga);
      }
      for (Integer jumlahLembaar : pesanan.dataTotalLembar) {
        System.out.println(jumlahLembaar);
      }

    HapusPesanan();

    System.out.println("akhiran");
      for (String layanan : pesanan.dataPesanan) {
        System.out.println(layanan);
      }
      for (Integer harga : pesanan.dataHarga) {
        System.out.println(harga);
      }
      for (Integer jumlahLembaar : pesanan.dataTotalLembar) {
        System.out.println(jumlahLembaar);
      }
  }
}