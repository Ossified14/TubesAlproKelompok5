package ui;

import java.util.Scanner;

public class MenuView {
  private static MenuData menuData = new MenuData();
  private static Scanner input = new Scanner(System.in);
  private static MenuService service = new MenuService();

  public static void tampilkanMenu() {
    Boolean condition = true;
    Boolean fistTime = true;
    int pilihMenu;

    do {
      if (fistTime) {
        for (int i=0; i<menuData.getMenu().length; i++){
          System.out.println((i+1)+ ". " + menuData.getMenu()[i]);
        }
        fistTime = false;
      }

      System.out.print("Input menu: ");
      pilihMenu = input.nextInt();

      if (pilihMenu == 1) {
        service.tambahJenisLayanan.tambahPesanan();
      }
      if (pilihMenu == 2) {
        service.ubahJumlahLembar.ubahJumlahLembar();
      }
      if (pilihMenu == 3) {
        service.tampilkanPesanan.tampilkanPesanan();
      }
      if (pilihMenu == 4) {
        service.hapusLayanan.HapusPesanan();
      }
      if (pilihMenu == 5) {
        service.hitungTotalBiaya.hitungTotalBiaya();
      }
      if (pilihMenu == 6) {
        for (int i=0; i<menuData.getMenu().length; i++){
          System.out.println((i+1)+ ". " + menuData.getMenu()[i]);
        }
      }
      if (pilihMenu == 7) {
        condition = false;
      }
    } while (condition);
  }
}