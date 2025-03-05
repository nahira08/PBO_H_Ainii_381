import java.util.Scanner;

public class Tugas_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String menuPilihan;

        // Data valid untuk login Admin
        final String NIM_TERAKHIR = "381";
        final String ADMIN_USERNAME = "Admin" + NIM_TERAKHIR;
        final String ADMIN_PASSWORD = "Password" + NIM_TERAKHIR;

        // Data valid untuk login Mahasiswa
        final String MAHASISWA_NAMA = "Nur Aini";
        final String MAHASISWA_NIM = "202410370110381";

        // Menampilkan menu login
        System.out.println("Pilih login: ");
        System.out.println("1. Admin ");
        System.out.println("2. Mahasiswa ");
        System.out.print("Masukkan Pilihan: ");

        menuPilihan = input.nextLine();

         // proses login Admin
          if (menuPilihan.equals("1")) {

            System.out.print("Masukkan username: ");
            String username = input.nextLine();

            System.out.print("Masukkan password: ");
            String password = input.nextLine();

            if (username.equals(ADMIN_USERNAME) && password.equals(ADMIN_PASSWORD)) {
                System.out.println("Login Admin berhasil!");
            } else {
                System.out.println("Login gagal! Username atau password salah.");
            }
            
            // proses login Mahasiswa
        } else if (menuPilihan.equals("2")) {

            System.out.print("Masukkan Nama: ");
            String nama = input.nextLine();

            System.out.print("Masukkan NIM: ");
            String nim = input.nextLine();

            if (nama.equals(MAHASISWA_NAMA)&& nim.equals(MAHASISWA_NIM)) {
                System.out.println("Login Mahasiswa berhasil!");
            } else {
                System.out.println("Login gagal! Nama atau NIM salah.");
            }

            // Menangani input yang tidak valid 
        } else {
            System.out.println("Pilihan Tidak Valid");
        }

        // menutup Scanner
        input.close();
    }
}
