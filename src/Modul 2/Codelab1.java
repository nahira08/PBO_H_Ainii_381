
class Hewan {
     String namaHewan;
     String jenisHewan;
     String suaraHewan;

    void tampilkanInfo() {
        System.out.println("Nama: " + namaHewan);
        System.out.println("Jenis: " + jenisHewan);
        System.out.println("Suara: " + suaraHewan);

    }
    void masukanInfo(String nama, String jenis, String suara) {
        namaHewan = nama;
        jenisHewan = jenis;
        suaraHewan = suara;
        tampilkanInfo();
    }
}
public class Codelab1 {
   public static void main(String[] args) {
    Hewan info = new Hewan();
    info.masukanInfo("Kucing", "Mamalia", "Nyann~");
    System.out.println();
    info.masukanInfo("Anjing", "Mamalia", "Woof-Woof!!");
   }
}
