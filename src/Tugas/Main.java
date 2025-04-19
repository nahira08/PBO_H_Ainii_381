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

        if (menuPilihan.equals("1")) {
            System.out.print("Masukkan username: ");
            String username = input.nextLine();

            System.out.print("Masukkan password: ");
            String password = input.nextLine();

            Admin admin = new Admin("Nur Aini Admin", "202410370110381", username, password);
            admin.login();         
            admin.displayInfo();   

        } else if (menuPilihan.equals("2")) {
            System.out.print("Masukkan Nama: ");
            String nama = input.nextLine();

            System.out.print("Masukkan NIM : ");
            String nim = input.nextLine();

            Mahasiswa mahasiswa = new Mahasiswa(nama, nim);
            mahasiswa.login();         
            mahasiswa.displayInfo();   

        } else {
            System.out.println("Pilihan tidak valid.");
        }

        input.close();
    }
}
