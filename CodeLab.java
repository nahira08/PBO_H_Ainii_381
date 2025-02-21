// Author : Aini 

import java.time.LocalDate;
import java.util.Scanner;

public class CodeLab {
    public static void main(String[] args) {
        String firstName;
        String gender;
        int birthYear;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Nama : ");
        firstName = scanner.nextLine();

        System.out.print("Masukkan Jenis Kelamin (P/L) : ");
        gender = scanner.nextLine();

        System.out.print("Masukkan Tahun Lahir : ");
        birthYear = scanner.nextInt();

        int currentYear = LocalDate.now().getYear();
        int age = currentYear - birthYear;

        String genderFormatted;
        if (gender.equalsIgnoreCase("L")) {
            genderFormatted = "Laki-laki";
        } else if (gender.equalsIgnoreCase("P")) {
            genderFormatted = "Perempuan";
        } else {
            genderFormatted = "Tidak diketahui";
        }

        System.out.println();

        System.out.println("Data Diri : ");
        System.out.println(String.format("%-15s: %s", "Nama", firstName));
        System.out.println(String.format("%-15s: %s", "Jenis Kelamin", genderFormatted));
        System.out.println(String.format("%-15s: %d tahun", "Umur", age));
        scanner.close();
    }
}
