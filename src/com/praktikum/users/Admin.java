package com.praktikum.users;

import com.praktikum.actions.AdminActions;
import com.praktikum.data.Item;
import com.praktikum.main.LoginSystem;
import java.util.Scanner;

public class Admin extends User implements AdminActions {
    private String username;
    private String password;

    public Admin(String nama, String nim, String username, String password) {
        super(nama, nim);
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public boolean login() {
        System.out.println("Login Admin berhasil!\n");
        return true;
    }

    @Override
    public void displayInfo() {
        System.out.println("==================================");
        System.out.println("         HALAMAN ADMIN");
        System.out.println("==================================");
        System.out.printf("Nama Admin : %s\n", getNama());
        System.out.printf("NIM        : %s\n", getNim());
        System.out.println("==================================\n");
    }

    @Override
    public void manageItems() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n=== KELOLA LAPORAN BARANG ===");
            System.out.println("1. Lihat Semua Laporan");
            System.out.println("2. Tandai Barang Telah Diambil (Claimed)");
            System.out.println("0. Kembali");
            System.out.print("Pilih menu: ");
            String pilihan = scanner.nextLine();

            switch (pilihan) {
                case "1":
                    if (LoginSystem.reportedItems.isEmpty()) {
                        System.out.println(">> Tidak ada laporan barang.");
                    } else {
                        System.out.println("=== Semua Laporan ===");
                        for (int i = 0; i < LoginSystem.reportedItems.size(); i++) {
                            Item item = LoginSystem.reportedItems.get(i);
                            System.out.printf("[%d] %s - %s (%s)\n", i, item.getItemName(), item.getLocation(), item.getStatus());
                        }
                    }
                    break;

                case "2":
                    try {
                        System.out.println("=== Daftar Barang yang Bisa Ditandai ===");
                        for (int i = 0; i < LoginSystem.reportedItems.size(); i++) {
                            Item item = LoginSystem.reportedItems.get(i);
                            if (item.getStatus().equals("Reported")) {
                                System.out.printf("[%d] %s - %s (%s)\n", i, item.getItemName(), item.getLocation(), item.getStatus());
                            }
                        }

                        System.out.print("Masukkan indeks barang yang ingin ditandai 'Claimed': ");
                        int index = Integer.parseInt(scanner.nextLine());

                        Item selected = LoginSystem.reportedItems.get(index);
                        if (selected.getStatus().equals("Reported")) {
                            selected.setStatus("Claimed");
                            System.out.println("Barang berhasil ditandai sebagai 'Claimed'.");
                        } else {
                            System.out.println("Barang sudah dalam status 'Claimed'.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Input harus berupa angka!");
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Indeks tidak valid. Silakan coba lagi.");
                    }
                    break;

                case "0":
                    return;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    @Override
    public void manageUsers() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n=== KELOLA MAHASISWA ===");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa");
            System.out.println("0. Kembali");
            System.out.print("Pilih menu: ");
            String pilihan = scanner.nextLine();

            switch (pilihan) {
                case "1":
                    System.out.print("Nama Mahasiswa: ");
                    String nama = scanner.nextLine();
                    System.out.print("NIM Mahasiswa: ");
                    String nim = scanner.nextLine();
                    LoginSystem.userList.add(new Mahasiswa(nama, nim));
                    System.out.println("Mahasiswa berhasil ditambahkan.");
                    break;

                case "2":
                    System.out.print("Masukkan NIM Mahasiswa yang ingin dihapus: ");
                    String targetNIM = scanner.nextLine();
                    boolean ditemukan = false;

                    for (int i = 0; i < LoginSystem.userList.size(); i++) {
                        User u = LoginSystem.userList.get(i);
                        if (u instanceof Mahasiswa) {
                            Mahasiswa m = (Mahasiswa) u;
                            if (m.getNim().equals(targetNIM)) {
                                LoginSystem.userList.remove(i);
                                System.out.println("Mahasiswa berhasil dihapus.");
                                ditemukan = true;
                                break;
                            }
                        }
                    }

                    if (!ditemukan) {
                        System.out.println("Mahasiswa dengan NIM tersebut tidak ditemukan.");
                    }
                    break;

                case "0":
                    return;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    @Override
    public void displayAppMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n=== MENU ADMIN ===");
            System.out.println("1. Kelola Laporan Barang");
            System.out.println("2. Kelola Data Mahasiswa");
            System.out.println("0. Logout");
            System.out.print("Pilih menu: ");
            String pilihan = scanner.nextLine();

            switch (pilihan) {
                case "1":
                    manageItems();
                    break;
                case "2":
                    manageUsers();
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
