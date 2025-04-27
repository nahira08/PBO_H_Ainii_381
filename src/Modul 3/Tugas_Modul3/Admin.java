public class Admin extends User {
    private String username;
    private String password;

    public Admin(String nama, String nim, String username, String password) {
        super(nama, nim);
        this.username = username;
        this.password = password;
    }

    @Override
    public void login() {
        if (username.equals("Admin381") && password.equals("Password381")) {
            System.out.println("Login Admin berhasil!\n");
        } else {
            System.out.println("Login gagal! Username atau password salah!\n");
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
