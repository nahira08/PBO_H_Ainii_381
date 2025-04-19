package Tugas;

import java.util.Scanner;

public class Main { // program utama buat menjalankan program
    public static void main(String[] args) { // first method yaw
        Scanner input = new Scanner(System.in);

        System.out.println("=========== LOGIN SYSTEM ===========");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Pilih login: ");
        String menuPilihan = input.nextLine();

        if (menuPilihan.equals("1")) { // login si admin
            System.out.print("Masukkan username: ");
            String username = input.nextLine();

            System.out.print("Masukkan password: ");
            String password = input.nextLine();

            // buat objek si admin
            Admin admin = new Admin("Nur Aini Admin", "202410370110381", username, password);

            // hanya tampilkan info kalau login berhasil
            if (admin.login()) {
                admin.displayInfo();
            }

        } else if (menuPilihan.equals("2")) { // login si mahasiswa
            System.out.print("Masukkan Nama: ");
            String nama = input.nextLine();

            System.out.print("Masukkan NIM : ");
            String nim = input.nextLine();

            Mahasiswa mahasiswa = new Mahasiswa(nama, nim);

            // hanya tampilkan info kalau login berhasil
            if (mahasiswa.login()) {
                mahasiswa.displayInfo();
            }

        } else {
            System.out.println("Pilihan tidak valid.");
        }

        input.close();
    }
}
