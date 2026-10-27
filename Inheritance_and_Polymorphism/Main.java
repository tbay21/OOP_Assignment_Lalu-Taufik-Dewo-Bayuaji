
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sisi bujur sangkar: ");
        double sisi = input.nextDouble();
        System.out.print("Masukkan warna: ");
        String warnaBS = input.next();

        System.out.print("Masukkan radius lingkaran: ");
        double radius = input.nextDouble();
        System.out.print("Masukkan warna: ");
        String warnaL = input.next();

        System.out.print("Masukkan tinggi silinder: ");
        double tinggi = input.nextDouble();
        System.out.print("Masukkan radius silinder: ");
        double radiusS = input.nextDouble();
        System.out.print("Masukkan warna: ");
        String warnaS = input.next();

        Bentuk[] daftarBentuk = {
            new BujurSangkar(sisi, warnaBS),
            new Lingkaran(radius, warnaL),
            new Silinder(tinggi, radiusS, warnaS)
        };

        System.out.println("\n=== Hasil Perhitungan ===");

        for (Bentuk b : daftarBentuk) {
            System.out.println(
                b.getClass().getSimpleName()
                + " = " + b.hitung()
            );
        }

        input.close();
    }
}
