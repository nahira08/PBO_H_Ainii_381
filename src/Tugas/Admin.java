package Tugas;
public class Admin { // Di sini saya membuat class Admin yang menyimpan username dan password tetap menggunakan final.
    final String username = "Admin381";
    final String password = "Password381";

    // Method login() akan mencocokkan input pengguna, dan memberikan respons login berhasil atau gagal.
    void login(String getUsername, String getPassword) { 
        if (getUsername.equals(username) && getPassword.equals(password)) {
            System.out.println("Login Admin berhasil!");
        } else {
            System.out.println("Login gagal! Username atau password salah.");
        }
    }
}