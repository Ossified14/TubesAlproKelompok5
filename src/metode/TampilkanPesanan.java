package metode;

import data.Pesanan;

public class TampilkanPesanan {

  private static Pesanan pesanan = new Pesanan();

  public static void TampilkanPesanan(int index) {
    if (index < pesanan.dataPesanan.size()){
      System.out.println("===PESANAN KE -" + (index + 1) + "===");
      System.out.println("Nama :" + pesanan.dataPesanan.get(index));
      System.out.println("Jumlah :" + pesanan.dataTotalLembar.get(index));
      System.out.println("Harga per lembar : Rp" + pesanan.dataHarga.get(index));
      System.out.println("-----------------------");
    }
  }
  public static void TampilkanPesanan(){
    if (pesanan.dataPesanan.isEmpty()) {
      System.out.println("Belum ada data pesanan.");
      return;
    }
    for(int i= 0;i < pesanan.dataPesanan.size(); i++){
      TampilkanPesanan(i);
    }
  }
}

