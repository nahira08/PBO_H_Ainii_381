import java.util.Scanner;

public class Tugas_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int pilihan;

        // Data valid untuk login Admin
        final String NIM_TERAKHIR = "381";
        final String ADMIN_USERNAME = "Admin" + NIM_TERAKHIR;
        final String ADMIN_PASSWORD = "Password" + NIM_TERAKHIR;

        // Data valid untuk login Mahasiswa
        final String MAHASISWA_NAMA = "Nur Aini";
        final String MAHASISWA_NIM = "202410370110381";

        System.out.println("Pilih login: ");
        System.out.println("1. Admin ");
        System.out.println("2. Mahasiswa ");
        System.out.print("Masukkan Pilihan: ");

        pilihan = scanner.nextInt();
        scanner.nextLine();

        if (pilihan == 1) {

            System.out.print("Masukkan username: ");
            String username = scanner.nextLine();

            System.out.print("Masukkan password: ");
            String password = scanner.nextLine();

            if (username.equals(ADMIN_USERNAME) && password.equals(ADMIN_PASSWORD)) {
                System.out.println("Login Admin berhasil!");
            } else {
                System.out.println("Login gagal! Username atau password salah.");
            }

        } else if (pilihan == 2) {

            System.out.print("Masukkan Nama: ");
            String nama = scanner.nextLine();

            System.out.print("Masukkan NIM: ");
            String nim = scanner.nextLine();

            if (nama.equalsIgnoreCase(MAHASISWA_NAMA)&& nim.equals(MAHASISWA_NIM)) {
                System.out.println("Login Mahasiswa berhasil!");
            } else {
                System.out.println("Login gagal! Nama atau NIM salah.");
            }

        } else {
            System.out.println("Pilihan Tidak Valid");
        }

        scanner.close();
    }
}
