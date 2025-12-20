package metode;

import data.Pesanan;
import java.util.Scanner;

public class TambahJenisLayanan {
  private static Scanner input = new Scanner(System.in);

  Pesanan pesanan = new Pesanan();

  private void tambahPesanan(String e) {
    System.out.print("input pesanan:");
    String x = input.nextLine();

    pesanan.dataPesanan.add(x);
  }
}