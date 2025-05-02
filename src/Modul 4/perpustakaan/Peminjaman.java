package perpustakaan;

public interface Peminjaman { // interface itu kontrak perilaku 
    void pinjamBuku(String judul);
    void kembalikanBuku(String judul);
}
