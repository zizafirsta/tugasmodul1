import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class tugas1modul1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input data diri
        System.out.print("Nama : ");
        String nama = scanner.nextLine();

        System.out.print("Jenis Kelamin (L/P) : ");
        char jenisKelamin = scanner.next().charAt(0);

        System.out.print("Tanggal Lahir (yyyy-mm-dd) : ");
        String tanggalLahirStr = scanner.next();
        LocalDate tanggalLahir = LocalDate.parse(tanggalLahirStr);

        // Hitung umur
        LocalDate sekarang = LocalDate.now();
        Period period = Period.between(tanggalLahir, sekarang);
        int umurTahun = period.getYears();
        int umurBulan = period.getMonths();

        // Output data diri
        System.out.println("\nNama : " + nama);
        System.out.println("Jenis Kelamin : " + (jenisKelamin == 'L' ? "Laki-laki" : "Perempuan"));
        System.out.println("Umur Anda : " + umurTahun + " tahun " + umurBulan + " bulan");
    }
}