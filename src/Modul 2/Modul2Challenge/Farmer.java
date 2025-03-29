package Modul2Challenge;

public class Farmer {
    String name;
    Plant favouritePlant;

    Farmer(String name, Plant favouritePlant) {
        this.name = name;
        this.favouritePlant = favouritePlant;
    }

    void talk() {
        System.out.println("Halo, saya " + name + ", dan tanaman favorit saya adalah " 
            + favouritePlant.name + " (tipe: " + favouritePlant.type + ")");
    }
}

