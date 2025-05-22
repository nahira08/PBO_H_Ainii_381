package Modul5.Codelab;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator; // ← Diperlukan karena akuu pakai Iterator sekarang
import java.util.Scanner;

public class ManajemenStok {
    public static void main(String[] args) {
        ArrayList<Barang> daftarBarang = new ArrayList<>(); // ARRAYLISTS > data bisa berubah-ubah
        Scanner scanner = new Scanner(System.in); // Untuk input user
        boolean lanjutbang = true; // Flag loop menu

        // ARRAYLISTS (data awal)
        daftarBarang.add(new Barang("Matcha", 10));
        daftarBarang.add(new Barang("Dark choco", 5)); // Array > jumlah data tetap
        daftarBarang.add(new Barang("Avocado", 15));

        while (lanjutbang) {
            System.out.println("\n===== Menu Manajemen Stok =====");
            System.out.println("1. Tambah Barang Baru");
            System.out.println("2. Tampilkan Semua Barang");
            System.out.println("3. Kurangi Stok Barang");
            System.out.println("4. Hapus Barang"); // ← Menu tambahannyaa
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            String pilihan = scanner.nextLine();

            if (pilihan.equals("1")) {
                // Tambah barang
                System.out.print("Masukkan nama barang: ");
                String nama = scanner.nextLine();

                try {
                    System.out.print("Masukkan stok awal: ");
                    int stok = scanner.nextInt(); // EXCEPTIONS > Penanganan Error Saat Input Stok
                    scanner.nextLine(); // buang newline
                    daftarBarang.add(new Barang(nama, stok));
                    System.out.println("Barang '" + nama + "' berhasil ditambahkan.");
                } catch (InputMismatchException e) {
                    System.out.println("Input stok harus berupa angka!");
                    scanner.nextLine(); // bersihkan buffer
                }

            } else if (pilihan.equals("2")) {
                // Tampilkan semua barang (pakai ITERATOR yaw)
                if (daftarBarang.isEmpty()) {
                    System.out.println("Stok barang kosong.");
                } else {
                    System.out.println("--- Daftar Barang ---");
                    Iterator<Barang> iterator = daftarBarang.iterator(); // ← ITERATOR
                    int i = 0;
                    while (iterator.hasNext()) { // hasNext > Next > remove ( method ITERATOR YAW)
                        Barang b = iterator.next();
                        System.out.println(i + ". Nama: " + b.getNama() + ", Stok: " + b.getStok());
                        i++;
                    }
                }

            } else if (pilihan.equals("3")) {
                // Kurangi stok 
                if (daftarBarang.isEmpty()) { // indexed for loop > 
                    System.out.println("Stok barang kosong.");
                } else {
                    System.out.println("--- Pilih Barang yang Akan Dikurangi ---");
                    for (int i = 0; i < daftarBarang.size(); i++) {
                        Barang b = daftarBarang.get(i);
                        System.out.println(i + ". " + b.getNama() + " (Stok: " + b.getStok() + ")");
                    }

                    try {
                        System.out.print("Masukkan indeks barang: ");
                        int indeks = scanner.nextInt();

                        System.out.print("Masukkan jumlah yang akan diambil: ");
                        int jumlah = scanner.nextInt(); // akses elemen berdasarkan indeks
                        scanner.nextLine();

                        Barang b = daftarBarang.get(indeks);

                        if (jumlah > b.getStok()) {
                            throw new StokTidakCukupException("Stok untuk '" + b.getNama() + "' hanya tersisa " + b.getStok());
                        }

                        b.setStok(b.getStok() - jumlah);
                        System.out.println("Stok barang '" + b.getNama() + "' berhasil dikurangi. Sisa stok: " + b.getStok());

                    } catch (InputMismatchException e) {
                        System.out.println("Input harus berupa angka!");
                        scanner.nextLine();
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Indeks tidak valid!");
                    } catch (StokTidakCukupException e) {
                        System.out.println("ERROR: " + e.getMessage());
                    }
                }

            } else if (pilihan.equals("4")) {
                // Hapus barang
                if (daftarBarang.isEmpty()) {
                    System.out.println("Tidak ada barang untuk dihapus.");
                } else {
                    System.out.println("--- Daftar Barang ---");
                    for (int i = 0; i < daftarBarang.size(); i++) {
                        Barang b = daftarBarang.get(i);
                        System.out.println(i + ". " + b.getNama() + " (Stok: " + b.getStok() + ")");
                    }

                    try {
                        System.out.print("Masukkan indeks barang yang ingin dihapus: ");
                        int indeks = scanner.nextInt();
                        scanner.nextLine();

                        Barang b = daftarBarang.get(indeks);
                        daftarBarang.remove(indeks);
                        System.out.println("Barang '" + b.getNama() + "' berhasil dihapus.");
                    } catch (InputMismatchException e) {
                        System.out.println("Input harus berupa angka!");
                        scanner.nextLine();
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Indeks tidak valid!");
                    }
                }

            } else if (pilihan.equals("0")) {
                lanjutbang = false;
                System.out.println("Terima kasih!");
            } else {
                System.out.println("Pilihan tidak valid.");
            }
        }

        scanner.close(); // tutup Scanner
    }
}
