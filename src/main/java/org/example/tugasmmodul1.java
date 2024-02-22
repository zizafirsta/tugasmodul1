import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class tugasmmodul1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //input data diri
        System.out.print("Nama: ");
        String nama = scanner.nextLine();

        System.out.print("Jenis Kelamin (L/P): ");
        String jenisKelamin = scanner.nextLine();

        System.out.print("Tanggal Lahir (yyyy-mm-dd): ");
        String tanggalLahirStr = scanner.nextLine();
        LocalDate tanggalLahir = LocalDate.parse(tanggalLahirStr, DateTimeFormatter.ISO_DATE);

        System.out.println("\n// output\n");
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + (jenisKelamin.equalsIgnoreCase("L") ? "Laki-laki" : "Perempuan"));

        LocalDate today = LocalDate.now();
        Period period = Period.between(tanggalLahir, today);
        int umurTahun = period.getYears();
        int umurBulan = period.getMonths();
        System.out.println("Umur Anda: " + umurTahun + " tahun " + umurBulan + " bulan");

        scanner.close();
    }
}