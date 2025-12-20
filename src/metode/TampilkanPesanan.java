package metode;

import data.Pesanan;

public class TampilkanPesanan {

  private static Pesanan pesanan = new Pesanan();
  
  public static  void TampilkanPesanan(){
    for (int i = 0; i < pesanan.dataPesanan.size(); i++) {
      System.out.println("nama: "+pesanan.dataPesanan.get(i));
      System.out.println("jumlah: "+pesanan.dataTotalLembar.get(i));
      System.out.println("harga1an: "+pesanan.dataHarga.get(i));
    }
  }

  public static void main(String[] args) {
    pesanan.dataPesanan.add("Pulpen");
    pesanan.dataHarga.add(5000);
    pesanan.dataTotalLembar.add(1);
    pesanan.dataPesanan.add("pensil");
    pesanan.dataHarga.add(3500);
    pesanan.dataTotalLembar.add(1);


    TampilkanPesanan();
  }
}