package Modul2Challenge;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Buat objek itemnyaa
        Item semangka = new Item("Semangka", "Buah");
        Item mawar = new Item("Mawar", "Bunga");
        Item tuna = new Item("Tuna", "Daging Ikan");

        // Buat objek person dengan item favorit masing-masing
        Person person1 = new Person("Radyaa", semangka);
        Person person2 = new Person("Ainii", mawar);
        Person person3 = new Person("Emengg", tuna);

        // Output nyaa
        System.out.println("Hello world!");
        System.out.println("Current date and time: " + new Date());

        person1.talk();
        person2.talk();
        person3.talk();
    }
}


