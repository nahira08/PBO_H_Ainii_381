package Modul2Challenge;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Buat objek tanaman
        Plant Tomat = new Plant("Tomat", "Sayur");
        Plant Mawar = new Plant("Mawar", "Bunga");
        Plant Mangga = new Plant("Mangga", "Buah");

        // Buat petani dengan tanaman favorit
        Farmer farmer1 = new Farmer("Siti", Tomat);
        Farmer farmer2 = new Farmer("Budi", Mawar);
        Farmer farmer3 = new Farmer("Joko", Mangga);

        // Output
        System.out.println("Hello world!");
        System.out.println("Current date and time: " + new Date());

        farmer1.talk();
        farmer2.talk();
        farmer3.talk();
    }
}

