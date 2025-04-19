package Tugas;

public class Admin extends User { //subclass 
    private String username;
    private String password;

    public Admin(String nama, String nim, String username, String password) { // construktr
        super(nama, nim);
        this.username = username;
        this.password = password;
    }

    @Override
    public boolean login() {
        if (username.equals("Admin381") && password.equals("Password381")) {
            System.out.println("Login Admin berhasil!\n");
            return true;
        } else {
            System.out.println("Login gagal! Username atau password salah!\n");
            return false;
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("==================================");
        System.out.println("         HALAMAN ADMIN");
        System.out.println("==================================");
        System.out.printf("Nama Admin : %s\n", getNama());
        System.out.printf("NIM        : %s\n", getNim());
        System.out.println("==================================\n");
    }
}
