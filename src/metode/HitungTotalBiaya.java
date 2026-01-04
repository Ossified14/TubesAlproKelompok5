package metode;

import data.Pesanan;

public class HitungTotalBiaya {

    // Menghitung total dan menampilkan rincian
    public static int hitungTotalBiaya() {
        int total = 0;

        System.out.println("=== Rincian Pesanan ===");

        for (int i = 0; i < Pesanan.dataPesanan.size(); i++) {

            String nama = Pesanan.dataPesanan.get(i);
            int harga = Pesanan.dataHarga.get(i);
            int jumlah = Pesanan.dataTotalLembar.get(i);

            int subtotal = harga * jumlah;
            total += subtotal;

            System.out.println(
                (i + 1) + ". " + nama +
                " | Harga: Rp " + harga +
                " | Jumlah: " + jumlah +
                " | Subtotal: Rp " + subtotal
            );
        }

        System.out.println("----------------------");
        System.out.println("Total Biaya: Rp " + total);

        return total;
    }

    public static void main(String[] args) {

        // Data pesanan
        Pesanan.dataPesanan.add("Print");
        Pesanan.dataHarga.add(1000);
        Pesanan.dataTotalLembar.add(10);

        Pesanan.dataPesanan.add("Fotocopy");
        Pesanan.dataHarga.add(500);
        Pesanan.dataTotalLembar.add(20);

        // Simpan hasil total
        Pesanan.totalBiaya = hitungTotalBiaya();
    }
}
