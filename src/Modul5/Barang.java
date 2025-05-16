package Modul5;

// Class Barang digunakan untuk menyimpan data tiap barang di program
public class Barang {
    private String nama; // Nama barang 
    private int stok;   // Jumlah stok barang

    // Constructor: digunakan saat membuat objek Barang baru
    public Barang(String nama, int stok) {
        this.nama = nama;
        this.stok = stok;
    }

    // Getter: inii untuk mengambil nama barang
    public String getNama() {
        return nama;
    }

    // Getter: inii untuk mengambil jumlah stok barang
    public int getStok() {
        return stok;
    }

    // Setter: inii untuk mengubah nilai stok barang (misalnya saat dikurangi)
    public void setStok(int stok) {
        this.stok = stok;
    }
}
