package com.praktikum.users;

import com.praktikum.actions.MahasiswaActions;
import java.util.Scanner;

public class Mahasiswa extends User implements MahasiswaActions {

    public Mahasiswa(String nama, String nim) {
        super(nama, nim);
    }

    @Override
    public boolean login() {
        if (getNama().equals("Nur Aini") && getNim().equals("381")) {
            System.out.println("Login Mahasiswa sukses!\n");
            return true;
        } else {
            System.out.println("Nama atau NIM salah!\n");
            return false;
        }
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
        System.out.print("Masukkan Nama Barang: ");
        String namaBarang = scanner.nextLine();
        System.out.print("Masukkan Deskripsi Barang: ");
        String deskripsi = scanner.nextLine();
        System.out.print("Masukkan Lokasi Terakhir/Ditemukan: ");
        String lokasi = scanner.nextLine();

        System.out.println(">> Laporan telah diterima.");
        System.out.println("Barang: " + namaBarang);
        System.out.println("Deskripsi: " + deskripsi);
        System.out.println("Lokasi: " + lokasi);
    }

    @Override
    public void viewReportedItems() {
        System.out.println(">> Fitur Lihat Laporan Belum Tersedia <<");
    }

    @Override
    public void displayAppMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
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
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}
