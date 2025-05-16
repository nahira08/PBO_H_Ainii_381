package Modul5;

// Custom exception yang akan digunakan jika stok barang tidak mencukupi
public class StokTidakCukupException extends Exception {
    // Constructor: menerima pesan error khusus yang bisa ditampilkan saat exception terjadi
    public StokTidakCukupException(String message) {
        super(message); // Kirim pesan ke constructor superclass (Exception)
    }
}
