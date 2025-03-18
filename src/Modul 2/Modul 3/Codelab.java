// package Codelab.

class KarakterGame {
    private String nama;
    private int kesehatan;

    public KaracterGame(String nama, int kesehatan) {
        this.nama = nama;
        this.kesehatan = kesehatan;
    }

    void setnama(String nama) {
        this.nama = nama;
    }

    String getnama() {
        return nama;
    }

    void setKesehatan(int kesehatan) {
        this.kesehatan = kesehatan;
    }

    int getKesehatan() {
        return kesehatan;
    }

    void serang(KarakterGame target) {
    }
}

class Pahlawan extends KarakterGame {
    public Pahlawan(String nama, int kesehatan) {
        super(nama, kesehatan);
    }

    @Override
    void serang(KarakterGame target) {
        target.setKesehatan(target.getKesehatan() - 20);
        System.out.println("%s menyerang %s menggunakan ");
    }
}