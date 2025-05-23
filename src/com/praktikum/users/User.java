package com.praktikum.users;

public abstract class User { // inii superclass buat Admin sama Mahasiswa
    private String nama; // Nunjukin bagian penting aja, detailnya disembunyiin. 
    private String nim; // Kerangka class, isi di subclass

    public User(String nama, String nim) { // construktornyaa
        this.nama = nama;
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    // Abstract method wajib diisi oleh child-class (Admin & Mahasiswa)
    public abstract boolean login();
    public abstract void displayAppMenu();
    public abstract void displayInfo();

}
