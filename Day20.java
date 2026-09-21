
import java.util.Scanner;

public class Day20 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        // Input
        System.out.print("Masukkan NIM: ");
        int nim = s.nextInt();
        System.out.print("Masukkan Umur: ");
        int umur = s.nextInt();
        System.out.print("Masukkan tinggi badan: ");
        double tinggibadan = s.nextDouble();

        // Konversi
        String nilainim = String.valueOf(nim);
        String nilaiumur = Integer.toString(umur);
        String nilaitinggi = tinggibadan + "";

        // Penggabungan
        String gabungan = nilaiumur + nilaitinggi;

        // Output
        System.out.println("=== DATA MAHASISWA ===");
        System.out.println("NIM\t\t\t: " + nilainim);
        System.out.println("Umur\t\t\t: " + nilaiumur);
        System.out.println("Tinggi badan\t\t: " + nilaitinggi + " CM");
        System.out.println("Gabungan Umur + Tinggi\t: " + gabungan);

        s.close();
    }
    
}
