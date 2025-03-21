// Author : Nur Aini

import java.time.LocalDate;
import java.util.Scanner;

public class Modul1Challenge {
    public static void main(String[] args) {
        Scanner userInput = new Scanner (System.in);

        // 1. buat input data pengguna dlu^^
        System.out.println("===== Kalkulator Kebutuhan Kalori harian =====");
        System.out.print("Masukkan nama: ");
        String nama = userInput.nextLine();

        System.out.print("Masukkan tahun lahir: ");
        int tahunLahir = userInput.nextInt();

        System.out.print("Masukkan jenis kelamin (L/P): ");
        char gender = userInput.next().charAt(0);

        System.out.print("Masukkan berat badan (kg): ");
        double berat = userInput.nextDouble();

        System.out.print("Masukkan tinggi badan (cm): ");
        double tinggi = userInput.nextDouble();

        // 2. trus kita hitung umur yaw^^
        int tahunSekarang = LocalDate.now().getYear();
        int umur = tahunSekarang - tahunLahir;

        // 3. truss kita bikin pilihan aktivitas ^^
        System.out.println("Pilih tingkat akktivitas:");
        System.out.println("1. Ringan (olahraga 1-3 hari/minggu)");
        System.out.println("2. Sedang (olahraga 3-5 hari/minggu)");
        System.out.println("3. Berat (olahraga 6-7 hari/minggu)");
        System.out.println("Pilihan (1/2/3): ");
        int aktivitas = userInput.nextInt();

        // 4. truss hitung BMR 
        double bmr = 0.0;
        if (gender == 'L' || gender == 'l') {
            bmr = 66 + (13.7 * berat) + (5 * tinggi) - (6.8 * umur);
        } else if (gender == 'P' || gender == 'p') {
            bmr = 655 + (9.6 * berat) + (1.8 * tinggi) - (4.7 * umur);
        } else {
            System.out.println("Jenis Kelamin tidak valid!");
        }

        // 5. menghitung kalori harian berdasarkan aktivitas yaw ^^
        double kebutuhanKalori = 0.0;
        switch (aktivitas) {
            case 1:
               kebutuhanKalori = bmr * 1.375;
               break;
            case 2:
               kebutuhanKalori = bmr * 1.55;
               break;
            case 3:
               kebutuhanKalori = bmr * 1.725;
               break;
            default :
               System.out.println("Pilihan aktivitas tidak valid!");
        }

        // 6. ini tuh buat Output hasilnya ^^
        System.out.println("\n===== Hasil Perhitungan =====");
        System.out.println("Haii, " + nama + "!");
        System.out.println("Umurmu: " + umur + "tahun");
        System.out.printf("Kebutuhan kalori harianmu: %.2f kalori\n", kebutuhanKalori);

        userInput.close();
    }
}