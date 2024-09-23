
import java.util.Scanner;

public class Penjumlahan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input angka A
        System.out.print("A: ");
        double A = scanner.nextDouble();

        // Input angka B
        System.out.print("B: ");
        double B = scanner.nextDouble();

        // Input angka C
        System.out.print("C: ");
        double C = scanner.nextDouble();

        // Menghitung jumlah
        double sum = A + B + C;

        // Menampilkan hasil penjumlahan
        System.out.println("Nilai Penjumlahan: " + A + " + " + B + " + " + C + " = " + sum);

        // Menutup scanner
        scanner.close();
    }
}
