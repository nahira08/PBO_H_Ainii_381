import java.util.Scanner;

class Admin {
    final String username = "Admin381";
    final String password = "Password381";

    void login(String getUsername, String getPassword) {
        if (getUsername.equals(username) && getPassword.equals(password)) {
            System.out.println("Login Admin berhasil!");
        } else {
            System.out.println("Login gagal! Username atau password salah.");
        }
    }
} 

class Mahasiswa {
    final String username = "Nur Aini";
    final String password = "202410370110381";

    void displayInfo() {
        System.out.println("\nNama: " + username);
        System.out.println("Password: " + password);
    }

    void login(String getUsername, String getPassword) {
        if (getUsername.equals(username) && getPassword.equals(password)) {
            displayInfo();
            System.out.println("Login Mahasiswa berhasil!");
        } else {
            System.out.println("Login gagal! Nama atau NIM salah.");
        }
    }
}

public class Tugas_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String menuPilihan;

        // Menampilkan menu login
        System.out.println("Pilih login: ");
        System.out.println("1. Admin ");
        System.out.println("2. Mahasiswa ");
        System.out.print("Masukkan Pilihan: ");

        menuPilihan = input.nextLine();

        // proses login Admin
        if (menuPilihan.equals("1")) {
            Admin admin = new Admin(); // Buat objek Admin
            
            System.out.print("Masukkan username: ");
            String username = input.nextLine();

            System.out.print("Masukkan password: ");
            String password = input.nextLine();

            // Panggil method login yang sekarang bertipe void
            admin.login(username, password);
            
        } else if (menuPilihan.equals("2")) {
            Mahasiswa mahasiswa = new Mahasiswa(); // Buat objek Mahasiswa

            System.out.print("Masukkan Nama: ");
            String nama = input.nextLine();

            System.out.print("Masukkan NIM: ");
            String nim = input.nextLine();

            // Panggil method login yang sekarang bertipe void
            mahasiswa.login(nama, nim);

        } else {
            System.out.println("Pilihan Tidak Valid");
        }

        input.close();
    }
}
