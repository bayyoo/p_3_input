import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Biodata {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = "";
        String nim = "";
        String address = "";

        try {
            // Input Name
            System.out.print("Masukkan Nama: ");
            name = reader.readLine();

            // Input NIM
            System.out.print("Masukkan NIM: ");
            nim = reader.readLine();

            // Input Address
            System.out.print("Masukkan Alamat: ");
            address = reader.readLine();

            // Output Biodata
            System.out.println("\nInput Biodata Diri:");
            System.out.println("Nama: " + name);
            System.out.println("NIM: " + nim);
            System.out.println("Alamat: " + address);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
