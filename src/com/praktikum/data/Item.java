package com.praktikum.data;

public class Item {
    // ini properti data itemnyaa
    private String itemName;
    private String description;
    private String location;
    private String status;

    // constructorr = method khusus yang dipakai 
    // untuk mengisi nilai awal saat objekk dibuatt
    public Item(String itemName, String description, String location) {
        this.itemName = itemName;
        this.description = description;
        this.location = location;
        this.status = "Reported"; // default status
    }

    // Getter methods
    public String getItemName() {
        return itemName;
    }

    public String getDescription() {
        return description;
    }

    public String getLocation() {
        return location;
    }

    public String getStatus() {
        return status;
    }

    // Setter methods
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Rpresentasi sebagai teks (digunakan saat loop di Iteratornyaa)
    @Override
    public String toString() {
        return "Nama: " + itemName +
               "\nDeskripsi: " + description +
               "\nLokasi: " + location +
               "\nStatus: " + status;
    }
}
