import java.util.Scanner;

public class tugas216 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jenis;

        do {
            int durasi;
            int total = 0;

            System.out.println("\n--- Program Hitung Biaya Parkir ---");
            System.out.println("Masukkan jenis kendaraan:");
            System.out.println("1. Mobil");
            System.out.println("2. Motor");
            System.out.println("0. Keluar");
            System.out.print("Pilihan Anda: ");
            
            jenis = sc.nextInt();

            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi parkir (jam): ");
                durasi = sc.nextInt();

                if (durasi > 5) {
                    total = 12500;
                } else {
                    if (jenis == 1) {
                        total = durasi * 3000;
                    } else {
                        total = durasi * 2000;
                    }
                }
                System.out.println("------------------------------------");
                System.out.println("Total biaya parkir: Rp " + total);
                System.out.println("------------------------------------");

            } else if (jenis == 0) {
                System.out.println("Terima kasih telah menggunakan program ini.");
            } else {
                System.out.println("Pilihan jenis kendaraan tidak valid.");
            }

        } while (jenis != 0);

        sc.close();
    }
}