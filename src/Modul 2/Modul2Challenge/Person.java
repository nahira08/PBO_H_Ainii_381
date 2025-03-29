package Modul2Challenge;

public class Person {
    String name;
    Item favouriteItem;

    public Person(String name, Item favouriteItem) {
        this.name = name;
        this.favouriteItem = favouriteItem;
    }

    void talk() {
        System.out.println("Halo saya " + name +
                ", dan item favorit saya adalah " + favouriteItem.name +
                " (tipe: " + favouriteItem.type + ")");
    }
}

