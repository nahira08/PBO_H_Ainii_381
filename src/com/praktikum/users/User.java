package com.praktikum.users;

public abstract class User { // inii superclass buat Admin sama Mahasiswa
    private String nama;
    private String nim;

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

    public abstract boolean login();
    public abstract void displayAppMenu();
    public abstract void displayInfo();

}
