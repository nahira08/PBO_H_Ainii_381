package Modul 3;

class Mahasiswa extends User {
    
    public Mahasiswa(String nama, String nim) {
        super(nama, nim); 
    }

    @Override 
    public void login() {
        if (getNama().equals("Aini") && getNim().equals("381")) {
            System.out.println("Login Mahasiswa berhasil.");
        } else {
            System.out.println("Login mahasiswa gagal.");
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Selamat datang Mahasiswa " + getNama());
    }
}
