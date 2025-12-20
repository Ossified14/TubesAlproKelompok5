package metode;

import data.JenisPesanan;
import data.Pesanan;
import java.util.Scanner;

public class TambahJenisLayanan {
  private static Scanner input = new Scanner(System.in);

  private static Pesanan pesanan = new Pesanan();
  private static JenisPesanan jenisPesanan= new JenisPesanan();

  private void tambahPesanan() {
    System.out.print("Masukkan angka dari Jenis Layanan Yang Diinginkan (Print(1)/Fotocopy(2)): ");
    int Jenis = input.nextInt();

    System.out.print("Masukkan Jumlah Lembar: ");
    int Jumlah = input.nextInt();

    if(Jenis == 1){
      pesanan.dataPesanan.add(jenisPesanan.dataJenisPesanan[0]);
      pesanan.dataHarga.add(jenisPesanan.hargaDataJenisPesanan[0]);
      pesanan.dataTotalLembar.add(Jumlah);
    }else if(Jenis == 2){
      pesanan.dataPesanan.add(jenisPesanan.dataJenisPesanan[1]);
      pesanan.dataHarga.add(jenisPesanan.hargaDataJenisPesanan[1]);
      pesanan.dataTotalLembar.add(Jumlah);
    }else{
      System.out.println("Jenis Layanan Tidak tersedia");
    }
  }

  // public static void main(String[] args) {
  //   TambahJenisLayanan test = new TambahJenisLayanan();

  //   test.tambahPesanan();
    
  //   for (String string : pesanan.dataPesanan) {
  //     System.out.println(string);
  //   }
  //   for (int harga : pesanan.dataHarga) {
  //     System.out.println(harga);
  //   }
  //   for (int kuantitas : pesanan.dataTotalLembar) {
  //     System.out.println(kuantitas);
  //   }
  // }
}