package metode;

import data.Pesanan;
import java.util.Scanner;

public class UbahJumlahLembar {
  //ambil data dari Pesanan.java dan ubah jumlah lembarnya
  private static Pesanan pesanan = new Pesanan();
  private static Scanner input = new Scanner(System.in);

  public static void ubahJumlahLembar(){
    System.out.print("set nomor beraapa: ");
    int pilih = input.nextInt();
    System.out.print("nomor "+ pilih + " awalnya: " + pesanan.dataTotalLembar.get(pilih-1) + " ubah jadi apa: ");
    int diUbahJadi = input.nextInt();

    pesanan.dataTotalLembar.set(pilih-1, diUbahJadi);
  }

  public static void main(String[] args) {
    TampilkanPesanan test = new TampilkanPesanan();

    pesanan.dataPesanan.add("Pulpen");
    pesanan.dataHarga.add(5000);
    pesanan.dataTotalLembar.add(1);
    pesanan.dataPesanan.add("pensil");
    pesanan.dataHarga.add(3500);
    pesanan.dataTotalLembar.add(1);

    for (String string : pesanan.dataPesanan) {
      System.out.println(string);
    }

    for (Integer angka : pesanan.dataTotalLembar) {
      System.out.println(angka);
    }

    ubahJumlahLembar();

    for (String string : pesanan.dataPesanan) {
      System.out.println(string);
    }

    for (Integer angka : pesanan.dataTotalLembar) {
      System.out.println(angka);
    }
  }
}
