package Tugas;
class Mahasiswa { // Di class Mahasiswa, saya menyimpan nama dan NIM.
    final String Nama = "Nur Aini";
    final String Nim = "202410370110381";

    void displayInfo() { //  Jika login berhasil, method displayInfo() akan menampilkan nama dan NIM mahasiswa.
        System.out.println("\nNama: " + Nama);
        System.out.println("Password: " + Nim);
    }

    void login(String getUsername, String getPassword) { // Sama seperti Admin, method login() digunakan untuk verifikasi input user.
        if (getUsername.equals(Nama) && getPassword.equals(Nim)) {
            displayInfo();
            System.out.println("Login Mahasiswa berhasil!");
        } else {
            System.out.println("Login gagal! Nama atau NIM salah.");
        }
    }
}