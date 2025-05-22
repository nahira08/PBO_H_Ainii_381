package Modul5.Praktek;

import java.util.ArrayList;

public class ContohArrayList {
    public static void main(String[] args) {
        ArrayList<String> daftarNama = new ArrayList<>();

        // Menambahkan elemen
        daftarNama.add("Matcha");
        daftarNama.add("Dark Choco");
        daftarNama.add("Avocado");

        // Akses dan manipulasi dengan aman
        System.out.println("Nama pertama: " + daftarNama.get(0));
        daftarNama.set(1, "Matcha");
        if (daftarNama.size() > 1) daftarNama.remove(2);

        System.out.println("Nama kedua: " + daftarNama.get(0));
        daftarNama.set(1, "Dark Choco");
        if (daftarNama.size() > 2) daftarNama.remove(2);

        System.out.println("Nama ketiga: " + daftarNama.get(0));
        if (daftarNama.size() > 1) daftarNama.set(1, "Avocado");
        if (daftarNama.size() > 3) daftarNama.remove(2);

        // Tampilkan hasil akhir
        System.out.println("\n-- Daftar Nama --");
        for (String nama : daftarNama) {
            System.out.println(nama);
        }
    }
}

