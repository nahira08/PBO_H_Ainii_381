package com.praktikum.main;

import com.praktikum.data.Item;
import com.praktikum.users.*;
import java.util.ArrayList;
import java.util.Scanner;

public class LoginSystem {

    // ArrayList = menyimpan semua user dan laporan barangnyaa
    public static ArrayList<User> userList = new ArrayList<>();
    public static ArrayList<Item> reportedItems = new ArrayList<>(); 

    // Tambah user default (Admin & Mahasiswa)
    public static void initDefaultUsers() { // ngisi data awal3
        userList.add(new Admin("Nur Aini Admin", "202410370110381", "Admin381", "Password381"));
        userList.add(new Mahasiswa("Nur Aini", "381"));

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        initDefaultUsers(); // inisialisasi userListt

        System.out.println("=========== LOGIN SYSTEM ===========");
        System.out.print("Masukkan username/Nama: ");
        String uname = input.nextLine();

        System.out.print("Masukkan password/NIM: ");
        String pw = input.nextLine();

        User user = null;

        // Iterator = enchanced for-loop untuk menelusuri userlistt
        for (User u : userList) {
            if (u instanceof Admin) {
                Admin a = (Admin) u;
                if (a.getUsername().equals(uname) && a.getPassword().equals(pw)) {
                    user = a;
                    break;
                }
            } else if (u instanceof Mahasiswa) {
                Mahasiswa m = (Mahasiswa) u;
                if (m.getNama().equals(uname) && m.getNim().equals(pw)) {
                    user = m;
                    break;
                }
            }
        }

        // Pengecekan login berhasill
        if (user != null && user.login()) {
            user.displayInfo();
            user.displayAppMenu();
        } else {
            System.out.println("Login gagal. Username atau password/NIM salah.");
        }

        input.close();
    }
}
