package metode;

import data.Pesanan;

public class HitungTotalBiaya {
  //Ambil data dari pesanan
  //dan hitung harganya sesuai dengan bobot
  //untuk harga layanan dan jumlah lembarnya
  private static Pesanan pesanan = new Pesanan();

  public static void hitungTotalBiaya(){

    int total = 0;

    for (int i = 0; i < pesanan.dataHarga.size(); i++) {
      total += pesanan.dataHarga.get(i) * pesanan.dataTotalLembar.get(i);
    }

    System.out.println(total);
  }
}