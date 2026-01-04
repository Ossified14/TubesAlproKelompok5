package metode;

import data.Pesanan;

public class TampilkanPesanan {

  private static Pesanan pesanan = new Pesanan();

  public static void TampilkanPesanan(){
    if (pesanan.dataPesanan.isEmpty()) {
      System.out.println("Belum ada data pesanan.");
      return;
    }
    for(int i= 0 ;i < pesanan.dataPesanan.size(); i++){
      System.out.println("===PESANAN KE -" + (i + 1) + "===");
      System.out.println("Nama :" + pesanan.dataPesanan.get(i));
      System.out.println("Jumlah :" + pesanan.dataTotalLembar.get(i));
      System.out.println("Harga per lembar : Rp" + pesanan.dataHarga.get(i));
      System.out.println("-----------------------");
    }
  }
}