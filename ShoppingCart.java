import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ShoppingCart {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        String input;
        double pricePensil = 12000, pricePulpen = 15000, priceBuku = 25000;
        double totalPensil = 0, totalPulpen = 0, totalBuku = 0;
        int totalItems = 0;

        System.out.println("* Data Barang Dagangan *");
        System.out.println("1. Pensil 2B = @Rp. 12.000");
        System.out.println("2. Pulpen = @Rp. 15.000");
        System.out.println("3. Buku Tulis = @Rp. 25.000");
        System.out.println("Silahkan Pesan");

        try {
            // Purchase Pensil 2B
            System.out.print("Beli Pensil 2B? Y atau N: ");
            input = dataIn.readLine();
            if (input.equalsIgnoreCase("Y")) {
                System.out.print("Jumlahnya: ");
                input = dataIn.readLine();
                totalPensil = Integer.parseInt(input) * pricePensil;
                totalItems += Integer.parseInt(input);
            }

            // Purchase Pulpen
            System.out.print("Beli Pulpen? Y atau N: ");
            input = dataIn.readLine();
            if (input.equalsIgnoreCase("Y")) {
                System.out.print("Jumlahnya: ");
                input = dataIn.readLine();
                totalPulpen = Integer.parseInt(input) * pricePulpen;
                totalItems += Integer.parseInt(input);
            }

            // Purchase Buku Tulis
            System.out.print("Beli Buku Tulis? Y atau N: ");
            input = dataIn.readLine();
            if (input.equalsIgnoreCase("Y")) {
                System.out.print("Jumlahnya: ");
                input = dataIn.readLine();
                totalBuku = Integer.parseInt(input) * priceBuku;
                totalItems += Integer.parseInt(input);
            }

            // Total and Discounts
            double totalPrice = totalPensil + totalPulpen + totalBuku;
            double discountItems = (totalItems > 3) ? totalPrice * 0.1 : 0; // 10% discount for more than 3 items
            double discountPrice = (totalPrice > 100000) ? totalPrice * 0.05 : 0; // 5% discount for total price over Rp. 100.000
            double finalTotal = totalPrice - discountItems - discountPrice;

            // Display results
            System.out.println("\nTotal Barang yang Dibeli: " + totalItems);
            System.out.println("Total Harga Sebelum Diskon: Rp. " + totalPrice);
            System.out.println("Diskon berdasarkan jumlah item: Rp. " + discountItems);
            System.out.println("Diskon berdasarkan total harga: Rp. " + discountPrice);
            System.out.println("Total Harga Setelah Diskon: Rp. " + finalTotal);

        } catch (IOException | NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
