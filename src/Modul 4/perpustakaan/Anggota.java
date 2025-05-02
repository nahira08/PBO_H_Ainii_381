package perpustakaan;

public class Anggota implements Peminjaman { // sehingga harus mematuhi aturan
    private String nama;
    private String idAnggota;

    public Anggota(String nama, String idAnggota) {
        this.nama = nama;
        this.idAnggota = idAnggota;
    }

    public void pinjamBuku(String judul) {
        System.out.println(nama + " meminjam buku berjudul : " + judul);
    }

    public void pinjamBuku(String judul, int durasiHari) {
        System.out.println(nama + " meminjam buku \"" + judul + "\" selama " + durasiHari + " hari.");
    }

    public void kembalikanBuku(String judul) {
        System.out.println(nama + " mengembalikan buku berjudul : " + judul);
    }

    public void display() {
        System.out.println("Anggota: " + nama + " (ID: " + idAnggota + ")");
    }
    
}
