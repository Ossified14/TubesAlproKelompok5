package metode;

import data.Pesanan;

public class HitungTotalBiaya {
  //Ambil data dari pesanan
  //dan hitung harganya sesuai dengan bobot
  //untuk harga layanan dan jumlah lembarnya
  private static Pesanan pesanan = new Pesanan();

  public static int hitungTotalBiaya(){

    int total = 0;

    for (int i = 0; i < pesanan.dataHarga.size(); i++) {
      total += pesanan.dataHarga.get(i) * pesanan.dataTotalLembar.get(i);
    }

    return total;
  }

    public static void main(String[] args) {
    // TampilkanPesanan test = new TampilkanPesanan();

    pesanan.dataPesanan.add("Pulpen");
    pesanan.dataHarga.add(5000);
    pesanan.dataTotalLembar.add(1);
    pesanan.dataPesanan.add("pensil");
    pesanan.dataHarga.add(3500);
    pesanan.dataTotalLembar.add(1);

    System.out.println("totalnya :" + hitungTotalBiaya());

    TampilkanPesanan.tampilkanPesanan();
  }
}