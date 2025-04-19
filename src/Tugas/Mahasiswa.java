package Tugas;
class Mahasiswa { 
    final String Nama = "Nur Aini";
    final String Nim = "202410370110381";

    void displayInfo() { 
        System.out.println("\nNama: " + Nama);
        System.out.println("Password: " + Nim);
    }

    void login(String getUsername, String getPassword) { 
        if (getUsername.equals(Nama) && getPassword.equals(Nim)) {
            displayInfo();
            System.out.println("Login Mahasiswa berhasil!");
        } else {
            System.out.println("Login gagal! Nama atau NIM salah.");
        }
    }
}