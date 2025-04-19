public class Mahasiswa extends User {
 
    public Mahasiswa(String nama, String nim) {
        super(nama, nim);
    }

    @Override
    public void login() {
        if (getNama().equals("Nur Aini") && getNim().equals("381")) {
            System.out.println("Login Mahasiswa sukses!\n");
        } else {
            System.out.println("Nama atau NIM salah!\n");
        }
    }

    @Override
    public void displayInfo() {
        if (getNama().equals("Nur Aini") && getNim().equals("381")) {
            System.out.println("==================================");
            System.out.println("        HALAMAN MAHASISWA");
            System.out.println("==================================");
            System.out.printf("Nama       : %s\n", getNama());
            System.out.printf("NIM        : %s\n", getNim());
            System.out.println("==================================\n");
        }
    }
}