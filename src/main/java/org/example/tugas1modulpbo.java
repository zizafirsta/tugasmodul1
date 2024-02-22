package org.example;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class tugas1modulpbo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // menginput data diri
        System.out.print("Nama : ");
        String nama = scanner.nextLine();

        System.out.print("Jenis Kelamin (L/P) : ");
        char jenisKelamin = scanner.next().charAt(0);

        System.out.print("tanggal Lahir (yyyy-mm-dd) : ");
        String tanggalKelahiranStr = scanner.next();
        LocalDate tanggalKelahiran = LocalDate.parse(tanggalKelahiranStr);

        // menghitung umur
        LocalDate sekarang = LocalDate.now();
        Period period = Period.between(tanggalKelahiran, sekarang);
        int umurTahun = period.getYears();
        int umurBulan = period.getMonths();

        // Output data diri
        System.out.println("\nNama : " + nama);
        System.out.println("Jenis Kelamin : " + (jenisKelamin == 'L' ? "Laki-laki" : "Perempuan"));
        System.out.println("Umur Anda : " + umurTahun + " tahun " + umurBulan + " bulan");
    }
}