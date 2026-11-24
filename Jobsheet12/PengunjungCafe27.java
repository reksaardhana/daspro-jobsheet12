package Jobsheet12;

public class PengunjungCafe27 {
    static void daftarPengunjung(String... namaPengunjung, int... nomorMeja) {
        System.out.println("Meja nomor " + nomorMeja);
        System.out.println("Daftar Nama Pengunjung:");
        for (String nama : namaPengunjung) {
            System.out.println("- " + nama);
        }
    }

    public static void main(String[] args) {
        daftarPengunjung("Ali", "Budi", "Citra");
    }
}