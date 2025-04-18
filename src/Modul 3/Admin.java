package Modul 3;

class Admin extends User {
    private String username;
    private String password;

    public Admin(String nama, String nim, String username, String password) {
        super(nama, nim);
        this.usermame = username;
        this.password = password;
    }

    @Override
    public void login() {
        if (username.equals("admin") && password.equals("admin381")) {
            System.out.println("Login Admin berhasil.");
        } else {
            System.out.println("Login Admin gagal.");
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Selamat datang Admin " + getNama());
    }
}
