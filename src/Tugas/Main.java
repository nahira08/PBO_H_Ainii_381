package Tugas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=========== LOGIN SYSTEM ===========");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Pilih login: ");
        String menuPilihan = input.nextLine();

        // Pilihan login sebagai Admin
        if (menuPilihan.equals("1")) {
            System.out.print("Masukkan username: ");
            String username = input.nextLine();

            System.out.print("Masukkan password: ");
            String password = input.nextLine();

            // Admin menggunakan constructor dengan super() ke User
            Admin admin = new Admin("Nur Aini Admin", "202410370110381", username, password);
            admin.login();         // Override dari User
            admin.displayInfo();   // Override dari User

        // Pilihan login sebagai Mahasiswa
        } else if (menuPilihan.equals("2")) {
            System.out.print("Masukkan Nama: ");
            String nama = input.nextLine();

            System.out.print("Masukkan NIM : ");
            String nim = input.nextLine();

            // Mahasiswa juga menggunakan inheritance dari User
            Mahasiswa mahasiswa = new Mahasiswa(nama, nim);
            mahasiswa.login();         // Override dari User
            mahasiswa.displayInfo();   // Override dari User

        // Pilihan tidak valid
        } else {
            System.out.println("Pilihan tidak valid.");
        }

        input.close();
    }
}
