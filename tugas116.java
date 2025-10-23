import java.util.Scanner;

public class tugas116 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int HARGA_TIKET = 50000;
        int totalTiketHarian = 0;
        double totalPenjualanHarian = 0.0;
        char lanjutTransaksi;

        System.out.println("--- PROGRAM KASIR TIKET BIOSKOP ---");

        do {
            int jumlahTiket;

            do {
                System.out.print("\nMasukkan jumlah tiket yang dibeli: ");
                jumlahTiket = sc.nextInt();
                if (jumlahTiket < 0) {
                    System.out.println("Input tidak valid. Jumlah tiket tidak boleh negatif. Silakan coba lagi.");
                }
            } while (jumlahTiket < 0);
            
            if (jumlahTiket == 0) {
                System.out.println("Tidak ada tiket yang dibeli.");
            } else {
                double subtotal = (double) jumlahTiket * HARGA_TIKET;
                double diskon = 0.0;

                if (jumlahTiket > 10) {
                    diskon = subtotal * 0.15;
                } else if (jumlahTiket > 4) {
                    diskon = subtotal * 0.10;
                }

                double totalBayar = subtotal - diskon;

                System.out.println("--- Detail Pembayaran ---");
                System.out.printf("Total Harga: Rp %,.0f%n", subtotal);
                if (diskon > 0) {
                    System.out.printf("Diskon:      Rp %,.0f%n", diskon);
                }
                System.out.printf("Total Bayar: Rp %,.0f%n", totalBayar);
                System.out.println("-------------------------");

                totalTiketHarian += jumlahTiket;
                totalPenjualanHarian += totalBayar;
            }

            System.out.print("\nApakah ada transaksi lain? (y/n): ");
            lanjutTransaksi = sc.next().charAt(0);

        } while (lanjutTransaksi == 'y' || lanjutTransaksi == 'Y');

        System.out.println("\n--- RINGKASAN PENJUALAN HARIAN ---");
        System.out.println("Total tiket yang terjual: " + totalTiketHarian + " tiket");
        System.out.printf("Total pendapatan hari ini: Rp %,.0f%n", totalPenjualanHarian);
        System.out.println("------------------------------------");

        sc.close();
    }
}