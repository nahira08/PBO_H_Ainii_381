package perpustakaan;

public class Nonfiksi extends Buku {
    private String bidang;

    public Nonfiksi(String judul, String penulis, String bidang) {
        super(judul, penulis);
        this.bidang = bidang;
    }

    @Override 
    public void displayInfo() {
        System.out.println("Buku non-fiksi : " + judul + " oleh " + penulis + " (Bidang: " + bidang + ")");
    }
}
