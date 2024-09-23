import javax.swing.*;
import java.util.Scanner;

public class Gradedetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input NIM
        System.out.print("Masukkan NIM: ");
        String nim = scanner.nextLine();
        
        // Get the last digit of the NIM to determine odd/even
        int lastDigit = Integer.parseInt(nim.substring(nim.length() - 1));
        
        int nilai;
        
        if (lastDigit % 2 == 1) { // Odd NIM
            // Input nilai using JOptionPane
            String inputNilai = JOptionPane.showInputDialog("Masukkan Nilai Anda:");
            nilai = Integer.parseInt(inputNilai);
        } else { // Even NIM
            // Input nilai using console
            System.out.print("Masukkan Nilai Anda: ");
            nilai = scanner.nextInt();
        }

        // Determine grade based on the value of nilai
        String grade;
        if (nilai > 90) {
            grade = "Excellent";
        } else if (nilai >= 80) {
            grade = "Good job";
        } else if (nilai >= 60) {
            grade = "Belajar Lagi";
        } else {
            grade = "Anda Tidak Lulus";
        }

        // Display results
        if (lastDigit % 2 == 1) { // Output using JOptionPane for odd NIM
            JOptionPane.showMessageDialog(null, "Grade Anda: " + grade);
        } else { // Output using console for even NIM
            System.out.println("Grade Anda: " + grade);
        }

        // Close the scanner
        scanner.close();
    }
}
