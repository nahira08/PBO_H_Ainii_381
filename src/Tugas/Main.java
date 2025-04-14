package Tugas;
import java.util.Scanner;

public class Main { //Di awal main(), saya membuat menu untuk memilih login sebagai Admin atau Mahasiswa.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String menuPilihan;

        // Menampilkan menu login
        System.out.println("Pilih login: ");
        System.out.println("1. Admin ");
        System.out.println("2. Mahasiswa ");
        System.out.print("Masukkan Pilihan: ");

        menuPilihan = input.nextLine();

        // Jika user pilih 1, maka dibuat object Admin, lalu input username dan password, lalu dipanggil method login() milik class Admin
        if (menuPilihan.equals("1")) {
            Admin admin = new Admin(); // Buat objek Admin
            
            System.out.print("Masukkan username: ");
            String username = input.nextLine();

            System.out.print("Masukkan password: ");
            String password = input.nextLine();

            // Panggil method login yang sekarang bertipe void
            admin.login(username, password);
            
        //Jika pilihannya 2, maka buat object Mahasiswa, input nama dan nim, lalu panggil login() milik class Mahasiswa
        } else if (menuPilihan.equals("2")) { 
            Mahasiswa mahasiswa = new Mahasiswa(); 

            System.out.print("Masukkan Nama: ");
            String nama = input.nextLine();

            System.out.print("Masukkan NIM: ");
            String nim = input.nextLine();

            mahasiswa.login(nama, nim);

            // Terakhir, kalau input tidak valid, muncul pesan error 
        } else {
            System.out.println("Pilihan Tidak Valid");
        }

        input.close();
    }
}
