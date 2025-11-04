import java.util.Scanner;

public class BiayaPengiriman1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=====================================");
        System.out.println("      Program Hitung Biaya Kirim");
        System.out.println("=====================================\n");

        System.out.print("Masukkan berat paket (kg): ");
        double berat = sc.nextDouble();

        System.out.print("Masukkan jarak tempuh (km): ");
        double jarak = sc.nextDouble();

        System.out.println("\nMasukkan ukuran paket (cm):");
        System.out.print("Panjang: ");
        double panjang = sc.nextDouble();
        System.out.print("Lebar: ");
        double lebar = sc.nextDouble();
        System.out.print("Tinggi: ");
        double tinggi = sc.nextDouble();

        double volume = panjang * lebar * tinggi;
        double tarifPerKg = (jarak <= 10) ? 4250 : 6000;
        double biayaUtama = berat * tarifPerKg;
        double biayaTambahan = (volume > 100) ? 50000 : 0;
        double total = biayaUtama + biayaTambahan;

        System.out.println("\n========== RINCIAN BIAYA ==========");
        System.out.printf("Berat Paket\t\t: %.2f kg\n", berat);
        System.out.printf("Jarak Tempuh\t\t: %.2f km\n", jarak);
        System.out.printf("Volume Paket\t\t: %.2f cm³\n", volume);
        System.out.printf("Tarif per Kg\t\t: Rp %.0f\n", tarifPerKg);
        System.out.printf("Biaya Berdasarkan Berat: Rp %.0f\n", biayaUtama);
        System.out.printf("Biaya Tambahan Volume\t: Rp %.0f\n", biayaTambahan);
        System.out.println("-----------------------------------");
        System.out.printf("Total Biaya Pengiriman\t: Rp %.0f\n", total);
        System.out.println("=====================================");

        sc.close();
    }
}