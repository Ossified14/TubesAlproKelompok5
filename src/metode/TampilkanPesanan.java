package metode;

import data.Pesanan;

public class TampilkanPesanan {
  private Pesanan pesanan = new Pesanan();
  
  public void TampilkanPesanan(){
    for (String x : pesanan.dataPesanan) {
      System.out.println(x);
    }
  }
}