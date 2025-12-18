package ui;

import metode.TampilkanPesanan;

public class MenuService {

  TampilkanPesanan tampilkanPesanan = new TampilkanPesanan();

  public void tampilkanPesananUser() {
    tampilkanPesanan.tampilkan();
  }
}