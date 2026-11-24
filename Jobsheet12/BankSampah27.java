package Jobsheet12;

import java.util.Scanner;

public class BankSampah27 {
    static Scanner sc = new Scanner(System.in);

    static double[] inputSetoran(int n) {
        double[] setoran = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Berat setoran nasabah ke-" + (i + 1)
                    + " (kg): ");
            setoran[i] = sc.nextDouble();
        }
        return setoran;
    }

    static void tampilSetoran(double[] setoran) {
        for (int i = 0; i < setoran.length; i++) {
            System.out.println("Nasabah ke-" + (i + 1) + ": " + setoran[i]
                    + " kg");
        }
    }

    static double totalSetoran(double[] setoran) {
        double total = 0;
        for (double s : setoran) {
            total += s;
        }
        return total;
    }

    static double hitungSaldo(double berat, double hargaPerKg) {
        return berat * hargaPerKg;
    }

    static int nasabahTerbanyak(double[] setoran) {
        int idx = 0;
        for (int i = 1; i < setoran.length; i++) {
            if (setoran[i] > setoran[idx]) {
                idx = i;
            }
        }
        return idx;
    }

    public static void main(String[] args) {
        System.out.print("Masukkan jumlah nasabah: ");
        int n = sc.nextInt();

        double[] setoran = inputSetoran(n);

        System.out.println("\n=== Data Setoran ===");
        tampilSetoran(setoran);

        System.out.println("\nTotal setoran: " + totalSetoran(setoran)
                + " kg");

        System.out.println("\n=== Saldo Nasabah (Rp3.000/kg) ===");
        for (int i = 0; i < setoran.length; i++) {
            System.out.printf("Nasabah ke-%d: Rp%.2f%n", (i + 1),
                    hitungSaldo(setoran[i], 3000));
        }

        int idx = nasabahTerbanyak(setoran);
        System.out.println("\nNasabah dengan setoran terbanyak: nasabah ke-"
                + (idx + 1) + " (" + setoran[idx] + " kg)");
    }
}