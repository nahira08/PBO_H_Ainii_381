package app;

import perpustakaan.*;

public class Main {
    public static void main(String[] args) {
        // Daftar buku
        Nonfiksi buku1 = new Nonfiksi("Unity Tutorial", "Rickman Roedavan", "Pembuatan Game");
        Fiksi buku2 = new Fiksi("Thai Tea Confession", "Eka Kurniawan", "Fiksi");
        Fiksi buku3 = new Fiksi("Matcha Minuman Favoritku", "Nur Aini", "Fiksi");

        // Daftar anggota
        Anggota anggota1 = new Anggota("Alifia", "H334");
        Anggota anggota2 = new Anggota("Marvel", "H379");
        Anggota anggota3 = new Anggota("Aini", "H381");

        // Cetak daftar buku
        System.out.println("==== Daftar Buku ====");
        System.out.println();
        System.out.println("- Buku Non-Fiksi:");
        buku1.displayInfo();
        System.out.println();

        System.out.println("- Buku Fiksi:");
        buku2.displayInfo();
        buku3.displayInfo();
        System.out.println();

        // Cetak data anggota
        System.out.println("==== Data Anggota ====");
        System.out.println();
        anggota1.display();
        anggota2.display();
        anggota3.display();
        System.out.println();

        // Proses peminjaman
        System.out.println("==== Aktivitas Peminjaman ====");
        System.out.println();
        anggota1.pinjamBuku("Unity Tutorial");
        anggota2.pinjamBuku("Cantik Itu Luka", 7);
        anggota3.pinjamBuku("Matcha Minuman Favoritku");
        System.out.println();

        // Proses pengembalian
        System.out.println("==== Aktivitas Pengembalian ====");
        System.out.println();
        anggota1.kembalikanBuku("Unity Tutorial");
        anggota2.kembalikanBuku("Cantik Itu Luka");
        anggota3.kembalikanBuku("Matcha Minuman Favoritku");

        System.out.println("\n===========================");
    }
}
