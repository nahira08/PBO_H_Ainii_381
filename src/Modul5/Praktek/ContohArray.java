package Modul5.Praktek;

public class ContohArray {
    public static void main(String[] args) {
        // Membuat array dengan ukuran tetap
        String[] namaHari = new String[3];
        namaHari[0] = "Senin";
        namaHari[1] = "Selasa";
        namaHari[2] = "Rabu";

        // Array langsung dengan nilai
        int[] angkaKeberuntungan = {7, 11, 21, 3};

        // Mengakses elemen array dan panjang
        System.out.println("Hari pertama: " + namaHari[0]);
        System.out.println("Panjang array namaHari: " + namaHari.length);

        // Iterasi dengan for
        System.out.println("\n-- Daftar Hari (For loop) --");
        for (int i = 0; i < namaHari.length; i++) {
            System.out.println("Hari ke-" + (i + 1) + ": " + namaHari[i]);
        }

        // Iterasi dengan for-each
        System.out.println("\n-- Angka Keberuntungan (For-each loop) --");
        for (int angka : angkaKeberuntungan) {
            System.out.println(angka);
        }
    }
}
