package ui;

public class MenuView {
  public void tampilkanMenu() {
    MenuData menuData = new MenuData();
    MenuService menuService = new MenuService();

    for (String dataItem : menuData.getMenu()) {
      System.out.println(dataItem);
    }

    menuService.tampilkanPesananUser();
  }
}