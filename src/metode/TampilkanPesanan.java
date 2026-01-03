package metode;

import data.Pesanan;

public class TampilkanPesanan {

 public static void tampilkanPesanan(int index) {
        if (index < pesanan.dataPesanan.size()) {
            System.out.println("=== PESANAN KE-" + (index + 1) + " ===");
            System.out.println("Nama: " + Pesanan.dataPesanan.get(index));
            System.out.println("Jumlah: " + Pesanan.dataTotalLembar.get(index));
            System.out.println("Harga per lembar: Rp " + Pesanan.dataHarga.get(index));
            System.out.println("------------------------");
  private static Pesanan Pesanan = new Pesanan();
        }

         public static void TampilkanPesanan() {
        if (pesanan.dataPesanan.isEmpty()) {
            System.out.println("Belum ada data pesanan.");
            return;
        }
        
        for (int i = 0; i < pesanan.dataPesanan.size(); i++) {
            tampilkanPesanan(i);
        }
    }
      
  public static  void tampilkanPesanan(){
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


    tampilkanPesanan();
  }
}
 }
