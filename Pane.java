import javax.swing.*;

public class Pane {
    public static void main(String[] args) {
        // Display input dialog for selecting food menu
        String menu = JOptionPane.showInputDialog("Pilih Menu Makanan Berikut ini:\n" + 
                                                  "1. Sate Rp. 10.000\n" + 
                                                  "2. Soto Rp. 20.000\n" + 
                                                  "3. Tahu Campur Rp. 15.000\n" + 
                                                  "4. Rendang Rp. 20.000");
        
        int choice;
        
        try {
            // Convert input to integer
            choice = Integer.parseInt(menu);
            
            String result;
            
            // Use switch-case to determine food choice
            switch (choice) {
                case 1:
                    result = "Anda Memilih Sate Harga Rp. 10.000";
                    break;
                case 2:
                    result = "Anda Memilih Soto Harga Rp. 20.000";
                    break;
                case 3:
                    result = "Anda Memilih Tahu Campur Harga Rp. 15.000";
                    break;
                case 4:
                    result = "Anda Memilih Rendang Harga Rp. 20.000";
                    break;
                default:
                    result = "Makanan yang Anda pilih belum ada di daftar kami";
                    break;
            }
            
            // Display the result to the user
            JOptionPane.showMessageDialog(null, result);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Input tidak valid!");
        }
    }
}
