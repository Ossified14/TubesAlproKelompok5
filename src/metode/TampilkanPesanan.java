package metode;

import data.Pesanan;

public class TampilkanPesanan {

  public void tampilkan() {
    Pesanan data = new Pesanan();
    
    for (String item : data.getDataPesanan()) {
      System.out.println(item);
    }
  }
}