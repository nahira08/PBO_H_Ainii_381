package Modul 3;

class LoginSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Pilihan login sebagai:");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Masukkan pilihan (1/2): ");
        int pilihan = input.nextInt();
        input.nextLine();

        if (pilihan == 1) {
            System.out.print("Masukkan username: ");
            String username = input.nextLine();
            System.out.print("Masukkan password: ");
            String password = input.nextLine();

            Admin admin = new Admin("Admin user", "381", username, password);
            admin.login();
            admin.displayInfo();

        } else if (pilihan == 2) {
            System.out.print("Masukkan nama: ");
            String nama = input.nextLine();
            System.out.println("Masukkan NIM: ");
            String nim = input.nextLine();

            Mahasiswa mhs = new Mahasiswa(nama, nim);
            mhs.login();
            mhs.displayInfo();

        } else {
            System.out.println("Pilihan tidak valid.");
        }

        input.close();
    }
}
