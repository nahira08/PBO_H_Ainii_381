package com.praktikum.users;

import com.praktikum.actions.MahasiswaActions;
import com.praktikum.data.Item;
import com.praktikum.main.LoginSystem;
import java.util.Scanner;

public class Mahasiswa extends User implements MahasiswaActions {

    public Mahasiswa(String nama, String nim) {
        super(nama, nim);
    }

    @Override
    public boolean login() {
        System.out.println("Login Mahasiswa sukses!\n");
        return true;
    }

    @Override
    public void displayInfo() {
        if (getNama().equals("Nur Aini") && getNim().equals("381")) {
            System.out.println("==================================");
            System.out.println("       HALAMAN MAHASISWA");
            System.out.println("==================================");
            System.out.printf("Nama Mahasiswa : %s\n", getNama());
            System.out.printf("NIM            : %s\n", getNim());
            System.out.println("==================================\n");
        }
    }

    @Override
    public void reportItem() {
        Scanner scanner = new Scanner(System.in);
        try { // Exceptions = Menangani error input & akses data saat runtimee
            System.out.print("Masukkan Nama Barang: ");
            String namaBarang = scanner.nextLine();

            System.out.print("Masukkan Deskripsi Barang: ");
            String deskripsi = scanner.nextLine();

            System.out.print("Masukkan Lokasi Terakhir/Ditemukan: ");
            String lokasi = scanner.nextLine();

            // ArrayLists = bisa tambah/hapus data biar fleksibel
            Item item = new Item(namaBarang, deskripsi, lokasi);
            LoginSystem.reportedItems.add(item);

            System.out.println("\n>> Laporan telah diterima dan disimpan!");
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan saat input laporan: " + e.getMessage());
        }
    }

    @Override
    public void viewReportedItems() {
        if (LoginSystem.reportedItems.isEmpty()) {
            System.out.println(">> Belum ada laporan barang.");
        } else {
            System.out.println("=== Daftar Barang yang Dilaporkan ===");
            int count = 0;

            // Iterator = Menelusuri data dalam koleksi (pakai for-each yaw)
            for (Item item : LoginSystem.reportedItems) {
                if (item.getStatus().equals("Reported")) {
                    count++;
                    System.out.println(item);
                    System.out.println("-----------------------------");
                }
            }
            if (count == 0) {
                System.out.println(">> Tidak ada item dengan status 'Reported'.");
            }
        }
    }

    @Override
    public void displayAppMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("\n=== MENU MAHASISWA ===");
            System.out.println("1. Laporkan Barang Temuan/Hilang");
            System.out.println("2. Lihat Daftar Laporan");
            System.out.println("0. Logout");
            System.out.print("Pilih menu: ");
            String pilihan = scanner.nextLine();

            switch (pilihan) {
                case "1":
                    reportItem();
                    break;
                case "2":
                    viewReportedItems();
                    break;
                case "0":
                    System.out.println("Logout...");
                    LoginSystem.main(null);
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}
