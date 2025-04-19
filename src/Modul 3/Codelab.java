// Author Nur Aini || Nim : 202410370110381

// Superclass untuk semua karakter dalam game
class KarakterGame {
    private String nama;
    private int kesehatan;

    // Constructor untuk inisialisasi nama dan kesehatan karakter
    public KarakterGame(String nama, int kesehatan) {
        this.nama = nama;
        this.kesehatan = kesehatan;
    }

    // Getter untuk mendapatkan nama karakter
    public String getNama() {
        return nama;
    }

    // Getter untuk mendapatkan nilai kesehatan karakter
    public int getKesehatan() {
        return kesehatan;
    }

    // Setter untuk mengatur ulang nilai kesehatan (tidak boleh negatif)
    public void setKesehatan(int kesehatan) {
        if (kesehatan < 0) {
            this.kesehatan = 0; // Mencegah nilai kesehatan negatif
        } else {
            this.kesehatan = kesehatan;
        }
    }

    // Method serang dasar, akan dioverride oleh subclass
    public void serang(KarakterGame target) {
        System.out.println(getNama() + " menyerang " + target.getNama() + " dengan serangan dasar!");
        target.setKesehatan(target.getKesehatan() - 10);
        System.out.println(target.getNama() + " sekarang memiliki kesehatan: " + target.getKesehatan());
    }
}

// Subclass Pahlawan dengan serangan spesial Thunderbolt
class Pahlawan extends KarakterGame {
    public Pahlawan(String nama, int kesehatan) {
        super(nama, kesehatan);
    }

    // Override method serang dengan efek Thunderbolt
    @Override
    public void serang(KarakterGame target) {
        System.out.printf("%s menyerang %s menggunakan Thunderbolt!\n", getNama(), target.getNama());
        target.setKesehatan(target.getKesehatan() - 20);

        System.out.printf("Kesehatan %s sekarang %d\n\n", target.getNama(), target.getKesehatan());
        if (target.getKesehatan() == 0) {
            System.out.printf("%s die...\n\n", target.getNama());
        }
    }
}

// Subclass Musuh dengan serangan spesial Shadow Claw
class Musuh extends KarakterGame {
    public Musuh(String nama, int kesehatan) {
        super(nama, kesehatan);
    }

    // Override method serang dengan efek Shadow Claw
    @Override
    public void serang(KarakterGame target) {
        System.out.printf("%s menyerang %s menggunakan Shadow Claw!\n", getNama(), target.getNama());
        target.setKesehatan(target.getKesehatan() - 15);

        System.out.printf("Kesehatan %s sekarang %d\n\n", target.getNama(), target.getKesehatan());
        if (target.getKesehatan() == 0) {
            System.out.printf("%s game over...\n\n", target.getNama());
        }
    }
}

// Kelas utama untuk menjalankan simulasi game
public class Codelab {
    public static void main(String[] args) {
        // Ini Membuat objek dengan nama karakter yang diinginkan
        KarakterGame karakterUmum = new KarakterGame("Ash Ketchum", 100);
        Pahlawan pikachu = new Pahlawan("Pikachu", 150);
        Musuh mimikyu = new Musuh("Mimikyu", 200);

        // Ini Menampilkan status awal semua karakter
        System.out.println("====== Game Start ======\n");
        System.out.printf("%s memiliki kesehatan: %d\n", pikachu.getNama(), pikachu.getKesehatan());
        System.out.printf("%s memiliki kesehatan: %d\n", mimikyu.getNama(), mimikyu.getKesehatan());
        System.out.printf("%s memiliki kesehatan: %d\n\n", karakterUmum.getNama(), karakterUmum.getKesehatan());

        // Ini Simulasi pertarungan antar karakter
        mimikyu.serang(pikachu);
        pikachu.serang(mimikyu);
        mimikyu.serang(karakterUmum);
        pikachu.serang(karakterUmum);
        pikachu.serang(karakterUmum);
        pikachu.serang(karakterUmum);
        pikachu.serang(karakterUmum);
        pikachu.serang(karakterUmum);
    }
}
